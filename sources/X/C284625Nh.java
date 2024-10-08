package X;

import java.io.IOException;

/* renamed from: X.5Nh  reason: invalid class name and case insensitive filesystem */
public final class C284625Nh implements AnonymousClass4TH, C264924Rv {
    public long A00 = -9223372036854775807L;
    public C264924Rv A01;
    public AnonymousClass4TH A02;
    public C265164Su A03;
    public final long A04;
    public final C264874Rq A05;
    public final AnonymousClass4QW A06;

    public final long E3Q(long j) {
        return 0;
    }

    public final void A00(C264874Rq r9) {
        long j = this.A04;
        long j2 = this.A00;
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        C265164Su r1 = this.A03;
        r1.getClass();
        AnonymousClass4TH AMb = r1.AMb(r9, this.A06, j);
        this.A02 = AMb;
        if (this.A01 != null) {
            AMb.E3p(this, j);
        }
    }

    public final void AGR(long j) {
        AnonymousClass4TH r0 = this.A02;
        if (r0 != null) {
            r0.AGR(j);
        }
    }

    public final boolean AJh(long j, long j2) {
        AnonymousClass4TH r0 = this.A02;
        if (r0 == null || !r0.AJh(j, j2)) {
            return false;
        }
        return true;
    }

    public final boolean AJi(C21415XaP xaP) {
        AnonymousClass4TH r0 = this.A02;
        if (r0 == null || !r0.AJi(xaP)) {
            return false;
        }
        return true;
    }

    public final void APR(long j, boolean z) {
        this.A02.APR(j, z);
    }

    public final long AZp(AnonymousClass4P6 r3, long j) {
        return this.A02.AZp(r3, j);
    }

    public final long AiS(long j) {
        AnonymousClass4TH r0 = this.A02;
        if (r0 == null) {
            return 0;
        }
        return r0.AiS(j);
    }

    public final long AiU() {
        return this.A02.AiU();
    }

    public final long BWC() {
        return this.A02.BWC();
    }

    public final C264844Rn C99() {
        return this.A02.C99();
    }

    public final void Cnk() {
        try {
            AnonymousClass4TH r0 = this.A02;
            if (r0 != null) {
                r0.Cnk();
                return;
            }
            C265164Su r02 = this.A03;
            if (r02 != null) {
                r02.Cnl();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public final /* bridge */ /* synthetic */ void D6K(AnonymousClass4TI r2) {
        this.A01.D6K(this);
    }

    public final void DZ1(AnonymousClass4TH r2) {
        this.A01.DZ1(this);
    }

    public final void E3p(C264924Rv r9, long j) {
        this.A01 = r9;
        AnonymousClass4TH r7 = this.A02;
        if (r7 != null) {
            long j2 = this.A04;
            long j3 = this.A00;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            r7.E3p(this, j2);
        }
    }

    public final long E6K() {
        return this.A02.E6K();
    }

    public final void EB7(long j) {
        this.A02.EB7(j);
    }

    public final long EL5(long j, boolean z) {
        return this.A02.EL5(j, z);
    }

    public final long ELF(AnonymousClass4TD[] r8, AnonymousClass4RX[] r9, boolean[] zArr, boolean[] zArr2, long j) {
        long j2 = this.A00;
        if (j2 == -9223372036854775807L || j != this.A04) {
            j2 = j;
        } else {
            this.A00 = -9223372036854775807L;
        }
        return this.A02.ELF(r8, r9, zArr, zArr2, j2);
    }

    public final void Efw(boolean z) {
        AnonymousClass4TH r0 = this.A02;
        if (r0 != null) {
            r0.Efw(z);
        }
    }

    public final void FKi(byte b, boolean z) {
        AnonymousClass4TH r0 = this.A02;
        if (r0 != null) {
            r0.FKi(b, z);
        }
    }

    public final boolean isLoading() {
        AnonymousClass4TH r0 = this.A02;
        if (r0 == null || !r0.isLoading()) {
            return false;
        }
        return true;
    }

    public C284625Nh(C264874Rq r3, AnonymousClass4QW r4, long j) {
        this.A05 = r3;
        this.A06 = r4;
        this.A04 = j;
    }
}
