package X;

/* renamed from: X.1to  reason: invalid class name */
public final class AnonymousClass1to {
    public C68021yv A00;
    public C68021yv A01;
    public C68021yv A02;
    public C68021yv A03;
    public C68021yv A04;
    public C68021yv A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final C67301sn A09;
    public final C67301sn A0A;
    public final C66891qr A0B;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1to.A01(long):X.1yv, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final X.C68021yv A01(long r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1to.A01(long):X.1yv, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1to.A01(long):X.1yv");
    }

    public AnonymousClass1to(C66891qr r1, C67301sn r2, C67301sn r3, long j, long j2, long j3) {
        this.A0B = r1;
        this.A0A = r2;
        this.A09 = r3;
        this.A08 = j;
        this.A06 = j2;
        this.A07 = j3;
    }

    public static C68021yv A00(AnonymousClass1to r5) {
        if (14i.A08()) {
            C68021yv r4 = r5.A03;
            if (r4 != null) {
                return r4;
            }
            C67271si Aeq = r5.A0A.Aeq();
            C68021yv r42 = new C68021yv(Aeq.A03, Aeq.A01);
            r5.A03 = r42;
            return r42;
        }
        C68021yv r43 = r5.A04;
        if (r43 != null) {
            return r43;
        }
        C67271si B7M = r5.A0A.B7M();
        C68021yv r44 = new C68021yv(B7M.A03, B7M.A01);
        r5.A04 = r44;
        return r44;
    }
}
