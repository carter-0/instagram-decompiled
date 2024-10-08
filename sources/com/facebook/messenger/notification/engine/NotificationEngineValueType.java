package com.facebook.messenger.notification.engine;

import X.0oU;

public enum NotificationEngineValueType {
    NOTIFICATION_ENGINE_VALUE_TYPE_NONE(0),
    NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN(1),
    NOTIFICATION_ENGINE_VALUE_TYPE_NUMBER(2),
    NOTIFICATION_ENGINE_VALUE_TYPE_STRING(3),
    NOTIFICATION_ENGINE_VALUE_TYPE_ARRAY(4);
    
    public final int value;

    /* access modifiers changed from: public */
    static {
        NotificationEngineValueType[] notificationEngineValueTypeArr;
        $ENTRIES = 0oU.A00(notificationEngineValueTypeArr);
    }

    public final int getValue() {
        return this.value;
    }

    /* access modifiers changed from: public */
    NotificationEngineValueType(int i) {
        this.value = i;
    }
}
