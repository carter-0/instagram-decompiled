package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.List;

/* renamed from: X.U4o  reason: case insensitive filesystem */
public abstract class C14724U4o extends FrameLayout implements X0S, X0T, X0U {
    public float A00;
    public float A01;
    public int A02 = 100;
    public C20087Wkl A03;
    public X83 A04;
    public AccessibilityManager A05;
    public C18024Vk0 A06;

    public float A03(int i) {
        return ((float) i) / ((float) this.A02);
    }

    public abstract int getCurrentPositionAsValue();

    public abstract int getLengthPx();

    public void setCurrentPositionWithBounds(float f) {
        this.A00 = Math.min(1.0f, Math.max(0.0f, f));
        X83 x83 = this.A04;
        if (x83 != null) {
            x83.DaL(getCurrentPositionAsValue());
        }
        if (this.A05 == null) {
            this.A05 = (AccessibilityManager) getContext().getSystemService("accessibility");
        }
        if (2eO.A01(getContext(), true)) {
            C20087Wkl wkl = this.A03;
            if (wkl == null) {
                this.A03 = new C20087Wkl(this);
            } else {
                removeCallbacks(wkl);
            }
            postDelayed(this.A03, 200);
        }
        invalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.C14724U4o r3, float r4, float r5) {
        /*
            boolean r0 = r3 instanceof com.instagram.ui.igeditseekbar.IgVerticalChunkySlider
            if (r0 == 0) goto L_0x0035
            r4 = r5
        L_0x0005:
            int r0 = r3.getLengthPx()
            int r0 = r0 / 3
            float r0 = (float) r0
            r1 = 1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0021
            int r0 = r3.getCurrentPositionAsValue()
            int r0 = r0 - r1
        L_0x0016:
            r3.setCurrentValue(r0)
        L_0x0019:
            X.X83 r0 = r3.A04
            if (r0 == 0) goto L_0x0020
            r0.DAc()
        L_0x0020:
            return r1
        L_0x0021:
            int r0 = r3.getLengthPx()
            int r0 = r0 * 2
            int r0 = r0 / 3
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0019
            int r0 = r3.getCurrentPositionAsValue()
            int r0 = r0 + 1
            goto L_0x0016
        L_0x0035:
            r2 = r3
            com.instagram.ui.igeditseekbar.IgEditSeekBar r2 = (com.instagram.ui.igeditseekbar.IgEditSeekBar) r2
            int r0 = r2.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r1 = X.AnonymousClass7TE.A00(r5, r0)
            int r0 = r2.A08
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.Dba.A1U(r0)
            if (r0 != 0) goto L_0x0005
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14724U4o.A01(X.U4o, float, float):boolean");
    }

    private int getMax() {
        return AnonymousClass7TE.A05(1.0f - this.A01, (float) this.A02);
    }

    private int getMin() {
        return AnonymousClass7TE.A05(-this.A01, (float) this.A02);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A06.A02(motionEvent);
    }

    public void setOnSliderChangeListener(X83 x83) {
        this.A04 = x83;
        if (x83 != null) {
            x83.DaL(getCurrentPositionAsValue());
        }
    }

    public void setRootPosition(float f) {
        this.A01 = f;
    }

    public void setValueRangeSize(int i) {
        this.A02 = i;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.Vk0] */
    public C14724U4o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        Handler A0D = AnonymousClass7TF.A0D();
        ? obj = new Object();
        obj.A00 = 0.5f;
        obj.A0H = AnonymousClass05K.A01;
        obj.A01 = -1.0f;
        obj.A02 = -1.0f;
        obj.A03 = 0.0f;
        obj.A04 = 0.0f;
        obj.A0E = null;
        obj.A0F = AnonymousClass05K.A00;
        obj.A0A = null;
        obj.A05 = 0;
        obj.A0B = null;
        obj.A0C = null;
        obj.A0D = null;
        obj.A09 = new GestureDetector(context, new W84(obj), A0D);
        obj.A08 = context;
        this.A06 = obj;
        Integer[] numArr = {AnonymousClass05K.A0C, AnonymousClass05K.A0N};
        int i2 = 0;
        obj.A05 = 0;
        int i3 = 0;
        do {
            Integer num = numArr[i3];
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 4;
                        break;
                    case 3:
                        i = 8;
                        break;
                    default:
                        i = 1;
                        break;
                }
                i2 |= i;
                obj.A05 = i2;
            }
            i3++;
        } while (i3 < 2);
        obj.A0C = this;
        obj.A0B = this;
        obj.A0D = this;
        setWillNotDraw(false);
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static void A00(C14724U4o u4o, List list, int i) {
        u4o.setCurrentValue(list.indexOf(Integer.valueOf(i)));
    }

    public void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-49443392);
        super.onDetachedFromWindow();
        C20087Wkl wkl = this.A03;
        if (wkl != null) {
            removeCallbacks(wkl);
        }
        AnonymousClass0fD.A0D(40449381, A062);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(getMax());
        accessibilityEvent.setCurrentItemIndex(getCurrentPositionAsValue());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isEnabled()) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.addAction(4096);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r4 != 81) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L_0x001b
            r0 = 21
            r2 = 1
            if (r4 == r0) goto L_0x0020
            r0 = 22
            if (r4 == r0) goto L_0x002a
            r0 = 69
            if (r4 == r0) goto L_0x0020
            r0 = 70
            if (r4 == r0) goto L_0x002a
            r0 = 81
            if (r4 == r0) goto L_0x002a
        L_0x001b:
            boolean r2 = super.onKeyDown(r4, r5)
            return r2
        L_0x0020:
            int r1 = r3.getCurrentPositionAsValue()
            int r0 = r3.A02
            int r0 = r0 / 20
            int r1 = r1 - r0
            goto L_0x0033
        L_0x002a:
            int r1 = r3.getCurrentPositionAsValue()
            int r0 = r3.A02
            int r0 = r0 / 20
            int r1 = r1 + r0
        L_0x0033:
            r3.setCurrentValue(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14724U4o.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setContentDescription(getContext().getString(2131969580, Pxf.A1Y(Integer.valueOf(getCurrentPositionAsValue()), Integer.valueOf(getMin()), getMax())));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r1 != 3) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        if (r10 <= 0) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r7.A0F.intValue() != 3) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            r0 = 1601155023(0x5f6fafcf, float:1.7271251E19)
            int r9 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r11.isEnabled()
            r8 = 0
            if (r0 != 0) goto L_0x0015
            r0 = 712126809(0x2a723159, float:2.1511039E-13)
            X.AnonymousClass0fD.A0C(r0, r9)
            return r8
        L_0x0015:
            X.Vk0 r7 = r11.A06
            java.lang.Integer r0 = r7.A0F
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r10)
            r6 = 1
            r5 = 3
            if (r0 != 0) goto L_0x004f
            r7.A02(r12)
            java.lang.Integer r0 = r7.A0F
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x0120
        L_0x002e:
            r1 = 1
            int r0 = r12.getActionMasked()
            if (r0 == r5) goto L_0x003c
            int r0 = r12.getActionMasked()
            if (r0 == r6) goto L_0x003c
            r8 = 1
        L_0x003c:
            boolean r0 = r11.isPressed()
            if (r8 == r0) goto L_0x0048
            r11.setPressed(r8)
            r11.invalidate()
        L_0x0048:
            r0 = -661008572(0xffffffffd899cf44, float:-1.35292383E15)
            X.AnonymousClass0fD.A0C(r0, r9)
            return r1
        L_0x004f:
            X.X0T r0 = r7.A0C
            if (r0 == 0) goto L_0x0120
            int r0 = r7.A05
            if (r0 <= 0) goto L_0x0120
            java.lang.Integer r0 = r7.A0E
            if (r0 == 0) goto L_0x0120
            android.view.VelocityTracker r0 = r7.A0A
            if (r0 != 0) goto L_0x0065
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.A0A = r0
        L_0x0065:
            r0.addMovement(r12)
            int r1 = r12.getAction()
            float r4 = r12.getX()
            float r3 = r12.getY()
            if (r1 == r6) goto L_0x00a8
            r0 = 2
            if (r1 == r0) goto L_0x007c
            if (r1 == r5) goto L_0x00a8
            goto L_0x002e
        L_0x007c:
            float r0 = r7.A01
            float r2 = r4 - r0
            float r0 = r7.A02
            float r10 = r3 - r0
            r7.A01 = r4
            r7.A02 = r3
            float r0 = r7.A03
            float r0 = r0 + r2
            r7.A03 = r0
            float r0 = r7.A04
            float r0 = r0 + r10
            r7.A04 = r0
            X.X0T r1 = r7.A0C
            X.U4o r1 = (X.C14724U4o) r1
            boolean r0 = r1 instanceof com.instagram.ui.igeditseekbar.IgVerticalChunkySlider
            if (r0 == 0) goto L_0x009b
            float r2 = -r10
        L_0x009b:
            int r0 = r1.getLengthPx()
            float r0 = (float) r0
            float r2 = r2 / r0
            float r0 = r1.A00
            float r0 = r0 + r2
            r1.setCurrentPositionWithBounds(r0)
            goto L_0x002e
        L_0x00a8:
            android.view.VelocityTracker r2 = r7.A0A
            r0 = 0
            r7.A0A = r0
            r1 = 1000(0x3e8, float:1.401E-42)
            X.C18024Vk0.A00(r7)
            int r0 = r7.A06
            float r0 = (float) r0
            r2.computeCurrentVelocity(r1, r0)
            java.lang.Integer r1 = r7.A0E
            if (r1 == r10) goto L_0x011b
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x011b
            float r0 = r2.getYVelocity()
        L_0x00c4:
            int r10 = (int) r0
            X.C18024Vk0.A00(r7)
            int r1 = r7.A07
            int r0 = java.lang.Math.abs(r10)
            if (r0 <= r1) goto L_0x00f1
            if (r10 < 0) goto L_0x00d4
            if (r10 <= 0) goto L_0x00e8
        L_0x00d4:
            X.X0T r1 = r7.A0C
            X.U4o r1 = (X.C14724U4o) r1
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x00e1
            X.JTP.A15(r1, r8)
        L_0x00e1:
            X.X83 r0 = r1.A04
            if (r0 == 0) goto L_0x00e8
            r0.DAc()
        L_0x00e8:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r7.A0F = r0
            r2.recycle()
            goto L_0x002e
        L_0x00f1:
            X.X0U r0 = r7.A0D
            if (r0 == 0) goto L_0x00d4
            X.C18024Vk0.A00(r7)
            java.lang.Integer r0 = r7.A0I
            int r1 = X.AnonymousClass7TG.A0A(r0)
            float r0 = r7.A03
            float r0 = java.lang.Math.abs(r0)
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d4
            float r0 = r7.A04
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d4
            X.X0U r0 = r7.A0D
            X.U4o r0 = (X.C14724U4o) r0
            A01(r0, r4, r3)
            goto L_0x00e8
        L_0x011b:
            float r0 = r2.getXVelocity()
            goto L_0x00c4
        L_0x0120:
            r1 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14724U4o.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int currentPositionAsValue;
        if (!super.performAccessibilityAction(i, bundle)) {
            if (isEnabled()) {
                if (i == 4096) {
                    currentPositionAsValue = getCurrentPositionAsValue() + (this.A02 / 20);
                } else if (i == 8192) {
                    currentPositionAsValue = getCurrentPositionAsValue() - (this.A02 / 20);
                }
                setCurrentValue(currentPositionAsValue);
            }
            return false;
        }
        return true;
    }

    public void setCurrentValue(int i) {
        setCurrentPositionWithBounds(A03(i));
    }
}
