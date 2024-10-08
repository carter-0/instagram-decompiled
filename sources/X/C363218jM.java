package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import com.instagram.android.R;

/* renamed from: X.8jM  reason: invalid class name and case insensitive filesystem */
public final class C363218jM {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public Rect A04;
    public Integer A05 = AnonymousClass05K.A00;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Rect A09 = new Rect();
    public final C363198jK A0A;
    public final C363198jK A0B;

    public final void A00(int i, int i2) {
        float f = (float) i;
        this.A03 = f;
        float f2 = (float) i2;
        this.A00 = f2;
        this.A02 = f;
        this.A01 = f2;
        boolean z = false;
        this.A0B.A06.A00(0, i, 0, 0);
        this.A0A.A06.A00(0, i2, 0, 0);
        if (!(i == 0 || i2 == 0)) {
            z = true;
        }
        this.A06 = z;
    }

    public C363218jM(Context context, 2cp r5) {
        Integer num = AnonymousClass05K.A0C;
        this.A0B = new C363198jK(context, r5, num);
        this.A0A = new C363198jK(context, r5, num);
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.design_dark_default_color_on_background));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material));
        this.A08 = paint;
    }
}
