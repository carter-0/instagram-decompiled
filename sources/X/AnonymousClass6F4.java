package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.6F4  reason: invalid class name */
public final class AnonymousClass6F4 extends C267794cD implements C268434dO {
    public float A00;
    public C270284gU A01;
    public C270284gU A02;

    public final /* synthetic */ int CmX(C268084cj r2, C268014cc r3, int i) {
        return GR6.A00(r2, r3, this, i);
    }

    public final /* synthetic */ int Cma(C268084cj r2, C268014cc r3, int i) {
        return GR6.A01(r2, r3, this, i);
    }

    public final /* synthetic */ int CoQ(C268084cj r2, C268014cc r3, int i) {
        return GR6.A02(r2, r3, this, i);
    }

    public final /* synthetic */ int CoT(C268084cj r2, C268014cc r3, int i) {
        return GR6.A03(r2, r3, this, i);
    }

    public final C289145d6 Cny(C268074ci r6, C268004cb r7, long j) {
        int i;
        int i2;
        int A03;
        int A022;
        C270284gU r1 = this.A02;
        if (r1 == null || ((Number) r1.getValue()).intValue() == Integer.MAX_VALUE) {
            i = Integer.MAX_VALUE;
        } else {
            i = Math.round(((Number) r1.getValue()).floatValue() * this.A00);
        }
        C270284gU r12 = this.A01;
        if (r12 == null || ((Number) r12.getValue()).intValue() == Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = Math.round(((Number) r12.getValue()).floatValue() * this.A00);
        }
        if (i != Integer.MAX_VALUE) {
            A03 = i;
        } else {
            A03 = Constraints.A03(j);
        }
        if (i2 != Integer.MAX_VALUE) {
            A022 = i2;
        } else {
            A022 = Constraints.A02(j);
        }
        if (i == Integer.MAX_VALUE) {
            i = Constraints.A01(j);
        }
        if (i2 == Integer.MAX_VALUE) {
            i2 = Constraints.A00(j);
        }
        C267974cY Cnz = r6.Cnz(AnonymousClass5SF.A04(A03, i, A022, i2));
        int i3 = Cnz.A01;
        int i4 = Cnz.A00;
        return r7.Cfi(0Yt.A0E(), new AnonymousClass9L6(Cnz, 19), i3, i4);
    }
}
