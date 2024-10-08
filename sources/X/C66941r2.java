package X;

import java.util.UUID;

/* renamed from: X.1r2  reason: invalid class name and case insensitive filesystem */
public final class C66941r2 implements AnonymousClass1r3, C60560iY {
    public static C66941r2 A01;
    public static boolean A02;
    public static final String A03 = UUID.randomUUID().toString();
    public int A00 = 0;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1r2.E53():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final synchronized java.lang.String E53() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1r2.E53():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66941r2.E53():java.lang.String");
    }

    public final synchronized void E5y() {
        if (!A02) {
            A02 = true;
        } else {
            this.A00++;
        }
    }

    public final void E5z() {
    }
}
