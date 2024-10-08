package com.instagram.debug.devoptions.direct.burner;

import X.0oU;
import X.0qQ;
import X.C51972G9s;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BurnerSendSettingsConfig {
    public static final int $stable = 8;
    public String buckId;
    public boolean isTLC;
    public int messageCount;
    public MessageType messageType;
    public String targetUserId;

    public enum MessageType {
        TEXT(0),
        IMAGES(1),
        VIDEOS(2);
        
        public final int value;

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        /* access modifiers changed from: public */
        static {
            MessageType[] $values;
            $ENTRIES = 0oU.A00($values);
        }

        public final int getValue() {
            return this.value;
        }

        /* access modifiers changed from: public */
        MessageType(int i) {
            this.value = i;
        }
    }

    public BurnerSendSettingsConfig() {
        this("", 1, true, MessageType.TEXT, (String) null);
    }

    public final void setBuckId(String str) {
        0qQ.A0B(str, 0);
        this.buckId = str;
    }

    public final void setMessageType(MessageType messageType2) {
        0qQ.A0B(messageType2, 0);
        this.messageType = messageType2;
    }

    public final String getBuckId() {
        return this.buckId;
    }

    public final int getMessageCount() {
        return this.messageCount;
    }

    public final MessageType getMessageType() {
        return this.messageType;
    }

    public final String getTargetUserId() {
        return this.targetUserId;
    }

    public final boolean isTLC() {
        return this.isTLC;
    }

    public final void setMessageCount(int i) {
        this.messageCount = i;
    }

    public final void setTLC(boolean z) {
        this.isTLC = z;
    }

    public final void setTargetUserId(String str) {
        this.targetUserId = str;
    }

    public BurnerSendSettingsConfig(String str, int i, boolean z, MessageType messageType2, String str2) {
        C51972G9s.A1B(str, messageType2);
        this.buckId = str;
        this.messageCount = i;
        this.isTLC = z;
        this.messageType = messageType2;
        this.targetUserId = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BurnerSendSettingsConfig(String str, int i, boolean z, MessageType messageType2, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) == 0 ? z : true, (i2 & 8) != 0 ? MessageType.TEXT : messageType2, (i2 & 16) != 0 ? null : str2);
    }
}
