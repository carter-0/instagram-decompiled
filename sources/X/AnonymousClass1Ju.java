package X;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.1Ju  reason: invalid class name */
public final class AnonymousClass1Ju implements C61110lV {
    public long A00;
    public long A01;
    public final 0tX A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Ju.<init>(android.content.Context):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass1Ju(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Ju.<init>(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Ju.<init>(android.content.Context):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Ju.A00(X.1Ju):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A00(X.AnonymousClass1Ju r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Ju.A00(X.1Ju):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Ju.A00(X.1Ju):void");
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(2132084945);
        A00(this);
        AnonymousClass0fD.A0A(-1615795892, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(716366590);
        this.A01 = System.currentTimeMillis();
        AnonymousClass0fD.A0A(2009061671, A03);
    }
}
