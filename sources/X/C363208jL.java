package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8jL  reason: invalid class name and case insensitive filesystem */
public final class C363208jL extends Drawable {
    public double A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public final float A07;
    public final Paint A08;
    public final PointF A09 = new PointF();
    public final int A0A;
    public final Path A0B = new Path();
    public final PointF A0C = new PointF();
    public final PointF A0D = new PointF();
    public final PointF A0E = new PointF();
    public final PointF A0F = new PointF();
    public final List A0G = new ArrayList();
    public final boolean A0H;

    public final int getOpacity() {
        return -3;
    }

    public final void A00(int i, int i2, int i3, int i4) {
        this.A05 = i;
        this.A06 = i2;
        this.A04 = i3;
        this.A03 = i4;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int i;
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Rect bounds = getBounds();
        int i8 = this.A0A;
        Canvas canvas2 = canvas;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 3) {
                    f = (float) (bounds.left + this.A05);
                    f2 = (float) (bounds.top + this.A06);
                    f3 = f + this.A07;
                } else if (i8 == 5) {
                    f3 = (float) (bounds.right - this.A04);
                    f = f3 - this.A07;
                    f2 = (float) (bounds.top + this.A06);
                } else if (i8 == 16) {
                    float f5 = ((float) (bounds.left + bounds.right)) / 2.0f;
                    float f6 = this.A07 / 2.0f;
                    float f7 = (float) this.A01;
                    f = (f5 - f6) - f7;
                    int i9 = this.A02;
                    f2 = (float) ((bounds.top + this.A06) - i9);
                    f3 = (f5 + f6) - f7;
                    i3 = (bounds.bottom - this.A03) - i9;
                    f4 = (float) i3;
                } else if (i8 == 48) {
                    int i10 = bounds.left;
                    boolean z = this.A0H;
                    if (z) {
                        i4 = this.A04;
                    } else {
                        i4 = this.A05;
                    }
                    f = (float) (i10 + i4);
                    f2 = (float) (bounds.top + this.A06);
                    int i11 = bounds.right;
                    if (z) {
                        i5 = this.A05;
                    } else {
                        i5 = this.A04;
                    }
                    f3 = (float) (i11 - i5);
                    f4 = f2 + this.A07;
                } else if (i8 == 80) {
                    int i12 = bounds.left;
                    boolean z2 = this.A0H;
                    if (z2) {
                        i6 = this.A04;
                    } else {
                        i6 = this.A05;
                    }
                    f = (float) (i12 + i6);
                    f4 = (float) (bounds.bottom - this.A03);
                    f2 = f4 - this.A07;
                    int i13 = bounds.right;
                    if (z2) {
                        i7 = this.A05;
                    } else {
                        i7 = this.A04;
                    }
                    f3 = (float) (i13 - i7);
                } else {
                    return;
                }
                i3 = bounds.bottom - this.A03;
                f4 = (float) i3;
            } else {
                int i14 = bounds.left;
                boolean z3 = this.A0H;
                if (z3) {
                    i = this.A04;
                } else {
                    i = this.A05;
                }
                int i15 = this.A01;
                f = (float) ((i14 + i) - i15);
                float f8 = ((float) (bounds.top + bounds.bottom)) / 2.0f;
                float f9 = this.A07 / 2.0f;
                float f10 = (float) this.A02;
                f2 = (f8 - f9) - f10;
                int i16 = bounds.right;
                if (z3) {
                    i2 = this.A05;
                } else {
                    i2 = this.A04;
                }
                f3 = (float) ((i16 - i2) - i15);
                f4 = (f8 + f9) - f10;
            }
            canvas2.drawRect(f, f2, f3, f4, this.A08);
            return;
        }
        double d = this.A00;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        if (cos != 0.0f) {
            PointF pointF = this.A09;
            float f11 = pointF.y + (((-pointF.x) / cos) * sin);
            if (f11 >= ((float) bounds.top) && f11 < ((float) bounds.bottom)) {
                PointF pointF2 = this.A0D;
                pointF2.x = (float) (bounds.left - this.A01);
                pointF2.y = f11;
                this.A0G.add(pointF2);
            }
            int i17 = bounds.right;
            float f12 = pointF.y + (((((float) i17) - pointF.x) / cos) * sin);
            if (f12 >= ((float) bounds.top) && f12 < ((float) bounds.bottom)) {
                PointF pointF3 = this.A0E;
                pointF3.x = (float) (i17 - this.A01);
                pointF3.y = f12;
                this.A0G.add(pointF3);
            }
        }
        if (sin != 0.0f) {
            PointF pointF4 = this.A09;
            float f13 = pointF4.x + (((-pointF4.y) / sin) * cos);
            if (f13 >= ((float) bounds.left) && f13 < ((float) bounds.right)) {
                PointF pointF5 = this.A0F;
                pointF5.x = f13;
                pointF5.y = (float) (bounds.top - this.A02);
                this.A0G.add(pointF5);
            }
            int i18 = bounds.bottom;
            float f14 = pointF4.x + (((((float) i18) - pointF4.y) / sin) * cos);
            if (f14 >= ((float) bounds.left) && f14 < ((float) bounds.right)) {
                PointF pointF6 = this.A0C;
                pointF6.x = f14;
                pointF6.y = (float) (i18 - this.A02);
                this.A0G.add(pointF6);
            }
        }
        List list = this.A0G;
        if (list.size() >= 2) {
            PointF pointF7 = (PointF) list.get(0);
            PointF pointF8 = (PointF) list.get(list.size() - 1);
            Path path = this.A0B;
            path.moveTo(pointF7.x, pointF7.y);
            path.lineTo(pointF8.x, pointF8.y);
            canvas2.drawPath(path, this.A08);
            list.clear();
            path.reset();
        }
    }

    public final void setAlpha(int i) {
        this.A08.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C363208jL(Context context, float f, int i, int i2) {
        Paint paint = new Paint(1);
        this.A08 = paint;
        this.A07 = f;
        this.A0A = i2;
        paint.setColor(context.getColor(i));
        this.A0H = 0mk.A02(context);
    }
}
