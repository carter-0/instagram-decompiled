package X;

/* renamed from: X.5da  reason: invalid class name and case insensitive filesystem */
public final class C289435da implements C268064ch {
    public final AnonymousClass6GP A00;

    public final long CgW(C268064ch r3, long j) {
        return CgX(r3, j, true);
    }

    public final long CgX(C268064ch r11, long j, boolean z) {
        if (r11 instanceof C289435da) {
            AnonymousClass6GP r2 = ((C289435da) r11).A00;
            C268054cg r1 = r2.A04;
            r1.A0d();
            AnonymousClass6GP r8 = this.A00;
            AnonymousClass6GP A0Z = r8.A04.A0a(r1).A0Z();
            if (A0Z != null) {
                long A002 = C289165d8.A00(C289165d8.A01(r2.A0S(A0Z), AnonymousClass5TW.A01(j)), r8.A0S(A0Z));
                return C289325dP.A00((float) ((int) (A002 >> 32)), (float) ((int) (A002 & 4294967295L)));
            }
            AnonymousClass6GP A003 = HRX.A00(r2);
            long A01 = C289165d8.A01(C289165d8.A01(r2.A0S(A003), A003.A00), AnonymousClass5TW.A01(j));
            AnonymousClass6GP A004 = HRX.A00(r8);
            long A005 = C289165d8.A00(A01, C289165d8.A01(r8.A0S(A004), A004.A00));
            long A006 = C289325dP.A00((float) ((int) (A005 >> 32)), (float) ((int) (A005 & 4294967295L)));
            C268054cg r3 = A004.A04.A07;
            0qQ.A0A(r3);
            C268054cg r0 = A003.A04.A07;
            0qQ.A0A(r0);
            return r3.CgX(r0, A006, true);
        }
        AnonymousClass6GP A007 = HRX.A00(this.A00);
        return C289295dM.A07(CgX(A007.A03, j, true), A007.A04.CgX(r11, 0, true));
    }

    private final long A00() {
        AnonymousClass6GP r7 = this.A00;
        AnonymousClass6GP A002 = HRX.A00(r7);
        return C289295dM.A06(CgX(A002.A03, 0, true), r7.A04.CgW(A002.A04, 0));
    }

    public final long Bwh() {
        AnonymousClass6GP r0 = this.A00;
        return C289155d7.A00(r0.A01, r0.A00);
    }

    public final boolean COx() {
        return this.A00.A04.COx();
    }

    public final AnonymousClass5VN CgV(C268064ch r2, boolean z) {
        return this.A00.A04.CgV(r2, z);
    }

    public final long CgY(long j) {
        return this.A00.A04.CgY(C289295dM.A07(j, A00()));
    }

    public final long Cgb(long j) {
        return this.A00.A04.Cgb(C289295dM.A07(j, A00()));
    }

    public final long EKS(long j) {
        return C289295dM.A07(this.A00.A04.EKS(j), A00());
    }

    public final void FHn(C268064ch r2, float[] fArr) {
        this.A00.A04.FHn(r2, fArr);
    }

    public final void FHq(float[] fArr) {
        this.A00.A04.FHq(fArr);
    }

    public final long FNU(long j) {
        return C289295dM.A07(this.A00.A04.FNU(j), A00());
    }

    public C289435da(AnonymousClass6GP r1) {
        this.A00 = r1;
    }

    public final C268064ch Bab() {
        AnonymousClass6GP A0Z;
        if (!COx()) {
            I2E.A01("LayoutCoordinate operations are only valid when isAttached is true");
            throw AnonymousClass00P.createAndThrow();
        }
        C268054cg r1 = this.A00.A04.A0H.A0W.A04.A07;
        if (r1 == null || (A0Z = r1.A0Z()) == null) {
            return null;
        }
        return A0Z.A03;
    }
}
