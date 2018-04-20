package com.klinker.android.send_message;


public interface MessageChangedCallback {
    public static class MessageChangedInfo {
        public MessageChangedInfo(boolean isMMS, long originalMessageId, long originalThreadId, long newMessageId){
            this.isMMS = isMMS;
            this.originalMessageId = originalMessageId;
            this.originalThreadId = originalThreadId;
            this.newMessageId = newMessageId;
        }
        boolean isMMS;
        long originalMessageId;
        long originalThreadId;
        long newMessageId;
    }

    public static class OriginalMessageInfo {
        public OriginalMessageInfo(long originalMessageId, long originalThreadId) {
            this.originalMessageId = originalMessageId;
            this.originalThreadId = originalThreadId;
        }
        long originalMessageId;
        long originalThreadId;
    }

    public OriginalMessageInfo originalMessageInfo();
    public void messageChanged(MessageChangedInfo info);
}
