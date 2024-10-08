package X;

/* renamed from: X.0e3  reason: invalid class name */
public final class AnonymousClass0e3 implements C62700vA {
    public final long A00;
    public final C62700vA A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0e3.getName():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.String getName() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0e3.getName():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0e3.getName():java.lang.String");
    }

    public final long CDK(0XY r5) {
        return Math.min(this.A01.CDK(r5), this.A00);
    }

    public AnonymousClass0e3(C62700vA r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
