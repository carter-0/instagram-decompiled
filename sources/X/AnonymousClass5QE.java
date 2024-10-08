package X;

/* renamed from: X.5QE  reason: invalid class name */
public final class AnonymousClass5QE implements AnonymousClass5QF {
    public final /* synthetic */ AnonymousClass5QD A00;

    public AnonymousClass5QE(AnonymousClass5QD r1) {
        this.A00 = r1;
    }

    public final void AHx(int i, float f, float f2, float f3, float f4) {
        ((AnonymousClass5QC) this.A00).A02.A02.A01.AHx(i, f, f2, f3, f4);
    }

    public final long AmQ() {
        return C288015bE.A01(((AnonymousClass5QC) this.A00).A02.A02.A00);
    }

    public final void CNZ(float f, float f2, float f3, float f4) {
        AnonymousClass5QD r5 = this.A00;
        AnonymousClass5QB r0 = ((AnonymousClass5QC) r5).A02.A02;
        AnonymousClass5QA r4 = r0.A01;
        long j = r0.A00;
        long A002 = C288015bE.A00(C288025bF.A02(j) - (f3 + f), C288025bF.A00(j) - (f4 + f2));
        if (C288025bF.A02(A002) < 0.0f || C288025bF.A00(A002) < 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        r5.ElR(A002);
        r4.FHv(f, f2);
    }

    public final void EJR(long j, float f) {
        AnonymousClass5QA r2 = ((AnonymousClass5QC) this.A00).A02.A02.A01;
        float A01 = C289295dM.A01(j);
        float A02 = C289295dM.A02(j);
        r2.FHv(A01, A02);
        r2.EJQ(f);
        r2.FHv(-A01, -A02);
    }

    public final void EKJ(long j, float f, float f2) {
        AnonymousClass5QA r2 = ((AnonymousClass5QC) this.A00).A02.A02.A01;
        float A01 = C289295dM.A01(j);
        float A02 = C289295dM.A02(j);
        r2.FHv(A01, A02);
        r2.EKI(f, f2);
        r2.FHv(-A01, -A02);
    }

    public final void FHv(float f, float f2) {
        ((AnonymousClass5QC) this.A00).A02.A02.A01.FHv(f, f2);
    }
}
