package X;

import android.view.View;
import android.view.ViewGroup;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

public final class WBK implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public WBK(C47714EDx eDx, C307786Rm r3, C276544tV r4, C277014uI r5) {
        this.A00 = 0;
        this.A01 = eDx;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (java.lang.Boolean.valueOf(r1) != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        if (java.lang.Boolean.valueOf(r1) != null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFocusChange(android.view.View r7, boolean r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x009e;
                case 1: goto L_0x0043;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r8 == 0) goto L_0x0042
            java.lang.Object r5 = r6.A04
            X.VYI r5 = (X.VYI) r5
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0042
            java.lang.Object r2 = r6.A03
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1 = 0
            java.lang.Object r0 = r6.A01
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getTop()
            r2.A0u(r1, r0)
            java.lang.Object r4 = r6.A02
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r4 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r4
            X.3uh r0 = r5.A00
            r3 = 0
            if (r0 == 0) goto L_0x002c
            java.lang.String r3 = r0.A0j
        L_0x002c:
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x00bd
            if (r0 == 0) goto L_0x00b7
            boolean r1 = r0.A0q()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x00b7
        L_0x003c:
            r4.A0L(r3, r1)
            r0 = 1
            r5.A01 = r0
        L_0x0042:
            return
        L_0x0043:
            if (r8 == 0) goto L_0x008e
            java.lang.Object r5 = r6.A04
            X.VYI r5 = (X.VYI) r5
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x008e
            java.lang.Object r1 = r6.A01
            android.view.View r1 = (android.view.View) r1
            int r0 = r1.getTop()
            float r0 = (float) r0
            float r0 = java.lang.Math.abs(r0)
            java.lang.Object r3 = r6.A03
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.widget.AbsListView r3 = (android.widget.AbsListView) r3
            float r2 = X.JTP.A00(r0, r3)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 + r0
            r0 = 1133903872(0x43960000, float:300.0)
            float r2 = r2 * r0
            int r1 = r1.getTop()
            int r0 = (int) r2
            r3.smoothScrollBy(r1, r0)
            java.lang.Object r4 = r6.A02
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r4 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r4
            X.3uh r0 = r5.A00
            r3 = 0
            if (r0 == 0) goto L_0x007d
            java.lang.String r3 = r0.A0j
        L_0x007d:
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x00c9
            if (r0 == 0) goto L_0x00c3
            boolean r1 = r0.A0q()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x00c3
            goto L_0x003c
        L_0x008e:
            java.lang.Object r1 = r6.A04
            X.VYI r1 = (X.VYI) r1
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0042
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r1.A03
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r0.A0E
            r0.requestFocus()
            return
        L_0x009e:
            if (r8 == 0) goto L_0x0042
            java.lang.Object r3 = r6.A03
            X.4tV r3 = (X.C276544tV) r3
            java.lang.Object r2 = r6.A04
            X.4uI r2 = (X.C277014uI) r2
            X.6Tl r1 = X.DbU.A0T(r3)
            java.lang.Object r0 = r6.A02
            X.6Rm r0 = (X.C307786Rm) r0
            r1.A02(r0)
            X.DbT.A1R(r0, r3, r1, r2)
            return
        L_0x00b7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00c3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00c9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WBK.onFocusChange(android.view.View, boolean):void");
    }

    public WBK(View view, ViewGroup viewGroup, VYI vyi, ReelDashboardFragment reelDashboardFragment, int i) {
        this.A00 = i;
        this.A04 = vyi;
        if (1 - i != 0) {
            this.A03 = viewGroup;
            this.A01 = view;
        } else {
            this.A01 = view;
            this.A03 = viewGroup;
        }
        this.A02 = reelDashboardFragment;
    }
}
