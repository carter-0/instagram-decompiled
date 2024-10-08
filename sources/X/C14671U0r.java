package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.U0r  reason: case insensitive filesystem */
public final class C14671U0r extends Drawable {
    public float A00;
    public int A01 = -1;
    public int A02 = 0;
    public final int A03;
    public final Paint A04 = JTP.A0D();

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return (int) (this.A00 * 2.0f);
    }

    public final int getIntrinsicWidth() {
        return (int) (this.A00 * 2.0f);
    }

    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    public C14671U0r(Context context) {
        this.A03 = AnonymousClass7TG.A04(context);
    }

    public final void draw(Canvas canvas) {
        float A012 = C66581MXm.A01(this);
        float exactCenterY = getBounds().exactCenterY();
        Paint paint = this.A04;
        paint.setColor(this.A02);
        canvas.drawCircle(A012, exactCenterY, this.A00, paint);
        paint.setColor(this.A01);
        canvas.drawCircle(A012, exactCenterY, this.A00 - ((float) this.A03), paint);
    }
}
