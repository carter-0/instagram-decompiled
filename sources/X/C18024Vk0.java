package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.Vk0  reason: case insensitive filesystem */
public final class C18024Vk0 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public Context A08;
    public GestureDetector A09;
    public VelocityTracker A0A;
    public X0S A0B;
    public X0T A0C;
    public X0U A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public boolean A0J;

    public static void A00(C18024Vk0 vk0) {
        int scaledPagingTouchSlop;
        int scaledTouchSlop;
        if (!vk0.A0J) {
            Context context = vk0.A08;
            if (context != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                Integer num = vk0.A0G;
                if (num != null) {
                    scaledPagingTouchSlop = num.intValue();
                } else {
                    scaledPagingTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                }
                Integer num2 = vk0.A0I;
                if (num2 != null) {
                    scaledTouchSlop = num2.intValue();
                } else {
                    scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                }
                int scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                int scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                vk0.A0G = Integer.valueOf(scaledPagingTouchSlop);
                vk0.A0I = Integer.valueOf(scaledTouchSlop);
                vk0.A07 = scaledMinimumFlingVelocity;
                vk0.A06 = scaledMaximumFlingVelocity;
                vk0.A0J = true;
                vk0.A0J = true;
                vk0.A08 = null;
                return;
            }
            throw new IllegalStateException("Init Context must not be null");
        }
    }

    public final void A01() {
        X0T x0t;
        if (this.A0F == AnonymousClass05K.A0C && (x0t = this.A0C) != null) {
            View view = (View) x0t;
            if (view.getParent() != null) {
                JTP.A15(view, false);
            }
        }
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0F = AnonymousClass05K.A0N;
        VelocityTracker velocityTracker = this.A0A;
        this.A0A = null;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r1 != 3) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        if ((r12.A05 & 1) == 1) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        if ((r12.A05 & 2) == 2) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e5, code lost:
        if (X.Dba.A1U((X.AnonymousClass7TE.A00(r2, (float) (r6.getHeight() / 2)) > ((float) r6.A08) ? 1 : (X.AnonymousClass7TE.A00(r2, (float) (r6.getHeight() / 2)) == ((float) r6.A08) ? 0 : -1))) == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012d, code lost:
        if ((r6 & 1) == 1) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012f, code lost:
        r6 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014a, code lost:
        if ((r12.A05 & 4) == 4) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014c, code lost:
        r6 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0157, code lost:
        if ((r12.A05 & 8) == 8) goto L_0x0159;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(android.view.MotionEvent r13) {
        /*
            r12 = this;
            X.X0T r0 = r12.A0C
            r7 = 0
            if (r0 == 0) goto L_0x0028
            int r0 = r12.A05
            if (r0 <= 0) goto L_0x0028
            int r1 = r13.getAction()
            float r3 = r13.getX()
            float r2 = r13.getY()
            r4 = 1
            if (r1 == 0) goto L_0x00be
            if (r1 == r4) goto L_0x0087
            r9 = 2
            if (r1 == r9) goto L_0x0029
            r0 = 3
            if (r1 == r0) goto L_0x0087
        L_0x0020:
            java.lang.Integer r1 = r12.A0F
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r7 = X.AnonymousClass7TF.A1W(r1, r0)
        L_0x0028:
            return r7
        L_0x0029:
            java.lang.Integer r1 = r12.A0F
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x0020
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0020
            A00(r12)
            java.lang.Integer r0 = r12.A0G
            int r11 = X.AnonymousClass7TG.A0A(r0)
            A00(r12)
            java.lang.Integer r0 = r12.A0I
            int r6 = X.AnonymousClass7TG.A0A(r0)
            float r0 = r12.A01
            float r0 = r3 - r0
            int r5 = (int) r0
            float r0 = r12.A02
            float r0 = r2 - r0
            int r10 = (int) r0
            int r8 = java.lang.Math.abs(r5)
            int r7 = java.lang.Math.abs(r10)
            float r1 = r12.A03
            float r0 = (float) r5
            float r1 = r1 + r0
            r12.A03 = r1
            float r1 = r12.A04
            float r0 = (float) r10
            float r1 = r1 + r0
            r12.A04 = r1
            if (r7 <= r6) goto L_0x0132
            java.lang.Integer r0 = r12.A0H
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            if (r0 == r6) goto L_0x0074
            float r1 = (float) r7
            float r0 = r12.A00
            float r1 = r1 * r0
            float r0 = (float) r8
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0132
        L_0x0074:
            if (r10 >= 0) goto L_0x007e
            int r0 = r12.A05
            r0 = r0 & 1
            if (r0 != r4) goto L_0x015c
            goto L_0x012f
        L_0x007e:
            if (r10 <= 0) goto L_0x015c
            int r0 = r12.A05
            r0 = r0 & 2
            if (r0 != r9) goto L_0x015c
            goto L_0x0105
        L_0x0087:
            X.X0U r0 = r12.A0D
            if (r0 == 0) goto L_0x0020
            java.lang.Integer r1 = r12.A0F
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x0020
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0020
            A00(r12)
            java.lang.Integer r0 = r12.A0I
            int r1 = X.AnonymousClass7TG.A0A(r0)
            float r0 = r12.A03
            float r0 = java.lang.Math.abs(r0)
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            float r0 = r12.A04
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            X.X0U r0 = r12.A0D
            X.U4o r0 = (X.C14724U4o) r0
            boolean r7 = X.C14724U4o.A01(r0, r3, r2)
            if (r7 != 0) goto L_0x0028
            goto L_0x00e7
        L_0x00be:
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r12.A0F = r5
            r0 = 0
            r12.A03 = r0
            r12.A04 = r0
            X.X0S r6 = r12.A0B
            if (r6 == 0) goto L_0x00eb
            boolean r0 = r6 instanceof com.instagram.ui.igeditseekbar.IgVerticalChunkySlider
            if (r0 != 0) goto L_0x00eb
            com.instagram.ui.igeditseekbar.IgEditSeekBar r6 = (com.instagram.ui.igeditseekbar.IgEditSeekBar) r6
            int r0 = r6.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r1 = X.AnonymousClass7TE.A00(r2, r0)
            int r0 = r6.A08
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.Dba.A1U(r0)
            if (r0 != 0) goto L_0x00eb
        L_0x00e7:
            r12.A01()
            return r7
        L_0x00eb:
            r12.A01 = r3
            r12.A02 = r2
            X.X0S r0 = r12.A0B
            if (r0 == 0) goto L_0x0020
            java.lang.Integer r6 = r12.A0E
            if (r6 != 0) goto L_0x0105
            int r6 = r12.A05
            r1 = 8
            r0 = r6 & 8
            if (r0 == r1) goto L_0x0159
            r1 = 2
            r0 = r6 & 2
            if (r0 != r1) goto L_0x012b
            r6 = r5
        L_0x0105:
            r12.A01 = r3
            r12.A02 = r2
            r12.A0E = r6
            java.lang.Integer r1 = r12.A0F
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r12.A0F = r0
            if (r1 == r0) goto L_0x0020
            X.X0T r1 = r12.A0C
            if (r1 == 0) goto L_0x0020
            X.U4o r1 = (X.C14724U4o) r1
            X.X83 r0 = r1.A04
            if (r0 == 0) goto L_0x0120
            r0.DAh()
        L_0x0120:
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x0020
            X.JTP.A15(r1, r4)
            goto L_0x0020
        L_0x012b:
            r0 = r6 & 1
            if (r0 != r4) goto L_0x014c
        L_0x012f:
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            goto L_0x0105
        L_0x0132:
            if (r8 <= r11) goto L_0x0020
            java.lang.Integer r1 = r12.A0H
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0143
            float r1 = (float) r8
            float r0 = r12.A00
            float r1 = r1 * r0
            float r0 = (float) r7
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0020
        L_0x0143:
            if (r5 >= 0) goto L_0x014f
            int r0 = r12.A05
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L_0x015c
        L_0x014c:
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            goto L_0x0105
        L_0x014f:
            if (r5 <= 0) goto L_0x015c
            int r0 = r12.A05
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x015c
        L_0x0159:
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            goto L_0x0105
        L_0x015c:
            r12.A01()
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18024Vk0.A02(android.view.MotionEvent):boolean");
    }
}
