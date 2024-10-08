package X;

/* renamed from: X.0fv  reason: invalid class name */
public final class AnonymousClass0fv implements AnonymousClass0r6 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0fv.collect(X.02o, X.4D7):java.lang.Object, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.Object collect(X.02o r1, X.AnonymousClass4D7 r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0fv.collect(X.02o, X.4D7):java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0fv.collect(X.02o, X.4D7):java.lang.Object");
    }

    public AnonymousClass0fv(0sL r1, AnonymousClass0r6 r2, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A02 = r2;
                this.A01 = r1;
                break;
            default:
                this.A01 = r2;
                this.A02 = r1;
                break;
        }
    }
}
