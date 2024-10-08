package X;

import android.graphics.RectF;

/* renamed from: X.WMg  reason: case insensitive filesystem */
public final class C19125WMg implements C20974X7e {
    public final C17562VaG ASu(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f5;
        RectF rectF = W3G.A00;
        if (f >= 0.0f && f <= 1.0f) {
            if (f >= f2) {
                if (f > f3) {
                    f8 = f7;
                } else {
                    f = (f - f2) / (f3 - f2);
                }
            }
            float f9 = f8 / f5;
            float f10 = f8 / f7;
            return new C17562VaG(f9, f10, f4 * f9, f8, f6 * f10, f8);
        }
        f8 = C13988Tno.A00(f7, f5, f);
        float f92 = f8 / f5;
        float f102 = f8 / f7;
        return new C17562VaG(f92, f102, f4 * f92, f8, f6 * f102, f8);
    }

    public final void AC4(RectF rectF, C17562VaG vaG, float f) {
        float A00 = (AnonymousClass7TE.A00(vaG.A01, vaG.A03) / 2.0f) * f;
        rectF.left += A00;
        rectF.right -= A00;
    }

    public final boolean Esa(C17562VaG vaG) {
        return AnonymousClass7TF.A1R((vaG.A03 > vaG.A01 ? 1 : (vaG.A03 == vaG.A01 ? 0 : -1)));
    }
}
