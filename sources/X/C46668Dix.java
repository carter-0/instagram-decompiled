package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.Dix  reason: case insensitive filesystem */
public final class C46668Dix extends Drawable implements AnonymousClass1MK {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final GradientDrawable A07;
    public final Interpolator A08 = new AccelerateInterpolator(1.0f);
    public final Interpolator A09 = new DecelerateInterpolator(1.0f);
    public final List A0A;
    public final List A0B = AnonymousClass7TE.A1C();
    public final C62320sa A0C;

    public C46668Dix(Context context, List list, C62320sa r7, int i, int i2, int i3, int i4) {
        this.A06 = context;
        this.A03 = i;
        this.A02 = i2;
        this.A05 = i3;
        this.A04 = i4;
        this.A0A = list;
        this.A0C = r7;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, AnonymousClass6LW.A07);
        gradientDrawable.setShape(1);
        gradientDrawable.setCornerRadius(((float) i) / 2.0f);
        this.A07 = gradientDrawable;
        this.A0B.clear();
        this.A00 = 0;
        0nY.A00().ATE(new C47808EHu(this, list));
    }

    public final void CyF(C226952iF r8, AnonymousClass3LX r9) {
        0qQ.A0B(r9, 1);
        Bitmap bitmap = r9.A01;
        if (bitmap != null) {
            int i = this.A04;
            Bitmap A092 = 1MF.A09(bitmap, i, i, 0, false);
            0qQ.A07(A092);
            int i2 = this.A03;
            int i3 = i2 + this.A02;
            0fO.A03(A092);
            Bitmap createBitmap = Bitmap.createBitmap(A092, (i - i3) / 2, ((i - i2) / 2) - this.A05, i3, i3);
            0qQ.A07(createBitmap);
            Bitmap A072 = 1MF.A07(createBitmap, i3, i3);
            if (A072 != null) {
                createBitmap.recycle();
                this.A0B.add(new ScaleDrawable(new BitmapDrawable(this.A06.getResources(), A072), 17, 1.0f, 1.0f));
                int i4 = this.A00 + 1;
                this.A00 = i4;
                if (i4 == this.A0A.size()) {
                    this.A01 = true;
                    invalidateSelf();
                    C62320sa r0 = this.A0C;
                    if (r0 != null) {
                        r0.invoke();
                        return;
                    }
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A01) {
            GradientDrawable gradientDrawable = this.A07;
            int i = this.A02 / 2;
            int i2 = i + this.A03;
            gradientDrawable.setBounds(i, i, i2, i2);
            gradientDrawable.draw(canvas);
            List list = this.A0B;
            int currentTimeMillis = (int) ((System.currentTimeMillis() / 1500) % ((long) list.size()));
            Drawable drawable = (Drawable) list.get(currentTimeMillis);
            if (currentTimeMillis == 0) {
                currentTimeMillis = list.size();
            }
            Drawable drawable2 = (Drawable) list.get(currentTimeMillis - 1);
            drawable.setBounds(i, i, i2, i2);
            drawable2.setBounds(i, i, i2, i2);
            long currentTimeMillis2 = System.currentTimeMillis() % 1500;
            if (0 > currentTimeMillis2 || currentTimeMillis2 >= 280) {
                drawable.setAlpha(255);
                drawable.setLevel(CameraCapturer.OPEN_CAMERA_TIMEOUT);
            } else {
                if (currentTimeMillis2 < 200) {
                    float f = (float) currentTimeMillis2;
                    float f2 = 200.0f - 0.0f;
                    float f3 = 0.0f - 1.0f;
                    float f4 = 0.0f;
                    if (f2 != 0.0f) {
                        f4 = (f - 0.0f) / f2;
                    }
                    float f5 = (f4 * f3) + 1.0f;
                    Interpolator interpolator = this.A08;
                    float interpolation = interpolator.getInterpolation(f5);
                    float f6 = 0.0f - 10000.0f;
                    float f7 = 0.0f;
                    if (f3 != 0.0f) {
                        f7 = (interpolation - 1.0f) / f3;
                    }
                    drawable2.setLevel((int) ((f7 * f6) + 10000.0f));
                    float interpolation2 = interpolator.getInterpolation(f5);
                    float f8 = 0.0f - 255.0f;
                    float f9 = 0.0f;
                    if (f3 != 0.0f) {
                        f9 = (interpolation2 - 1.0f) / f3;
                    }
                    drawable2.setAlpha((int) ((f9 * f8) + 255.0f));
                    drawable2.draw(canvas);
                } else {
                    drawable2.setAlpha(0);
                }
                float f10 = (float) currentTimeMillis2;
                float f11 = 280.0f - 0.0f;
                float f12 = 1.0f - 0.0f;
                float f13 = 0.0f;
                if (f11 != 0.0f) {
                    f13 = (f10 - 0.0f) / f11;
                }
                float f14 = (f13 * f12) + 0.0f;
                Interpolator interpolator2 = this.A09;
                float interpolation3 = interpolator2.getInterpolation(f14);
                float f15 = 10000.0f - 0.0f;
                float f16 = 0.0f;
                if (f12 != 0.0f) {
                    f16 = (interpolation3 - 0.0f) / f12;
                }
                drawable.setLevel((int) ((f16 * f15) + 0.0f));
                float interpolation4 = interpolator2.getInterpolation(f14);
                float f17 = 255.0f - 0.0f;
                float f18 = 0.0f;
                if (f12 != 0.0f) {
                    f18 = (interpolation4 - 0.0f) / f12;
                }
                drawable.setAlpha((int) ((f18 * f17) + 0.0f));
            }
            drawable.draw(canvas);
            invalidateSelf();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A03 + this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A03 + this.A02;
    }

    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        for (Drawable alpha : this.A0B) {
            alpha.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
        for (Drawable colorFilter2 : this.A0B) {
            colorFilter2.setColorFilter(colorFilter);
        }
    }
}
