package X;

import android.os.PowerManager;

/* renamed from: X.0fk  reason: invalid class name and case insensitive filesystem */
public abstract class C60270fk {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0fk.A02(android.os.PowerManager$WakeLock):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static void A02(android.os.PowerManager.WakeLock r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0fk.A02(android.os.PowerManager$WakeLock):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60270fk.A02(android.os.PowerManager$WakeLock):void");
    }

    public static void A00(PowerManager.WakeLock wakeLock) {
        wakeLock.acquire();
        0BX.A01(wakeLock, -1);
    }

    public static void A01(PowerManager.WakeLock wakeLock) {
        wakeLock.release();
        0BX.A00(wakeLock);
    }
}
