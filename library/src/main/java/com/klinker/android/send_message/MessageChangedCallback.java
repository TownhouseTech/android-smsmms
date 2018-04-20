package com.klinker.android.send_message;


public interface MessageChangedCallback {
    public static class MessageChangedInfo {
        public MessageChangedInfo(boolean isMMS, long originalMessageId, long originalThreadId, long newMessageId){
            this.isMMS = isMMS;
            this.originalMessageId = originalMessageId;
            this.originalThreadId = originalThreadId;
            this.newMessageId = newMessageId;
        }
        public boolean isMMS;
        public long originalMessageId;
        public long originalThreadId;
        public long newMessageId;
    }

    public void messageChanged(MessageChangedInfo info);
}
