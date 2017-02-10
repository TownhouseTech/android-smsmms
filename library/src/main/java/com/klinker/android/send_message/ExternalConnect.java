package com.klinker.android.send_message;

public class ExternalConnect {
    public static final int EXTERNAL_CONNECT_PERSIST_DATA = 0;

    private static ExternalConnect instance;
    public static ExternalConnect get(){
        if(instance == null){
            instance = new ExternalConnect();
        }
        return instance;
    }

    private ExternalConnect(){
    }

    private ExternalCallback callback = null;

    public static void setCallback(ExternalCallback callback) {
        get().callback = callback;
    }

    public static boolean callCallback(int type, Object... values) {
        ExternalCallback callback = get().callback;
        return callback == null || callback.process(type, values);
    }
}
