package X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.video.heroplayer.ipc.HeroScrollSetting;

public final class UAx extends C249403jg {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public UAx(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        int i3;
        switch (this.A00) {
            case 0:
                i2 = AnonymousClass7TG.A0D(recyclerView, -649052056);
                if (i == 0) {
                    C61415K6m.A01((C61415K6m) this.A02);
                }
                super.onScrollStateChanged(recyclerView, i);
                i3 = -2069998162;
                break;
            case 1:
                i2 = AnonymousClass0fD.A03(-954192691);
                C14074TpO tpO = (C14074TpO) this.A02;
                HeroScrollSetting heroScrollSetting = ((C14385TvE) this.A01).A02;
                if (heroScrollSetting != null) {
                    1wS.A01(tpO.A0C).A0D(heroScrollSetting, AnonymousClass7TF.A1P(i));
                }
                if (i == 0) {
                    tpO.A0D.DhX();
                }
                i3 = 951888791;
                break;
            case 2:
                i2 = AnonymousClass0fD.A03(381747415);
                if (i == 0) {
                    ((C19560Wbk) this.A01).A00.mRecyclerView.A16(this);
                    ((Runnable) this.A02).run();
                }
                i3 = -1643934374;
                break;
            default:
                super.onScrollStateChanged(recyclerView, i);
                return;
        }
        AnonymousClass0fD.A0A(i3, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        r8 = r6.A03;
        r0 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r0 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        r5 = r0.size();
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r4 >= r5) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        r0 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (r0 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r7 != X.C51971G9r.A0I(r0, r4)) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        r2 = r8.A0E;
        r1 = r4 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        if (((X.UKG) r2.get(r1)).A08 != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a2, code lost:
        if (((X.UKG) r2.get(r1)).A07 != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        r0 = ((X.UKG) r2.get(r1)).A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        if (r0 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ae, code lost:
        com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment.A02(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
        X.AnonymousClass0fD.A0A(1603438506, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b8, code lost:
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r11, int r12, int r13) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x00d3;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onScrolled(r11, r12, r13)
            return
        L_0x0009:
            r0 = 326789138(0x137a6812, float:3.1605747E-27)
            int r3 = X.AnonymousClass0fD.A03(r0)
            super.onScrolled(r11, r12, r13)
            java.lang.Object r0 = r10.A02
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r7 = r0.A1b()
            int r8 = r0.A1a()
            java.lang.Object r6 = r10.A01
            com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment r6 = (com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment) r6
            X.UAP r5 = r6.A03
            java.util.List r0 = r5.A02
            java.lang.String r9 = "moduleTypeBoundaries"
            if (r0 == 0) goto L_0x00cb
            int r4 = r0.size()
            r2 = 1
        L_0x0030:
            if (r2 >= r4) goto L_0x0075
            java.util.List r0 = r5.A02
            if (r0 == 0) goto L_0x00cb
            int r0 = X.C51971G9r.A0I(r0, r2)
            if (r8 >= r0) goto L_0x00c7
            java.util.List r1 = r5.A0E
            int r0 = r2 + -1
            java.lang.Object r1 = X.00k.A0O(r1, r0)
            X.UKG r1 = (X.UKG) r1
            if (r1 == 0) goto L_0x00c7
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x00c7
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x00c7
            X.UxB r1 = r1.A04
            if (r1 == 0) goto L_0x0075
            X.UxB r0 = r6.A02
            if (r1 == r0) goto L_0x0075
            r6.A02 = r1
            X.X71 r4 = r6.A07
            android.content.Context r2 = r6.requireContext()
            X.UxB r1 = r6.A02
            X.UxB r0 = X.C16559UxB.TAGGED_PRODUCT
            if (r1 != r0) goto L_0x00bb
            java.lang.String r0 = r6.A0C
            if (r0 != 0) goto L_0x0072
            X.1Xj r0 = r6.A01
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = X.LTZ.A03(r2, r0)
        L_0x0072:
            r4.FLy(r0)
        L_0x0075:
            X.UAP r8 = r6.A03
            java.util.List r0 = r8.A02
            if (r0 == 0) goto L_0x00cb
            int r5 = r0.size()
            r4 = 1
        L_0x0080:
            if (r4 >= r5) goto L_0x00b1
            java.util.List r0 = r8.A02
            if (r0 == 0) goto L_0x00cb
            int r0 = X.C51971G9r.A0I(r0, r4)
            if (r7 != r0) goto L_0x00b8
            java.util.List r2 = r8.A0E
            int r1 = r4 + -1
            java.lang.Object r0 = r2.get(r1)
            X.UKG r0 = (X.UKG) r0
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x00b8
            java.lang.Object r0 = r2.get(r1)
            X.UKG r0 = (X.UKG) r0
            boolean r0 = r0.A07
            if (r0 != 0) goto L_0x00b8
            java.lang.Object r0 = r2.get(r1)
            X.UKG r0 = (X.UKG) r0
            X.UxB r0 = r0.A04
            if (r0 == 0) goto L_0x00b1
            com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment.A02(r0, r6)
        L_0x00b1:
            r0 = 1603438506(0x5f9287aa, float:2.111719E19)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x00b8:
            int r4 = r4 + 1
            goto L_0x0080
        L_0x00bb:
            r1 = 2131973778(0x7f135692, float:1.9584601E38)
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r0, r1)
            goto L_0x0072
        L_0x00c7:
            int r2 = r2 + 1
            goto L_0x0030
        L_0x00cb:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d3:
            r0 = -1685390427(0xffffffff9b8afba5, float:-2.2992806E-22)
            int r4 = X.AnonymousClass7TG.A0D(r11, r0)
            if (r12 == 0) goto L_0x0104
            java.lang.Object r0 = r10.A01
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.3pI r1 = r0.A0D
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x0101
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            if (r1 == 0) goto L_0x0101
            java.lang.Object r3 = r10.A02
            X.K6m r3 = (X.C61415K6m) r3
            int r2 = r1.A1a()
            int r1 = r1.A1b()
            int r0 = r3.A00
            if (r0 < r2) goto L_0x00fc
            if (r0 <= r1) goto L_0x0101
        L_0x00fc:
            java.lang.String r0 = "scroll"
            X.C61415K6m.A04(r3, r0)
        L_0x0101:
            super.onScrolled(r11, r12, r13)
        L_0x0104:
            r0 = 1267653010(0x4b8ed992, float:1.872362E7)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAx.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
