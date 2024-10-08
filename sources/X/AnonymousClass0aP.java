package X;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.0aP  reason: invalid class name */
public final class AnonymousClass0aP extends AnonymousClass0wW {
    public final C62880wX A00;
    public volatile boolean A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0aP.<init>(X.0wX):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass0aP(X.C62880wX r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0aP.<init>(X.0wX):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0aP.<init>(X.0wX):void");
    }

    public final String getToken() {
        return "IgSessionManager.LOGGED_OUT_TOKEN";
    }

    public final C62880wX getDeviceSession() {
        return this.A00;
    }

    public final boolean hasEnded() {
        return this.A01;
    }

    public final void A06() {
        for (Object next : A02()) {
            if (next instanceof AnonymousClass0lh) {
                ((AnonymousClass0lh) next).onSessionWillEnd();
            }
        }
        this.A01 = true;
    }
}
