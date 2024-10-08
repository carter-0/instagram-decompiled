package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.UGx  reason: case insensitive filesystem */
public final class C14959UGx extends C14633Tzf {
    public float A00;
    public C18608Vv1 A01;
    public final float A02;
    public final Rect A03 = new Rect();
    public final RectF A04 = new RectF();
    public final RectF A05 = new RectF();
    public final Drawable A06;
    public final C69419Nl1 A07;
    public final Paint A08;

    public final void A0D(Canvas canvas) {
        Drawable drawable = this.A06;
        Rect rect = this.A03;
        drawable.setBounds(rect);
        canvas.drawCircle((float) rect.centerX(), (float) rect.centerY(), (float) (rect.width() >> 1), this.A08);
        drawable.setAlpha(76);
        drawable.draw(canvas);
    }

    public C14959UGx(Drawable drawable, WFU wfu, C69419Nl1 nl1, C18608Vv1 vv1) {
        super(wfu);
        Paint paint = new Paint();
        this.A08 = paint;
        this.A01 = vv1;
        this.A06 = drawable;
        float f = this.A0A;
        this.A02 = (f * 48.0f) / 2.0f;
        this.A00 = (float) ((int) (f * 8.0f));
        this.A03 = 5;
        this.A02 = 4.0f;
        this.A07 = nl1;
        paint.setColor(-1);
        paint.setAlpha(178);
    }
}
