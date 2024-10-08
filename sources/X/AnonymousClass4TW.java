package X;

/* renamed from: X.4TW  reason: invalid class name */
public final class AnonymousClass4TW implements AnonymousClass4TH, C264924Rv {
    public long A00;
    public long A01;
    public long A02;
    public AnonymousClass5HW A03;
    public C264924Rv A04;
    public AnonymousClass4TX[] A05 = new AnonymousClass4TX[0];
    public final AnonymousClass4TH A06;

    public final long E3Q(long j) {
        return 0;
    }

    public final void AGR(long j) {
        this.A06.AGR(j);
    }

    public final boolean AJh(long j, long j2) {
        return this.A06.AJh(j, j2);
    }

    public final /* synthetic */ boolean AJi(C21415XaP xaP) {
        return this.A06.AJh(xaP.A01, -9223372036854775807L);
    }

    public final void APR(long j, boolean z) {
        this.A06.APR(j, z);
    }

    public final long AZp(AnonymousClass4P6 r18, long j) {
        long j2;
        AnonymousClass4P6 r12 = r18;
        long j3 = this.A02;
        long j4 = j;
        if (j == j3) {
            return j3;
        }
        long j5 = r12.A01;
        long max = Math.max(0, Math.min(j5, j - j3));
        long j6 = r12.A00;
        long j7 = this.A00;
        if (j7 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j7 - j;
        }
        long max2 = Math.max(0, Math.min(j6, j2));
        if (!(max == j5 && max2 == j6)) {
            r12 = new AnonymousClass4P6(max, max2);
        }
        return this.A06.AZp(r12, j4);
    }

    public final long AiS(long j) {
        return this.A06.AiS(j);
    }

