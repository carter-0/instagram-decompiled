package X;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;

public abstract class WC5 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public int A00;
    public Runnable A01;
    public Runnable A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final View A07;
    public final int[] A08 = new int[2];

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.A03 = false;
        this.A00 = -1;
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A07.removeCallbacks(runnable);
        }
    }

    public static void A00(WC5 wc5) {
        Runnable runnable = wc5.A02;
        if (runnable != null) {
            wc5.A07.removeCallbacks(runnable);
        }
        Runnable runnable2 = wc5.A01;
        if (runnable2 != null) {
            wc5.A07.removeCallbacks(runnable2);
        }
    }

    public final X8C A01() {
        C18018Vju vju;
        if (this instanceof U6P) {
            return ((U6P) this).A00;
        }
        if (this instanceof U6O) {
            vju = ((U6O) this).A00.A00.A0D;
            if (vju == null) {
                return null;
            }
        } else {
            V25 v25 = ((U6N) this).A00.A00;
            if (v25 == null || (vju = ((U5s) v25).A00.A09) == null) {
                return null;
            }
        }
        return vju.A00();
    }

    public final boolean A02() {
        X8C A012;
        if (this instanceof U6P) {
            U5e u5e = ((U6P) this).A01;
            X9Y x9y = u5e.A02;
            if (!x9y.Cc6()) {
                x9y.Etl(u5e.getTextDirection(), u5e.getTextAlignment());
            }
        } else if (this instanceof U6O) {
            ((U6O) this).A00.A00.A04();
        } else {
            U6N u6n = (U6N) this;
            ActionMenuItemView actionMenuItemView = u6n.A00;
            C20868X1u x1u = actionMenuItemView.A01;
            if (x1u == null || !x1u.CNz(actionMenuItemView.A02) || (A012 = u6n.A01()) == null || !A012.Cc6()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (r2 == 3) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        if (r0 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        if (r1 != 3) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r15, android.view.MotionEvent r16) {
        /*
            r14 = this;
            boolean r4 = r14.A03
            r3 = 1
            r2 = r16
            if (r4 == 0) goto L_0x0086
            android.view.View r9 = r14.A07
            X.X8C r1 = r14.A01()
            r8 = 0
            if (r1 == 0) goto L_0x0063
            boolean r0 = r1.Cc6()
            if (r0 == 0) goto L_0x0063
            X.U5Q r5 = r1.BN8()
            if (r5 == 0) goto L_0x0063
            boolean r0 = r5.isShown()
            if (r0 == 0) goto L_0x0063
            android.view.MotionEvent r6 = android.view.MotionEvent.obtainNoHistory(r2)
            int[] r7 = r14.A08
            r9.getLocationOnScreen(r7)
            r0 = r7[r8]
            float r1 = (float) r0
            r0 = r7[r3]
            float r0 = (float) r0
            r6.offsetLocation(r1, r0)
            r5.getLocationOnScreen(r7)
            r0 = r7[r8]
            int r0 = -r0
            float r1 = (float) r0
            r0 = r7[r3]
            int r0 = -r0
            float r0 = (float) r0
            r6.offsetLocation(r1, r0)
            int r0 = r14.A00
            boolean r5 = r5.A01(r6, r0)
            r6.recycle()
            int r2 = r2.getActionMasked()
            if (r2 == r3) goto L_0x0055
            r1 = 3
            r0 = 1
            if (r2 != r1) goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r5 == 0) goto L_0x0063
            if (r0 == 0) goto L_0x0063
        L_0x005a:
            r1 = 1
        L_0x005b:
            r14.A03 = r1
            if (r1 != 0) goto L_0x0062
            if (r4 != 0) goto L_0x0062
            r3 = 0
        L_0x0062:
            return r3
        L_0x0063:
            r1 = r14
            boolean r0 = r14 instanceof X.U6O
            if (r0 == 0) goto L_0x0076
            X.U6O r1 = (X.U6O) r1
            X.U69 r0 = r1.A00
            X.WDU r1 = r0.A00
            X.Wlc r0 = r1.A0B
            if (r0 != 0) goto L_0x005a
            r1.A02()
            goto L_0x009d
        L_0x0076:
            X.X8C r1 = r14.A01()
            if (r1 == 0) goto L_0x009d
            boolean r0 = r1.Cc6()
            if (r0 == 0) goto L_0x009d
            r1.dismiss()
            goto L_0x009d
        L_0x0086:
            android.view.View r5 = r14.A07
            boolean r0 = r5.isEnabled()
            r13 = 0
            if (r0 == 0) goto L_0x009d
            int r1 = r2.getActionMasked()
            if (r1 == 0) goto L_0x00fe
            if (r1 == r3) goto L_0x00fa
            r0 = 2
            if (r1 == r0) goto L_0x009f
            r0 = 3
            if (r1 == r0) goto L_0x00fa
        L_0x009d:
            r1 = 0
            goto L_0x005b
        L_0x009f:
            int r0 = r14.A00
            int r0 = r2.findPointerIndex(r0)
            if (r0 < 0) goto L_0x009d
            float r7 = r2.getX(r0)
            float r6 = r2.getY(r0)
            float r2 = r14.A04
            float r1 = -r2
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00d9
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00d9
            int r1 = r5.getRight()
            int r0 = r5.getLeft()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d9
            int r1 = r5.getBottom()
            int r0 = r5.getTop()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d9
            goto L_0x009d
        L_0x00d9:
            A00(r14)
            X.JTP.A15(r5, r3)
            boolean r0 = r14.A02()
            if (r0 == 0) goto L_0x009d
            r1 = 1
            long r6 = android.os.SystemClock.uptimeMillis()
            r10 = 3
            r11 = 0
            r8 = r6
            r12 = r11
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r6, r8, r10, r11, r12, r13)
            r5.onTouchEvent(r0)
            r0.recycle()
            goto L_0x005b
        L_0x00fa:
            A00(r14)
            goto L_0x009d
        L_0x00fe:
            int r0 = r2.getPointerId(r13)
            r14.A00 = r0
            java.lang.Runnable r2 = r14.A01
            if (r2 != 0) goto L_0x010f
            X.WhM r2 = new X.WhM
            r2.<init>(r14)
            r14.A01 = r2
        L_0x010f:
            int r0 = r14.A06
            long r0 = (long) r0
            r5.postDelayed(r2, r0)
            java.lang.Runnable r2 = r14.A02
            if (r2 != 0) goto L_0x0120
            X.WhN r2 = new X.WhN
            r2.<init>(r14)
            r14.A02 = r2
        L_0x0120:
            int r0 = r14.A05
            long r0 = (long) r0
            r5.postDelayed(r2, r0)
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WC5.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public WC5(View view) {
        this.A07 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.A04 = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.A06 = tapTimeout;
        this.A05 = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }
}
