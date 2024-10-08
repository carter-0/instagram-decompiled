package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.1Cc  reason: invalid class name and case insensitive filesystem */
public abstract class C64031Cc {
    public static volatile long A00 = -1;
    public static volatile String A01 = "not set";
    public static volatile String A02 = "not set";
    public static C279824zU A03;
    public static volatile int A04;
    public static volatile int A05;
    public static volatile long A06;
    public static volatile long A07;
    public static volatile long A08;
    public static volatile 1CS A09 = 1CS.A07;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Cc.A03():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A03() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Cc.A03():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64031Cc.A03():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Cc.A04(X.1CS, long):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A04(X.1CS r1, long r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Cc.A04(X.1CS, long):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64031Cc.A04(X.1CS, long):void");
    }

    public static final int A00() {
        return A01(AwakeTimeSinceBootClock.INSTANCE.now());
    }

    public static final int A01(long j) {
        long j2 = (j - A08) / 1000;
        if (j2 < 1) {
            return 0;
        }
        if (j2 < 5) {
            return 1;
        }
        if (j2 < 30) {
            return 2;
        }
        if (j2 < 120) {
            return 3;
        }
        return 4;
    }

    public static final long A02() {
        return AwakeTimeSinceBootClock.INSTANCE.now() - A08;
    }
}
