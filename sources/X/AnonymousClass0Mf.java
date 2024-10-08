package X;

/* renamed from: X.0Mf  reason: invalid class name */
public final class AnonymousClass0Mf {
    public static AnonymousClass0Mf A03;
    public int A00;
    public 0Pd A01;
    public boolean A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0Mf.A01():int, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final int A01() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0Mf.A01():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Mf.A01():int");
    }

    static {
        new Object();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.0Mf] */
    public static synchronized void A00(0Pd r3) {
        synchronized (AnonymousClass0Mf.class) {
            if (A03 == null) {
                ? obj = new Object();
                obj.A00 = 0;
                obj.A02 = false;
                obj.A01 = r3;
                A03 = obj;
            }
        }
    }
}
