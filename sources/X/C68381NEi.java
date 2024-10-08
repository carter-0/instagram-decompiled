package X;

import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: X.NEi  reason: case insensitive filesystem */
public final class C68381NEi extends C68383NEk {
    public Paint A00;
    public final float A01;
    public final float A02;
    public final Integer A03;

    public C68381NEi(DisplayMetrics displayMetrics, Integer num, int i, int i2) {
        super(displayMetrics, i);
        this.A03 = num;
        this.A01 = i2;
        float applyDimension = TypedValue.applyDimension(2, 2.0f, displayMetrics);
        this.A01 = applyDimension;
        float applyDimension2 = TypedValue.applyDimension(2, 8.0f, displayMetrics);
        this.A02 = applyDimension2;
        float f = this.A00;
        float f2 = applyDimension + applyDimension2;
        this.A00 = f < f2 ? f2 : f;
    }
}
