package X;

/* renamed from: X.128  reason: invalid class name */
public final class AnonymousClass128 extends 122 {
    public final long A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.128.A04(X.18g):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A04(X.18g r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.128.A04(X.18g):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass128.A04(X.18g):void");
    }

    public final String A06() {
        return "StartupTypeDetectorInitializer";
    }

    public final void A07() {
        C638515i r4 = AnonymousClass15h.sStartupTypeDetector;
        long j = this.A00;
        15k r1 = r4.A01;
        r1.A04 = 14i.A08();
        r1.A01 = j;
        C638515i.A01(r4);
        14i.A03(15Y.A02, r4.A03);
    }

    public AnonymousClass128(long j) {
        this.A00 = j;
    }
}
