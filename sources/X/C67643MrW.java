package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.MrW  reason: case insensitive filesystem */
public final class C67643MrW extends Drawable {
    public int A00;
    public Path A01;
    public Path A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final float A06 = 9.0f;
    public final int A07;
    public final int A08;
    public final Paint A09;
    public final Paint A0A;

    public final void draw(Canvas canvas) {
        int i;
        Path path;
        int i2;
        Path path2;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        if (this.A03 || this.A05) {
            getBounds().exactCenterX();
            getBounds().exactCenterY();
            float f = this.A06;
            if (this.A05) {
                i = this.A00;
            } else {
                i = 0;
            }
            float f2 = f - ((float) i);
            RectF rectF = new RectF(getBounds());
            rectF.inset(f2, f2);
            RectF rectF2 = new RectF(getBounds());
            this.A01.reset();
            path = this.A01;
            path.addOval(rectF2, Path.Direction.CW);
            path.addOval(rectF, Path.Direction.CCW);
        } else {
            path = this.A01;
        }
        this.A01 = path;
        canvas2.drawPath(path, this.A09);
        int level = getLevel() / 100;
        if (this.A04 || this.A05) {
            float f3 = (((float) level) * 360.0f) / 100.0f;
            float A012 = C66581MXm.A01(this);
            float exactCenterY = getBounds().exactCenterY();
            float f4 = this.A06;
            if (this.A05) {
                i2 = this.A00;
            } else {
                i2 = 0;
            }
            float f5 = f4 - ((float) i2);
            float f6 = f5 / 2.0f;
            float f7 = A012 - f5;
            RectF rectF3 = new RectF(getBounds());
            rectF3.inset(f5, f5);
            RectF rectF4 = new RectF(getBounds());
            this.A02.reset();
            path2 = this.A02;
            if (f3 >= 360.0f || f3 <= -360.0f) {
                path2.addOval(rectF4, Path.Direction.CW);
                path2.addOval(rectF3, Path.Direction.CCW);
            } else {
                path2.setFillType(Path.FillType.WINDING);
                float f8 = exactCenterY - f7;
                path2.moveTo(A012, f8);
                path2.arcTo(new RectF(A012 - f6, exactCenterY - (f7 + f5), A012 + f6, f8), 90.0f, 180.0f, false);
                path2.arcTo(rectF4, 270.0f, f3, false);
                double radians = Math.toRadians((360.0d * (((double) level) / 100.0d)) - 90.0d);
                int i3 = getBounds().right - getBounds().left;
                float cos = (float) Math.cos(radians);
                float f9 = (float) i3;
                float f10 = f4 / 2.0f;
                float f11 = (((cos * f9) + f9) / 2.0f) - (cos * f10);
                float sin = (float) Math.sin(radians);
                PointF pointF = new PointF(f11, (((sin * f9) + f9) / 2.0f) - (sin * f10));
                float f12 = pointF.x;
                float f13 = pointF.y;
                float f14 = f3 - 90.0f;
                path2.arcTo(new RectF(f12 - f6, f13 - f6, f12 + f6, f13 + f6), f14, 180.0f, false);
                path2.arcTo(rectF3, f14, -f3, false);
                path2.close();
            }
            this.A04 = false;
        } else {
            path2 = this.A02;
        }
        this.A02 = path2;
        canvas2.drawPath(path2, this.A0A);
    }

    @Deprecated(message = "parent deprecated too", replaceWith = @ReplaceWith(expression = "PixelFormat", imports = {}))
    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        Paint paint = this.A0A;
        float exactCenterX = rect.exactCenterX();
        float exactCenterY = rect.exactCenterY();
        int i = this.A07;
        paint.setShader(new SweepGradient(exactCenterX, exactCenterY, new int[]{i, this.A08, i}, new float[]{0.0f, 0.5f, 1.0f}));
        this.A04 = true;
        this.A03 = true;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C67643MrW(int i, int i2, int i3) {
        this.A07 = i;
        this.A08 = i2;
        this.A0A = AnonymousClass7TE.A0V(1);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A09 = A0V;
        this.A01 = C51965G9l.A0C();
        this.A02 = C51965G9l.A0C();
        this.A04 = true;
        this.A03 = true;
        A0V.setColor(i3);
    }

    public final boolean onLevelChange(int i) {
        super.onLevelChange(i);
        this.A04 = true;
        invalidateSelf();
        return true;
    }
}
