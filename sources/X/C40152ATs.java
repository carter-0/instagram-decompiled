package X;

/* renamed from: X.ATs  reason: case insensitive filesystem */
public final class C40152ATs implements C344737sL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C344567s4 A06;
    public C345087su A07;
    public C345087su A08;
    public C345087su A09;
    public C344697sH A0A;
    public C344697sH A0B;
    public C344697sH A0C;
    public C344697sH A0D;
    public boolean A0E = true;
    public final C344767sO A0F;
    public final C344407ro A0G;
    public final C366478oz A0H;
    public final C344737sL A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final C368028rx A0L;
    public final C344737sL A0M;
    public final C344737sL[] A0N;

    public C40152ATs(C368028rx r5, C344767sO r6, C344407ro r7, C344737sL r8, C344737sL r9, boolean z, boolean z2) {
        this.A0M = r8;
        this.A0F = r6;
        this.A0I = r9;
        this.A0G = r7;
        this.A0J = z;
        this.A0K = z2;
        this.A0L = r5;
        C366478oz r0 = new C366478oz(r7);
        this.A0H = r0;
        this.A0N = (C344737sL[]) 03t.A0I(new C344737sL[]{r8, r6, r9, r0}).toArray(new C344737sL[0]);
    }

    public final void ACn(C345897uG r5) {
        0qQ.A0B(r5, 0);
        this.A0E = true;
        for (C344737sL ACn : this.A0N) {
            ACn.ACn(r5);
        }
    }

    public final void CMa(C344567s4 r5) {
        0qQ.A0B(r5, 0);
        this.A06 = r5;
        for (C344737sL CMa : this.A0N) {
            CMa.CMa(r5);
        }
    }

    public final /* synthetic */ C345137sz EEw(C345137sz r1, C345097sv r2, C344697sH r3, Long l) {
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011e, code lost:
        if (r1 != null) goto L_0x0120;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EEx(X.C344697sH r8, java.lang.Long r9) {
        /*
            r7 = this;
            r5 = 0
            X.0qQ.A0B(r8, r5)
            boolean r0 = r8.CVW(r5)
            if (r0 == 0) goto L_0x0168
            java.util.List r0 = r8.B9R(r5)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0168
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x00a8
            X.7su r0 = r7.A00()
            r7.A08 = r0
            X.7ro r4 = r7.A0G
            X.7su r0 = r7.A03()
            X.7uu r3 = new X.7uu
            r3.<init>(r4, r0)
            boolean r0 = r7.A02()
            if (r0 == 0) goto L_0x01ce
            boolean r0 = r7.A0K
            if (r0 != 0) goto L_0x01a6
            X.7sG r1 = r8.BDu()
            r7.A0A = r1
            X.7su r0 = r7.A03()
            r1.A8c(r0, r5)
            X.7su r0 = r7.A00()
            r7.A09 = r0
            X.7s4 r1 = r7.A06
            if (r1 == 0) goto L_0x01e2
            r6 = 0
            X.7sG r0 = new X.7sG
            r0.<init>(r4, r6, r1)
            r7.A0D = r0
            r0.EZt(r3, r5)
            X.7sH r1 = r7.A0D
            if (r1 == 0) goto L_0x01df
            X.7su r0 = r7.A09
            if (r0 == 0) goto L_0x01dc
            r1.A8c(r0, r5)
            X.7su r0 = r7.A09
            if (r0 == 0) goto L_0x01dc
            X.7uu r2 = new X.7uu
            r2.<init>(r4, r0)
            X.7s4 r1 = r7.A06
            if (r1 == 0) goto L_0x01e2
            X.7sG r0 = new X.7sG
            r0.<init>(r4, r6, r1)
            r7.A0C = r0
            r0.EZt(r2, r5)
        L_0x0077:
            X.7sH r1 = r7.A0C
            if (r1 == 0) goto L_0x01d9
            X.7su r0 = r7.A03()
            r1.A8c(r0, r5)
            boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x018b
            X.7sG r0 = r8.BDv()
            r7.A0B = r0
        L_0x008c:
            boolean r0 = r7.A0K
            if (r0 == 0) goto L_0x009f
            boolean r0 = r7.A02()
            if (r0 == 0) goto L_0x009f
            X.7su r0 = r7.A09
            if (r0 == 0) goto L_0x01dc
            X.7uu r3 = new X.7uu
            r3.<init>(r4, r0)
        L_0x009f:
            X.7sH r0 = r7.A0B
            if (r0 == 0) goto L_0x01d6
            r0.EZt(r3, r5)
            r7.A0E = r5
        L_0x00a8:
            X.8rx r1 = r7.A0L
            if (r1 == 0) goto L_0x00be
            java.lang.Object r0 = r8.BHP(r5)
            X.0qQ.A07(r0)
            X.7sz r0 = (X.C345137sz) r0
            X.7v0 r0 = r0.getTexture()
            if (r0 == 0) goto L_0x00be
            r1.A00(r0)
        L_0x00be:
            boolean r2 = r7.A0K
            if (r2 != 0) goto L_0x00f4
            boolean r0 = r7.A02()
            if (r0 == 0) goto L_0x00f4
            java.util.List r0 = r8.B9R(r5)
            java.lang.Object r0 = r0.get(r5)
            X.7sv r0 = (X.C345097sv) r0
            int r1 = r0.BZY()
            X.7su r0 = r7.A03()
            r0.A02(r1)
            X.7su r3 = r7.A03()
            int r1 = r7.A03
            int r0 = r7.A02
            r3.A03(r1, r0, r5)
            X.8oz r1 = r7.A0H
            X.7sH r0 = r7.A0A
            if (r0 == 0) goto L_0x01e5
            r1.EEx(r0, r9)
            r7.A01(r9)
        L_0x00f4:
            boolean r0 = r7.A02()
            if (r0 == 0) goto L_0x016c
            if (r2 != 0) goto L_0x016c
            X.7su r3 = r7.A03()
            int r1 = r7.A01
            int r0 = r7.A00
        L_0x0104:
            r3.A03(r1, r0, r5)
            r1 = 500(0x1f4, float:7.0E-43)
            boolean r0 = r8.CVW(r1)
            if (r0 == 0) goto L_0x0169
            java.lang.Object r0 = r8.BHP(r1)
            X.0qQ.A07(r0)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0169
            X.7sO r1 = r7.A0F
            if (r1 == 0) goto L_0x0169
        L_0x0120:
            X.7sL r1 = (X.C344737sL) r1
            X.7sH r0 = r7.A0C
            if (r0 == 0) goto L_0x01d9
            r1.EEx(r0, r9)
            if (r2 == 0) goto L_0x0134
            boolean r0 = r7.A02()
            if (r0 == 0) goto L_0x0134
            r7.A01(r9)
        L_0x0134:
            X.7sL r3 = r7.A0I
            if (r3 == 0) goto L_0x0168
            X.7su r2 = r7.A07
            if (r2 == 0) goto L_0x0143
            int r1 = r7.A05
            int r0 = r7.A04
            r2.A03(r1, r0, r5)
        L_0x0143:
            X.7sH r1 = r7.A0B
            if (r1 == 0) goto L_0x01d6
            if (r8 == r1) goto L_0x0153
            r0 = 1011(0x3f3, float:1.417E-42)
            X.C367478qo.A00(r8, r1, r0)
            r0 = 1012(0x3f4, float:1.418E-42)
            X.C367478qo.A00(r8, r1, r0)
        L_0x0153:
            X.7sH r0 = r7.A0B
            if (r0 == 0) goto L_0x01d6
            r3.EEx(r0, r9)
            X.7su r0 = r7.A07
            if (r0 == 0) goto L_0x0168
            X.7sy r2 = r0.A0A
            X.7sG r8 = (X.C344687sG) r8
            X.7sJ r1 = r8.A07
            r0 = 0
            r1.A01(r2, r0)
        L_0x0168:
            return
        L_0x0169:
            X.8oz r1 = r7.A0H
            goto L_0x0120
        L_0x016c:
            java.util.List r0 = r8.B9R(r5)
            java.lang.Object r0 = r0.get(r5)
            X.7sv r0 = (X.C345097sv) r0
            int r1 = r0.BZY()
            X.7su r0 = r7.A03()
            r0.A02(r1)
            X.7su r3 = r7.A03()
            int r1 = r7.A03
            int r0 = r7.A02
            goto L_0x0104
        L_0x018b:
            X.7s4 r2 = r7.A06
            if (r2 == 0) goto L_0x01e2
            r1 = 0
            X.7sG r0 = new X.7sG
            r0.<init>(r4, r1, r2)
            r7.A0B = r0
            X.7su r1 = r7.A00()
            r7.A07 = r1
            X.7sH r0 = r7.A0B
            if (r0 == 0) goto L_0x01d6
            r0.A8c(r1, r5)
            goto L_0x008c
        L_0x01a6:
            X.7sG r0 = r8.BDu()
            r7.A0C = r0
            X.7su r0 = r7.A00()
            r7.A09 = r0
            X.7s4 r2 = r7.A06
            if (r2 == 0) goto L_0x01e2
            r1 = 0
            X.7sG r0 = new X.7sG
            r0.<init>(r4, r1, r2)
            r7.A0D = r0
            r0.EZt(r3, r5)
            X.7sH r1 = r7.A0D
            if (r1 == 0) goto L_0x01df
            X.7su r0 = r7.A09
            if (r0 == 0) goto L_0x01dc
            r1.A8c(r0, r5)
            goto L_0x0077
        L_0x01ce:
            X.7sG r0 = r8.BDu()
            r7.A0C = r0
            goto L_0x0077
        L_0x01d6:
            java.lang.String r0 = "igluIo"
            goto L_0x01e7
        L_0x01d9:
            java.lang.String r0 = "intermediateIo"
            goto L_0x01e7
        L_0x01dc:
            java.lang.String r0 = "preprocessFramebuffer"
            goto L_0x01e7
        L_0x01df:
            java.lang.String r0 = "preprocessIo"
            goto L_0x01e7
        L_0x01e2:
            java.lang.String r0 = "glHost"
            goto L_0x01e7
        L_0x01e5:
            java.lang.String r0 = "basicIo"
        L_0x01e7:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40152ATs.EEx(X.7sH, java.lang.Long):void");
    }

    public final void FMh(int i, Object obj) {
        0qQ.A0B(obj, 1);
        for (C344737sL FMh : this.A0N) {
            FMh.FMh(i, obj);
        }
    }

    private final C345087su A00() {
        return new C345087su(this.A0G, new C345047sq(), new C345077st(), true);
    }

    private final void A01(Long l) {
        String str;
        C345087su r3 = this.A09;
        if (r3 != null) {
            r3.A03(this.A01, this.A00, 0);
            C344737sL r1 = this.A0M;
            C344697sH r0 = this.A0D;
            if (r0 != null) {
                r1.EEx(r0, l);
                return;
            }
            str = "preprocessIo";
        } else {
            str = "preprocessFramebuffer";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final boolean A02() {
        if (this.A03 >= this.A01 || this.A02 >= this.A00) {
            return false;
        }
        return true;
    }

    public final C345087su A03() {
        C345087su r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("intermediateFramebuffer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int AlC() {
        int i = 0;
        for (C344737sL AlC : this.A0N) {
            i |= AlC.AlC();
        }
        return i;
    }

    public final /* synthetic */ int Avq() {
        return 0;
    }

    public final boolean CKm() {
        for (C344737sL CKm : this.A0N) {
            if (CKm.CKm()) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ boolean Cag() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FLA(int r17, int r18, int r19, boolean r20, int r21, int r22) {
        /*
            r16 = this;
            r0 = r16
            boolean r2 = r0.A02()
            r6 = r18
            r0.A03 = r6
            r7 = r19
            r0.A02 = r7
            r14 = r21
            r0.A05 = r14
            r15 = r22
            r0.A04 = r15
            r4 = r14
            r10 = r15
            float r3 = (float) r6
            float r1 = (float) r7
            float r3 = r3 / r1
            float r1 = (float) r14
            float r1 = r1 / r3
            int r1 = (int) r1
            if (r1 > r15) goto L_0x008f
            r10 = r1
        L_0x0021:
            int[] r3 = new int[]{r4, r10}
            r1 = 0
            r9 = r3[r1]
            r0.A01 = r9
            r0.A00 = r10
            boolean r4 = r0.A0K
            boolean r3 = r0.A02()
            r5 = r17
            r8 = r20
            if (r4 != 0) goto L_0x0067
            if (r3 == 0) goto L_0x007d
            X.7sL r4 = r0.A0M
            r4.FLA(r5, r6, r7, r8, r9, r10)
            X.7sO r4 = r0.A0F
            if (r4 == 0) goto L_0x004c
            int r6 = r0.A01
            int r7 = r0.A00
            r9 = r6
            r10 = r7
            r4.FLA(r5, r6, r7, r8, r9, r10)
        L_0x004c:
            X.7sL r9 = r0.A0I
            if (r9 == 0) goto L_0x0059
            int r11 = r0.A01
            int r12 = r0.A00
            r10 = r5
        L_0x0055:
            r13 = r8
            r9.FLA(r10, r11, r12, r13, r14, r15)
        L_0x0059:
            boolean r3 = r0.A0E
            if (r3 != 0) goto L_0x0063
            boolean r3 = r0.A02()
            if (r2 == r3) goto L_0x0064
        L_0x0063:
            r1 = 1
        L_0x0064:
            r0.A0E = r1
            return
        L_0x0067:
            if (r3 == 0) goto L_0x007d
            X.7sO r3 = r0.A0F
            if (r3 == 0) goto L_0x0073
            r4 = r3
            r9 = r6
            r10 = r7
            r4.FLA(r5, r6, r7, r8, r9, r10)
        L_0x0073:
            X.7sL r4 = r0.A0M
            int r9 = r0.A01
            int r10 = r0.A00
            r4.FLA(r5, r6, r7, r8, r9, r10)
            goto L_0x004c
        L_0x007d:
            X.7sO r3 = r0.A0F
            if (r3 == 0) goto L_0x0087
            r4 = r3
            r9 = r6
            r10 = r7
            r4.FLA(r5, r6, r7, r8, r9, r10)
        L_0x0087:
            X.7sL r9 = r0.A0I
            if (r9 == 0) goto L_0x0059
            r10 = r5
            r11 = r6
            r12 = r7
            goto L_0x0055
        L_0x008f:
            float r1 = (float) r15
            float r1 = r1 * r3
            int r4 = (int) r1
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40152ATs.FLA(int, int, int, boolean, int, int):void");
    }

    public final void detach() {
        for (C344737sL detach : this.A0N) {
            detach.detach();
        }
    }

    public final void release() {
        for (C344737sL release : this.A0N) {
            release.release();
        }
    }
}
