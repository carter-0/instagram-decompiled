package X;

import android.content.Context;
import android.graphics.RectF;

public final class OJW {
    public final Context A00;

    public final OBS A00(RectF rectF, Float f, Float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i) {
        float width;
        float f14;
        float f15;
        float f16 = f6;
        float A09 = (float) 0nA.A09(this.A00);
        boolean A1R = AnonymousClass7TF.A1R((f3 > (f6 / f5) ? 1 : (f3 == (f6 / f5) ? 0 : -1)));
        RectF rectF2 = rectF;
        if (f3 > rectF2.width() / rectF2.height()) {
            width = rectF2.height() / (A09 / f3);
            f14 = rectF2.left - (((A09 * width) - rectF2.width()) / 2.0f);
        } else {
            width = rectF2.width() / A09;
            f14 = rectF2.left;
        }
        float height = (rectF2.top + f12) - (((width * f4) - rectF2.height()) / 2.0f);
        if (f != null) {
            f15 = f.floatValue();
        } else if (A1R) {
            f15 = f6 / f3;
        } else {
            f15 = f5;
        }
        if (f2 != null) {
            f16 = f2.floatValue();
        } else if (!A1R) {
            f16 = f5 * f3;
        }
        return new OBS(new C70716OHl(width, f14, height, rectF2.height() / width, rectF2.width() / width, f7 / width, f13, 0), new C70716OHl(f9, f10, f11, f15, f16, f8, 0.0f, i));
    }

    public OJW(Context context) {
        this.A00 = context;
    }
}
