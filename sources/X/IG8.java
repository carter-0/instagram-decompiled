package X;

public final class IG8 implements AnonymousClass5WO {
    public final /* synthetic */ I4K A00;

    public IG8(I4K i4k) {
        this.A00 = i4k;
    }

    public final long DYX(long j, long j2, int i) {
        I4K i4k = this.A00;
        float A02 = C289295dM.A02(j2);
        if (A02 < 0.0f) {
            A02 = 0.0f;
        }
        return C289325dP.A00(0.0f, i4k.A00(A02));
    }

    public final long DYf(long j, int i) {
        float f;
        I4K i4k = this.A00;
        float A02 = C289295dM.A02(j);
        float f2 = A02;
        if (A02 > 0.0f) {
            f2 = 0.0f;
        }
        float A002 = i4k.A00(f2);
        0sP r1 = (0sP) i4k.A02.getValue();
        if (r1 != null) {
            f = AnonymousClass7TE.A04(r1.invoke(Float.valueOf(A02 - A002)));
        } else {
            f = 0.0f;
        }
        return C289325dP.A00(0.0f, A002 + f);
    }

    public final /* synthetic */ Object DYV(AnonymousClass4D7 r2, long j, long j2) {
        return GQ9.A04();
    }

    public final /* synthetic */ Object DYa(AnonymousClass4D7 r2, long j) {
        return GQ9.A04();
    }
}
