package X;

/* renamed from: X.04g  reason: invalid class name */
public abstract class AnonymousClass04g {
    public 02M[] A00;
    public final 04k A01;

    public abstract 04k A00();

    public void A02(02M r1) {
    }

    public void A03(02M r1) {
    }

    public void A04(02M r1) {
    }

    public abstract void A05(02M r1);

    public abstract void A06(02M r1);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.04g.A07(X.02M, int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public void A07(X.02M r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.04g.A07(X.02M, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04g.A07(X.02M, int):void");
    }

    public final void A01() {
        02M[] r1 = this.A00;
        if (r1 != null) {
            02M r0 = r1[0];
            02M r12 = r1[1];
            if (r12 == null) {
                r12 = this.A01.A00.A05(2);
            }
            if (r0 == null) {
                r0 = this.A01.A00.A05(1);
            }
            A06(02M.A02(r0, r12));
            02M r02 = this.A00[4];
            if (r02 != null) {
                A03(r02);
            }
            02M r03 = this.A00[5];
            if (r03 != null) {
                A02(r03);
            }
            02M r04 = this.A00[6];
            if (r04 != null) {
                A04(r04);
            }
        }
    }

    public AnonymousClass04g(04k r1) {
        this.A01 = r1;
    }

    public AnonymousClass04g() {
        this(new 04k());
    }
}
