package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;

public final class J6X extends 0Yg implements 0sP {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final long A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6X(float f, float f2, float f3, int i, long j) {
        super(1);
        this.A03 = i;
        if (i != 0) {
            this.A02 = f;
            this.A00 = f2;
            this.A04 = j;
            this.A01 = f3;
        } else {
            this.A01 = f;
            this.A02 = f2;
            this.A04 = j;
            this.A00 = f3;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        switch (this.A03) {
            case 0:
                AnonymousClass5Q4 r3 = (AnonymousClass5Q4) obj2;
                0qQ.A0B(r3, 0);
                float f = this.A01 / 2.0f;
                r3.AQW();
                long j = this.A04;
                float F06 = r3.F06(this.A02 + f);
                float f2 = this.A00;
                long A002 = C289325dP.A00(f2, f2);
                C289635dw r5 = C289635dw.A00;
                r3.AQV((C288195bW) null, r5, F06, 1.0f, 3, j, A002);
                AnonymousClass5Q4 r13 = r3;
                C289635dw r15 = r5;
                r13.AQV((C288195bW) null, r15, r3.F06(f), 1.0f, 3, C51965G9l.A08(4284409671L), A002);
                break;
            case 1:
                AnonymousClass6GH r32 = (AnonymousClass6GH) obj2;
                0qQ.A0B(r32, 0);
                float f3 = this.A00;
                long j2 = this.A04;
                return r32.A00(new J6X(f3, this.A01, (C288025bF.A00(r32.A00.Bwg()) * 0.8333333f) + (this.A02 * r32.AwL()), 0, j2));
            default:
                AnonymousClass5Q3 A0T = C51968G9o.A0T(obj2);
                float f4 = this.A00;
                long j3 = this.A04;
                float f5 = this.A02;
                float f6 = this.A01;
                AnonymousClass5QA A0r = G9t.A0r(A0T);
                AnonymousClass5S8 r10 = new AnonymousClass5S8();
                Paint paint = r10.A01;
                if (!C289095d0.A01(f4, 0.0f)) {
                    paint.setMaskFilter(new BlurMaskFilter(A0T.F06(f4), BlurMaskFilter.Blur.NORMAL));
                }
                paint.setColor(C285595Rx.A00(j3));
                float F062 = A0T.F06(f5);
                long Bwg = A0T.Bwg();
                A0r.AQt(r10, (-F062) / 3.0f, F062, C288025bF.A02(Bwg) + F062, C288025bF.A00(Bwg) + F062, A0T.F06(f6), A0T.F06(f6));
                break;
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6X(float f, long j, float f2, float f3, int i) {
        super(1);
        this.A03 = 2;
        this.A00 = f;
        this.A04 = j;
        this.A02 = f2;
        this.A01 = f3;
    }
}
