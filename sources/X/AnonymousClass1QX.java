package X;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.1QX  reason: invalid class name */
public final class AnonymousClass1QX {
    public AnonymousClass1TD A00;
    public boolean A01;
    public final 1QS A02;
    public final 1QU A03;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1QX.<init>(X.1QS, X.1QU):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass1QX(X.1QS r1, X.1QU r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1QX.<init>(X.1QS, X.1QU):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QX.<init>(X.1QS, X.1QU):void");
    }

    public final synchronized void A00() {
        AnonymousClass1TD r0 = this.A00;
        if (r0 != null) {
            r0.A6x();
        }
        this.A01 = true;
    }

    public final synchronized void A01(AnonymousClass1TD r2) {
        this.A00 = r2;
        if (this.A01) {
            r2.A6x();
        }
    }
}
