package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.Div  reason: case insensitive filesystem */
public final class C46666Div extends Drawable implements Drawable.Callback, AnonymousClass1MK {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final Interpolator A05 = new AccelerateInterpolator(1.0f);
    public final Interpolator A06 = new DecelerateInterpolator(1.0f);
    public final List A07;
    public final List A08 = AnonymousClass7TE.A1C();
    public final double A09;
    public final int A0A;
    public final Drawable A0B;

    public final void CyF(C226952iF r6, AnonymousClass3LX r7) {
        0qQ.A0B(r7, 1);
        Bitmap bitmap = r7.A01;
        if (bitmap != null) {
            int i = this.A03;
            Bitmap A092 = 1MF.A09(bitmap, i, i, 0, false);
            0qQ.A07(A092);
            this.A08.add(new ScaleDrawable(new BitmapDrawable(this.A04.getResources(), A092), 80, 1.0f, 1.0f));
            int i2 = this.A00 + 1;
            this.A00 = i2;
            if (i2 == this.A07.size()) {
                this.A01 = true;
                invalidateSelf();
            }
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A01) {
            List list = this.A08;
            int currentTimeMillis = (int) ((System.currentTimeMillis() / 1500) % ((long) list.size()));
            Drawable drawable = (Drawable) list.get(currentTimeMillis);
            if (currentTimeMillis == 0) {
                currentTimeMillis = list.size();
            }
            Drawable drawable2 = (Drawable) list.get(currentTimeMillis - 1);
            int i = this.A02;
            int i2 = this.A03;
            int i3 = i2 + i;
            drawable.setBounds(i, 0, i3, i2);
            drawable2.setBounds(i, 0, i3, i2);
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
                    Interpolator interpolator = this.A05;
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
                Interpolator interpolator2 = this.A06;
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
            return;
        }
        Context context = this.A04;
        double d = this.A09;
        int A022 = (int) (((double) AnonymousClass7TG.A02(context)) * d);
        int dimensionPixelSize = (int) (((double) context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin)) * d);
        Drawable drawable3 = this.A0B;
        int i4 = this.A0A;
        drawable3.setBounds(A022, dimensionPixelSize, A022 + i4, i4 + dimensionPixelSize);
        drawable3.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final int getIntrinsicHeight() {
        return this.A03;
    }

    public final int getIntrinsicWidth() {
        return this.A03 + (this.A02 * 2);
    }

    public final void setAlpha(int i) {
        this.A0B.setAlpha(i);
        for (Drawable alpha : this.A08) {
            alpha.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0B.setColorFilter(colorFilter);
        for (Drawable colorFilter2 : this.A08) {
            colorFilter2.setColorFilter(colorFilter);
        }
    }

    public C46666Div(Context context, UserSession userSession, List list, int i) {
        this.A04 = context;
        this.A07 = list;
        double A002 = C346897vw.A00(userSession);
        this.A09 = A002;
        this.A03 = (int) (((double) context.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height)) * A002);
        this.A02 = (int) (((double) AnonymousClass7TE.A0C(context.getResources())) * A002);
        this.A0A = (int) (((double) context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material)) * A002);
        int A0H = 2Yu.A0H(context, R.attr.igds_color_creation_tools_orange);
        Paint paint = AnonymousClass3JT.A00;
        this.A0B = AnonymousClass3JT.A05(context, i, context.getColor(A0H));
        this.A08.clear();
        this.A00 = 0;
        0nY.A00().ATE(new C47809EHv(this, list));
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
