package X;

/* renamed from: X.0xM  reason: invalid class name */
public final class AnonymousClass0xM extends AnonymousClass1qG {
    public static AnonymousClass0xM A01;
    public final 1Mx A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0xM.onEventReceivedWithParamsCollectionMap(X.0Df, X.1z2):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onEventReceivedWithParamsCollectionMap(X.0Df r1, X.C68051z2 r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0xM.onEventReceivedWithParamsCollectionMap(X.0Df, X.1z2):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0xM.onEventReceivedWithParamsCollectionMap(X.0Df, X.1z2):void");
    }

    public static AnonymousClass0xM A00() {
        AnonymousClass0xM r1 = A01;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass0xM r12 = new AnonymousClass0xM(100);
        A01 = r12;
        return r12;
    }

    public AnonymousClass0xM(int i) {
        this.A00 = new 1Mx(i);
    }
}
