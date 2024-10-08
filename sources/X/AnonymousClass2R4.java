package X;

/* renamed from: X.2R4  reason: invalid class name */
public final class AnonymousClass2R4 {
    public double A00;
    public double A01;
    public double A02;
    public double A03;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2R4.toString():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2R4.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2R4.toString():java.lang.String");
    }

    public final boolean A00(double d, double d2) {
        double d3 = this.A01;
        double d4 = this.A02;
        if (d3 > d4) {
            return false;
        }
        double d5 = this.A03;
        double d6 = this.A00;
        if (d5 > d6 || d3 > d || d > d4 || d5 > d2 || d2 > d6) {
            return false;
        }
        return true;
    }

    public final boolean A01(AnonymousClass2R4 r13) {
        double d = this.A01;
        double d2 = this.A02;
        if (d > d2) {
            return false;
        }
        double d3 = this.A03;
        double d4 = this.A00;
        if (d3 > d4) {
            return false;
        }
        double d5 = r13.A01;
        if (d > d5 || d5 > d2) {
            return false;
        }
        double d6 = r13.A02;
        if (d > d6 || d6 > d2) {
            return false;
        }
        double d7 = r13.A00;
        if (d3 > d7 || d7 > d4) {
            return false;
        }
        double d8 = r13.A03;
        if (d3 > d8 || d8 > d4) {
            return false;
        }
        return true;
    }
}
