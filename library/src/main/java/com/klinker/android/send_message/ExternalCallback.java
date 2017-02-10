package com.klinker.android.send_message;

public interface ExternalCallback {
    boolean process(int type, Object... values);
}
