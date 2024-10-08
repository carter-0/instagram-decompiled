package X;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.2c0  reason: invalid class name */
public final class AnonymousClass2c0 {
    public static final AnonymousClass2c0 A02 = new AnonymousClass2c0(C61410nE.A00, new Object());
    public final C61410nE A00;
    public final AnonymousClass2c1 A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2c0.<init>(X.0nE, X.2c1):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass2c0(X.C61410nE r1, X.AnonymousClass2c1 r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2c0.<init>(X.0nE, X.2c1):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2c0.<init>(X.0nE, X.2c1):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2c1, java.lang.Object] */
    public AnonymousClass2c0() {
        this(C61410nE.A00, new Object());
    }
}
