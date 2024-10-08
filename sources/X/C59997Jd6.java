package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jd6  reason: case insensitive filesystem */
public final class C59997Jd6 extends Drawable implements Drawable.Callback {
    public long A00;
    public LRZ A01;
    public LRZ A02;
    public boolean A03 = true;
    public boolean A04;
    public int A05 = -1;
    public long A06;
    public Paint A07;
    public boolean A08;
    public final float A09;
    public final float A0A;
    public final long A0B;
    public final Paint A0C;
    public final RectF A0D;
    public final C60711Jpw A0E;
    public final List A0F;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C59997Jd6(C60711Jpw jpw, List list, float f, int i) {
        this.A0A = f;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A0C = A0V;
        AnonymousClass7TE.A1Q(A0V);
        A0V.setColor(i);
        this.A01 = new LRZ(f);
        this.A02 = new LRZ(f);
        this.A0D = AnonymousClass7TE.A0Y();
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A0F = A1C;
        A1C.addAll(list);
        this.A0B = ((long) A1C.size()) * LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        this.A09 = 0.5f;
        this.A0E = jpw;
    }

    public final void draw(Canvas canvas) {
        RectF rectF = this.A0D;
        float f = this.A0A;
        Paint paint = this.A0C;
        Canvas canvas2 = canvas;
        canvas2.drawRoundRect(rectF, f, f, paint);
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.A00;
        this.A00 = currentTimeMillis;
        if (this.A04) {
            this.A06 += j;
        }
        long j2 = this.A06;
        long j3 = this.A0B;
        int max = Math.max(0, (int) Math.floor((double) (((float) (j2 % j3)) / 5000.0f)));
        float f2 = (float) j2;
        float f3 = (float) j3;
        float max2 = (Math.max(0.0f, ((float) Math.floor((double) (f2 / f3))) * f3) + ((float) (((long) max) * LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT))) - 750.0f;
        float f4 = max2 + 5750.0f;
        float f5 = f4 - 750.0f;
        float A012 = 0mi.A01(f2, max2, f4, 0.0f, 1.0f);
        float A013 = 0mi.A01(f2, f5, 5750.0f + f5, 0.0f, 1.0f);
        List list = this.A0F;
        int max3 = Math.max(0, (max + 1) % list.size());
        if (A012 >= 0.65f) {
            LRZ lrz = this.A02;
            if (lrz.A03 == null && this.A03) {
                lrz.A03((C63947LEp) list.get(max3), width, height);
            }
        } else {
            LRZ lrz2 = this.A02;
            if (lrz2.A03 != null) {
                LRZ lrz3 = this.A01;
                this.A01 = lrz2;
                lrz3.A01();
                this.A02 = lrz3;
            }
            max3 = max;
        }
        LRZ lrz4 = this.A01;
        if (lrz4.A03 == null) {
            lrz4.A03((C63947LEp) list.get(max), width, height);
        }
        if (max3 != this.A05) {
            list.get(max3);
            this.A05 = max3;
        }
        LRZ lrz5 = this.A01;
        if (lrz5.A03 != null) {
            if (!this.A03) {
                A012 = 1.0f;
            }
            lrz5.A02(canvas2, A012, width, height, 255);
            this.A08 = true;
        }
        int round = Math.round(0mi.A02((float) this.A06, f5, f5 + 750.0f, 0.0f, 255.0f));
        LRZ lrz6 = this.A02;
        if (lrz6.A03 != null && this.A03 && round > 0) {
            lrz6.A02(canvas2, A013, width, height, round);
        }
        if (paint != null) {
            Paint paint2 = this.A07;
            paint2.getClass();
            canvas2.drawRoundRect(rectF, f, f, paint2);
        }
        if ((this.A04 && this.A03) || !this.A08) {
            invalidateSelf();
        }
    }

    public final void onBoundsChange(Rect rect) {
        this.A0D.set(rect);
        float f = this.A09;
        if (f > 0.0f) {
            float f2 = (float) rect.bottom;
            LinearGradient linearGradient = new LinearGradient(0.0f, f2, 0.0f, f2 - (((float) rect.height()) * f), Color.argb(Math.round(127.5f), 0, 0, 0), 0, Shader.TileMode.CLAMP);
            Paint A0D2 = JTP.A0D();
            this.A07 = A0D2;
            A0D2.setShader(linearGradient);
        }
        invalidateSelf();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
