package X;

/* renamed from: X.0iU  reason: invalid class name */
public final class AnonymousClass0iU {
    public static AnonymousClass0iZ A00;
    public static C60550iT A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0iU.A01(X.0if, X.0lg):X.0xK, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static synchronized X.AnonymousClass0xK A01(X.AnonymousClass0if r1, X.0lg r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0iU.A01(X.0if, X.0lg):X.0xK, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0iU.A01(X.0if, X.0lg):X.0xK");
    }

    public static synchronized C60550iT A00() {
        C60550iT r0;
        synchronized (AnonymousClass0iU.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = new C60550iT();
                A01 = r0;
            }
        }
        return r0;
    }
}
