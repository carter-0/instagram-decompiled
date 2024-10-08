package com.instagram.shopping.adapter.cart.merchant;

import X.AnonymousClass3AW;
import X.C67780Muk;
import X.C74432Pum;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class PinnedLinearLayoutManager extends LinearLayoutManager {
    public Class A00;
    public Class A01;
    public String A02;
    public String A03;
    public final float A04 = 100.0f;
    public final Context A05;
    public final C67780Muk A06;
    public final C74432Pum A07;

    public PinnedLinearLayoutManager(Context context, C74432Pum pum) {
        super(context, 1, false);
        this.A05 = context;
        this.A07 = pum;
        this.A06 = new C67780Muk(context, this);
    }

    public final void A1T(AnonymousClass3AW r2, RecyclerView recyclerView, int i) {
        C67780Muk muk = this.A06;
        muk.A00 = i;
        A0t(muk);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        if (r5 == null) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1R(X.AnonymousClass3AN r14, X.AnonymousClass3AW r15) {
        /*
            r13 = this;
            r0 = -2036657440(0xffffffff869b12e0, float:-5.8332254E-35)
            int r3 = X.AnonymousClass0fD.A03(r0)
            boolean r10 = X.AnonymousClass7TG.A1Z(r14, r15)
            super.A1R(r14, r15)
            java.lang.String r2 = r13.A03
            java.lang.Class r1 = r13.A01
            if (r1 == 0) goto L_0x0096
            if (r2 == 0) goto L_0x0096
            boolean r0 = r15.A08
            if (r0 != 0) goto L_0x0096
            X.Pum r7 = r13.A07
            int r0 = r7.AZM(r2)
            android.view.View r5 = r13.A1D(r0)
            r4 = 0
            java.lang.String r6 = r13.A02
            if (r6 == 0) goto L_0x0035
            java.lang.Class r0 = r13.A00
            if (r0 == 0) goto L_0x0035
            int r0 = r7.AZM(r6)
            android.view.View r4 = r13.A1D(r0)
        L_0x0035:
            if (r5 != 0) goto L_0x00a3
            boolean r0 = r15.A0C
            if (r0 == 0) goto L_0x009c
            boolean r0 = r15.A0A
            if (r0 != 0) goto L_0x0043
            boolean r0 = r15.A0B
            if (r0 == 0) goto L_0x009c
        L_0x0043:
            java.util.List r6 = r14.A07
            X.0qQ.A07(r6)
            long r11 = r7.BJQ(r1, r2)
            java.lang.Class r2 = r13.A00
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x007a
            java.lang.String r0 = r13.A02
            if (r0 == 0) goto L_0x0082
            long r8 = r7.BJQ(r2, r0)
            java.util.Iterator r7 = r6.iterator()
        L_0x005e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r6 = r7.next()
            X.3kE r6 = (X.C249703kE) r6
            long r1 = r6.mItemId
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            android.view.View r5 = r6.itemView
            goto L_0x005e
        L_0x0073:
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            android.view.View r4 = r6.itemView
            goto L_0x005e
        L_0x007a:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r1)
            r0 = -1387122009(0xffffffffad5232a7, float:-1.1948365E-11)
            goto L_0x0089
        L_0x0082:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r1)
            r0 = -1510272159(0xffffffffa5fb1361, float:-4.355469E-16)
        L_0x0089:
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        L_0x008d:
            int r1 = r1 - r0
            r5.offsetTopAndBottom(r1)
            if (r4 == 0) goto L_0x0096
            r4.offsetTopAndBottom(r1)
        L_0x0096:
            r0 = 375808891(0x1666637b, float:1.8610643E-25)
            goto L_0x009f
        L_0x009a:
            if (r5 != 0) goto L_0x00a3
        L_0x009c:
            r0 = -1525954587(0xffffffffa50bc7e5, float:-1.2124055E-16)
        L_0x009f:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x00a3:
            boolean r0 = r13.A10(r5, r10)
            if (r0 != 0) goto L_0x00ad
            r0 = -2129113831(0xffffffff81184d19, float:-2.7973306E-38)
            goto L_0x009f
        L_0x00ad:
            if (r4 == 0) goto L_0x00ce
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            X.3MX r0 = (X.AnonymousClass3MX) r0
            android.graphics.Rect r1 = r0.A02
            int r2 = r4.getMeasuredHeight()
            int r0 = r1.top
            int r2 = r2 + r0
            int r0 = r1.bottom
            int r2 = r2 + r0
        L_0x00c1:
            int r1 = r13.A00
            int r1 = r1 - r2
            int r0 = r13.A0V(r5)
            if (r0 < r1) goto L_0x008d
            r0 = 2002559826(0x775ca352, float:4.4750697E33)
            goto L_0x009f
        L_0x00ce:
            r2 = 0
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.adapter.cart.merchant.PinnedLinearLayoutManager.A1R(X.3AN, X.3AW):void");
    }
}
