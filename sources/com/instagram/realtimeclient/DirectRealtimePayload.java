package com.instagram.realtimeclient;

import X.C254403sQ;

public final class DirectRealtimePayload {
    public boolean canSeeBroadcastChats;
    public boolean canSeeNotes;
    public String clientContext;
    public String clientFacingErrorMessage;
    public String clientRequestId;
    public Integer count;
    public DirectApiError error;
    public String errorCode;
    public boolean isEpdError;
    public String itemId;
    public String message;
    public String threadId;
    public C254403sQ throttlingType;
    public long timestamp;
    public Long ttlMs;

    public enum Action {
        ACK("item_ack"),
        UNSEEN_COUNT("inbox_unseen_count"),
        UNKNOWN("unknown");
        
        public String mServerValue;

        public String getServerValue() {
            return this.mServerValue;
        }

        /* access modifiers changed from: public */
        Action(String str) {
            this.mServerValue = str;
        }

        public static Action fromServerValue(String str) {
            for (Action action : values()) {
                if (action.getServerValue().equals(str)) {
                    return action;
                }
            }
            return UNKNOWN;
        }
    }
}
