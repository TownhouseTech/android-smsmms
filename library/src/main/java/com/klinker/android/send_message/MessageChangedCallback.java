package com.klinker.android.send_message;


public interface MessageChangedCallback {
    public static class MessageChangedInfo {
        boolean isMMS;
        long originalMessageId;
        long originalThreadId;
        long newMessageId;
    }

    public MessageChangedInfo messageChanged(long originalId, long originalThreadId);
}
