package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Dmg  reason: case insensitive filesystem */
public final class C46864Dmg extends C249403jg {
    public final int A00;
    public final Object A01;

    public C46864Dmg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(RecyclerView recyclerView, Object obj, int i) {
        recyclerView.A15(new C46864Dmg(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a4, code lost:
        X.0qQ.A0F("searchEditText");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ad, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x017e;
                case 1: goto L_0x010e;
                case 2: goto L_0x00f4;
                case 3: goto L_0x00dd;
                case 4: goto L_0x009f;
                case 5: goto L_0x0081;
                case 6: goto L_0x0064;
                case 7: goto L_0x004f;
                case 8: goto L_0x0036;
                case 9: goto L_0x001f;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -2089324919(0xffffffff83776e89, float:-7.2713664E-37)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            if (r9 != r0) goto L_0x0018
            java.lang.Object r0 = r7.A01
            X.EzK r0 = (X.C49601EzK) r0
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r0.A03
            X.0nA.A0N(r0)
        L_0x0018:
            r0 = -2038445113(0xffffffff867fcbc7, float:-4.8109881E-35)
        L_0x001b:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x001f:
            r0 = -172986541(0xfffffffff5b06f53, float:-4.473155E32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r7.A01
            X.E4s r0 = (X.C47488E4s) r0
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r0.A02
            r0 = 1
            if (r9 != r0) goto L_0x0032
            r1.A03()
        L_0x0032:
            r0 = 2038402023(0x797f8be7, float:8.292958E34)
            goto L_0x001b
        L_0x0036:
            r0 = 155294442(0x9419aea, float:2.330437E-33)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            if (r9 != r0) goto L_0x004b
            java.lang.Object r0 = r7.A01
            X.E7Q r0 = (X.E7Q) r0
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r0.A0B
            if (r0 == 0) goto L_0x01a4
            r0.A04()
        L_0x004b:
            r0 = 1680585157(0x642bb1c5, float:1.2668812E22)
            goto L_0x001b
        L_0x004f:
            r0 = -696288076(0xffffffffd67f7cb4, float:-7.0227765E13)
            int r4 = X.AnonymousClass7TG.A0D(r8, r0)
            super.onScrollStateChanged(r8, r9)
            java.lang.Object r0 = r7.A01
            X.E7P r0 = (X.E7P) r0
            X.E7P.A00(r0)
            r0 = 100380456(0x5fbaf28, float:2.3668269E-35)
            goto L_0x001b
        L_0x0064:
            r0 = -1236276503(0xffffffffb64feae9, float:-3.098214E-6)
            int r4 = X.AnonymousClass7TG.A0D(r8, r0)
            super.onScrollStateChanged(r8, r9)
            java.lang.Object r1 = r7.A01
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r1
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L_0x007d
            if (r9 == 0) goto L_0x007d
            r1.A03()
        L_0x007d:
            r0 = 1211908229(0x483c4085, float:192770.08)
            goto L_0x001b
        L_0x0081:
            r0 = -1092012320(0xffffffffbee936e0, float:-0.4554968)
            int r4 = X.AnonymousClass7TG.A0D(r8, r0)
            super.onScrollStateChanged(r8, r9)
            java.lang.Object r1 = r7.A01
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r1
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L_0x009a
            if (r9 == 0) goto L_0x009a
            r1.A03()
        L_0x009a:
            r0 = -1507752778(0xffffffffa62184b6, float:-5.6037953E-16)
            goto L_0x001b
        L_0x009f:
            r0 = -1910215022(0xffffffff8e246e92, float:-2.0267798E-30)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r7.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r5 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r5
            boolean r0 = r5.isScrolledToTop()
            if (r0 == 0) goto L_0x00c3
            boolean r0 = r5.A1O
            if (r0 != 0) goto L_0x00c3
            X.FFv r0 = r5.A0L
            android.view.View r1 = r0.A01
            if (r1 == 0) goto L_0x00be
            r0 = 0
        L_0x00bb:
            r1.setVisibility(r0)
        L_0x00be:
            r0 = -1027286790(0xffffffffc2c4d8fa, float:-98.42378)
            goto L_0x001b
        L_0x00c3:
            if (r9 == 0) goto L_0x00be
            com.instagram.common.session.UserSession r3 = r5.A0G
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318234865440788(0x81073e00061814, double:3.031136198473819E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 != 0) goto L_0x00be
            X.FFv r0 = r5.A0L
            android.view.View r1 = r0.A01
            if (r1 == 0) goto L_0x00be
            r0 = 8
            goto L_0x00bb
        L_0x00dd:
            r0 = -649784108(0xffffffffd94514d4, float:-3.46709195E15)
            int r4 = X.AnonymousClass0fD.A03(r0)
            if (r9 == 0) goto L_0x00ef
            java.lang.Object r0 = r7.A01
            X.EEP r0 = (X.EEP) r0
            android.view.ViewGroup r0 = r0.A04
            X.0nA.A0N(r0)
        L_0x00ef:
            r0 = -2095981236(0xffffffff8311dd4c, float:-4.2865707E-37)
            goto L_0x001b
        L_0x00f4:
            r0 = -3643340(0xffffffffffc86834, float:NaN)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            if (r9 != r0) goto L_0x0109
            java.lang.Object r0 = r7.A01
            X.E7U r0 = (X.E7U) r0
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r0.A07
            if (r0 == 0) goto L_0x01a4
            r0.A04()
        L_0x0109:
            r0 = 1949498265(0x7432fb99, float:5.6721915E31)
            goto L_0x001b
        L_0x010e:
            r0 = 1172010061(0x45db744d, float:7022.5376)
            int r4 = X.AnonymousClass0fD.A03(r0)
            super.onScrollStateChanged(r8, r9)
            if (r9 != 0) goto L_0x0179
            r0 = -1
            boolean r0 = r8.canScrollVertically(r0)
            if (r0 == 0) goto L_0x0179
            java.lang.Object r5 = r7.A01
            com.instagram.business.fragment.SuggestBusinessFragment r5 = (com.instagram.business.fragment.SuggestBusinessFragment) r5
            boolean r0 = r5.isAdded()
            if (r0 == 0) goto L_0x0179
            X.F2O r1 = r5.A03
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0179
            boolean r0 = r1.A02
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0179
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x016b
            X.UdP r1 = com.instagram.business.fragment.SuggestBusinessFragment.A00(r5)
            r6 = 1
            X.EAh r0 = r1.A01
            r0.A00 = r6
            r1.notifyDataSetChanged()
            X.3pI r3 = r8.A0D
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            if (r3 == 0) goto L_0x016b
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131165245(0x7f07003d, float:1.7944702E38)
            int r2 = r1.getDimensionPixelSize(r0)
            int r1 = r3.A1d()
            X.UdP r0 = com.instagram.business.fragment.SuggestBusinessFragment.A00(r5)
            int r0 = r0.getItemCount()
            int r0 = r0 - r6
            if (r1 != r0) goto L_0x016b
            r0 = 0
            r8.scrollBy(r0, r2)
        L_0x016b:
            X.F2O r3 = r5.A03
            com.instagram.common.session.UserSession r2 = r5.A04
            X.FTs r1 = new X.FTs
            r1.<init>(r7)
            java.lang.String r0 = r5.A06
            r3.A00(r1, r2, r5, r0)
        L_0x0179:
            r0 = 1515072005(0x5a4e2a05, float:1.45075115E16)
            goto L_0x001b
        L_0x017e:
            r0 = -1054199423(0xffffffffc12a3181, float:-10.637086)
            int r4 = X.AnonymousClass7TG.A0D(r8, r0)
            super.onScrollStateChanged(r8, r9)
            java.lang.Object r2 = r7.A01
            X.F2o r2 = (X.C49703F2o) r2
            X.UdP r1 = r2.A04
            int r0 = r1.getItemCount()
            r2.A00(r8, r0)
            android.database.DataSetObserver r0 = r2.A02
            if (r0 == 0) goto L_0x019f
            r1.unregisterDataSetObserver(r0)
            r0 = 0
            r2.A02 = r0
        L_0x019f:
            r0 = -278554069(0xffffffffef659a2b, float:-7.1058445E28)
            goto L_0x001b
        L_0x01a4:
            java.lang.String r0 = "searchEditText"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46864Dmg.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }
}
