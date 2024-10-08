package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.instagram.android.R;

/* renamed from: X.6M4  reason: invalid class name */
public final class AnonymousClass6M4 extends Drawable implements Drawable.Callback, C252203oj {
    public static final Interpolator A0A = new AccelerateInterpolator();
    public static final C71392co A0B = C71392co.A03(5.0d, 10.0d);
    public boolean A00;
    public long A01;
    public boolean A02;
    public final Resources A03;
    public final Drawable A04;
    public final C306386Ly A05;
    public final Integer A06;
    public final long A07 = 500;
    public final long A08;
    public final C321166tg A09;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            r9 = 0
            X.0qQ.A0B(r13, r9)
            long r4 = java.lang.System.currentTimeMillis()
            boolean r0 = r12.A02
            if (r0 != 0) goto L_0x0010
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x00be
        L_0x0010:
            long r6 = r12.A01
            long r0 = r12.A08
            long r10 = r6 + r0
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x00be
            long r2 = r12.A07
            long r10 = r10 + r2
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x00b5
            long r4 = r4 - r6
            float r7 = (float) r4
            float r6 = (float) r0
            long r0 = r0 + r2
            float r5 = (float) r0
            r4 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            float r5 = r5 - r6
            float r1 = r3 - r4
            r2 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0034
            float r7 = r7 - r6
            float r2 = r7 / r5
        L_0x0034:
            float r2 = r2 * r1
            float r2 = r2 + r4
            X.6tg r0 = r12.A09
            if (r0 == 0) goto L_0x0048
            X.9q0 r0 = r0.A00
            android.graphics.drawable.GradientDrawable r1 = r0.A02
            r0 = 1132396544(0x437f0000, float:255.0)
            float r0 = X.0mi.A02(r2, r3, r4, r3, r0)
            int r0 = (int) r0
            r1.setAlpha(r0)
        L_0x0048:
            android.view.animation.Interpolator r0 = A0A
            float r2 = r0.getInterpolation(r2)
        L_0x004e:
            android.graphics.drawable.Drawable r0 = r12.A04
            android.graphics.Rect r1 = r0.getBounds()
            X.0qQ.A07(r1)
            r3 = 0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 * r0
            int r0 = java.lang.Math.round(r2)
            X.6Ly r4 = r12.A05
            r4.setAlpha(r0)
            r13.save()
            java.lang.Integer r2 = r12.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 != r0) goto L_0x0096
            r13.translate(r3, r3)
            int r5 = r1.centerX()
            int r0 = r4.A0A
            int r0 = r0 / 2
            int r5 = r5 - r0
            int r3 = r1.top
            int r0 = r4.A06
            int r3 = r3 - r0
            int r2 = r1.centerX()
            int r0 = r4.A0A
            int r0 = r0 / 2
            int r2 = r2 + r0
            int r1 = r1.top
        L_0x0089:
            r4.setBounds(r5, r3, r2, r1)
            r4.draw(r13)
            r13.restore()
            r12.invalidateSelf()
        L_0x0095:
            return
        L_0x0096:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r13.translate(r3, r0)
            int r5 = r1.centerX()
            int r0 = r4.A0A
            int r0 = r0 / 2
            int r5 = r5 - r0
            int r3 = r1.bottom
            int r2 = r1.centerX()
            int r0 = r4.A0A
            int r0 = r0 / 2
            int r2 = r2 + r0
            int r1 = r1.bottom
            int r0 = r4.A06
            int r1 = r1 + r0
            goto L_0x0089
        L_0x00b5:
            X.6tg r0 = r12.A09
            if (r0 == 0) goto L_0x0095
            X.9q0 r0 = r0.A00
            r0.A00 = r9
            return
        L_0x00be:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6M4.draw(android.graphics.Canvas):void");
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    public final void A00() {
        this.A01 = 0;
        this.A02 = true;
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return this.A05.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A05.A0A;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
    }

    public AnonymousClass6M4(AnonymousClass6M3 r8) {
        Context context = r8.A09;
        this.A03 = context.getResources();
        Drawable drawable = r8.A0A;
        this.A04 = drawable;
        this.A09 = r8.A05;
        this.A06 = r8.A06;
        int i = r8.A02;
        this.A08 = r8.A03;
        C306386Ly r5 = new C306386Ly(context, r8.A00);
        r5.setCallback(this);
        r5.A0K(Layout.Alignment.ALIGN_CENTER);
        r5.A0C(0.0f, (float) i);
        r5.A0F(-1);
        r5.A0A((float) r8.A01);
        r5.A0I(r8.A04);
        if (r8.A08) {
            r5.A0N = true;
            Context context2 = r5.A0Z;
            0qQ.A07(context2);
            r5.A0D(0nA.A00(context2, 8.0f), 0.0f, 0.0f, context2.getColor(R.color.background));
        }
        String str = r8.A07;
        if (!(str == null || str.length() == 0)) {
            r5.A0M(str);
        }
        this.A05 = r5;
        this.A00 = true;
        this.A02 = true;
        if (drawable instanceof Drawable.Callback) {
            setCallback((Drawable.Callback) drawable);
        }
    }

    public final void A01() {
        this.A01 = System.currentTimeMillis();
        this.A02 = false;
        invalidateSelf();
    }

    public final void DmE(2cs r1) {
        invalidateSelf();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
