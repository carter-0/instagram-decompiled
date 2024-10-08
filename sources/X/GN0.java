package X;

import android.widget.ImageView;
import com.instagram.android.R;

public final class GN0 extends C251343mx {
    public final float A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final boolean A04;

    public final C251263mp A0X(AnonymousClass3Y5 r12) {
        0qQ.A0B(r12, 0);
        if (this.A04) {
            AnonymousClass3XV r0 = 2WX.A02;
            2WX A0X = C51965G9l.A0X((2WX) null, C51968G9o.A0d(AnonymousClass05K.A0Y, C244413b9.ABSOLUTE));
            long j = this.A03;
            2WX A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0X, AnonymousClass05K.A0C, 1, j), AnonymousClass05K.A0N, 1, j);
            long doubleToRawLongBits = Double.doubleToRawLongBits(15.0d);
            2WX A0H = C51974G9v.A0H(A002, C51967G9n.A0U(0, doubleToRawLongBits), 0, doubleToRawLongBits);
            2Wb A0Q = C51972G9s.A0Q(r12);
            2WX A0T = C51972G9s.A0T(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A00, 0, Double.doubleToRawLongBits(24.5d)), 0, Double.doubleToRawLongBits(22.0d));
            C51974G9v.A0g(C244013aV.A0D(A0Q, R.drawable.ff_heart_with_border), ImageView.ScaleType.FIT_XY, A0Q.A00, A0Q, A0T);
            return C243563Zg.A0B(A0Q, r12, A0H);
        }
        float f = this.A00;
        float f2 = 20.0f;
        if (f >= 40.0f) {
            f2 = 28.0f;
        }
        float f3 = 4.0f;
        if (f >= 40.0f) {
            f3 = 5.0f;
        }
        float f4 = (f - f2) + f3;
        AnonymousClass3XV r02 = 2WX.A02;
        2WX A0X2 = C51965G9l.A0X((2WX) null, C51968G9o.A0d(AnonymousClass05K.A0Y, C244413b9.ABSOLUTE));
        long j2 = this.A03;
        2WX A003 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0X2, AnonymousClass05K.A0C, 1, j2), AnonymousClass05K.A0N, 1, j2);
        long A06 = C51965G9l.A06(f4);
        2WX A0H2 = C51974G9v.A0H(A003, C51967G9n.A0U(0, A06), 0, A06);
        2Wb A0Q2 = C51972G9s.A0Q(r12);
        int i = this.A02;
        return C51967G9n.A0Q(new C249263jP(ImageView.ScaleType.FIT_XY, C51974G9v.A0M((2WX) null, AnonymousClass05K.A00, 0, C51965G9l.A06(f2)), (Integer) null, i, C244013aV.A02(A0Q2, this.A01)), A0Q2, r12, A0H2);
    }

    public GN0(float f, int i, int i2, long j, boolean z) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
        this.A04 = z;
        this.A03 = j;
    }
}
