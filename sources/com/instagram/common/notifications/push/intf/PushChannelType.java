package com.instagram.common.notifications.push.intf;

import X.0oU;
import X.0sr;

public enum PushChannelType {
    A0D((String) null, 0),
    AMAZON((String) null, 1),
    GCM("☁", 2),
    FBNS("⚡", 3),
    NOKIA((String) null, 4),
    FCM("🔥", 5),
    MSYS("🚀", 6),
    LOCAL((String) null, 7),
    REALTIME_LOCAL_NOTIFICATION((String) null, 8),
    SYNC((String) null, 9),
    MEM("🌀", 10),
    IRIS("👁️", 11);
    
    public final String A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        PushChannelType[] pushChannelTypeArr;
        A02 = 0oU.A00(pushChannelTypeArr);
    }

    public final boolean A00() {
        return 0sr.A1P(new PushChannelType[]{AMAZON, GCM, FBNS, NOKIA, FCM}).contains(this);
    }

    /* access modifiers changed from: public */
    PushChannelType(String str, int i) {
        this.A01 = r2;
        this.A00 = str;
    }
}