    public final long AiU() {
        long AiU = this.A06.AiU();
        if (AiU != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || AiU < j) {
                return AiU;
            }
        }
        return Long.MIN_VALUE;
    }

    public final long BWC() {
        long BWC = this.A06.BWC();
        if (BWC != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || BWC < j) {
                return BWC;
            }
        }
        return Long.MIN_VALUE;
    }

    public final C264844Rn C99() {
        return this.A06.C99();
    }

    public final void Cnk() {
        AnonymousClass5HW r0 = this.A03;
        if (r0 == null) {
            this.A06.Cnk();
            return;
        }
        throw r0;
    }

    public final /* bridge */ /* synthetic */ void D6K(AnonymousClass4TI r2) {
        C264924Rv r0 = this.A04;
        r0.getClass();
        r0.D6K(this);
    }

    public final void DZ1(AnonymousClass4TH r2) {
        if (this.A03 == null) {
            C264924Rv r0 = this.A04;
            r0.getClass();
            r0.DZ1(this);
        }
    }

    public final void E3p(C264924Rv r2, long j) {
        this.A04 = r2;
        this.A06.E3p(this, j);
    }

    public final long E6K() {
        long j = this.A01;
        if (j != -9223372036854775807L) {
            this.A01 = -9223372036854775807L;
            long E6K = E6K();
            if (E6K != -9223372036854775807L) {
                return E6K;
            }
            return j;
        }
        long E6K2 = this.A06.E6K();
        if (E6K2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        boolean z2 = false;
        if (E6K2 >= this.A02) {
            z2 = true;
        }
        C256703wD.A04(z2);
        long j2 = this.A00;
        if (j2 != Long.MIN_VALUE && E6K2 > j2) {
            z = false;
        }
        C256703wD.A04(z);
        return E6K2;
    }

    public final void EB7(long j) {
        this.A06.EB7(j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        if (r10 > r0) goto L_0x009c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long ELF(X.AnonymousClass4TD[] r19, X.AnonymousClass4RX[] r20, boolean[] r21, boolean[] r22, long r23) {
        /*
            r18 = this;
            r6 = r19
            int r4 = r6.length
            X.4TX[] r7 = new X.AnonymousClass4TX[r4]
            r5 = r18
            r5.A05 = r7
            X.4TD[] r12 = new X.AnonymousClass4TD[r4]
            r3 = 0
            r1 = 0
        L_0x000d:
            r2 = 0
            if (r1 >= r4) goto L_0x001f
            r0 = r19[r1]
            X.4TX r0 = (X.AnonymousClass4TX) r0
            r7[r1] = r0
            if (r0 == 0) goto L_0x001a
            X.4TD r2 = r0.A01
        L_0x001a:
            r12[r1] = r2
            int r1 = r1 + 1
            goto L_0x000d
        L_0x001f:
            X.4TH r11 = r5.A06
            r13 = r20
            r14 = r21
            r15 = r22
            r16 = r23
            long r10 = r11.ELF(r12, r13, r14, r15, r16)
            long r0 = r5.A01
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x00a1
            long r0 = r5.A02
            int r7 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x00a1
            r8 = 0
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x00a1
            int r8 = r13.length
            r7 = 0
        L_0x0046:
            if (r7 >= r8) goto L_0x00a1
            r0 = r20[r7]
            if (r0 == 0) goto L_0x009e
            X.3wB r0 = r0.Brg()
            java.lang.String r1 = r0.A0W
            java.lang.String r0 = r0.A0R
            boolean r0 = X.2Kn.A07(r1, r0)
            if (r0 != 0) goto L_0x009e
            r0 = r10
        L_0x005b:
            r5.A01 = r0
            int r0 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x0073
            long r0 = r5.A02
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x009c
            long r0 = r5.A00
            r8 = -9223372036854775808
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0073
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 > 0) goto L_0x009c
        L_0x0073:
            r0 = 1
        L_0x0074:
            X.C256703wD.A04(r0)
        L_0x0077:
            if (r3 >= r4) goto L_0x00a7
            r0 = r12[r3]
            X.4TX[] r7 = r5.A05
            if (r0 != 0) goto L_0x0088
            r7[r3] = r2
        L_0x0081:
            r0 = r7[r3]
            r19[r3] = r0
            int r3 = r3 + 1
            goto L_0x0077
        L_0x0088:
            r0 = r7[r3]
            if (r0 == 0) goto L_0x0092
            X.4TD r1 = r0.A01
            r0 = r12[r3]
            if (r1 == r0) goto L_0x0081
        L_0x0092:
            r1 = r12[r3]
            X.4TX r0 = new X.4TX
            r0.<init>(r5, r1)
            r7[r3] = r0
            goto L_0x0081
        L_0x009c:
            r0 = 0
            goto L_0x0074
        L_0x009e:
            int r7 = r7 + 1
            goto L_0x0046
        L_0x00a1:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x005b
        L_0x00a7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TW.ELF(X.4TD[], X.4RX[], boolean[], boolean[], long):long");
    }

    public final void Efw(boolean z) {
        this.A06.Efw(z);
    }

    public final void FKi(byte b, boolean z) {
        this.A06.FKi(b, z);
    }

    public final boolean isLoading() {
        return this.A06.isLoading();
    }

    public AnonymousClass4TW(AnonymousClass4TH r2, long j, long j2) {
        this.A06 = r2;
        this.A01 = j;
        this.A02 = j;
        this.A00 = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r6 > r3) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long EL5(long r9, boolean r11) {
        /*
            r8 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A01 = r0
            X.4TX[] r3 = r8.A05
            int r2 = r3.length
            r5 = 0
            r1 = 0
        L_0x000c:
            if (r1 >= r2) goto L_0x0017
            r0 = r3[r1]
            if (r0 == 0) goto L_0x0014
            r0.A00 = r5
        L_0x0014:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0017:
            X.4TH r0 = r8.A06
            long r6 = r0.EL5(r9, r11)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            long r1 = r8.A02
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            long r3 = r8.A00
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0034
        L_0x0033:
            r5 = 1
        L_0x0034:
            X.C256703wD.A04(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TW.EL5(long, boolean):long");
    }
}
