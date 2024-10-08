package X;

import android.graphics.Path;

public final class IG3 implements AnonymousClass5S2 {
    public final boolean A00;

    public final C289315dO AMX(C268024cd r6, AnonymousClass5Q8 r7, long j) {
        boolean z = this.A00;
        C3018160e A002 = C3026864w.A00();
        float A02 = C288025bF.A02(j) / 2.0f;
        if (z) {
            float A003 = C288025bF.A00(j);
            Path path = A002.A03;
            path.moveTo(A02, A003);
            path.lineTo(C288025bF.A02(j), 0.0f);
            path.lineTo(0.0f, 0.0f);
        } else {
            Path path2 = A002.A03;
            path2.moveTo(A02, 0.0f);
            path2.lineTo(C288025bF.A02(j), C288025bF.A00(j));
            path2.lineTo(0.0f, C288025bF.A00(j));
        }
        return new C289335dQ(A002);
    }

    public IG3(boolean z) {
        this.A00 = z;
    }
}
