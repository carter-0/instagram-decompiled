package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1TL  reason: invalid class name */
public final class AnonymousClass1TL {
    public static long A00 = 80;
    public static boolean A01 = true;
    public static boolean A02 = true;
    public static boolean A03 = true;
    public static boolean A04;
    public static final Handler A05 = new Handler(Looper.getMainLooper());
    public static final AnonymousClass1TM A06;
    public static final AnonymousClass1TL A07 = new Object();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1TL.A00(X.2hn):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A00(X.C226752hn r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1TL.A00(X.2hn):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TL.A00(X.2hn):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1TL.A01(X.2hn):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A01(X.C226752hn r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1TL.A01(X.2hn):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TL.A01(X.2hn):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.1TL] */
    static {
        AnonymousClass1TM r0;
        synchronized (AnonymousClass1TM.class) {
            r0 = AnonymousClass1TM.A05;
            if (r0 == null) {
                r0 = new AnonymousClass1TM();
                AnonymousClass1TM.A05 = r0;
            }
        }
        A06 = r0;
    }
}
