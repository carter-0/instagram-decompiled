package X;

import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.instagram.ui.widget.textview.IgTextLayoutView;

/* renamed from: X.3Z0  reason: invalid class name */
public abstract class AnonymousClass3Z0 extends 057 {
    public int A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public final View A02;
    public final AccessibilityManager A03;

    public final AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        int i2;
        if (i != -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.A02, i);
            if (obtain != null) {
                accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(obtain);
            } else {
                accessibilityNodeInfoCompat = null;
            }
            accessibilityNodeInfoCompat.getClass();
            A04(accessibilityNodeInfoCompat, i);
            if (this.A00 == i) {
                accessibilityNodeInfoCompat.mInfo.setAccessibilityFocused(true);
                i2 = 128;
            } else {
                accessibilityNodeInfoCompat.mInfo.setAccessibilityFocused(false);
                i2 = 64;
            }
            accessibilityNodeInfoCompat.addAction(i2);
            return accessibilityNodeInfoCompat;
        }
        View view = this.A02;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(view));
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat2.mInfo);
        A03(accessibilityNodeInfoCompat2);
        return accessibilityNodeInfoCompat2;
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        if (i == -1) {
            return this.A02.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = this.A03;
            if ((accessibilityManager != null && (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled())) || (i3 = this.A00) == i) {
                return false;
            }
            this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
            View view = this.A02;
            view.invalidate();
            A02(i3, Constants.LOAD_RESULT_PGO_ATTEMPTED);
            this.A00 = i;
            view.invalidate();
            i4 = Constants.LOAD_RESULT_PGO;
        } else if (i2 != 128 || this.A00 != i) {
            return false;
        } else {
            this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
            this.A02.invalidate();
            i4 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
        }
        A02(i, i4);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(float r8, float r9) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass418
            if (r0 == 0) goto L_0x006c
            r0 = r7
            X.418 r0 = (X.AnonymousClass418) r0
            com.instagram.ui.widget.textview.IgTextLayoutView r0 = r0.A00
            android.text.Layout r4 = r0.A00
        L_0x000b:
            int r2 = (int) r8
            int r1 = (int) r9
        L_0x000d:
            android.graphics.RectF r0 = X.C18722Vyw.A02
            if (r4 == 0) goto L_0x0085
            java.lang.CharSequence r6 = r4.getText()
            boolean r0 = r6 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0085
            android.text.Spanned r6 = (android.text.Spanned) r6
            if (r6 == 0) goto L_0x0085
            r5 = 0
            int r0 = r4.getLineTop(r5)
            if (r1 < r0) goto L_0x0085
            int r0 = r4.getLineCount()
            int r0 = r0 + -1
            int r0 = r4.getLineBottom(r0)
            if (r1 >= r0) goto L_0x0085
            int r3 = r4.getLineForVertical(r1)
            float r1 = (float) r2
            float r0 = r4.getLineLeft(r3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0085
            float r0 = r4.getLineRight(r3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0085
            int r1 = r4.getOffsetForHorizontal(r3, r1)
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r1 = r6.getSpans(r1, r1, r0)
            android.text.style.ClickableSpan[] r1 = (android.text.style.ClickableSpan[]) r1
            int r0 = r1.length
            if (r0 == 0) goto L_0x0085
            r2 = r1[r5]
            if (r2 == 0) goto L_0x0085
            java.lang.CharSequence r1 = r4.getText()
            r0 = 17
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r0 = r1.getSpanStart(r2)
            return r0
        L_0x006c:
            boolean r0 = r7 instanceof X.AnonymousClass41N
            android.view.View r3 = r7.A02
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.text.Layout r4 = r3.getLayout()
            if (r0 != 0) goto L_0x000b
            int r2 = (int) r8
            int r0 = r3.getPaddingLeft()
            int r2 = r2 - r0
            int r1 = (int) r9
            int r0 = r3.getPaddingTop()
            int r1 = r1 - r0
            goto L_0x000d
        L_0x0085:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Z0.A01(float, float):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r3 = r4.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(int r5, int r6) {
        /*
            r4 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L_0x000e
            android.view.accessibility.AccessibilityManager r0 = r4.A03
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            return
        L_0x000f:
            android.view.View r3 = r4.A02
            android.view.ViewParent r2 = r3.getParent()
            if (r2 == 0) goto L_0x000e
            r1 = -1
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain(r6)
            if (r5 == r1) goto L_0x0025
            r0.setSource(r3, r5)
        L_0x0021:
            r2.requestSendAccessibilityEvent(r3, r0)
            return
        L_0x0025:
            r3.onInitializeAccessibilityEvent(r0)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Z0.A02(int, int):void");
    }

    public void A03(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Layout layout;
        IgTextLayoutView igTextLayoutView;
        if ((this instanceof C267024ao) || !(this instanceof AnonymousClass418)) {
            View view = this.A02;
            layout = ((TextView) view).getLayout();
            igTextLayoutView = view;
        } else {
            0qQ.A0B(accessibilityNodeInfoCompat, 0);
            IgTextLayoutView igTextLayoutView2 = ((AnonymousClass418) this).A00;
            layout = igTextLayoutView2.A00;
            igTextLayoutView = igTextLayoutView2;
        }
        C18722Vyw.A00(layout, igTextLayoutView, accessibilityNodeInfoCompat);
    }

    public void A04(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        Layout layout;
        IgTextLayoutView igTextLayoutView;
        if (this instanceof AnonymousClass418) {
            IgTextLayoutView igTextLayoutView2 = ((AnonymousClass418) this).A00;
            layout = igTextLayoutView2.A00;
            igTextLayoutView = igTextLayoutView2;
        } else {
            View view = this.A02;
            layout = ((TextView) view).getLayout();
            igTextLayoutView = view;
        }
        C18722Vyw.A01(layout, igTextLayoutView, accessibilityNodeInfoCompat, i);
    }

    public final boolean A05(MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = this.A03;
        if (accessibilityManager == null || (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int A012 = A01(motionEvent.getX(), motionEvent.getY());
                int i = this.A01;
                if (i != A012) {
                    this.A01 = A012;
                    A02(A012, 128);
                    A02(i, 256);
                }
                if (A012 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10) {
                int i2 = this.A01;
                if (i2 != Integer.MIN_VALUE) {
                    this.A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
                    A02(i2, 256);
                }
                return true;
            }
        }
        return false;
    }

    public AnonymousClass3Z0(View view) {
        this.A02 = view;
        this.A03 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
    }
}
