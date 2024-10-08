package X;

public final class GWR {
    public long A00;
    public final AnonymousClass6Gj A01;

    public final C289295dM A00(GPU gpu, float f) {
        float A02;
        float abs;
        float A022;
        long A002;
        long A07 = C289295dM.A07(this.A00, C289295dM.A06(gpu.A06, gpu.A07));
        this.A00 = A07;
        AnonymousClass6Gj r5 = this.A01;
        if (r5 == null) {
            abs = C289295dM.A00(A07);
        } else {
            if (r5 == AnonymousClass6Gj.Horizontal) {
                A02 = C289295dM.A01(A07);
            } else {
                A02 = C289295dM.A02(A07);
            }
            abs = Math.abs(A02);
        }
        if (abs < f) {
            return null;
        }
        if (r5 == null) {
            A002 = C289295dM.A06(A07, C289295dM.A05(f, C289295dM.A04(C289295dM.A00(A07), A07)));
        } else {
            AnonymousClass6Gj r4 = AnonymousClass6Gj.Horizontal;
            if (r5 == r4) {
                A022 = C289295dM.A01(A07);
            } else {
                A022 = C289295dM.A02(A07);
            }
            float signum = A022 - (Math.signum(A022) * f);
            if (r5 == r4) {
                A002 = C289325dP.A00(signum, C289295dM.A02(A07));
            } else {
                A002 = C289325dP.A00(C289295dM.A01(A07), signum);
            }
        }
        return C51965G9l.A0M(A002);
    }

    public GWR(AnonymousClass6Gj r3) {
        this.A01 = r3;
        this.A00 = 0;
    }

    public GWR() {
        this((AnonymousClass6Gj) null);
    }
}
