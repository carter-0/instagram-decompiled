package X;

public final class MGI extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGI(AnonymousClass4D7 r2, 0sP r3, int i, int i2) {
        super(2, r2);
        this.A02 = 3;
        this.A04 = i;
        this.A03 = i2;
        this.A05 = r3;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MGI, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MGI, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.MGI, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        int i;
        int i2;
        int i3;
        C60108Jfo jfo;
        C62517Kh8 kh8;
        AnonymousClass4D7 r6 = r12;
        switch (this.A02) {
            case 0:
                return new MGI((AnonymousClass8IT) this.A01, (AnonymousClass51R) this.A05, r6, this.A04, this.A03);
            case 1:
                jfo = (C60108Jfo) this.A01;
                kh8 = (C62517Kh8) this.A05;
                i3 = this.A04;
                i2 = this.A03;
                i = 1;
                break;
            case 2:
                jfo = (C60108Jfo) this.A01;
                kh8 = (C62517Kh8) this.A05;
                i3 = this.A03;
                i2 = this.A04;
                i = 2;
                break;
            default:
                ? mgi = new MGI(r12, (0sP) this.A05, this.A04, this.A03);
                mgi.A01 = obj;
                return mgi;
        }
        return new MGI(kh8, jfo, r6, i3, i2, i);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.MGI, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        r0 = new X.C59721JVf(new X.C61065Jw3(r3, r2, r0), r4);
        r13.A00 = 1;
        r0 = r7.emit(r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0085, code lost:
        X.0eS.A00(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008a, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        if (r0 != r6) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r1 = r13.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r13.A00
            r5 = 1
            switch(r1) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0040;
                case 2: goto L_0x002a;
                default: goto L_0x000a;
            }
        L_0x000a:
            if (r0 != 0) goto L_0x0085
            X.0eS.A00(r14)
            java.lang.Object r8 = r13.A01
            X.6FR r8 = (X.AnonymousClass6FR) r8
            int r9 = r13.A04
            int r11 = r13.A03
            java.lang.Object r10 = r13.A05
            r12 = 4
            X.J6Y r7 = new X.J6Y
            r7.<init>((java.lang.Object) r8, (int) r9, (java.lang.Object) r10, (int) r11, (int) r12)
            r13.A00 = r5
            X.0sK r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A05(r8, r13, r7, r0)
        L_0x0027:
            if (r0 != r6) goto L_0x0088
            return r6
        L_0x002a:
            if (r0 != 0) goto L_0x0085
            X.0eS.A00(r14)
            java.lang.Object r0 = r13.A01
            X.Jfo r0 = (X.C60108Jfo) r0
            X.0V2 r7 = r0.A0T
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            java.lang.Object r3 = r13.A05
            X.Kh8 r3 = (X.C62517Kh8) r3
            int r2 = r13.A03
            int r0 = r13.A04
            goto L_0x0055
        L_0x0040:
            if (r0 != 0) goto L_0x0085
            X.0eS.A00(r14)
            java.lang.Object r0 = r13.A01
            X.Jfo r0 = (X.C60108Jfo) r0
            X.0V2 r7 = r0.A0T
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            java.lang.Object r3 = r13.A05
            X.Kh8 r3 = (X.C62517Kh8) r3
            int r2 = r13.A04
            int r0 = r13.A03
        L_0x0055:
            X.Jw3 r1 = new X.Jw3
            r1.<init>((X.C62517Kh8) r3, (int) r2, (int) r0)
            X.JVf r0 = new X.JVf
            r0.<init>((X.C61065Jw3) r1, (java.lang.Integer) r4)
            r13.A00 = r5
            java.lang.Object r0 = r7.emit(r0, r13)
            goto L_0x0027
        L_0x0066:
            if (r0 != 0) goto L_0x0085
            X.0eS.A00(r14)
            java.lang.Object r0 = r13.A01
            X.8IT r0 = (X.AnonymousClass8IT) r0
            X.3ju r4 = r0.A00
            java.lang.Object r3 = r13.A05
            X.51R r3 = (X.AnonymousClass51R) r3
            int r2 = r13.A04
            int r1 = r13.A03
            X.KN2 r0 = new X.KN2
            r0.<init>(r3, r2, r1)
            r13.A00 = r5
            java.lang.Object r0 = r4.ELH(r0, r13)
            goto L_0x0027
        L_0x0085:
            X.0eS.A00(r14)
        L_0x0088:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGI) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGI(AnonymousClass8IT r2, AnonymousClass51R r3, AnonymousClass4D7 r4, int i, int i2) {
        super(2, r4);
        this.A02 = 0;
        this.A01 = r2;
        this.A05 = r3;
        this.A04 = i;
        this.A03 = i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGI(C62517Kh8 kh8, C60108Jfo jfo, AnonymousClass4D7 r4, int i, int i2, int i3) {
        super(2, r4);
        this.A02 = i3;
        this.A01 = jfo;
        this.A05 = kh8;
        if (1 - i3 != 0) {
            this.A03 = i;
            this.A04 = i2;
        } else {
            this.A04 = i;
            this.A03 = i2;
        }
    }
}
