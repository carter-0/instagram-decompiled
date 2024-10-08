package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;

/* renamed from: X.8Os  reason: invalid class name and case insensitive filesystem */
public final class C355118Os extends Drawable {
    public static final int[] A08 = {-65536, -65281, -16776961, -16711681, -16711936, -256, -65536};
    public int A00;
    public int A01;
    public int A02;
    public final Paint A03 = new Paint(1);
    public final Paint A04 = new Paint(1);
    public final Rect A05;
    public final int A06;
    public final Paint A07;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.drawCircle((float) this.A00, (float) this.A01, (float) this.A02, this.A03);
        canvas.drawCircle((float) this.A00, (float) this.A01, (float) this.A02, this.A04);
    }

    public final int getOpacity() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A00 = rect.centerX();
        this.A01 = rect.centerY();
        this.A02 = rect.width() / 2;
        SweepGradient sweepGradient = new SweepGradient((float) this.A00, (float) this.A01, A08, (float[]) null);
        RadialGradient radialGradient = new RadialGradient((float) this.A00, (float) this.A01, (float) this.A02, -1, 16711680, Shader.TileMode.CLAMP);
        this.A03.setShader(sweepGradient);
        this.A04.setShader(radialGradient);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return (this.A02 + this.A06) * 2;
    }

    public final int getIntrinsicWidth() {
        return (this.A02 + this.A06) * 2;
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A04.setAlpha(i);
        this.A07.setAlpha(i);
    }

    public C355118Os(int i) {
        this.A06 = i;
        Paint paint = new Paint(1);
        this.A07 = paint;
        this.A05 = new Rect();
        paint.setColor(-1);
    }
}
