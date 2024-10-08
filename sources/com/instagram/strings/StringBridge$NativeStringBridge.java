package com.instagram.strings;

import X.002;
import X.0KC;
import X.0dV;
import X.0wb;
import X.AnonymousClass05K;
import android.os.Looper;
import com.facebook.jni.HybridData;
import java.util.concurrent.TimeUnit;

public final class StringBridge$NativeStringBridge {
    public static boolean sFailedToLoadStrings;
    public static boolean sTriedInitStatic;
    public final HybridData mHybridData = nativeInitHybrid();

    public static native HybridData nativeInitHybrid();

    public native String nativeGetInstagramString(String str);

    public static synchronized void initStatic() {
        Integer num;
        0wb r6;
        Throwable th;
        String str;
        String str2;
        Integer num2;
        synchronized (StringBridge$NativeStringBridge.class) {
            if (!sTriedInitStatic) {
                sTriedInitStatic = true;
                long nanoTime = System.nanoTime();
                try {
                    0dV.A0C("scrambler");
                    0dV.A0C("strings");
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                        th = new Throwable();
                        str = "StringBridge:loadOnMainThread";
                        0KC.A0M(str, "StringBridge load on main - time=%sms", th, new Object[]{Long.valueOf(millis)});
                        r6 = 0wb.A01;
                        if (millis > 1000) {
                            num = AnonymousClass05K.A0Y;
                        } else {
                            num = AnonymousClass05K.A00;
                        }
                        str2 = 002.A0e("StringBridge load on main - time=", "ms", millis);
                        r6.EFV(num, str, str2, th);
                    }
                } catch (Throwable th2) {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                        Throwable th3 = new Throwable();
                        0KC.A0M("StringBridge:loadOnMainThread", "StringBridge load on main - time=%sms", th3, new Object[]{Long.valueOf(millis2)});
                        0wb r5 = 0wb.A01;
                        if (millis2 > 1000) {
                            num2 = AnonymousClass05K.A0Y;
                        } else {
                            num2 = AnonymousClass05K.A00;
                        }
                        r5.EFV(num2, "StringBridge:loadOnMainThread", 002.A0e("StringBridge load on main - time=", "ms", millis2), th3);
                    }
                    throw th2;
                }
            }
        }
    }

    static {
        initStatic();
    }
}
