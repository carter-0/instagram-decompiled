package X;

/* renamed from: X.0Vi  reason: invalid class name and case insensitive filesystem */
public abstract class C59470Vi {
    public static volatile boolean A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0Vi.A00():boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static boolean A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0Vi.A00():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59470Vi.A00():boolean");
    }

    public static boolean A01(int i) {
        0VY r0;
        if (!A00 || (r0 = 0VY.A0A) == null || r0.A05(i) == null) {
            return false;
        }
        return true;
    }
}
