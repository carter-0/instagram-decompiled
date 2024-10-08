package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;
import org.webrtc.CameraCapturer;

public final class WC4 implements View.OnTouchListener {
    public static final int A0G = ViewConfiguration.getTapTimeout();
    public int A00;
    public Runnable A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public float[] A07 = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] A08 = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] A09 = {0.0f, 0.0f};
    public float[] A0A = {0.0f, 0.0f};
    public float[] A0B = {0.0f, 0.0f};
    public final View A0C;
    public final Interpolator A0D = new AccelerateInterpolator();
    public final ListView A0E;
    public final C18503Vsz A0F = new C18503Vsz();

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        if (r1 == 0.0f) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        if (r6.A03 != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008c, code lost:
        if (r6.A03 != false) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float A00(int r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            float[] r0 = r6.A0A
            r1 = r0[r7]
            float[] r0 = r6.A07
            r4 = r0[r7]
            float r1 = r1 * r9
            r3 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0078
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = r1
            if (r0 >= 0) goto L_0x0078
            r4 = 0
        L_0x0014:
            r1 = 0
        L_0x0015:
            float r9 = r9 - r8
            r5 = 0
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0076
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0071
            float r9 = r9 / r4
            float r2 = r2 - r9
        L_0x0027:
            float r2 = r2 - r1
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0061
            android.view.animation.Interpolator r1 = r6.A0D
            float r0 = -r2
            float r0 = r1.getInterpolation(r0)
            float r1 = -r0
        L_0x0034:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x005a
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x003e:
            float[] r0 = r6.A0B
            r4 = r0[r7]
            float[] r0 = r6.A09
            r3 = r0[r7]
            float[] r0 = r6.A08
            r2 = r0[r7]
            float r4 = r4 * r10
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0090
            float r1 = r1 * r4
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x008f
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = r1
            if (r0 >= 0) goto L_0x008f
            return r3
        L_0x005a:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x003e
        L_0x0061:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0070
            android.view.animation.Interpolator r0 = r6.A0D
            float r1 = r0.getInterpolation(r2)
            goto L_0x0034
        L_0x006c:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x003e
        L_0x0070:
            return r3
        L_0x0071:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0076
            goto L_0x0027
        L_0x0076:
            r2 = 0
            goto L_0x0027
        L_0x0078:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0014
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x008a
            float r0 = r8 / r4
            float r1 = r1 - r0
            goto L_0x0015
        L_0x008a:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0014
            goto L_0x0015
        L_0x008f:
            return r2
        L_0x0090:
            float r1 = -r1
            float r1 = r1 * r4
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x009c
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = r1
            if (r0 >= 0) goto L_0x009c
            r2 = r3
        L_0x009c:
            float r2 = -r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WC4.A00(int, float, float, float):float");
    }

    public static void A01(WC4 wc4) {
        if (wc4.A06) {
            wc4.A03 = false;
            return;
        }
        C18503Vsz vsz = wc4.A0F;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = (int) (currentAnimationTimeMillis - vsz.A06);
        int i2 = vsz.A03;
        if (i <= i2) {
            i2 = i;
            if (i < 0) {
                i2 = 0;
            }
        }
        vsz.A02 = i2;
        vsz.A00 = C18503Vsz.A00(vsz, currentAnimationTimeMillis);
        vsz.A07 = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r6 = r8.A0E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02() {
        /*
            r8 = this;
            X.Vsz r0 = r8.A0F
            float r1 = r0.A01
            float r0 = java.lang.Math.abs(r1)
            float r1 = r1 / r0
            int r7 = (int) r1
            if (r7 == 0) goto L_0x0033
            android.widget.ListView r6 = r8.A0E
            int r5 = r6.getCount()
            r4 = 0
            if (r5 == 0) goto L_0x0033
            int r3 = r6.getChildCount()
            int r2 = r6.getFirstVisiblePosition()
            int r1 = r2 + r3
            r0 = 1
            if (r7 <= 0) goto L_0x0035
            if (r1 < r5) goto L_0x0042
            int r3 = r3 - r0
            android.view.View r0 = r6.getChildAt(r3)
            int r1 = r0.getBottom()
            int r0 = r6.getHeight()
            if (r1 > r0) goto L_0x0042
        L_0x0033:
            r0 = 0
            return r0
        L_0x0035:
            if (r2 > 0) goto L_0x0042
            android.view.View r0 = r6.getChildAt(r4)
            int r0 = r0.getTop()
            if (r0 < 0) goto L_0x0042
            goto L_0x0033
        L_0x0042:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WC4.A02():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r1 != 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            boolean r0 = r6.A04
            r5 = 0
            if (r0 == 0) goto L_0x0014
            int r1 = r8.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 == r4) goto L_0x006e
            r0 = 2
            if (r1 == r0) goto L_0x0019
            r0 = 3
            if (r1 == r0) goto L_0x006e
        L_0x0014:
            return r5
        L_0x0015:
            r6.A05 = r4
            r6.A02 = r5
        L_0x0019:
            float r2 = r8.getX()
            int r0 = r7.getWidth()
            float r1 = (float) r0
            android.view.View r3 = r6.A0C
            int r0 = r3.getWidth()
            float r0 = (float) r0
            r6.A00(r5, r2, r1, r0)
            float r2 = r8.getY()
            int r0 = r7.getHeight()
            float r1 = (float) r0
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r1 = r6.A00(r4, r2, r1, r0)
            X.Vsz r0 = r6.A0F
            r0.A01 = r1
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x0014
            boolean r0 = r6.A02()
            if (r0 == 0) goto L_0x0014
            java.lang.Runnable r2 = r6.A01
            if (r2 != 0) goto L_0x0057
            X.WhX r2 = new X.WhX
            r2.<init>(r6)
            r6.A01 = r2
        L_0x0057:
            r6.A03 = r4
            r6.A06 = r4
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x006a
            int r0 = r6.A00
            if (r0 <= 0) goto L_0x006a
            long r0 = (long) r0
            r3.postOnAnimationDelayed(r2, r0)
        L_0x0067:
            r6.A02 = r4
            return r5
        L_0x006a:
            r2.run()
            goto L_0x0067
        L_0x006e:
            A01(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WC4.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public WC4(ListView listView) {
        this.A0C = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.A08;
        float f2 = ((float) ((int) ((1575.0f * f) + 0.5f))) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.A09;
        float f3 = ((float) ((int) ((f * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        float[] fArr3 = this.A07;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.A0A;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.A0B;
        float f4 = 1.0f / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        this.A00 = A0G;
        C18503Vsz vsz = this.A0F;
        vsz.A04 = CameraCapturer.OPEN_CAMERA_DELAY_MS;
        vsz.A03 = CameraCapturer.OPEN_CAMERA_DELAY_MS;
        this.A0E = listView;
    }
}
