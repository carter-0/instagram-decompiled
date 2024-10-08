package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Iterator;

/* renamed from: X.V4a  reason: case insensitive filesystem */
public abstract class C16743V4a {
    public final int A01(View view) {
        if (this instanceof C14752U7j) {
            return view.getWidth();
        }
        if (this instanceof C14753U7k) {
            return ((C14753U7k) this).A00.A03;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r1 != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r1 = r3.A01;
        r2 = r6.getWidth() + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(android.view.View r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C14751U7i
            if (r0 == 0) goto L_0x0009
            int r0 = r6.getLeft()
            return r0
        L_0x0009:
            boolean r0 = r5 instanceof X.C14752U7j
            if (r0 == 0) goto L_0x004e
            r3 = r5
            X.U7j r3 = (X.C14752U7j) r3
            int r0 = r6.getLayoutDirection()
            r2 = 1
            boolean r1 = X.AnonymousClass7TF.A1S(r0, r2)
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r3.A02
            int r0 = r0.A02
            if (r0 != 0) goto L_0x0033
            if (r1 == 0) goto L_0x0037
        L_0x0021:
            int r1 = r3.A01
            int r0 = r6.getWidth()
            int r1 = r1 - r0
            int r2 = r3.A01
        L_0x002a:
            int r0 = java.lang.Math.max(r1, r7)
        L_0x002e:
            int r0 = java.lang.Math.min(r0, r2)
            return r0
        L_0x0033:
            if (r0 != r2) goto L_0x003f
            if (r1 == 0) goto L_0x0021
        L_0x0037:
            int r1 = r3.A01
            int r2 = r6.getWidth()
            int r2 = r2 + r1
            goto L_0x002a
        L_0x003f:
            int r1 = r3.A01
            int r0 = r6.getWidth()
            int r1 = r1 - r0
            int r0 = r3.A01
            int r2 = r6.getWidth()
            int r2 = r2 + r0
            goto L_0x002a
        L_0x004e:
            r0 = r5
            X.U7k r0 = (X.C14753U7k) r0
            androidx.slidingpanelayout.widget.SlidingPaneLayout r4 = r0.A00
            android.view.View r0 = r4.A06
            android.view.ViewGroup$MarginLayoutParams r3 = X.DbS.A0D(r0)
            int r1 = r4.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x0080
            int r2 = r4.getWidth()
            int r1 = r4.getPaddingRight()
            int r0 = r3.rightMargin
            int r1 = r1 + r0
            android.view.View r0 = r4.A06
            int r0 = r0.getWidth()
            int r1 = r1 + r0
            int r2 = r2 - r1
            int r0 = r4.A03
            int r1 = r2 - r0
            int r0 = java.lang.Math.min(r7, r2)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
        L_0x0080:
            int r1 = r4.getPaddingLeft()
            int r0 = r3.leftMargin
            int r1 = r1 + r0
            int r2 = r4.A03
            int r2 = r2 + r1
            int r0 = java.lang.Math.max(r7, r1)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16743V4a.A02(android.view.View, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r1 < X.C13988Tno.A06(r0, r6)) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r6 = r4.A0R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009c, code lost:
        if (r1 >= X.C13988Tno.A06(r3, r2)) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        if (r3 < X.C13988Tno.A06(r3, r4.A04)) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00be, code lost:
        if (r1 >= X.C13988Tno.A06(r3, r2)) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f0, code lost:
        if (r9 < 0.0f) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011a, code lost:
        if (r9 <= 0.0f) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0133, code lost:
        if (java.lang.Math.abs(r2) >= X.AnonymousClass7TE.A05((float) r8.getWidth(), 0.5f)) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0136, code lost:
        r4 = r5.A01;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 > r6) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.view.View r8, float r9, float r10) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C14751U7i
            if (r0 == 0) goto L_0x00c7
            r2 = r7
            X.U7i r2 = (X.C14751U7i) r2
            r1 = 0
            r5 = 4
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r2.A00
            if (r0 >= 0) goto L_0x0021
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x006e
            int r0 = r8.getTop()
            int r6 = r4.A08
            if (r0 <= r6) goto L_0x0068
        L_0x001b:
            r5 = 6
        L_0x001c:
            r0 = 1
            r4.A0Z(r8, r5, r6, r0)
        L_0x0020:
            return
        L_0x0021:
            boolean r0 = r4.A0Q
            if (r0 == 0) goto L_0x0071
            boolean r0 = r4.A0c(r8, r10)
            if (r0 == 0) goto L_0x0071
            float r1 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x003d
            r0 = 1140457472(0x43fa0000, float:500.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00c2
        L_0x003d:
            int r2 = r8.getTop()
            int r1 = r4.A0C
            int r0 = r4.A0R()
            int r1 = r1 + r0
            int r0 = r1 / 2
            if (r2 > r0) goto L_0x00c2
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x006e
            int r1 = r8.getTop()
            int r0 = r4.A0R()
            int r1 = X.C13988Tno.A06(r1, r0)
            int r0 = r8.getTop()
            int r6 = r4.A08
            int r0 = X.C13988Tno.A06(r0, r6)
            if (r1 >= r0) goto L_0x001b
        L_0x0068:
            int r6 = r4.A0R()
        L_0x006c:
            r5 = 3
            goto L_0x001c
        L_0x006e:
            int r6 = r4.A06
            goto L_0x006c
        L_0x0071:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0088
            float r1 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0088
            boolean r0 = r4.A0O
            if (r0 == 0) goto L_0x00ae
            int r6 = r4.A04
            goto L_0x001c
        L_0x0088:
            int r3 = r8.getTop()
            boolean r0 = r4.A0O
            if (r0 == 0) goto L_0x00a1
            int r6 = r4.A06
            int r1 = X.C13988Tno.A06(r3, r6)
            int r2 = r4.A04
            int r0 = X.C13988Tno.A06(r3, r2)
            if (r1 < r0) goto L_0x006c
        L_0x009e:
            r6 = r2
            goto L_0x001c
        L_0x00a1:
            int r6 = r4.A08
            if (r3 >= r6) goto L_0x00b4
            int r0 = r4.A04
            int r0 = X.C13988Tno.A06(r3, r0)
            if (r3 >= r0) goto L_0x001b
            goto L_0x0068
        L_0x00ae:
            int r3 = r8.getTop()
            int r6 = r4.A08
        L_0x00b4:
            int r1 = X.C13988Tno.A06(r3, r6)
            int r2 = r4.A04
            int r0 = X.C13988Tno.A06(r3, r2)
            if (r1 >= r0) goto L_0x009e
            goto L_0x001b
        L_0x00c2:
            int r6 = r4.A0C
            r5 = 5
            goto L_0x001c
        L_0x00c7:
            boolean r0 = r7 instanceof X.C14752U7j
            if (r0 == 0) goto L_0x0144
            r5 = r7
            X.U7j r5 = (X.C14752U7j) r5
            r0 = -1
            r5.A00 = r0
            int r6 = r8.getWidth()
            r3 = 0
            r1 = 1
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x011d
            int r0 = r8.getLayoutDirection()
            boolean r2 = X.AnonymousClass7TF.A1S(r0, r1)
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r5.A02
            int r1 = r0.A02
            r0 = 2
            if (r1 == r0) goto L_0x00f2
            if (r1 != 0) goto L_0x0116
            if (r2 == 0) goto L_0x0118
        L_0x00ee:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0136
        L_0x00f2:
            int r1 = r8.getLeft()
            int r0 = r5.A01
            int r4 = r0 + r6
            if (r1 >= r0) goto L_0x00fe
            int r4 = r0 - r6
        L_0x00fe:
            r3 = 1
        L_0x00ff:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r5.A02
            X.W3p r1 = r2.A03
            int r0 = r8.getTop()
            boolean r0 = r1.A0J(r4, r0)
            if (r0 == 0) goto L_0x013a
            X.Woa r0 = new X.Woa
            r0.<init>(r8, r2, r3)
            r8.postOnAnimation(r0)
            return
        L_0x0116:
            if (r2 == 0) goto L_0x00ee
        L_0x0118:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            goto L_0x00f2
        L_0x011d:
            int r2 = r8.getLeft()
            int r0 = r5.A01
            int r2 = r2 - r0
            int r0 = r8.getWidth()
            float r1 = (float) r0
            r0 = 1056964608(0x3f000000, float:0.5)
            int r1 = X.AnonymousClass7TE.A05(r1, r0)
            int r0 = java.lang.Math.abs(r2)
            if (r0 < r1) goto L_0x0136
            goto L_0x00f2
        L_0x0136:
            int r4 = r5.A01
            r3 = 0
            goto L_0x00ff
        L_0x013a:
            if (r3 == 0) goto L_0x0020
            X.X32 r0 = r2.A04
            if (r0 == 0) goto L_0x0020
            r0.D9F(r8)
            return
        L_0x0144:
            r0 = r7
            X.U7k r0 = (X.C14753U7k) r0
            android.view.ViewGroup$MarginLayoutParams r2 = X.DbS.A0D(r8)
            androidx.slidingpanelayout.widget.SlidingPaneLayout r3 = r0.A00
            int r0 = r3.getLayoutDirection()
            boolean r0 = X.C66581MXm.A1V(r0)
            r5 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            if (r0 == 0) goto L_0x018b
            int r1 = r3.getPaddingRight()
            int r0 = r2.rightMargin
            int r1 = r1 + r0
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x016f
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0172
            float r0 = r3.A00
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0172
        L_0x016f:
            int r0 = r3.A03
            int r1 = r1 + r0
        L_0x0172:
            android.view.View r0 = r3.A06
            int r0 = r0.getWidth()
            int r2 = r3.getWidth()
            int r2 = r2 - r1
            int r2 = r2 - r0
        L_0x017e:
            X.W3p r1 = r3.A0K
            int r0 = r8.getTop()
            r1.A0J(r2, r0)
            r3.invalidate()
            return
        L_0x018b:
            int r0 = r3.getPaddingLeft()
            int r2 = r2.leftMargin
            int r2 = r2 + r0
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x01a0
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x017e
            float r0 = r3.A00
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x017e
        L_0x01a0:
            int r0 = r3.A03
            int r2 = r2 + r0
            goto L_0x017e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16743V4a.A03(android.view.View, float, float):void");
    }

    public final void A04(View view, int i, int i2) {
        int paddingLeft;
        int i3;
        if (this instanceof C14751U7i) {
            ((C14751U7i) this).A00.A0U(i2);
        } else if (this instanceof C14752U7j) {
            C14752U7j u7j = (C14752U7j) this;
            SwipeDismissBehavior swipeDismissBehavior = u7j.A02;
            float width = ((float) u7j.A01) + (((float) view.getWidth()) * swipeDismissBehavior.A01);
            float width2 = ((float) u7j.A01) + (((float) view.getWidth()) * swipeDismissBehavior.A00);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f - width) / (width2 - width))), 1.0f));
            }
        } else {
            SlidingPaneLayout slidingPaneLayout = ((C14753U7k) this).A00;
            if (slidingPaneLayout.A06 == null) {
                slidingPaneLayout.A00 = 0.0f;
            } else {
                boolean A1V = C66581MXm.A1V(slidingPaneLayout.getLayoutDirection());
                ViewGroup.MarginLayoutParams A0D = DbS.A0D(slidingPaneLayout.A06);
                int width3 = slidingPaneLayout.A06.getWidth();
                if (A1V) {
                    i = (slidingPaneLayout.getWidth() - i) - width3;
                    paddingLeft = slidingPaneLayout.getPaddingRight();
                    i3 = A0D.rightMargin;
                } else {
                    paddingLeft = slidingPaneLayout.getPaddingLeft();
                    i3 = A0D.leftMargin;
                }
                float f2 = ((float) (i - (paddingLeft + i3))) / ((float) slidingPaneLayout.A03);
                slidingPaneLayout.A00 = f2;
                if (slidingPaneLayout.A02 != 0) {
                    SlidingPaneLayout.A01(slidingPaneLayout, f2);
                }
                Iterator it = slidingPaneLayout.A0M.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw new NullPointerException("onPanelSlide");
                }
            }
            slidingPaneLayout.invalidate();
        }
    }
}
