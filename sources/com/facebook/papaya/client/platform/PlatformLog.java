package com.facebook.papaya.client.platform;

import X.002;
import X.0dV;
import com.facebook.common.stringformat.StringFormatUtil;

public final class PlatformLog {
    public static PlatformLogHandlerImpl A00;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, com.facebook.papaya.client.platform.PlatformLogHandlerImpl] */
    public static synchronized void A00() {
        synchronized (PlatformLog.class) {
            if (A00 == null) {
                A00 = new Object();
            }
        }
    }

    static {
        0dV.A0C("papaya");
    }

    public static void A01(Class cls, String str, Object... objArr) {
        A00();
        PlatformLogHandlerImpl.nativeLog(3, cls.getSimpleName(), 002.A0B(StringFormatUtil.formatStrLocaleSafe(str, objArr)));
    }

    public static void A02(Class cls, String str, Object... objArr) {
        A00();
        PlatformLogHandlerImpl.nativeLog(1, cls.getSimpleName(), 002.A0B(StringFormatUtil.formatStrLocaleSafe(str, objArr)));
    }
}
