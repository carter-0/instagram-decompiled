package X;

/* renamed from: X.1C7  reason: invalid class name */
public final class AnonymousClass1C7 {
    public static boolean A00;
    public static AnonymousClass1C7 A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1C7.A01(X.1QX):X.2ZL, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final X.2ZL A01(X.AnonymousClass1QX r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1C7.A01(X.1QX):X.2ZL, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1C7.A01(X.1QX):X.2ZL");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1C7, java.lang.Object] */
    public static synchronized AnonymousClass1C7 A00() {
        AnonymousClass1C7 r0;
        synchronized (AnonymousClass1C7.class) {
            AnonymousClass1C7 r02 = A01;
            r0 = r02;
            if (r02 == null) {
                ? obj = new Object();
                A01 = obj;
                r0 = obj;
            }
        }
        return r0;
    }
}
