package X;

/* renamed from: X.2E7  reason: invalid class name */
public final class AnonymousClass2E7 implements AnonymousClass0eK {
    public volatile AnonymousClass0eK A00;
    public volatile boolean A01;
    public volatile Object A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2E7.get():java.lang.Object, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.Object get() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2E7.get():java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2E7.get():java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2E7, java.lang.Object, X.0eK] */
    public static AnonymousClass0eK A00(AnonymousClass0eK r2) {
        if (r2 instanceof AnonymousClass2E7) {
            return r2;
        }
        ? obj = new Object();
        obj.A00 = r2;
        obj.A01 = false;
        return obj;
    }
}
