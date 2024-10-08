package X;

import android.graphics.RectF;

/* renamed from: X.6KT  reason: invalid class name */
public final class AnonymousClass6KT {
    public float A00 = 1.0f;
    public final RectF A01;
    public final RectF A02;
    public final boolean A03;

    public static AnonymousClass6KT A00() {
        float A09 = ((float) 0nA.A09(C60960kU.A00)) / 2.0f;
        float A08 = ((float) 0nA.A08(C60960kU.A00)) / 2.0f;
        return A03(new RectF(A09, A08, A09, A08));
    }

    public static AnonymousClass6KT A01() {
        float A09 = ((float) 0nA.A09(C60960kU.A00)) / 2.0f;
        float A08 = (float) 0nA.A08(C60960kU.A00);
        return A03(new RectF(A09, A08, A09, A08));
    }

    public static AnonymousClass6KT A02() {
        float A09 = (float) 0nA.A09(C60960kU.A00);
        float A08 = (float) 0nA.A08(C60960kU.A00);
        return A03(new RectF(0.0f, A08, A09, 2.0f * A08));
    }

    public static AnonymousClass6KT A03(RectF rectF) {
        return new AnonymousClass6KT(new RectF(-1.0f, -1.0f, -1.0f, -1.0f), rectF, true);
    }

    public AnonymousClass6KT(RectF rectF, RectF rectF2, boolean z) {
        RectF rectF3 = new RectF();
        this.A01 = rectF3;
        RectF rectF4 = new RectF();
        this.A02 = rectF4;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        this.A03 = z;
    }

    public static AnonymousClass6KT A04(RectF rectF) {
        return new AnonymousClass6KT(rectF, new RectF(rectF.centerX(), rectF.centerY(), rectF.centerX(), rectF.centerY()), false);
    }
}
