package X;

/* renamed from: X.0dq  reason: invalid class name and case insensitive filesystem */
public final class C60160dq implements C62700vA, C62830wA {
    public final C62700vA A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0dq.getName():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.String getName() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0dq.getName():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60160dq.getName():java.lang.String");
    }

    public final long CDK(0XY r6) {
        if (this.A00.CDK(r6) < 500) {
            return 0;
        }
        return 1;
    }

    public C60160dq(C62700vA r1) {
        this.A00 = r1;
    }

    public final String Ax3(0XY r3) {
        return String.valueOf(CDK(r3));
    }
}
