package X;

/* renamed from: X.5xQ  reason: invalid class name and case insensitive filesystem */
public final class C300565xQ implements AnonymousClass4TH, C264924Rv {
    public C264924Rv A00;
    public final AnonymousClass4TH A01;
    public final long A02;

    public final long E3Q(long j) {
        return 0;
    }

    public final void AGR(long j) {
        this.A01.AGR(j);
    }

    public final boolean AJh(long j, long j2) {
        return this.A01.AJh(j - this.A02, j2);
    }

    public final /* synthetic */ boolean AJi(C21415XaP xaP) {
        return AJh(xaP.A01, -9223372036854775807L);
    }

    public final void APR(long j, boolean z) {
        this.A01.APR(j - this.A02, z);
    }

    public final long AZp(AnonymousClass4P6 r5, long j) {
        AnonymousClass4TH r0 = this.A01;
        long j2 = this.A02;
        return r0.AZp(r5, j - j2) + j2;
    }

    public final long AiS(long j) {
        return this.A01.AiS(j);
    }

    public final long AiU() {
        long AiU = this.A01.AiU();
        if (AiU != Long.MIN_VALUE) {
            return this.A02 + AiU;
        }
        return Long.MIN_VALUE;
    }

    public final long BWC() {
        long BWC = this.A01.BWC();
        if (BWC != Long.MIN_VALUE) {
            return this.A02 + BWC;
        }
        return Long.MIN_VALUE;
    }

    public final C264844Rn C99() {
        return this.A01.C99();
    }

    public final void Cnk() {
        this.A01.Cnk();
    }

    public final /* bridge */ /* synthetic */ void D6K(AnonymousClass4TI r2) {
        C264924Rv r0 = this.A00;
        r0.getClass();
        r0.D6K(this);
    }

    public final void DZ1(AnonymousClass4TH r2) {
        C264924Rv r0 = this.A00;
        r0.getClass();
        r0.DZ1(this);
    }

    public final void E3p(C264924Rv r4, long j) {
        this.A00 = r4;
        this.A01.E3p(this, j - this.A02);
    }

    public final long E6K() {
        long E6K = this.A01.E6K();
        if (E6K != -9223372036854775807L) {
            return this.A02 + E6K;
        }
        return -9223372036854775807L;
    }

    public final void EB7(long j) {
        this.A01.EB7(j - this.A02);
    }

    public final long EL5(long j, boolean z) {
        AnonymousClass4TH r0 = this.A01;
        long j2 = this.A02;
        return r0.EL5(j - j2, z) + j2;
    }

    public final long ELF(AnonymousClass4TD[] r18, AnonymousClass4RX[] r19, boolean[] zArr, boolean[] zArr2, long j) {
        int length = r18.length;
        AnonymousClass4TD[] r11 = new AnonymousClass4TD[length];
        int i = 0;
        while (true) {
            AnonymousClass4TD r6 = null;
            if (i >= length) {
                break;
            }
            C22285Xyu xyu = r18[i];
            if (xyu != null) {
                r6 = xyu.A00;
            }
            r11[i] = r6;
            i++;
        }
        AnonymousClass4TH r10 = this.A01;
        long j2 = this.A02;
        long ELF = r10.ELF(r11, r19, zArr, zArr2, j - j2);
        for (int i2 = 0; i2 < length; i2++) {
            AnonymousClass4TD r3 = r11[i2];
            if (r3 == null) {
                r18[i2] = null;
            } else {
                C22285Xyu xyu2 = r18[i2];
                if (xyu2 == null || xyu2.A00 != r3) {
                    r18[i2] = new C22285Xyu(r3, j2);
                }
            }
        }
        return ELF + j2;
    }

    public final void Efw(boolean z) {
        this.A01.Efw(z);
    }

    public final void FKi(byte b, boolean z) {
        this.A01.FKi(b, z);
    }

    public final boolean isLoading() {
        return this.A01.isLoading();
    }

    public C300565xQ(AnonymousClass4TH r1, long j) {
        this.A01 = r1;
        this.A02 = j;
    }
}
