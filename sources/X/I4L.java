package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

public final class I4L {
    public static final C286015Tp A05 = C305126Gq.A00(C58892IzH.A00, C52695Gb7.A00);
    public long A00;
    public AnonymousClass5VN A01;
    public final AnonymousClass5PZ A02;
    public final AnonymousClass5PZ A03;
    public final C284945Oz A04;

    public final void A00(AnonymousClass6Gj r9, AnonymousClass5VN r10, int i, int i2) {
        float f;
        float f2;
        float f3 = (float) (i2 - i);
        this.A02.EWt(f3);
        float f4 = r10.A01;
        AnonymousClass5VN r2 = this.A01;
        if (!(f4 == r2.A01 && r10.A03 == r2.A03)) {
            if (r9 == AnonymousClass6Gj.Vertical) {
                f4 = r10.A03;
                f = r10.A00;
            } else {
                f = r10.A02;
            }
            AnonymousClass5PZ r4 = this.A03;
            float B6X = r4.B6X();
            float f5 = (float) i;
            float f6 = B6X + f5;
            if (f > f6 || (f4 < B6X && f - f4 > f5)) {
                f2 = f - f6;
            } else if (f4 >= B6X || f - f4 > f5) {
                f2 = 0.0f;
            } else {
                f2 = f4 - B6X;
            }
            r4.EWt(r4.B6X() + f2);
            this.A01 = r10;
        }
        AnonymousClass5PZ r22 = this.A03;
        r22.EWt(C229632nm.A02(r22.B6X(), 0.0f, f3));
    }

    public I4L(AnonymousClass6Gj r3, float f) {
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A03 = new ParcelableSnapshotMutableFloatState(f);
        this.A02 = new ParcelableSnapshotMutableFloatState(0.0f);
        this.A01 = AnonymousClass5VN.A04;
        this.A00 = C285965Tk.A01;
        this.A04 = C51969G9p.A0S(r3);
    }

    public I4L() {
        this(AnonymousClass6Gj.Vertical, 0.0f);
    }
}
