package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.6Xw  reason: invalid class name and case insensitive filesystem */
public abstract class C309336Xw {
    public C309276Xq A00;
    public C309306Xt A01;

    public void A03(Canvas canvas, float f) {
        float f2;
        C309326Xv r2 = (C309326Xv) this;
        C309276Xq r3 = r2.A00;
        C309266Xp r4 = (C309266Xp) r3;
        float f3 = (((float) r4.A02) / 2.0f) + ((float) r4.A01);
        canvas.translate(f3, f3);
        canvas.rotate(-90.0f);
        float f4 = -f3;
        canvas.clipRect(f4, f4, f3, f3);
        int i = -1;
        if (r4.A00 == 0) {
            i = 1;
        }
        r2.A03 = i;
        int i2 = r4.A04;
        r2.A02 = ((float) i2) * f;
        r2.A01 = ((float) r4.A03) * f;
        r2.A00 = ((float) (r4.A02 - i2)) / 2.0f;
        if ((r2.A01.A02() && r3.A01 == 2) || (r2.A01.A01() && r3.A00 == 1)) {
            f2 = r2.A00 + (((1.0f - f) * ((float) r3.A04)) / 2.0f);
        } else if ((r2.A01.A02() && r3.A01 == 1) || (r2.A01.A01() && r3.A00 == 2)) {
            f2 = r2.A00 - (((1.0f - f) * ((float) r3.A04)) / 2.0f);
        } else {
            return;
        }
        r2.A00 = f2;
    }

    public void A04(Canvas canvas, Paint paint) {
        C309326Xv r2 = (C309326Xv) this;
        int A012 = C18108Vlc.A01(r2.A00.A02, r2.A01.A01);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(A012);
        paint.setStrokeWidth(r2.A02);
        float f = r2.A00;
        float f2 = -f;
        RectF rectF = new RectF(f2, f2, f, f);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
    }

    public int A01() {
        C309266Xp r0 = (C309266Xp) this.A00;
        return r0.A02 + (r0.A01 * 2);
    }

    public int A02() {
        C309266Xp r0 = (C309266Xp) this.A00;
        return r0.A02 + (r0.A01 * 2);
    }

    public void A05(Canvas canvas, Paint paint, float f, float f2, int i) {
        float f3;
        C309326Xv r6 = (C309326Xv) this;
        if (f != f2) {
            Paint paint2 = paint;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeCap(Paint.Cap.BUTT);
            paint2.setAntiAlias(true);
            paint2.setColor(i);
            paint2.setStrokeWidth(r6.A02);
            float f4 = (float) r6.A03;
            float f5 = f * 360.0f * f4;
            if (f2 >= f) {
                f3 = f2 - f;
            } else {
                f3 = (f2 + 1.0f) - f;
            }
            float f6 = f3 * 360.0f * f4;
            float f7 = r6.A00;
            float f8 = -f7;
            Canvas canvas2 = canvas;
            canvas2.drawArc(new RectF(f8, f8, f7, f7), f5, f6, false, paint2);
            if (r6.A01 > 0.0f && Math.abs(f6) < 360.0f) {
                paint2.setStyle(Paint.Style.FILL);
                float f9 = r6.A01;
                float f10 = -f9;
                RectF rectF = new RectF(f10, f10, f9, f9);
                C309326Xv.A00(canvas2, paint2, rectF, r6, r6.A02, r6.A01, f5, true);
                C309326Xv.A00(canvas2, paint2, rectF, r6, r6.A02, r6.A01, f5 + f6, false);
            }
        }
    }
}
