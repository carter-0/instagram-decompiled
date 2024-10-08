package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class U15 extends Drawable {
    public float A00;
    public VL3 A01;
    public VL3 A02;
    public float A03;
    public int A04;
    public ValueAnimator A05;
    public boolean A06;
    public final VL3[] A07;
    public final float A08;
    public final int A09;
    public final ValueAnimator.AnimatorUpdateListener A0A = new W4Q((Object) this, 0);
    public final Path A0B;
    public final List A0C;
    public final boolean A0D;
    public final float[] A0E;

    public final int getOpacity() {
        return -1;
    }

    /* JADX WARNING: type inference failed for: r5v18, types: [X.VZ2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.VZ2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.VZ2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v2, types: [X.VZ2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v12, types: [X.VZ2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v3, types: [X.VZ2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v15, types: [X.VZ2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v16, types: [X.VZ2, java.lang.Object] */
    public U15(Context context, float[] fArr, int i, boolean z) {
        VL3[] vl3Arr = new VL3[4];
        this.A07 = vl3Arr;
        this.A0B = new Path();
        this.A04 = 255;
        this.A09 = i;
        float[] fArr2 = fArr;
        this.A0E = fArr2;
        0qQ.A0B(fArr2, 0);
        int length = fArr2.length;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (fArr[i2] > 0.0f) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        this.A0D = z2;
        Context context2 = context;
        this.A08 = C14573Tyc.A00(context2, 375.0f);
        this.A0C = Arrays.asList(new C18511Vt9[]{new C18511Vt9(0.0f, C14573Tyc.A00(context2, 116.0f), 0, C14573Tyc.A00(context2, 350.0f), -15173646, C14573Tyc.A00(context2, 232.0f)), new C18511Vt9(0.0f, C14573Tyc.A00(context2, -219.0f), 1, C14573Tyc.A00(context2, 226.0f), -14298266, C14573Tyc.A00(context2, 153.0f)), new C18511Vt9(C14573Tyc.A00(context2, 124.0f), C14573Tyc.A00(context2, -438.0f), 2, C14573Tyc.A00(context2, 156.0f), -668109, C14573Tyc.A00(context2, 100.0f)), new C18511Vt9(C14573Tyc.A00(context2, 238.0f), C14573Tyc.A00(context2, -196.0f), 3, C14573Tyc.A00(context2, 206.0f), -37796, C14573Tyc.A00(context2, 132.0f)), new C18511Vt9(C14573Tyc.A00(context2, -175.0f), C14573Tyc.A00(context2, 373.0f), 4, C14573Tyc.A00(context2, 272.0f), -15173646, C14573Tyc.A00(context2, 175.0f)), new C18511Vt9(C14573Tyc.A00(context2, 308.0f), C14573Tyc.A00(context2, -71.0f), 5, C14573Tyc.A00(context2, 176.0f), -6278145, C14573Tyc.A00(context2, 119.0f))});
        HashMap hashMap = new HashMap();
        Integer A0j = C51967G9n.A0j();
        ? obj = new Object();
        obj.A04 = true;
        obj.A01 = 90.0f;
        hashMap.put(A0j, obj);
        ? obj2 = new Object();
        obj2.A03 = true;
        hashMap.put(4, obj2);
        ? obj3 = new Object();
        obj3.A02 = true;
        obj3.A00 = 0.5f;
        hashMap.put(5, obj3);
        vl3Arr[1] = new VL3(hashMap);
        HashMap hashMap2 = new HashMap();
        ? obj4 = new Object();
        obj4.A04 = true;
        obj4.A01 = 180.0f;
        hashMap2.put(A0j, obj4);
        ? obj5 = new Object();
        obj5.A02 = true;
        obj5.A00 = 0.5f;
        obj5.A03 = true;
        hashMap2.put(5, obj5);
        vl3Arr[2] = new VL3(hashMap2);
        HashMap hashMap3 = new HashMap();
        ? obj6 = new Object();
        obj6.A04 = true;
        obj6.A01 = 270.0f;
        hashMap3.put(A0j, obj6);
        ? obj7 = new Object();
        obj7.A02 = true;
        obj7.A00 = 0.5f;
        hashMap3.put(5, obj7);
        ? obj8 = new Object();
        obj8.A03 = true;
        hashMap3.put(1, obj8);
        vl3Arr[3] = new VL3(hashMap3);
        setAlpha(z ? 10 : 8);
    }

    public final void A01(boolean z) {
        if (this.A06 != z) {
            ValueAnimator valueAnimator = this.A05;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.A05 = null;
            }
            if (z) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.A05 = valueAnimator2;
                valueAnimator2.addUpdateListener(this.A0A);
                this.A05.setRepeatCount(-1);
                this.A05.setDuration(((long) this.A07.length) * 3000);
                this.A05.setFloatValues(new float[]{0.0f, 1.0f});
                C51969G9p.A10(this.A05);
                this.A05.start();
            }
            this.A06 = z;
        }
    }

    public final void draw(Canvas canvas) {
        VZ2 vz2;
        VZ2 vz22;
        float f;
        float f2;
        VZ2 vz23;
        VZ2 vz24;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        int save = canvas2.save();
        if (this.A0D) {
            canvas2.clipPath(this.A0B);
        }
        if (this.A03 > 1.0f) {
            Rect bounds = getBounds();
            float f5 = this.A03;
            canvas2.scale(f5, f5, bounds.exactCenterX(), bounds.exactCenterY());
        }
        canvas2.drawColor(this.A09);
        VL3 vl3 = this.A01;
        if (vl3 != null) {
            vz2 = (VZ2) C51968G9o.A10(vl3.A00, -1);
        } else {
            vz2 = null;
        }
        VL3 vl32 = this.A02;
        if (vl32 != null) {
            vz22 = (VZ2) C51968G9o.A10(vl32.A00, -1);
        } else {
            vz22 = null;
        }
        if (vz2 == null || !vz2.A04) {
            f = 0.0f;
        } else {
            f = vz2.A01;
        }
        if (vz22 == null || !vz22.A04) {
            f2 = 0.0f;
        } else {
            f2 = vz22.A01;
        }
        if (f == 270.0f && f2 == 0.0f) {
            f2 = 360.0f;
        }
        float A002 = C13988Tno.A00(f2, f, this.A00);
        Rect bounds2 = getBounds();
        if (A002 != 0.0f) {
            canvas2.rotate(A002, bounds2.exactCenterX(), bounds2.exactCenterY());
        }
        for (C18511Vt9 vt9 : this.A0C) {
            int save2 = canvas2.save();
            VL3 vl33 = this.A01;
            if (vl33 != null) {
                vz23 = (VZ2) C51968G9o.A10(vl33.A00, vt9.A06);
            } else {
                vz23 = null;
            }
            VL3 vl34 = this.A02;
            if (vl34 != null) {
                vz24 = (VZ2) C51968G9o.A10(vl34.A00, vt9.A06);
            } else {
                vz24 = null;
            }
            float f6 = vt9.A00;
            float exactCenterX = bounds2.exactCenterX();
            if (vz23 == null || !vz23.A03) {
                f3 = f6;
            } else {
                f3 = 0.0f + exactCenterX;
            }
            if (vz24 != null && vz24.A03) {
                f6 = exactCenterX + 0.0f;
            }
            float A003 = C13988Tno.A00(f6, f3, this.A00);
            float f7 = vt9.A01;
            float exactCenterY = bounds2.exactCenterY();
            if (vz23 == null || !vz23.A03) {
                f4 = f7;
            } else {
                f4 = 0.0f + exactCenterY;
            }
            if (vz24 != null && vz24.A03) {
                f7 = exactCenterY + 0.0f;
            }
            canvas2.translate(A003, C13988Tno.A00(f7, f4, this.A00));
            float f8 = vt9.A04;
            float f9 = vt9.A05;
            float max = Math.max(f8, f9);
            canvas2.scale(1.0f, Math.min(f8, f9) / max);
            VZ2 vz25 = vz23;
            VZ2 vz26 = vz24;
            Canvas canvas3 = canvas2;
            A00(canvas3, vt9.A09, vz25, vz26, max * 2.0f);
            A00(canvas3, vt9.A08, vz25, vz26, max * 1.5f);
            A00(canvas2, vt9.A07, vz23, vz24, max);
            canvas2.restoreToCount(save2);
        }
        canvas2.restoreToCount(save);
    }

    public final int getAlpha() {
        return this.A04;
    }

    public final void setAlpha(int i) {
        this.A04 = i;
        for (C18511Vt9 vt9 : this.A0C) {
            vt9.A07.setAlpha(i);
            vt9.A08.setAlpha(i);
            vt9.A09.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        for (C18511Vt9 vt9 : this.A0C) {
            vt9.A07.setColorFilter(colorFilter);
            vt9.A08.setColorFilter(colorFilter);
            vt9.A09.setColorFilter(colorFilter);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z3 = this.A06;
        if (!z) {
            if (z3 && (valueAnimator2 = this.A05) != null && valueAnimator2.isStarted()) {
                this.A05.cancel();
            }
        } else if (z3 && (valueAnimator = this.A05) != null && !valueAnimator.isStarted()) {
            this.A05.start();
        }
        return super.setVisible(z, z2);
    }

    private void A00(Canvas canvas, Paint paint, VZ2 vz2, VZ2 vz22, float f) {
        float f2;
        int alpha = paint.getAlpha();
        float f3 = 1.0f;
        if (vz2 == null || !vz2.A02) {
            f2 = 1.0f;
        } else {
            f2 = vz2.A00;
        }
        if (vz22 != null && vz22.A02) {
            f3 = vz22.A00;
        }
        float alpha2 = (float) paint.getAlpha();
        paint.setAlpha((int) C13988Tno.A00(f3 * alpha2, f2 * alpha2, this.A00));
        canvas.drawCircle(0.0f, 0.0f, f, paint);
        paint.setAlpha(alpha);
    }

    public final void onBoundsChange(Rect rect) {
        float f;
        super.onBoundsChange(rect);
        for (C18511Vt9 vt9 : this.A0C) {
            vt9.A00 = ((float) rect.centerX()) + vt9.A02;
            vt9.A01 = ((float) rect.centerY()) + vt9.A03;
        }
        Path path = this.A0B;
        path.reset();
        path.addRoundRect(new RectF(rect), this.A0E, Path.Direction.CW);
        path.close();
        float width = (float) rect.width();
        float f2 = this.A08;
        if (width > f2) {
            f = width / f2;
        } else {
            f = 0.0f;
        }
        this.A03 = f;
    }
}
