package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.5iH  reason: invalid class name and case insensitive filesystem */
public abstract class C292035iH {
    public static final long A00(float f, int i, long j, boolean z) {
        int i2;
        if ((z || i == 2) && Constraints.A07(j)) {
            i2 = Constraints.A01(j);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        int A03 = Constraints.A03(j);
        if (A03 != i2) {
            i2 = C229632nm.A03(AnonymousClass5iI.A00(f), A03, i2);
        }
        return C288985co.A04(0, i2, 0, Constraints.A00(j));
    }
}
