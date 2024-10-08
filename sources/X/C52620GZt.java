package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.GZt  reason: case insensitive filesystem */
public final class C52620GZt implements AnonymousClass5WO {
    public final AnonymousClass6Gj A00;
    public final GZF A01;

    public final Object DYV(AnonymousClass4D7 r4, long j, long j2) {
        return new GQ9(GQ9.A01(0.0f, 0.0f, 1, j2));
    }

    public final long DYX(long j, long j2, int i) {
        float A02;
        if (i != 2) {
            return 0;
        }
        if (this.A00 == AnonymousClass6Gj.Horizontal) {
            A02 = C289295dM.A01(j2);
        } else {
            A02 = C289295dM.A02(j2);
        }
        if (A02 == 0.0f) {
            return 0;
        }
        throw new CancellationException("Scroll cancelled");
    }

    public final long DYf(long j, int i) {
        float A02;
        if (i != 1) {
            return 0;
        }
        GZF gzf = this.A01;
        AnonymousClass5PZ r3 = gzf.A0N.A04;
        if (((double) Math.abs(r3.B6X())) <= 1.0E-6d) {
            return 0;
        }
        float B6X = r3.B6X();
        C284945Oz r2 = gzf.A0C;
        float f = B6X * ((float) ((GZQ) r2.getValue()).A05);
        float f2 = (((float) (C51970G9q.A0Q(r2).A05 + C51970G9q.A0Q(r2).A06)) * (-Math.signum(r3.B6X()))) + f;
        if (r3.B6X() > 0.0f) {
            float f3 = f2;
            f2 = f;
            f = f3;
        }
        AnonymousClass6Gj r32 = this.A00;
        AnonymousClass6Gj r22 = AnonymousClass6Gj.Horizontal;
        if (r32 == r22) {
            A02 = C289295dM.A01(j);
        } else {
            A02 = C289295dM.A02(j);
        }
        float f4 = -gzf.A0G.APi(-C229632nm.A02(A02, f, f2));
        if (r32 != r22) {
            f4 = C289295dM.A01(j);
        }
        float A022 = C289295dM.A02(j);
        return (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(A022)) & 4294967295L);
    }

    public C52620GZt(AnonymousClass6Gj r1, GZF gzf) {
        this.A01 = gzf;
        this.A00 = r1;
    }

    public final /* synthetic */ Object DYa(AnonymousClass4D7 r2, long j) {
        return GQ9.A04();
    }
}
