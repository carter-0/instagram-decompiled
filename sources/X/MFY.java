package X;

public final class MFY extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFY(Object obj, AnonymousClass4D7 r3, int i, int i2, int i3) {
        super(2, r3);
        this.A01 = i3;
        this.A04 = obj;
        this.A03 = i;
        this.A02 = i2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MFY, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.MFY, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        return new X.MFY(r1, r2, r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        return new X.MFY(r1, r2, r3, r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            int r0 = r6.A01
            r2 = r8
            java.lang.Object r1 = r6.A04
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0019;
                case 2: goto L_0x0021;
                case 3: goto L_0x0029;
                case 4: goto L_0x0031;
                default: goto L_0x0008;
            }
        L_0x0008:
            int r3 = r6.A03
            int r4 = r6.A02
            r5 = 5
        L_0x000d:
            X.MFY r0 = new X.MFY
            r0.<init>((java.lang.Object) r1, (X.AnonymousClass4D7) r2, (int) r3, (int) r4, (int) r5)
            return r0
        L_0x0013:
            int r4 = r6.A02
            int r3 = r6.A03
            r5 = 0
            goto L_0x000d
        L_0x0019:
            X.Jfo r1 = (X.C60108Jfo) r1
            int r3 = r6.A03
            int r4 = r6.A02
            r5 = 1
            goto L_0x0038
        L_0x0021:
            X.Jfo r1 = (X.C60108Jfo) r1
            int r3 = r6.A03
            int r4 = r6.A02
            r5 = 2
            goto L_0x0038
        L_0x0029:
            X.Jfo r1 = (X.C60108Jfo) r1
            int r3 = r6.A02
            int r4 = r6.A03
            r5 = 3
            goto L_0x0038
        L_0x0031:
            X.Jfo r1 = (X.C60108Jfo) r1
            int r3 = r6.A02
            int r4 = r6.A03
            r5 = 4
        L_0x0038:
            X.MFY r0 = new X.MFY
            r0.<init>((X.C60108Jfo) r1, (X.AnonymousClass4D7) r2, (int) r3, (int) r4, (int) r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFY.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.MFY, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e2, code lost:
        r9.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e4, code lost:
        r0 = r6.emit(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0109, code lost:
        X.0eS.A00(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010e, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r0 != r4) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A01
            X.1Hj r4 = X.1Hj.A02
            switch(r0) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x00c4;
                case 2: goto L_0x00a2;
                case 3: goto L_0x007c;
                case 4: goto L_0x0057;
                default: goto L_0x0007;
            }
        L_0x0007:
            int r0 = r9.A00
            r8 = 1
            r7 = 2
            if (r0 == 0) goto L_0x0038
            if (r0 != r8) goto L_0x0109
            X.0eS.A00(r10)
        L_0x0012:
            java.lang.Object r6 = r9.A04
            X.5b4 r6 = (X.AnonymousClass5b4) r6
            r0 = 1073741824(0x40000000, float:2.0)
            java.lang.Float r5 = X.C51965G9l.A0q(r0)
            int r0 = r9.A03
            int r3 = r0 * 5
            X.JNL r1 = X.C52518GVv.A02
            r0 = 0
            X.GQC r2 = new X.GQC
            r2.<init>(r1, r3, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.GRJ r0 = new X.GRJ
            r0.<init>(r2, r1)
            r9.A00 = r7
            java.lang.Object r0 = X.JTQ.A0V(r6, r0, r5, r9)
        L_0x0035:
            if (r0 != r4) goto L_0x010c
            return r4
        L_0x0038:
            X.0eS.A00(r10)
            java.lang.Object r6 = r9.A04
            X.5b4 r6 = (X.AnonymousClass5b4) r6
            java.lang.Float r5 = X.JTP.A0i()
            int r3 = r9.A03
            int r2 = r9.A02
            X.JNL r1 = X.C52518GVv.A02
            X.GQC r0 = new X.GQC
            r0.<init>(r1, r3, r2)
            r9.A00 = r8
            java.lang.Object r0 = X.JTQ.A0V(r6, r0, r5, r9)
            if (r0 != r4) goto L_0x0012
            return r4
        L_0x0057:
            int r0 = r9.A00
            r3 = 1
            if (r0 == 0) goto L_0x0063
            if (r0 == r3) goto L_0x0109
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0063:
            X.0eS.A00(r10)
            java.lang.Object r0 = r9.A04
            X.Jfo r0 = (X.C60108Jfo) r0
            X.0V2 r2 = r0.A0U
            int r1 = r9.A02
            int r0 = r9.A03
            int r1 = r1 - r0
            java.lang.Integer r0 = X.JTO.A0w(r1)
            r9.A00 = r3
            java.lang.Object r0 = r2.emit(r0, r9)
            goto L_0x0035
        L_0x007c:
            int r0 = r9.A00
            r2 = 1
            if (r0 == 0) goto L_0x0088
            if (r0 == r2) goto L_0x0109
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0088:
            X.0eS.A00(r10)
            java.lang.Object r0 = r9.A04
            X.Jfo r0 = (X.C60108Jfo) r0
            X.0V2 r6 = r0.A0X
            int r0 = r9.A02
            java.lang.Integer r1 = X.JTO.A0w(r0)
            int r0 = r9.A03
            java.lang.Integer r0 = X.JTO.A0w(r0)
            X.0eP r5 = X.AnonymousClass7TE.A1L(r1, r0)
            goto L_0x00e2
        L_0x00a2:
            int r0 = r9.A00
            r3 = 1
            if (r0 == 0) goto L_0x00ae
            if (r0 == r3) goto L_0x0109
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ae:
            X.0eS.A00(r10)
            java.lang.Object r0 = r9.A04
            X.Jfo r0 = (X.C60108Jfo) r0
            X.0V2 r6 = r0.A0V
            int r2 = r9.A03
            int r1 = r9.A02
            r0 = 0
            X.KMN r5 = new X.KMN
            r5.<init>(r2, r1, r0)
            r9.A00 = r3
            goto L_0x00e4
        L_0x00c4:
            int r0 = r9.A00
            r2 = 1
            if (r0 == 0) goto L_0x00d0
            if (r0 == r2) goto L_0x0109
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00d0:
            X.0eS.A00(r10)
            java.lang.Object r0 = r9.A04
            X.Jfo r0 = (X.C60108Jfo) r0
            X.0V2 r6 = r0.A0V
            int r1 = r9.A03
            int r0 = r9.A02
            X.KMN r5 = new X.KMN
            r5.<init>(r1, r0, r2)
        L_0x00e2:
            r9.A00 = r2
        L_0x00e4:
            java.lang.Object r0 = r6.emit(r5, r9)
            goto L_0x0035
        L_0x00ea:
            int r0 = r9.A00
            r3 = 1
            if (r0 == 0) goto L_0x00f6
            if (r0 == r3) goto L_0x0109
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00f6:
            X.0eS.A00(r10)
            java.lang.Object r2 = r9.A04
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = (androidx.compose.foundation.lazy.grid.LazyGridState) r2
            int r1 = r9.A02
            int r0 = r9.A03
            r9.A00 = r3
            java.lang.Object r0 = r2.A00(r9, r1, r0)
            goto L_0x0035
        L_0x0109:
            X.0eS.A00(r10)
        L_0x010c:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFY) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFY(C60108Jfo jfo, AnonymousClass4D7 r3, int i, int i2, int i3) {
        super(2, r3);
        this.A01 = i3;
        this.A04 = jfo;
        switch (i3) {
            case 1:
            case 2:
                this.A03 = i;
                this.A02 = i2;
                break;
            default:
                this.A02 = i;
                this.A03 = i2;
                break;
        }
    }
}
