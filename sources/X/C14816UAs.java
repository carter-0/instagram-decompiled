package X;

import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;

/* renamed from: X.UAs  reason: case insensitive filesystem */
public final class C14816UAs extends C249403jg {
    public final VOF A00;
    public final /* synthetic */ RefreshableRecyclerViewLayout A01;

    public C14816UAs(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout, VOF vof) {
        this.A01 = refreshableRecyclerViewLayout;
        this.A00 = vof;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d7, code lost:
        if (r1 > 1.0f) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2044007926(0x79d515f6, float:1.3830058E35)
            int r6 = X.AnonymousClass7TG.A0D(r13, r0)
            X.VOF r7 = r12.A00
            X.3pI r5 = r13.A0D
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
            if (r5 == 0) goto L_0x00ce
            int r0 = r5.A1a()
            r4 = 1
            if (r0 != 0) goto L_0x00da
            android.view.View r11 = r5.A1D(r0)
            X.3kE r2 = r13.A0W(r0)
            if (r11 == 0) goto L_0x0080
            if (r2 == 0) goto L_0x0080
            boolean r0 = r2 instanceof X.C14844UBy
            if (r0 != 0) goto L_0x0080
            X.W1R r8 = r7.A00
            boolean r0 = r8.A0I
            if (r0 != 0) goto L_0x0076
            X.2dZ r0 = r8.A0D
            if (r0 == 0) goto L_0x0076
            android.content.Context r1 = X.DbS.A07(r2)
            r0 = 100
            float r0 = X.0nA.A04(r1, r0)
            int r10 = (int) r0
            android.content.Context r1 = X.DbS.A07(r2)
            r0 = 20
            float r0 = X.0nA.A04(r1, r0)
            int r9 = (int) r0
            android.view.View r0 = r2.itemView
            int r3 = r0.getHeight()
            android.content.Context r1 = X.DbS.A07(r2)
            r0 = 142(0x8e, float:1.99E-43)
            float r0 = X.0nA.A04(r1, r0)
            int r0 = (int) r0
            int r1 = r3 - r0
            X.2dZ r0 = r8.A0D
            int r0 = r0.AYI()
            int r2 = r8.A04
            int r0 = r0 + r2
            int r1 = r3 - r1
            int r1 = r1 - r0
            int r0 = r1 - r10
            int r0 = X.0mi.A03(r0, r2, r3)
            r8.A02 = r0
            int r1 = r1 - r9
            int r0 = X.0mi.A03(r1, r2, r3)
            r8.A01 = r0
            r8.A0I = r4
        L_0x0076:
            int r0 = r11.getTop()
            int r0 = java.lang.Math.abs(r0)
            r8.A03 = r0
        L_0x0080:
            X.W1R r7 = r7.A00
        L_0x0082:
            android.view.View r1 = r5.A1D(r4)
            X.2dZ r0 = r7.A0D
            if (r0 == 0) goto L_0x00cb
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            if (r1 == 0) goto L_0x00ab
            int r3 = r1.getTop()
            int r2 = r1.getBottom()
            int r2 = r2 - r3
            X.2dZ r0 = r7.A0D
            int r1 = r0.AYI()
            int r0 = r7.A04
            int r1 = r1 + r0
            int r1 = r1 - r3
            float r1 = (float) r1
            float r0 = (float) r2
            float r1 = r1 / r0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d5
            r1 = 0
        L_0x00aa:
            r4 = r1
        L_0x00ab:
            android.view.View r0 = r7.A09
            if (r0 == 0) goto L_0x00b2
            r0.setAlpha(r4)
        L_0x00b2:
            android.view.View r3 = r7.A09
            r2 = 0
            if (r3 == 0) goto L_0x00c1
            int r1 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x00be
            r0 = 8
        L_0x00be:
            r3.setVisibility(r0)
        L_0x00c1:
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
            r2 = 1
        L_0x00c6:
            r7.A0J = r2
            X.W1R.A02(r7)
        L_0x00cb:
            X.W1R.A01(r7)
        L_0x00ce:
            r0 = 115462461(0x6e1d13d, float:8.494304E-35)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x00d5:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00da:
            X.W1R r7 = r7.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            r7.A03 = r0
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14816UAs.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
