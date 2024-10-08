package X;

/* renamed from: X.5dZ  reason: invalid class name and case insensitive filesystem */
public abstract class C289425dZ {
    public static final AnonymousClass5VN A00(C268064ch r4) {
        C268064ch Bab = r4.Bab();
        if (Bab != null) {
            return Bab.CgV(r4, true);
        }
        long Bwh = r4.Bwh();
        return new AnonymousClass5VN(0.0f, 0.0f, (float) ((int) (Bwh >> 32)), (float) C289005cr.A00(Bwh));
    }

    public static final AnonymousClass5VN A01(C268064ch r15) {
        C268064ch A02 = A02(r15);
        long Bwh = A02.Bwh();
        float f = (float) ((int) (Bwh >> 32));
        float A00 = (float) C289005cr.A00(Bwh);
        AnonymousClass5VN CgV = A02(r15).CgV(r15, true);
        float f2 = CgV.A01;
        float f3 = 0.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > f) {
            f2 = f;
        }
        float f4 = CgV.A03;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > A00) {
            f4 = A00;
        }
        float f5 = CgV.A02;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 <= f) {
            f = f5;
        }
        float f6 = CgV.A00;
        if (f6 >= 0.0f) {
            f3 = f6;
        }
        if (f3 <= A00) {
            A00 = f3;
        }
        if (f2 == f || f4 == A00) {
            return AnonymousClass5VN.A04;
        }
        long Cgb = A02.Cgb(C289325dP.A00(f2, f4));
        long Cgb2 = A02.Cgb(C289325dP.A00(f, f4));
        long Cgb3 = A02.Cgb(C289325dP.A00(f, A00));
        long Cgb4 = A02.Cgb(C289325dP.A00(f2, A00));
        float A01 = C289295dM.A01(Cgb);
        float A012 = C289295dM.A01(Cgb2);
        float A013 = C289295dM.A01(Cgb4);
        float A014 = C289295dM.A01(Cgb3);
        float min = Math.min(A01, Math.min(A012, Math.min(A013, A014)));
        float max = Math.max(A01, Math.max(A012, Math.max(A013, A014)));
        float A022 = C289295dM.A02(Cgb);
        float A023 = C289295dM.A02(Cgb2);
        float A024 = C289295dM.A02(Cgb4);
        float A025 = C289295dM.A02(Cgb3);
        return new AnonymousClass5VN(min, Math.min(A022, Math.min(A023, Math.min(A024, A025))), max, Math.max(A022, Math.max(A023, Math.max(A024, A025))));
    }

    public static final C268064ch A02(C268064ch r3) {
        C268054cg r2;
        C268054cg r1;
        C268064ch Bab = r3.Bab();
        while (true) {
            r2 = r3;
            r3 = Bab;
            if (Bab == null) {
                break;
            }
            Bab = Bab.Bab();
        }
        if ((r2 instanceof C268054cg) && (r1 = (C268054cg) r2) != null) {
            C268054cg r0 = r1.A07;
            while (true) {
                r2 = r1;
                r1 = r0;
                if (r0 == null) {
                    break;
                }
                r0 = r0.A07;
            }
        }
        return r2;
    }
}
