package X;

/* renamed from: X.0ds  reason: invalid class name and case insensitive filesystem */
public final class C60170ds implements C62700vA {
    public final C62700vA A00 = new Object();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0ds.getName():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.String getName() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0ds.getName():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60170ds.getName():java.lang.String");
    }

    public final long CDK(0XY r8) {
        long CDK = this.A00.CDK(r8);
        if (CDK > 30000) {
            return 30000;
        }
        if (CDK >= 500) {
            return CDK;
        }
        return 0;
    }
}
