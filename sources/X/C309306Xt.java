package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.List;

/* renamed from: X.6Xt  reason: invalid class name and case insensitive filesystem */
public abstract class C309306Xt extends Drawable implements Animatable {
    public static final Property A0A = new C309316Xu();
    public float A00;
    public int A01;
    public ValueAnimator A02;
    public ValueAnimator A03;
    public C309296Xs A04;
    public List A05;
    public boolean A06;
    public final Context A07;
    public final Paint A08 = new Paint();
    public final C309276Xq A09;

    public final int getOpacity() {
        return -3;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return A03(z, z2, true);
    }

    public final void start() {
        A04(true, true, false);
    }

    public final void stop() {
        A04(false, true, false);
    }

    public final boolean A01() {
        ValueAnimator valueAnimator = this.A02;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1 <= 0.0f) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(boolean r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            android.content.Context r0 = r3.A07
            android.content.ContentResolver r2 = r0.getContentResolver()
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = "animator_duration_scale"
            float r1 = android.provider.Settings.Global.getFloat(r2, r0, r1)
            if (r6 == 0) goto L_0x0016
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            boolean r0 = r3.A04(r4, r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309306Xt.A03(boolean, boolean, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        if (r6 == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ac, code lost:
        if (super.setVisible(r6, false) != false) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(boolean r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            android.animation.ValueAnimator r2 = r5.A03
            r0 = 500(0x1f4, double:2.47E-321)
            r4 = 2
            if (r2 != 0) goto L_0x003a
            android.util.Property r3 = A0A
            float[] r2 = new float[r4]
            r2 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r5, r3, r2)
            r5.A03 = r2
            r2.setDuration(r0)
            android.animation.ValueAnimator r3 = r5.A03
            android.animation.TimeInterpolator r2 = X.AnonymousClass6Y2.A02
            r3.setInterpolator(r2)
            android.animation.ValueAnimator r3 = r5.A03
            if (r3 == 0) goto L_0x0030
            boolean r2 = r3.isRunning()
            if (r2 == 0) goto L_0x0030
            java.lang.String r1 = "Cannot set showAnimator while the current showAnimator is running."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0030:
            r5.A03 = r3
            X.6Y4 r2 = new X.6Y4
            r2.<init>(r5)
            r3.addListener(r2)
        L_0x003a:
            android.animation.ValueAnimator r2 = r5.A02
            if (r2 != 0) goto L_0x0071
            android.util.Property r3 = A0A
            float[] r2 = new float[r4]
            r2 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r5, r3, r2)
            r5.A02 = r2
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r5.A02
            android.animation.TimeInterpolator r0 = X.AnonymousClass6Y2.A02
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r5.A02
            if (r1 == 0) goto L_0x0067
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto L_0x0067
            java.lang.String r1 = "Cannot set hideAnimator while the current hideAnimator is running."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0067:
            r5.A02 = r1
            X.6Y5 r0 = new X.6Y5
            r0.<init>(r5)
            r1.addListener(r0)
        L_0x0071:
            boolean r0 = r5.isVisible()
            r3 = 0
            if (r0 != 0) goto L_0x007b
            if (r6 != 0) goto L_0x00a0
        L_0x007a:
            return r3
        L_0x007b:
            if (r6 != 0) goto L_0x00a0
            android.animation.ValueAnimator r1 = r5.A02
        L_0x007f:
            r4 = 1
            boolean r0 = r1.isRunning()
            if (r8 != 0) goto L_0x00a3
            if (r0 == 0) goto L_0x0090
            r1.end()
        L_0x008b:
            boolean r2 = super.setVisible(r6, r3)
            return r2
        L_0x0090:
            android.animation.ValueAnimator[] r0 = new android.animation.ValueAnimator[]{r1}
            boolean r1 = r5.A06
            r5.A06 = r4
            r0 = r0[r3]
            r0.end()
            r5.A06 = r1
            goto L_0x008b
        L_0x00a0:
            android.animation.ValueAnimator r1 = r5.A03
            goto L_0x007f
        L_0x00a3:
            if (r0 != 0) goto L_0x007a
            if (r6 == 0) goto L_0x00ae
            boolean r0 = super.setVisible(r6, r3)
            r2 = 0
            if (r0 == 0) goto L_0x00c3
        L_0x00ae:
            r2 = 1
            if (r6 != 0) goto L_0x00c3
            X.6Xq r0 = r5.A09
            int r0 = r0.A00
        L_0x00b5:
            if (r0 == 0) goto L_0x00cc
            if (r7 != 0) goto L_0x00c8
            boolean r0 = r1.isPaused()
            if (r0 == 0) goto L_0x00c8
            r1.resume()
            return r2
        L_0x00c3:
            X.6Xq r0 = r5.A09
            int r0 = r0.A01
            goto L_0x00b5
        L_0x00c8:
            r1.start()
            return r2
        L_0x00cc:
            android.animation.ValueAnimator[] r0 = new android.animation.ValueAnimator[]{r1}
            boolean r1 = r5.A06
            r5.A06 = r4
            r0 = r0[r3]
            r0.end()
            r5.A06 = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309306Xt.A04(boolean, boolean, boolean):boolean");
    }

    public final int getAlpha() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        this.A01 = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.6Xs, java.lang.Object] */
    public C309306Xt(Context context, C309276Xq r3) {
        this.A07 = context;
        this.A09 = r3;
        this.A04 = new Object();
        setAlpha(255);
    }

    public final boolean isRunning() {
        if (A02() || A01()) {
            return true;
        }
        return false;
    }
}
