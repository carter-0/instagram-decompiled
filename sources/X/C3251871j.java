package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.71j  reason: invalid class name and case insensitive filesystem */
public final class C3251871j extends C249403jg {
    public C20977X7q A00;
    public C3252171m A01;
    public X48 A02;
    public Integer A03;
    public Integer A04;
    public boolean A05;
    public int A06;
    public int A07;
    public boolean A08;
    public final int A09;
    public final C252553pI A0A;
    public final C229132mt A0B;
    public final boolean A0C;
    public final Runnable A0D;
    public final boolean A0E;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3251871j(C252553pI r7, C229132mt r8, C3251771i r9) {
        this(r7, r8, r9, false, false);
        0qQ.A0B(r8, 1);
        0qQ.A0B(r9, 2);
    }

    private final int A00(RecyclerView recyclerView) {
        if (!this.A0E || recyclerView.getChildCount() <= 0) {
            return C240113Jq.A02(this.A0A);
        }
        int[] iArr = new int[2];
        for (int childCount = recyclerView.getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = recyclerView.getChildAt(childCount);
            childAt.getLocationOnScreen(iArr);
            int i = iArr[1];
            Context context = childAt.getContext();
            0qQ.A07(context);
            int i2 = this.A09;
            if (i2 < 0) {
                i2 = 0nA.A08(context);
            }
            if (i < i2) {
                return RecyclerView.A03(childAt);
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(androidx.recyclerview.widget.RecyclerView r7, X.C3251871j r8, int r9, boolean r10) {
        /*
            r0 = 1841511242(0x6dc33b4a, float:7.5526566E27)
            int r2 = X.AnonymousClass0fD.A03(r0)
            boolean r0 = r8.A08
            if (r0 != 0) goto L_0x0014
            if (r10 != 0) goto L_0x0014
            r0 = -677101705(0xffffffffd7a43f77, float:-3.61184973E14)
        L_0x0010:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0014:
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x0079
            X.3pI r3 = r8.A0A
            if (r3 == 0) goto L_0x0079
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0079
            if (r9 != 0) goto L_0x0026
            boolean r0 = r8.A0C
            if (r0 != 0) goto L_0x0079
        L_0x0026:
            java.lang.Integer r1 = r8.A03
            r0 = r1
            if (r9 == 0) goto L_0x002f
            if (r9 <= 0) goto L_0x00c1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x002f:
            if (r0 != r1) goto L_0x0079
            r4 = 0
            java.lang.Integer r0 = r8.A04
            int r0 = r0.intValue()
            r1 = 1
            if (r0 == r1) goto L_0x007d
            if (r0 != r4) goto L_0x00c5
            int r5 = r3.A0U()
            if (r5 == 0) goto L_0x005b
            int r0 = r8.A00(r7)
            if (r0 <= 0) goto L_0x005b
            int r5 = r5 - r0
            int r5 = r5 - r1
            X.71m r0 = r8.A01
            int r0 = r0.Bju()
        L_0x0051:
            if (r5 > r0) goto L_0x005b
            java.lang.Runnable r0 = r8.A0D
            r7.removeCallbacks(r0)
            r7.post(r0)
        L_0x005b:
            int r1 = r3.A0U()
            if (r1 <= 0) goto L_0x0079
            X.X48 r0 = r8.A02
            if (r0 == 0) goto L_0x0079
            int r0 = r8.A00(r7)
            int r1 = r1 - r0
            int r1 = r1 + -1
            int r0 = r8.A06
            if (r0 == r1) goto L_0x0079
            r8.A06 = r1
            X.X48 r0 = r8.A02
            if (r0 == 0) goto L_0x0079
            r0.D9h(r1)
        L_0x0079:
            r0 = 700863270(0x29c65326, float:8.80739E-14)
            goto L_0x0010
        L_0x007d:
            android.content.Context r6 = r7.getContext()
            if (r6 == 0) goto L_0x005b
            boolean r0 = r3 instanceof com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager
            if (r0 == 0) goto L_0x00cb
            r4 = r3
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager r4 = (com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager) r4
            X.Tu0 r0 = r4.A06
            java.util.List r1 = r0.A07
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00b2
            r5 = 0
        L_0x0095:
            android.graphics.Rect r0 = r4.A05
            int r4 = r0.bottom
            X.71m r0 = r8.A01
            int r0 = r0.Bju()
            float r1 = (float) r0
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 / r0
            int r0 = (int) r1
            if (r5 <= 0) goto L_0x005b
            if (r4 <= 0) goto L_0x005b
            int r5 = r5 - r4
            goto L_0x0051
        L_0x00b2:
            int r0 = r1.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r1.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r5 = r0.bottom
            goto L_0x0095
        L_0x00c1:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x002f
        L_0x00c5:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00cb:
            java.lang.IllegalArgumentException r0 = X.C240113Jq.A04(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3251871j.A01(androidx.recyclerview.widget.RecyclerView, X.71j, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r10 == 2) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r9, int r10) {
        /*
            r8 = this;
            r0 = 277087555(0x10840543, float:5.2072927E-29)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r0 = 0
            X.0qQ.A0B(r9, r0)
            r0 = 1
            if (r10 == r0) goto L_0x0012
            r0 = 2
            r2 = 0
            if (r10 != r0) goto L_0x0013
        L_0x0012:
            r2 = 1
        L_0x0013:
            X.3pI r1 = r8.A0A
            if (r1 == 0) goto L_0x002d
            int r0 = r1.A0U()
            if (r0 <= 0) goto L_0x002d
            boolean r0 = r8.A08
            if (r0 != 0) goto L_0x002d
            if (r2 == 0) goto L_0x002d
            X.X48 r0 = r8.A02
            if (r0 == 0) goto L_0x002d
            r1.A0U()
            r8.A00(r9)
        L_0x002d:
            r8.A08 = r2
            if (r10 != 0) goto L_0x0064
            int r7 = r8.A00(r9)
            int r0 = r9.getScrollState()
            int r1 = r8.A07
            X.X7q r5 = r8.A00
            if (r5 == 0) goto L_0x0064
            if (r0 != 0) goto L_0x0064
            boolean r0 = r5.CYB()
            if (r0 == 0) goto L_0x0064
            int r0 = r7 - r1
            long r3 = (long) r0
            long r1 = r5.BTP()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0064
            boolean r0 = r5.CO9()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0064
            r8.A07 = r7
            java.lang.Runnable r0 = r8.A0D
            r9.removeCallbacks(r0)
            r9.post(r0)
        L_0x0064:
            r0 = -565222125(0xffffffffde4f6513, float:-3.73609296E18)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3251871j.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A032 = AnonymousClass0fD.A03(-1928496376);
        0qQ.A0B(recyclerView, 0);
        A01(recyclerView, this, i2, false);
        AnonymousClass0fD.A0A(346615467, A032);
    }

    public C3251871j(C252553pI r4, C229132mt r5, C3251771i r6, boolean z, boolean z2) {
        0qQ.A0B(r5, 1);
        0qQ.A0B(r6, 2);
        this.A0B = r5;
        this.A0A = r4;
        this.A0C = z;
        this.A0E = z2;
        this.A0D = new C3251971k(this);
        this.A04 = r6.A02;
        this.A03 = r6.A01;
        this.A01 = new C3252071l(this, r6.A00);
        this.A06 = -1;
        this.A09 = -1;
        this.A05 = true;
    }
}
