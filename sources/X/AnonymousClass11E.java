package X;

/* renamed from: X.11E  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass11E {
    public static final 0sP A00 = 05L.A00;
    public static final 0sL A01 = 05M.A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.11E.A00(X.0sL, X.0r6):X.0r6, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final X.AnonymousClass0r6 A00(X.0sL r1, X.AnonymousClass0r6 r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.11E.A00(X.0sL, X.0r6):X.0r6, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11E.A00(X.0sL, X.0r6):X.0r6");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r1.A01 == r2) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0r6 A01(X.AnonymousClass0r6 r4) {
        /*
            boolean r0 = r4 instanceof X.AnonymousClass0Ud
            if (r0 != 0) goto L_0x0017
            X.0sP r3 = A00
            X.0sL r2 = A01
            boolean r0 = r4 instanceof X.C62200rt
            if (r0 == 0) goto L_0x0018
            r1 = r4
            X.0rt r1 = (X.C62200rt) r1
            X.0sP r0 = r1.A00
            if (r0 != r3) goto L_0x0018
            X.0sL r0 = r1.A01
            if (r0 != r2) goto L_0x0018
        L_0x0017:
            return r4
        L_0x0018:
            X.0rt r0 = new X.0rt
            r0.<init>(r3, r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11E.A01(X.0r6):X.0r6");
    }
}
