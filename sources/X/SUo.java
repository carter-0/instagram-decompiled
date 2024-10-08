package X;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

public final class SUo implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ float A05;
    public final /* synthetic */ float A06;
    public final /* synthetic */ float A07;
    public final /* synthetic */ SFX A08;
    public final /* synthetic */ C10779Rxz A09;

    public SUo(SFX sfx, C10779Rxz rxz, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.A08 = sfx;
        this.A06 = f;
        this.A02 = f2;
        this.A07 = f3;
        this.A03 = f4;
        this.A09 = rxz;
        this.A04 = f5;
        this.A00 = f6;
        this.A05 = f7;
        this.A01 = f8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Q7t q7t;
        ValueAnimator valueAnimator2 = valueAnimator;
        0qQ.A0B(valueAnimator2, 0);
        float A042 = C51970G9q.A04(valueAnimator2.getAnimatedValue(), AnonymousClass000.A00(338));
        SFX sfx = this.A08;
        float f = this.A06;
        float f2 = f + ((this.A02 - f) * A042);
        float f3 = this.A07;
        float f4 = f3 + ((this.A03 - f3) * A042);
        C12061Slo slo = this.A09.A04;
        float f5 = this.A04;
        float f6 = f5 + ((this.A00 - f5) * A042);
        float f7 = this.A05;
        float f8 = f7 + ((this.A01 - f7) * A042);
        Rect A0W = AnonymousClass7TE.A0W();
        C10779Rxz rxz = sfx.A05;
        int i = rxz.A03;
        int i2 = rxz.A02;
        S9P.A01(A0W, i, i2);
        int centerX = A0W.centerX();
        int centerY = A0W.centerY();
        int width = A0W.width() / 2;
        int width2 = A0W.width() / 2;
        int i3 = centerX - (width / 2);
        A0W.left = i3;
        int i4 = centerY - (width2 / 2);
        A0W.top = i4;
        A0W.right = i3 + width;
        A0W.bottom = i4 + width2;
        int i5 = rxz.A01;
        int i6 = rxz.A00;
        Matrix A002 = C11321SMv.A00(i, i2, i5, i6);
        A002.invert(A002);
        A002.postTranslate(f2, f4);
        RectF rectF = new RectF(A0W);
        A002.mapRect(rectF);
        A0W.left = (int) rectF.left;
        A0W.top = (int) rectF.top;
        A0W.right = (int) rectF.right;
        A0W.bottom = (int) rectF.bottom;
        S6R s6r = new S6R(A0W, f6, f8, i5, i6);
        if (slo.A0E && (q7t = slo.A09) != null) {
            AnonymousClass7TE.A1S(q7t, s6r, 0);
        }
    }
}
