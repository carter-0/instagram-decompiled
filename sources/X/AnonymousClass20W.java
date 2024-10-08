package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.20W  reason: invalid class name */
public final class AnonymousClass20W {
    public static AnonymousClass20W A04;
    public static final Map A05 = null;
    public int A00;
    public List A01;
    public final List A02;
    public final AtomicBoolean A03;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.20W.A01(X.3J8):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static synchronized void A01(X.AnonymousClass3J8 r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.20W.A01(X.3J8):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass20W.A01(X.3J8):void");
    }

    public static synchronized void A00() {
        synchronized (AnonymousClass20W.class) {
            A04.A00++;
        }
    }

    public static boolean A02() {
        return A04.A03.get();
    }
}
