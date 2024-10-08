package X;

import android.view.View;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

public final class WBD implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WBD(VWC vwc, ReelDashboardFragment reelDashboardFragment, int i) {
        this.A00 = i;
        switch (i) {
            case 7:
            case 8:
            case 13:
                this.A01 = reelDashboardFragment;
                this.A02 = vwc;
                return;
            default:
                this.A02 = reelDashboardFragment;
                this.A01 = vwc;
                return;
        }
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new WBD(i, obj, obj2), view);
    }

    /* JADX WARNING: type inference failed for: r0v224, types: [com.instagram.model.shopping.ProductSource, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0065, code lost:
        if (r0.A0A == false) goto L_0x0eb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0067, code lost:
        r5 = r2.getActivity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        r4 = r2.A06;
        r2 = X.C46649DiU.A04(r1, new java.util.HashMap());
        r1 = new com.instagram.bloks.hosting.IgBloksScreenConfig((X.0lg) r4);
        r1.A0P = X.AnonymousClass05K.A01;
        r1.A0U = "";
        r2.A0D(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0088, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x07da, code lost:
        r0 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0e78, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0e7b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0e95, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0e9c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0eb2, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0eb5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0eb6, code lost:
        X.0kR.A0F(r2.requireContext(), X.0cp.A03(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0ec1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0061, code lost:
        if (r1 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r29) {
        /*
            r28 = this;
            r4 = r28
            int r0 = r4.A00
            r5 = r29
            switch(r0) {
                case 0: goto L_0x0e7c;
                case 1: goto L_0x0e61;
                case 2: goto L_0x00b4;
                case 3: goto L_0x0e33;
                case 4: goto L_0x0e16;
                case 5: goto L_0x0df8;
                case 6: goto L_0x0dd5;
                case 7: goto L_0x0009;
                case 8: goto L_0x0009;
                case 9: goto L_0x0dbc;
                case 10: goto L_0x0089;
                case 11: goto L_0x0dae;
                case 12: goto L_0x0da0;
                case 13: goto L_0x0009;
                case 14: goto L_0x0d82;
                case 15: goto L_0x0d76;
                case 16: goto L_0x0054;
                case 17: goto L_0x0054;
                case 18: goto L_0x0046;
                case 19: goto L_0x0d5a;
                case 20: goto L_0x0d43;
                case 21: goto L_0x0d2c;
                case 22: goto L_0x0d15;
                case 23: goto L_0x0cfe;
                case 24: goto L_0x0ce7;
                case 25: goto L_0x0cd0;
                case 26: goto L_0x0cb9;
                case 27: goto L_0x0ca2;
                case 28: goto L_0x0c8b;
                case 29: goto L_0x0c7d;
                case 30: goto L_0x0019;
                case 31: goto L_0x0c46;
                case 32: goto L_0x0c02;
                case 33: goto L_0x0bc4;
                case 34: goto L_0x0b62;
                case 35: goto L_0x0b0d;
                case 36: goto L_0x0af2;
                case 37: goto L_0x0ad7;
                case 38: goto L_0x0abc;
                case 39: goto L_0x0aa3;
                case 40: goto L_0x0a8a;
                case 41: goto L_0x0a71;
                case 42: goto L_0x0a58;
                case 43: goto L_0x0a3d;
                case 44: goto L_0x0a22;
                case 45: goto L_0x090c;
                case 46: goto L_0x08f3;
                case 47: goto L_0x0714;
                case 48: goto L_0x06fb;
                case 49: goto L_0x06e2;
                case 50: goto L_0x066d;
                case 51: goto L_0x0656;
                case 52: goto L_0x0591;
                case 53: goto L_0x057a;
                case 54: goto L_0x0563;
                case 55: goto L_0x054a;
                case 56: goto L_0x0531;
                case 57: goto L_0x0504;
                case 58: goto L_0x04ed;
                case 59: goto L_0x04d4;
                case 60: goto L_0x044e;
                case 61: goto L_0x0437;
                case 62: goto L_0x0420;
                case 63: goto L_0x0409;
                case 64: goto L_0x02f6;
                case 65: goto L_0x0259;
                case 66: goto L_0x0212;
                case 67: goto L_0x01ba;
                case 68: goto L_0x01a3;
                case 69: goto L_0x010e;
                case 70: goto L_0x00d0;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r4.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r2 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r2
            java.lang.Object r0 = r4.A02
            X.VWC r0 = (X.VWC) r0
            java.lang.Integer r1 = r0.A01
            X.3uh r0 = r0.A00
            r2.A0H(r5, r0, r1)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r1 = r4.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r1 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r1
            X.3uh r0 = r1.A0F()
            if (r0 == 0) goto L_0x0018
            java.lang.String r5 = r0.A0k
            java.lang.String r4 = r0.A0j
            X.6Yo r3 = X.C13991Tnr.A0M(r1)
            X.AnonymousClass7TG.A1N(r5, r4)
            X.UcE r2 = new X.UcE
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "ReelQuestionResponsesListFragment.REEL_ID"
            r1.putString(r0, r5)
            java.lang.String r0 = "ReelQuestionResponsesListFragment.REEL_ITEM_ID"
            r1.putString(r0, r4)
            X.DbX.A18(r1, r2, r3)
            return
        L_0x0046:
            java.lang.Object r2 = r4.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r2 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r2
            java.lang.Object r0 = r4.A02
            X.VcV r0 = (X.C17700VcV) r0
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment.A07(r0, r2)
            java.lang.String r1 = r0.A07
            goto L_0x0061
        L_0x0054:
            java.lang.Object r2 = r4.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r2 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r2
            java.lang.Object r0 = r4.A02
            X.VcV r0 = (X.C17700VcV) r0
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment.A07(r0, r2)
            java.lang.String r1 = r0.A05
        L_0x0061:
            if (r1 == 0) goto L_0x0018
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x0eb6
            androidx.fragment.app.FragmentActivity r5 = r2.getActivity()
            if (r5 == 0) goto L_0x0018
            com.instagram.common.session.UserSession r4 = r2.A06
            java.lang.String r3 = ""
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            X.DiU r2 = X.C46649DiU.A04(r1, r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r1.<init>((X.0lg) r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A0P = r0
            r1.A0U = r3
            r2.A0D(r5, r1)
            return
        L_0x0089:
            java.lang.Object r2 = r4.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r2 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r2
            java.lang.Object r1 = r4.A02
            X.1Xj r1 = (X.1Xj) r1
            r0 = 0
            r2.A0D = r0
            com.instagram.common.typedurl.ImageUrl r4 = r1.A1Q()
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            X.37D r3 = X.DbT.A0i(r0)
            if (r3 == 0) goto L_0x0018
            com.instagram.common.session.UserSession r0 = r2.A06
            java.lang.String r2 = r0.A05
            java.lang.String r1 = r1.getId()
            X.3BQ r0 = X.AnonymousClass3BQ.DASHBOARD
            com.instagram.archive.fragment.InlineAddHighlightFragment r0 = X.LT8.A04(r4, r0, r2, r1)
            r3.A0I(r0)
            return
        L_0x00b4:
            java.lang.Object r3 = r4.A01
            X.UZu r3 = (X.C15289UZu) r3
            java.lang.Object r2 = r4.A02
            android.os.Bundle r2 = (android.os.Bundle) r2
            X.Vih r1 = r3.A03
            java.lang.String r0 = "DynamicFlowPlugin.extraFlowId"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x0018
            android.widget.EditText r0 = r3.A00
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            r1.A01(r2, r0)
            return
        L_0x00d0:
            r0 = -760793042(0xffffffffd2a7382e, float:-3.59101039E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A02
            X.VwI r5 = (X.C18661VwI) r5
            java.lang.Object r2 = r4.A01
            com.instagram.model.shopping.productfeed.ProductFeedItem r2 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r2
            com.instagram.common.session.UserSession r8 = r5.A03
            androidx.fragment.app.Fragment r1 = r5.A02
            androidx.fragment.app.FragmentActivity r6 = r1.requireActivity()
            X.4DU r7 = r5.A04
            java.lang.String r11 = r2.getId()
            X.TpH r9 = X.C14068TpH.PRODUCT
            X.UzD r10 = X.C16677UzD.PRODUCT
            X.OcF r3 = X.ORV.A01(r6, r7, r8, r9, r10, r11)
            r2 = 3
            X.Uu8 r1 = new X.Uu8
            r1.<init>(r5, r2)
            r3.A07(r1)
            java.lang.String r2 = r5.A0I
            java.lang.String r1 = "shopping_session_id"
            r3.A08(r1, r2)
            r1 = 0
            X.C71093OcF.A00(r1, r3)
            r1 = -1120338629(0xffffffffbd38fd3b, float:-0.045163374)
            goto L_0x0e78
        L_0x010e:
            r0 = 1281854467(0x4c678c03, float:6.0698636E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A01
            X.Wde r5 = (X.C19676Wde) r5
            java.lang.Boolean r1 = r5.A05
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x015a
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            r5.A05 = r1
            java.lang.Object r1 = r4.A02
            com.instagram.shopping.model.variantselector.VariantSelectorModel r1 = (com.instagram.shopping.model.variantselector.VariantSelectorModel) r1
            com.instagram.model.shopping.ProductVariantDimension r1 = r1.A08
            com.instagram.model.shopping.sizechart.SizeChart r4 = r1.A01
            r4.getClass()
            com.instagram.user.model.Product r1 = r5.A04
            X.2nI r6 = r5.A00
            java.lang.Boolean r3 = X.AnonymousClass7TE.A0u()
            if (r6 == 0) goto L_0x017e
            if (r1 == 0) goto L_0x017e
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r2 = r1.A0H
            java.lang.String r1 = "product_id"
            r7.put(r1, r2)
            java.lang.String r2 = "push_bottom_sheet"
            java.lang.String r1 = "true"
            r7.put(r2, r1)
            X.Di0 r1 = r5.A01
            if (r1 == 0) goto L_0x015f
            r5.A05 = r3
            X.C48382Edd.A00(r6, r1)
        L_0x015a:
            r1 = 2115234040(0x7e13e8f8, float:4.915154E37)
            goto L_0x0e78
        L_0x015f:
            com.instagram.common.session.UserSession r3 = r5.A08
            X.02m r2 = X.02m.A0p
            r1 = 37369280(0x23a35c0, float:1.3680547E-37)
            r2.markerStart(r1)
            X.4D6 r4 = r6.A07
            java.lang.String r1 = "com.bloks.www.bloks.commerce.size-chart.async"
            X.8ey r3 = X.C359988do.A04(r3, r1, r7)
            r2 = 2
            X.UcL r1 = new X.UcL
            r1.<init>(r2, r5, r6)
            r3.A00(r1)
            r4.schedule(r3)
            goto L_0x015a
        L_0x017e:
            r5.A05 = r3
            com.instagram.shopping.fragment.sizechart.SizeChartFragment r3 = new com.instagram.shopping.fragment.sizechart.SizeChartFragment
            r3.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = "size_chart_model"
            r2.putParcelable(r1, r4)
            r3.setArguments(r2)
            com.instagram.common.session.UserSession r1 = r5.A08
            X.7Pr r2 = new X.7Pr
            r2.<init>(r1)
            r2.A0T = r3
            X.7Pu r1 = r5.A02
            if (r1 == 0) goto L_0x015a
            r1.A0E(r3, r2)
            goto L_0x015a
        L_0x01a3:
            r0 = 1975964640(0x75c6d3e0, float:5.0408795E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X4u r2 = (X.C20929X4u) r2
            java.lang.Object r1 = r4.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r2.CtC(r1)
            r1 = 1689144157(0x64ae4b5d, float:2.5721312E22)
            goto L_0x0e78
        L_0x01ba:
            r0 = -1793754633(0xffffffff951579f7, float:-3.0186524E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.VPE r2 = (X.VPE) r2
            java.lang.Object r1 = r4.A02
            X.WS4 r1 = (X.WS4) r1
            X.JwE r6 = r1.A00
            java.lang.String r7 = r1.A01
            X.Uam r5 = r2.A00
            X.Jhq r1 = X.C15337Uam.A01(r5)
            X.LQd r4 = r1.A01
            X.05G r1 = r1.A02
            java.lang.Object r1 = r1.getValue()
            java.lang.String r3 = X.C41847B3o.A1E(r1)
            r2 = 3
            X.Iwl r1 = new X.Iwl
            r1.<init>(r7, r6, r2)
            X.C64141LQd.A01(r4, r3, r1)
            X.0eM r1 = r5.A09
            java.lang.Object r3 = r1.getValue()
            X.Vjb r3 = (X.C17999Vjb) r3
            X.Jhq r1 = X.C15337Uam.A01(r5)
            X.2Fk r1 = r1.A00
            java.lang.Object r1 = r1.A02()
            X.0qQ.A0A(r1)
            X.ULE r1 = (X.ULE) r1
            X.Jw0 r4 = r1.A00
            java.lang.String r11 = X.C13991Tnr.A0i(r5)
            r5 = 0
            r6 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = 520636977(0x1f084a31, float:2.886049E-20)
            goto L_0x0e78
        L_0x0212:
            r0 = -9442040(0xffffffffff6fed08, float:-3.1891623E38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A01
            X.VPB r1 = (X.VPB) r1
            java.lang.Object r6 = r4.A02
            X.Uaj r5 = r1.A00
            android.content.Context r2 = r5.requireContext()
            X.0eM r1 = r5.A0G
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r2, r1)
            r3 = 2131957587(0x7f131753, float:1.9551762E38)
            r2 = 5
            X.WBE r1 = new X.WBE
            r1.<init>((int) r2, (java.lang.Object) r6, (java.lang.Object) r5)
            r4.A02(r1, r3)
            r3 = 2131961472(0x7f132680, float:1.9559642E38)
            r2 = 6
            X.WBE r1 = new X.WBE
            r1.<init>((int) r2, (java.lang.Object) r6, (java.lang.Object) r5)
            r4.A04(r1, r3)
            X.FFy r2 = new X.FFy
            r2.<init>(r4)
            android.content.Context r1 = r5.requireContext()
            r2.A05(r1)
            r1 = 1785489451(0x6a6c682b, float:7.1449603E25)
            goto L_0x0e78
        L_0x0259:
            r0 = -511498161(0xffffffffe183284f, float:-3.024285E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A01
            X.Ubt r5 = (X.C15390Ubt) r5
            java.lang.Object r4 = r4.A02
            X.WWJ r4 = (X.WWJ) r4
            java.lang.Integer r2 = r4.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 == r1) goto L_0x02f1
            r4.A00 = r1
            X.UdS r1 = r5.A02
            if (r1 != 0) goto L_0x0278
            java.lang.String r1 = "adapter"
            goto L_0x0e95
        L_0x0278:
            r1.notifyDataSetChanged()
            X.Vaq r6 = r5.A04
            if (r6 != 0) goto L_0x0283
            java.lang.String r1 = "sectionNetworkHelper"
            goto L_0x0e95
        L_0x0283:
            java.lang.String r7 = r5.A08
            java.util.Map r3 = r6.A05
            java.lang.Object r2 = r3.get(r4)
            X.Uw4 r1 = X.Uw4.LOADING
            if (r2 == r1) goto L_0x02cc
            r3.put(r4, r1)
            com.instagram.common.session.UserSession r1 = r6.A02
            X.1NY r3 = X.AnonymousClass7TG.A0b(r1)
            java.lang.String r2 = r6.A04
            java.lang.Integer r1 = r4.A01
            int r1 = r1.intValue()
            switch(r1) {
                case 1: goto L_0x02d4;
                case 2: goto L_0x02d7;
                default: goto L_0x02a3;
            }
        L_0x02a3:
            java.lang.String r1 = "FACEBOOK_PAGE"
        L_0x02a5:
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            X.DbU.A1P(r3, r2, r1)
            java.lang.String r1 = "initially_selected_catalog_id"
            r3.A0G(r1, r7)
            java.lang.String r2 = r4.A02
            java.lang.String r1 = "max_id"
            r3.A0G(r1, r2)
            java.lang.Class<X.UY4> r2 = X.UY4.class
            java.lang.Class<X.VoK> r1 = X.C18253VoK.class
            X.1OC r3 = X.DbU.A0S(r3, r2, r1)
            r1 = 21
            X.C15619Ufl.A00(r3, r4, r6, r1)
            android.content.Context r2 = r6.A00
            X.07i r1 = r6.A01
            X.1ES.A00(r2, r1, r3)
        L_0x02cc:
            X.W35 r5 = r5.A03
            if (r5 != 0) goto L_0x02da
            java.lang.String r1 = "logger"
            goto L_0x0e95
        L_0x02d4:
            java.lang.String r1 = "BUSINESS_MANAGER"
            goto L_0x02a5
        L_0x02d7:
            java.lang.String r1 = "SHARED_WITH_BUSINESS"
            goto L_0x02a5
        L_0x02da:
            java.lang.Integer r2 = r4.A01
            X.0qQ.A07(r2)
            java.lang.String r1 = "catalog_load_more_start"
            X.0xI r3 = X.W35.A00(r5, r1)
            java.lang.String r2 = X.VHW.A00(r2)
            java.lang.String r1 = "products_source_type"
            r3.A0C(r1, r2)
            X.W35.A05(r3, r5)
        L_0x02f1:
            r1 = -2057323863(0xffffffff855fbaa9, float:-1.0519694E-35)
            goto L_0x0e78
        L_0x02f6:
            r0 = -1446674062(0xffffffffa9c58172, float:-8.7710126E-14)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A02
            X.Vfv r2 = (X.C17784Vfv) r2
            java.lang.Object r5 = r4.A01
            X.VYh r5 = (X.C17503VYh) r5
            r1 = 0
            X.Uaq r4 = r2.A00
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r4.A00
            r7 = 0
            if (r0 != 0) goto L_0x0311
            java.lang.String r1 = "inlineSearchBox"
            goto L_0x0e95
        L_0x0311:
            r0.A03()
            boolean r0 = r2.A00(r5)
            if (r0 != 0) goto L_0x0336
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = r4.A06
            if (r0 == 0) goto L_0x032f
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r2 = r0.A01
            if (r2 == 0) goto L_0x032f
            android.content.Context r1 = r4.requireContext()
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = r4.A06
            if (r0 == 0) goto L_0x032c
            com.instagram.model.shopping.ProductSource r7 = r0.A00
        L_0x032c:
            r2.A00(r1, r7)
        L_0x032f:
            r0 = -1899355499(0xffffffff8eca2295, float:-4.9830146E-30)
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x0336:
            X.0eM r0 = r4.A08
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r9 = r5.A02
            X.0qQ.A0B(r10, r1)
            X.W3U r6 = X.W3U.A00
            X.Uyv r8 = X.C16659Uyv.BRAND
            X.0xa r0 = X.W3U.A02(r10, r6)
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = r8.toString()
            java.lang.String r0 = "last_selected_product_source_type"
            r2.E5g(r0, r1)
            r2.apply()
            X.0xa r0 = X.W3U.A02(r10, r6)
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "shopping_brand_id"
            r1.E5g(r0, r9)
            r1.apply()
            java.lang.String r1 = r4.A07
            java.lang.String r0 = "entry_point_creator_swipe_up_to_shop"
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "logger"
            X.W35 r6 = r4.A03
            if (r0 == 0) goto L_0x03f4
            if (r6 == 0) goto L_0x0e95
            X.0eM r0 = r6.A07
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "instagram_shopping_merchant_selected"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            X.W35.A02(r2, r6)
            java.lang.String r0 = r5.A02
            X.C13988Tno.A1A(r2, r0)
            java.lang.String r1 = r5.A03
            java.lang.String r0 = "merchant_name"
            r2.AAJ(r0, r1)
            java.lang.String r0 = r6.A05
            if (r0 != 0) goto L_0x039c
            java.lang.String r0 = ""
        L_0x039c:
            X.C13988Tno.A1C(r2, r0)
            X.W35.A03(r2, r6)
            com.instagram.model.shopping.ProductSource r0 = r6.A00
            if (r0 == 0) goto L_0x03f2
            java.lang.String r1 = r0.A01
        L_0x03a8:
            java.lang.String r0 = "selected_source_id"
            r2.AAJ(r0, r1)
            com.instagram.model.shopping.ProductSource r0 = r6.A00
            if (r0 == 0) goto L_0x03f0
            X.Uyv r0 = r0.A00
            if (r0 == 0) goto L_0x03f0
            java.lang.String r1 = r0.toString()
        L_0x03b9:
            java.lang.String r0 = "selected_source_type"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "selected_source_name"
            r2.AAJ(r0, r7)
            java.lang.String r1 = r6.A06
            java.lang.String r0 = "waterfall_id"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x03cd:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r5.A02
            r0 = 2722(0xaa2, float:3.814E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putExtra(r0, r1)
            java.lang.String r1 = r5.A03
            r0 = 2724(0xaa4, float:3.817E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putExtra(r0, r1)
            X.DbX.A17(r2, r4)
            X.DbT.A1K(r4)
            goto L_0x032f
        L_0x03f0:
            r1 = r7
            goto L_0x03b9
        L_0x03f2:
            r1 = r7
            goto L_0x03a8
        L_0x03f4:
            if (r6 == 0) goto L_0x0e95
            java.lang.String r2 = r5.A02
            java.lang.String r1 = r5.A03
            com.instagram.model.shopping.ProductSource r0 = new com.instagram.model.shopping.ProductSource
            r0.<init>()
            r0.A01 = r2
            r0.A00 = r8
            r0.A04 = r1
            r6.A06(r0)
            goto L_0x03cd
        L_0x0409:
            r0 = 1467447304(0x57777808, float:2.72094902E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X6v r2 = (X.C20968X6v) r2
            java.lang.Object r1 = r4.A02
            X.Urb r1 = (X.C16274Urb) r1
            r2.Dni(r1)
            r1 = 568036982(0x21db8e76, float:1.4877726E-18)
            goto L_0x0e78
        L_0x0420:
            r0 = 1360567979(0x51189eab, float:4.0968565E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X6t r2 = (X.C20966X6t) r2
            java.lang.Object r1 = r4.A02
            X.UrZ r1 = (X.C16272UrZ) r1
            r2.DPm(r1)
            r1 = 473332445(0x1c367add, float:6.0377546E-22)
            goto L_0x0e78
        L_0x0437:
            r0 = -1578986070(0xffffffffa1e295aa, float:-1.5353971E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X6t r2 = (X.C20966X6t) r2
            java.lang.Object r1 = r4.A02
            X.UrZ r1 = (X.C16272UrZ) r1
            r2.DPl(r1)
            r1 = 998598659(0x3b856803, float:0.004071237)
            goto L_0x0e78
        L_0x044e:
            r0 = 941389450(0x381c768a, float:3.7303696E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A01
            X.VP7 r1 = (X.VP7) r1
            java.lang.Object r4 = r4.A02
            com.instagram.api.schemas.ProductDiscountInformationDict r4 = (com.instagram.api.schemas.ProductDiscountInformationDict) r4
            r3 = 0
            X.Ub6 r6 = r1.A00
            java.lang.String r1 = r4.getId()
            r6.A01 = r1
            r2 = 1
            r6.A02 = r2
            X.0eM r1 = r6.A08
            java.lang.Object r7 = r1.getValue()
            X.VbW r7 = (X.C17640VbW) r7
            X.0eM r1 = r6.A09
            java.lang.Object r1 = r1.getValue()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r5 = X.C13989Tnp.A0r(r1)
            X.0qQ.A0A(r5)
            X.0qQ.A0B(r5, r2)
            java.lang.String r1 = r4.getId()
            java.lang.Long r3 = X.C51971G9r.A0n(r3, r1)
            if (r3 == 0) goto L_0x04ca
            X.0wc r2 = r7.A00
            java.lang.String r1 = "shops_promotions_link_tap"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.String r1 = "discount_id"
            r4.A9F(r1, r3)
            java.lang.String r1 = r7.A02
            X.DbS.A1O(r4, r1)
            X.327 r3 = new X.327
            r3.<init>()
            java.lang.String r2 = r7.A03
            java.lang.String r1 = "prior_module"
            r3.A06(r1, r2)
            java.lang.String r2 = r7.A04
            java.lang.String r1 = "prior_submodule"
            r3.A06(r1, r2)
            java.lang.String r2 = r7.A05
            java.lang.String r1 = "shopping_session_id"
            r3.A06(r1, r2)
            X.4DU r1 = r7.A01
            java.lang.String r2 = r1.getModuleName()
            java.lang.String r1 = "submodule"
            X.C13988Tno.A19(r4, r3, r1, r2)
            X.C13988Tno.A1B(r4, r5)
            r4.Cgf()
        L_0x04ca:
            X.7Pu r1 = r6.A00
            X.DbW.A1K(r1)
            r1 = 1633075895(0x6156c2b7, float:2.4760212E20)
            goto L_0x0e78
        L_0x04d4:
            r0 = -298977816(0xffffffffee2df5e8, float:-1.3459547E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.Udb r1 = (X.C15486Udb) r1
            X.X4l r2 = r1.A03
            java.lang.Object r1 = r4.A01
            X.Vgt r1 = (X.C17840Vgt) r1
            r2.DIr(r1)
            r1 = 537944892(0x2010633c, float:1.2230108E-19)
            goto L_0x0e78
        L_0x04ed:
            r0 = 1267142976(0x4b871140, float:1.7703552E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X4k r2 = (X.C20919X4k) r2
            java.lang.Object r1 = r4.A02
            X.BIj r1 = (X.C42130BIj) r1
            r2.DgE(r1)
            r1 = -1182872963(0xffffffffb97eca7d, float:-2.429876E-4)
            goto L_0x0e78
        L_0x0504:
            r0 = 283075016(0x10df61c8, float:8.8108647E-29)
            int r21 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r4.A02
            X.Ues r0 = (X.C15564Ues) r0
            com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment r5 = r0.A00
            java.lang.Object r3 = r4.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            X.VcW r0 = r5.A0A
            X.UzB r0 = r0.A02
            int r1 = r0.ordinal()
            r0 = 16
            if (r1 != r0) goto L_0x052c
            java.lang.String r2 = "shopping_incentive_user_picture"
            java.lang.String r1 = "incentive"
            java.lang.String r0 = r3.getUsername()
            com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment.A00(r5, r0, r2, r1)
        L_0x052c:
            r1 = 2074421320(0x7ba52848, float:1.715092E36)
            goto L_0x07da
        L_0x0531:
            r0 = 1548665136(0x5c4ec130, float:2.32785028E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.WSk r1 = (X.C19277WSk) r1
            X.Vbb r1 = r1.A02
            X.0sP r2 = r1.A03
            java.lang.Object r1 = r4.A01
            r2.invoke(r1)
            r1 = -1696262613(0xffffffff9ae5162b, float:-9.4747994E-23)
            goto L_0x0e78
        L_0x054a:
            r0 = 1581771092(0x5e47e954, float:3.60128431E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.WSk r1 = (X.C19277WSk) r1
            X.Vbb r1 = r1.A02
            X.0sP r2 = r1.A02
            java.lang.Object r1 = r4.A01
            r2.invoke(r1)
            r1 = -1272943856(0xffffffffb4206b10, float:-1.494011E-7)
            goto L_0x0e78
        L_0x0563:
            r0 = 1776459103(0x69e29d5f, float:3.424505E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X6s r2 = (X.C20965X6s) r2
            java.lang.Object r1 = r4.A02
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            r2.DZc(r1)
            r1 = 1811407225(0x6bf7e179, float:5.993389E26)
            goto L_0x0e78
        L_0x057a:
            r0 = 1751183270(0x6860efa6, float:4.2489233E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X6s r2 = (X.C20965X6s) r2
            java.lang.Object r1 = r4.A02
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            r2.CuL(r1)
            r1 = -1256292921(0xffffffffb51e7dc7, float:-5.9042617E-7)
            goto L_0x0e78
        L_0x0591:
            r0 = -231614356(0xfffffffff231d86c, float:-3.522591E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A02
            X.Wbk r5 = (X.C19560Wbk) r5
            java.lang.Object r10 = r4.A01
            X.W0O r10 = (X.W0O) r10
            com.instagram.user.model.Product r6 = r10.A03()
            r6.getClass()
            com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment r4 = r5.A00
            com.instagram.common.session.UserSession r1 = r4.A02
            X.6xT r2 = X.C323426xT.A00(r1)
            java.lang.String r1 = r4.A0U
            X.VvF r1 = r2.A05(r1)
            r9 = 1
            if (r1 == 0) goto L_0x063d
            java.util.List r1 = r1.A06
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            int r1 = r1.size()
            if (r1 <= r9) goto L_0x063d
            X.6xZ r2 = X.C13990Tnq.A0V(r4)
            java.lang.String r1 = r4.A0U
            r2.A0F(r10, r1)
            X.Uw5 r3 = X.C16508Uw5.LOADED
            com.instagram.common.session.UserSession r1 = r4.A02
            X.6xT r2 = X.C323426xT.A00(r1)
            java.lang.String r1 = r4.A0U
            X.VvF r1 = r2.A05(r1)
            com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment.A00(r3, r4, r1)
            androidx.recyclerview.widget.RecyclerView r2 = r4.mRecyclerView
            X.Wnr r1 = new X.Wnr
            r1.<init>(r5, r6)
            r2.post(r1)
        L_0x05e8:
            X.W1l r7 = r4.A09
            java.lang.String r3 = r4.A0U
            java.lang.String r8 = r4.A0N
            java.lang.String r6 = r4.A0Q
            java.lang.String r5 = r4.A0T
            X.Dba.A0j(r9, r3, r8)
            X.0wc r2 = r7.A02
            java.lang.String r1 = "instagram_shopping_bag_save_for_later"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.String r1 = r10.A04()
            X.0qQ.A07(r1)
            X.C13991Tnr.A17(r4, r1)
            X.W0O.A01(r4, r10)
            com.instagram.user.model.Product r1 = r10.A03()
            r2 = 1
            if (r1 == 0) goto L_0x063b
            boolean r1 = r1.A0P
            if (r1 != r9) goto L_0x063b
        L_0x0615:
            X.C13991Tnr.A18(r4, r3, r2)
            java.lang.String r2 = r7.A05
            java.lang.String r3 = "Required value was null."
            if (r2 == 0) goto L_0x0650
            java.lang.String r1 = "merchant_bag_entry_point"
            r4.AAJ(r1, r2)
            java.lang.String r2 = r7.A06
            if (r2 == 0) goto L_0x064a
            java.lang.String r1 = "merchant_bag_prior_module"
            java.lang.String r1 = X.C18785W1l.A01(r4, r7, r1, r2, r8)
            X.C18785W1l.A02(r4, r7, r1, r6)
            X.C13991Tnr.A16(r4, r5)
            r4.Cgf()
            r1 = 851982079(0x32c836ff, float:2.3308074E-8)
            goto L_0x0e78
        L_0x063b:
            r2 = 0
            goto L_0x0615
        L_0x063d:
            X.C19560Wbk.A00(r5, r6)
            X.6xZ r2 = X.C13990Tnq.A0V(r4)
            java.lang.String r1 = r4.A0U
            r2.A0F(r10, r1)
            goto L_0x05e8
        L_0x064a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0650:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0656:
            r0 = -1779115326(0xffffffff95f4dac2, float:-9.8895954E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A02
            X.Wbk r2 = (X.C19560Wbk) r2
            java.lang.Object r1 = r4.A01
            X.W0O r1 = (X.W0O) r1
            r2.A05(r1)
            r1 = 371892881(0x162aa291, float:1.3783788E-25)
            goto L_0x0e78
        L_0x066d:
            r0 = 2072433645(0x7b86d3ed, float:1.4001323E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r4.A02
            X.Wbk r7 = (X.C19560Wbk) r7
            java.lang.Object r8 = r4.A01
            X.W0O r8 = (X.W0O) r8
            com.instagram.user.model.Product r2 = r8.A03()
            r2.getClass()
            com.instagram.user.model.ProductDetailsProductItemDict r1 = r2.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r1 = r1.A0C
            r1.getClass()
            java.lang.Integer r1 = r1.BIk()
            int r9 = r1.intValue()
            com.instagram.user.model.ProductDetailsProductItemDict r1 = r2.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r1 = r1.A0C
            java.lang.Integer r1 = r1.A0E
            int r2 = r1.intValue()
            r1 = -1
            if (r2 == r1) goto L_0x06a3
            int r9 = java.lang.Math.min(r9, r2)
        L_0x06a3:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r5 = r8.A02()
            r3 = 1
            r4 = 0
        L_0x06ae:
            if (r3 > r9) goto L_0x06c4
            if (r3 != r5) goto L_0x06b4
            int r4 = r3 + -1
        L_0x06b4:
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r3)
            java.lang.String r1 = "%d"
            java.lang.String r1 = X.0mp.A06(r1, r2)
            r6.add(r1)
            int r3 = r3 + 1
            goto L_0x06ae
        L_0x06c4:
            com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment r2 = r7.A00
            X.WeH r1 = new X.WeH
            r1.<init>(r7, r8, r5)
            r2.A0K = r1
            X.X8w r3 = r2.A0B
            android.content.Context r2 = r2.requireContext()
            r1 = 2131971027(0x7f134bd3, float:1.9579022E38)
            java.lang.String r1 = r2.getString(r1)
            r3.CqT(r6, r4, r1)
            r1 = 1133607611(0x43917abb, float:290.95883)
            goto L_0x0e78
        L_0x06e2:
            r0 = 1698161703(0x6537e427, float:5.427511E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r4.A01
            X.Wbk r3 = (X.C19560Wbk) r3
            java.lang.Object r2 = r4.A02
            com.instagram.user.model.Product r2 = (com.instagram.user.model.Product) r2
            java.lang.String r1 = "shopping_bag_item_product_name"
            X.C19560Wbk.A01(r3, r2, r1)
            r1 = -2042601081(0xffffffff86406187, float:-3.6182838E-35)
            goto L_0x0e78
        L_0x06fb:
            r0 = -1226385411(0xffffffffb6e6d7fd, float:-6.8796785E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r4.A01
            X.Wbk r3 = (X.C19560Wbk) r3
            java.lang.Object r2 = r4.A02
            com.instagram.user.model.Product r2 = (com.instagram.user.model.Product) r2
            java.lang.String r1 = "shopping_bag_item_product_thumbnail"
            X.C19560Wbk.A01(r3, r2, r1)
            r1 = -907123804(0xffffffffc9ee63a4, float:-1952884.5)
            goto L_0x0e78
        L_0x0714:
            r0 = 1621963654(0x60ad3386, float:9.984373E19)
            int r21 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.Wbk r1 = (X.C19560Wbk) r1
            java.lang.Object r10 = r4.A01
            X.W0O r10 = (X.W0O) r10
            com.instagram.user.model.Product r0 = r10.A03()
            r0.getClass()
            com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment r1 = r1.A00
            r1.A0F = r10
            X.W1l r5 = r1.A09
            java.lang.String r8 = r1.A0U
            java.lang.String r6 = r1.A0N
            java.lang.String r4 = r1.A0Q
            java.lang.String r3 = r1.A0T
            boolean r12 = X.AnonymousClass7TG.A1Z(r8, r6)
            X.0wc r2 = r5.A02
            java.lang.String r0 = "instagram_shopping_bag_edit_item"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r0)
            java.lang.String r0 = r10.A04()
            X.0qQ.A07(r0)
            java.lang.Long r7 = X.DbV.A0q(r0)
            java.lang.String r20 = "product_id"
            r0 = r20
            r2.A9F(r0, r7)
            int r0 = r10.A02()
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r19 = "quantity"
            r0 = r19
            r2.AAJ(r0, r7)
            com.instagram.user.model.Product r0 = r10.A03()
            r7 = 1
            if (r0 == 0) goto L_0x08d3
            boolean r0 = r0.A0P
            if (r0 != r12) goto L_0x08d3
        L_0x0770:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r18 = "is_in_stock"
            r0 = r18
            r2.A7p(r0, r7)
            java.lang.String r14 = "merchant_id"
            r2.AAJ(r14, r8)
            java.lang.String r0 = r5.A05
            java.lang.String r13 = "Required value was null."
            if (r0 == 0) goto L_0x08ed
            java.lang.String r11 = "merchant_bag_entry_point"
            r2.AAJ(r11, r0)
            java.lang.String r0 = r5.A06
            if (r0 == 0) goto L_0x08e7
            java.lang.String r9 = "merchant_bag_prior_module"
            r2.AAJ(r9, r0)
            java.lang.String r8 = "checkout_session_id"
            r2.AAJ(r8, r6)
            java.lang.String r0 = r5.A08
            if (r0 != 0) goto L_0x079f
            java.lang.String r0 = ""
        L_0x079f:
            java.lang.String r15 = "shopping_session_id"
            r2.AAJ(r15, r0)
            java.lang.String r0 = r5.A00
            java.lang.String r7 = "global_bag_entry_point"
            r2.AAJ(r7, r0)
            java.lang.String r0 = r5.A04
            java.lang.String r6 = "global_bag_prior_module"
            r2.AAJ(r6, r0)
            if (r4 == 0) goto L_0x07bd
            java.lang.Long r4 = X.AnonymousClass7TE.A10(r4)
            java.lang.String r0 = "global_bag_id"
            r2.A9F(r0, r4)
        L_0x07bd:
            X.C13991Tnr.A16(r2, r3)
            r2.Cgf()
            androidx.fragment.app.Fragment r0 = r1.mParentFragment
            boolean r0 = r0 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x07de
            X.3kF r3 = X.C249713kF.A00
            android.content.Context r2 = r1.requireContext()
            com.instagram.user.model.Product r1 = r10.A03()
            r0 = 0
            r3.A0h(r2, r0, r1)
        L_0x07d7:
            r1 = -932983725(0xffffffffc863cc53, float:-233265.3)
        L_0x07da:
            r0 = r21
            goto L_0x0e78
        L_0x07de:
            com.instagram.user.model.Product r3 = r10.A03()
            X.0qQ.A0B(r3, r12)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.List r2 = r3.A0O
            if (r2 == 0) goto L_0x08e2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x08e2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x07ff
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x07ff:
            r2.size()
            r4.size()
            java.lang.String r2 = r10.A04()
            java.lang.String r0 = r3.A0H
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x07d7
            com.instagram.common.session.UserSession r0 = r1.A02
            X.6xT r0 = X.C323426xT.A00(r0)
            boolean r0 = r0.A08(r3)
            r17 = r0 ^ 1
            X.6xZ r2 = X.C13990Tnq.A0V(r1)
            java.lang.String r0 = r1.A0U
            X.W0O r16 = r2.A08(r10, r3, r0)
            if (r16 == 0) goto L_0x07d7
            X.W1l r5 = r1.A09
            java.lang.String r0 = r1.A0U
            r22 = r0
            java.lang.String r4 = r1.A0N
            java.lang.String r3 = r1.A0Q
            java.lang.String r2 = r1.A0T
            X.0qQ.A0B(r4, r12)
            X.0wc r1 = r5.A02
            java.lang.String r0 = "instagram_shopping_bag_item_edited"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = r5.A08
            if (r0 != 0) goto L_0x0846
            java.lang.String r0 = ""
        L_0x0846:
            r1.AAJ(r15, r0)
            java.lang.String r0 = r16.A04()
            X.0qQ.A07(r0)
            java.lang.Long r15 = X.DbV.A0q(r0)
            r0 = r20
            r1.A9F(r0, r15)
            X.4Ny r0 = X.C263944Ny.A00(r22)
            r1.AAE(r0, r14)
            java.lang.String r0 = r5.A06
            if (r0 == 0) goto L_0x08dc
            r1.AAJ(r9, r0)
            java.lang.String r0 = r5.A05
            if (r0 == 0) goto L_0x08d6
            r1.AAJ(r11, r0)
            int r0 = r16.A02()
            java.lang.String r9 = java.lang.String.valueOf(r0)
            r0 = r19
            r1.AAJ(r0, r9)
            com.instagram.user.model.Product r0 = r16.A03()
            r9 = 1
            if (r0 == 0) goto L_0x08d1
            boolean r0 = r0.A0P
            if (r0 != r12) goto L_0x08d1
        L_0x0886:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r0 = r18
            r1.A7p(r0, r9)
            r0 = r17
            java.lang.Boolean r4 = X.JTP.A0g(r1, r8, r4, r0)
            java.lang.String r0 = "is_initial_add"
            r1.A7p(r0, r4)
            java.lang.String r0 = r5.A04
            r1.AAJ(r6, r0)
            java.lang.String r0 = r5.A00
            r1.AAJ(r7, r0)
            java.lang.String r0 = r10.A04()
            X.0qQ.A07(r0)
            r5 = 10
            java.lang.Long r4 = X.00y.A0n(r5, r0)
            java.lang.String r0 = "original_product_id"
            r1.A9F(r0, r4)
            if (r3 == 0) goto L_0x08c1
            java.lang.Long r3 = X.00y.A0n(r5, r3)
            java.lang.String r0 = "global_bag_id"
            r1.A9F(r0, r3)
        L_0x08c1:
            if (r2 == 0) goto L_0x08cc
            java.lang.Long r2 = X.00y.A0n(r5, r2)
            java.lang.String r0 = "merchant_bag_id"
            r1.A9F(r0, r2)
        L_0x08cc:
            r1.Cgf()
            goto L_0x07d7
        L_0x08d1:
            r9 = 0
            goto L_0x0886
        L_0x08d3:
            r7 = 0
            goto L_0x0770
        L_0x08d6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L_0x08dc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L_0x08e2:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x08e7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L_0x08ed:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L_0x08f3:
            r0 = -866171231(0xffffffffcc5f46a1, float:-5.8530436E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.Wbk r2 = (X.C19560Wbk) r2
            java.lang.Object r1 = r4.A02
            X.WRz r1 = (X.C19266WRz) r1
            X.W0O r1 = r1.A00
            r2.A05(r1)
            r1 = 1071076117(0x3fd75315, float:1.682223)
            goto L_0x0e78
        L_0x090c:
            r0 = -1221132691(0xffffffffb736fe6d, float:-1.09072835E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A01
            com.instagram.shopping.fragment.cart.ShoppingCartFragment r5 = (com.instagram.shopping.fragment.cart.ShoppingCartFragment) r5
            java.lang.Object r1 = r4.A02
            X.UNw r1 = (X.C15079UNw) r1
            com.instagram.user.model.User r13 = r1.A01
            X.VvF r4 = r1.A00
            com.instagram.common.session.UserSession r1 = r5.A02
            X.6xT r1 = X.C323426xT.A00(r1)
            X.6xZ r1 = r1.A07
            r1.A0B()
            com.instagram.common.session.UserSession r1 = r5.A02
            X.6xT r1 = X.C323426xT.A00(r1)
            X.6xZ r3 = r1.A07
            r3.A0B()
            int r1 = r4.A01
            java.lang.String r2 = "Attempting to checkout with a cart with no available items to checkout."
            if (r1 != 0) goto L_0x0945
            java.lang.String r1 = "instagram_shopping_bag_index"
            X.0wb.A03(r1, r2)
        L_0x0940:
            r1 = -1144992207(0xffffffffbbc0ce31, float:-0.005883955)
            goto L_0x0e78
        L_0x0945:
            java.lang.String r14 = X.AnonymousClass3ZA.A00(r13)
            java.lang.String r24 = r3.A09(r14)
            r24.getClass()
            java.lang.String r15 = X.C2818159r.A01()
            java.util.List r7 = r4.A09
            boolean r1 = r7.isEmpty()
            r3 = 1
            r1 = r1 ^ 1
            X.17k.A0F(r1)
            r2 = 0
            java.lang.Object r1 = r7.get(r2)
            X.W0O r1 = (X.W0O) r1
            com.instagram.user.model.Product r1 = r1.A03()
            if (r1 != 0) goto L_0x096e
            r3 = 0
        L_0x096e:
            X.17k.A0F(r3)
            java.lang.Object r1 = r7.get(r2)
            X.W0O r1 = (X.W0O) r1
            com.instagram.user.model.Product r1 = r1.A03()
            com.instagram.user.model.ProductDetailsProductItemDict r1 = r1.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r12 = r1.A0C
            r12.getClass()
            X.0eM r1 = X.SFL.A04
            java.lang.Object r6 = r1.getValue()
            X.SFL r6 = (X.SFL) r6
            com.instagram.common.session.UserSession r2 = r5.A02
            r6.A00 = r2
            com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule r1 = r6.A01
            if (r1 == 0) goto L_0x0994
            r1.mUserSession = r2
        L_0x0994:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r7.iterator()
        L_0x099d:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x09b3
            java.lang.Object r1 = r2.next()
            X.W0O r1 = (X.W0O) r1
            com.instagram.user.model.Product r1 = r1.A03()
            if (r1 == 0) goto L_0x0a1d
            r3.add(r1)
            goto L_0x099d
        L_0x09b3:
            r6.A03 = r3
            com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule r1 = r6.A01
            if (r1 == 0) goto L_0x09bb
            r1.mProducts = r3
        L_0x09bb:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r1 = r5.A03
            if (r1 == 0) goto L_0x09c9
            java.lang.String r1 = r1.A07
            r6.add(r1)
        L_0x09c9:
            com.instagram.common.session.UserSession r11 = r5.A02
            java.lang.String r16 = "instagram_shopping_bag_index"
            java.lang.String r10 = r5.A0I
            java.lang.String r9 = r5.A0C
            java.lang.String r8 = r5.A0D
            java.lang.String r3 = r5.A0G
            java.lang.String r2 = r5.A0E
            r2.getClass()
            java.lang.String r1 = r5.A0H
            java.lang.String r21 = "index_view_buy_now"
            r22 = r21
            r23 = r2
            r25 = r1
            r26 = r7
            r27 = r6
            r20 = r3
            r19 = r8
            r18 = r9
            r17 = r10
            com.instagram.model.payments.checkout.CheckoutLaunchParams r2 = X.C18769W0q.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.X8d r1 = r5.A0A
            r1.CpP(r2)
            X.W1l r6 = r5.A08
            r10 = 0
            java.lang.String r3 = r5.A0I
            java.lang.String r2 = r5.A0E
            r2.getClass()
            int r1 = r4.A00
            int r16 = X.C13988Tno.A03(r1)
            r8 = r6
            r9 = r4
            r11 = r3
            r12 = r14
            r13 = r15
            r14 = r2
            r15 = r24
            r8.A04(r9, r10, r11, r12, r13, r14, r15, r16)
            com.facebook.quicklog.reliability.UserFlowLogger r3 = r5.A01
            long r1 = r5.A00
            r3.flowEndSuccess(r1)
            goto L_0x0940
        L_0x0a1d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0a22:
            r0 = 1427266320(0x55125b10, float:1.0057488E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r4.A01
            com.instagram.shopping.fragment.cart.ShoppingCartFragment r3 = (com.instagram.shopping.fragment.cart.ShoppingCartFragment) r3
            java.lang.Object r1 = r4.A02
            X.UNw r1 = (X.C15079UNw) r1
            com.instagram.user.model.User r2 = r1.A01
            java.lang.String r1 = "index_view_view_cart_button"
            X.C13990Tnq.A1N(r3, r2, r1)
            r1 = 2115417056(0x7e16b3e0, float:5.007954E37)
            goto L_0x0e78
        L_0x0a3d:
            r0 = 480335089(0x1ca154f1, float:1.0676043E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r4.A01
            com.instagram.shopping.fragment.cart.ShoppingCartFragment r3 = (com.instagram.shopping.fragment.cart.ShoppingCartFragment) r3
            java.lang.Object r1 = r4.A02
            X.UNw r1 = (X.C15079UNw) r1
            com.instagram.user.model.User r2 = r1.A01
            java.lang.String r1 = "index_view_view_cart_button"
            X.C13990Tnq.A1N(r3, r2, r1)
            r1 = -1290131361(0xffffffffb31a285f, float:-3.5892636E-8)
            goto L_0x0e78
        L_0x0a58:
            r0 = -981068478(0xffffffffc5861542, float:-4290.657)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            com.instagram.shopping.fragment.cart.ShoppingCartFragment r2 = (com.instagram.shopping.fragment.cart.ShoppingCartFragment) r2
            java.lang.Object r1 = r4.A02
            X.UNw r1 = (X.C15079UNw) r1
            com.instagram.user.model.User r1 = r1.A01
            r2.DRR(r1)
            r1 = -635721929(0xffffffffda1ba737, float:-1.0953119E16)
            goto L_0x0e78
        L_0x0a71:
            r0 = -2035970682(0xffffffff86a58d86, float:-6.227405E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            com.instagram.shopping.fragment.cart.ShoppingCartFragment r2 = (com.instagram.shopping.fragment.cart.ShoppingCartFragment) r2
            java.lang.Object r1 = r4.A02
            X.UNw r1 = (X.C15079UNw) r1
            com.instagram.user.model.User r1 = r1.A01
            r2.DRP(r1)
            r1 = -1097038626(0xffffffffbe9c84de, float:-0.3057012)
            goto L_0x0e78
        L_0x0a8a:
            r0 = -1507324161(0xffffffffa6280eff, float:-5.830703E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            com.instagram.shopping.fragment.cart.ShoppingCartFragment r2 = (com.instagram.shopping.fragment.cart.ShoppingCartFragment) r2
            java.lang.Object r1 = r4.A02
            X.UNw r1 = (X.C15079UNw) r1
            com.instagram.user.model.User r1 = r1.A01
            r2.DRN(r1)
            r1 = 1912984536(0x7205d3d8, float:2.650727E30)
            goto L_0x0e78
        L_0x0aa3:
            r0 = 1037379501(0x3dd527ad, float:0.10407958)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            com.instagram.shopping.fragment.cart.ShoppingCartFragment r2 = (com.instagram.shopping.fragment.cart.ShoppingCartFragment) r2
            java.lang.Object r1 = r4.A02
            X.UNw r1 = (X.C15079UNw) r1
            com.instagram.user.model.User r1 = r1.A01
            r2.DRQ(r1)
            r1 = 1856471873(0x6ea78341, float:2.5921336E28)
            goto L_0x0e78
        L_0x0abc:
            r0 = -1244015245(0xffffffffb5d9d573, float:-1.6229882E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r4.A01
            com.instagram.shopping.fragment.cart.ShoppingCartFragment r3 = (com.instagram.shopping.fragment.cart.ShoppingCartFragment) r3
            java.lang.Object r1 = r4.A02
            X.UNw r1 = (X.C15079UNw) r1
            com.instagram.user.model.User r2 = r1.A01
            java.lang.String r1 = "index_view_product_thumbnail"
            X.C13990Tnq.A1N(r3, r2, r1)
            r1 = 1930904818(0x731744f2, float:1.198479E31)
            goto L_0x0e78
        L_0x0ad7:
            r0 = 1837144647(0x6d809a47, float:4.975074E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A02
            X.TqX r2 = (X.C14137TqX) r2
            java.lang.Object r1 = r4.A01
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = (com.instagram.ui.widget.searchedittext.SearchEditText) r1
            java.lang.String r1 = r1.getSearchString()
            X.C14137TqX.A04(r2, r1)
            r1 = 892019480(0x352b2318, float:6.375353E-7)
            goto L_0x0e78
        L_0x0af2:
            r0 = 686226024(0x28e6fa68, float:2.5643726E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A02
            X.TqX r2 = (X.C14137TqX) r2
            java.lang.Object r1 = r4.A01
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = (com.instagram.ui.widget.searchedittext.SearchEditText) r1
            java.lang.String r1 = r1.getSearchString()
            X.C14137TqX.A04(r2, r1)
            r1 = -1199721059(0xffffffffb87db59d, float:-6.048904E-5)
            goto L_0x0e78
        L_0x0b0d:
            r0 = -374082858(0xffffffffe9b3f2d6, float:-2.719306E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A02
            X.VuY r2 = (X.C18582VuY) r2
            com.instagram.model.hashtag.Hashtag r1 = r2.A03
            X.0iw r4 = r2.A07
            java.lang.String r8 = r1.getId()
            if (r8 != 0) goto L_0x0b39
            X.0wj r4 = X.0wj.A01
            r3 = 303967378(0x121e2c92, float:4.9910946E-28)
            java.lang.String r2 = r1.getName()
            java.lang.String r1 = ": id is null"
            java.lang.String r1 = X.002.A0R(r2, r1)
            X.DbT.A1Q(r4, r1, r3)
        L_0x0b34:
            r1 = -1059073573(0xffffffffc0dfd1db, float:-6.994367)
            goto L_0x0e78
        L_0x0b39:
            com.instagram.common.session.UserSession r5 = r2.A08
            android.app.Activity r3 = r2.A04
            X.TpH r6 = X.C14068TpH.HASHTAGS
            X.UzD r7 = X.C16677UzD.HASHTAG
            X.OcF r3 = X.ORV.A01(r3, r4, r5, r6, r7, r8)
            android.content.Context r1 = r2.A05
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131963102(0x7f132cde, float:1.9562948E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r2, r1)
            r3.A0A = r1
            r2 = 2
            X.Uu7 r1 = new X.Uu7
            r1.<init>(r2)
            r3.A07(r1)
            r1 = 0
            X.C71093OcF.A00(r1, r3)
            goto L_0x0b34
        L_0x0b62:
            r0 = 1573496904(0x5dc9a848, float:1.81636792E18)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r4.A02
            X.UZa r7 = (X.C15272UZa) r7
            java.lang.Object r0 = r4.A01
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = (com.instagram.ui.widget.searchedittext.SearchEditText) r0
            java.lang.String r6 = r0.getSearchString()
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            if (r0 == 0) goto L_0x0bb5
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            X.0eM r1 = r7.A0Z
            X.6Yo r4 = X.DbX.A0N(r0, r1)
            java.lang.String r0 = "search_result"
            r4.A0B = r0
            X.C14398TvR.A00()
            X.Twa r0 = new X.Twa
            r0.<init>()
            r1.getValue()
            java.lang.String r0 = r7.A04()
            java.lang.String r3 = r7.A0L
            if (r3 == 0) goto L_0x0bba
            X.TqX r2 = new X.TqX
            r2.<init>()
            android.os.Bundle r1 = X.C14452Twa.A00(r0, r6)
            java.lang.String r0 = "argument_prior_serp_session_id"
            r1.putString(r0, r3)
            r2.setArguments(r1)
            r4.A0D(r2)
            r4.A09 = r7
            r4.A04()
        L_0x0bb5:
            r0 = -1150433986(0xffffffffbb6dc53e, float:-0.0036280896)
            goto L_0x0eb2
        L_0x0bba:
            java.lang.String r0 = "serpSessionId"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0bc4:
            r0 = -1916269012(0xffffffff8dc80e2c, float:-1.2329363E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A02
            X.U94 r5 = (X.U94) r5
            X.0iw r8 = r5.A02
            java.lang.String r12 = X.AnonymousClass7TG.A0j()
            com.instagram.common.session.UserSession r9 = r5.A03
            java.lang.Object r4 = r4.A01
            X.Uq6 r4 = (X.C16181Uq6) r4
            java.lang.String r3 = r4.A07
            r2 = 0
            java.lang.Long r11 = X.C51971G9r.A0n(r2, r3)
            com.instagram.clips.model.metadata.AudioPageMetadata r1 = r4.A00
            java.lang.String r14 = r1.A07
            X.HOL r6 = X.HOL.SONG
            X.6sU r7 = r5.A01
            r10 = 0
            r13 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r3
            r19 = r2
            X.C52086GEg.A0I(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.X7t r1 = r5.A05
            r1.D05(r4)
            r1 = -274050689(0xffffffffefaa517f, float:-1.0542195E29)
            goto L_0x0e78
        L_0x0c02:
            r0 = 1237378686(0x49c0e67e, float:1580239.8)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A01
            X.Vue r1 = (X.C18587Vue) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0c41
            java.lang.Object r0 = r4.A02
            X.4Ww r0 = (X.C265934Ww) r0
            int r4 = r1.A01
            X.4Wv r3 = r0.A00
            int r1 = r3.A00
            r0 = -1
            if (r1 != r0) goto L_0x0c41
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.WaJ r0 = r3.A07
            r0.getClass()
            X.UNZ r0 = r0.A02
            java.lang.Boolean r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0c41
            X.4Wu r2 = r3.A05
            r2.getClass()
            X.3kD r1 = r3.A04
            r1.getClass()
            X.WaJ r0 = r3.A07
            r0.getClass()
            r2.DbN(r1, r3, r0, r4)
        L_0x0c41:
            r0 = 1051396008(0x3eab07a8, float:0.3340428)
            goto L_0x0eb2
        L_0x0c46:
            r0 = -1735263846(0xffffffff9891f99a, float:-3.7733655E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A02
            X.Uu2 r5 = (X.C16385Uu2) r5
            X.4M3 r3 = r5.A02
            boolean r1 = r3.isPlaying()
            java.lang.String r2 = "tapped"
            if (r1 == 0) goto L_0x0c6f
            r3.E21(r2)
            java.lang.Object r3 = r4.A01
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r2 = r5.A00
            r1 = 2131238650(0x7f081efa, float:1.8093585E38)
        L_0x0c67:
            X.DbU.A13(r2, r3, r1)
            r1 = 1021811612(0x3ce79b9c, float:0.028272443)
            goto L_0x0e78
        L_0x0c6f:
            r1 = 0
            r3.E2q(r2, r1)
            java.lang.Object r3 = r4.A01
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r2 = r5.A00
            r1 = 2131238615(0x7f081ed7, float:1.8093514E38)
            goto L_0x0c67
        L_0x0c7d:
            java.lang.Object r0 = r4.A01
            X.Ub4 r0 = (X.C15353Ub4) r0
            java.lang.Object r1 = r4.A02
            X.VgE r1 = (X.C17801VgE) r1
            X.TrG r0 = r0.A04
            r0.A01(r1)
            return
        L_0x0c8b:
            r0 = -1471020887(0xffffffffa85200a9, float:-1.1657485E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X9R r2 = (X.X9R) r2
            java.lang.Object r1 = r4.A02
            X.VW6 r1 = (X.VW6) r1
            r2.Drv(r1)
            r1 = -486442504(0xffffffffe30179f8, float:-2.3884188E21)
            goto L_0x0e78
        L_0x0ca2:
            r0 = 311267049(0x128d8ee9, float:8.933581E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X9R r2 = (X.X9R) r2
            java.lang.Object r1 = r4.A02
            X.VW6 r1 = (X.VW6) r1
            r2.Cun(r1)
            r1 = 207871406(0xc63ddae, float:1.7554153E-31)
            goto L_0x0e78
        L_0x0cb9:
            r0 = -803008078(0xffffffffd02311b2, float:-1.09433836E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X9R r2 = (X.X9R) r2
            java.lang.Object r1 = r4.A02
            X.Tzd r1 = (X.C14631Tzd) r1
            r2.DzU(r1)
            r1 = 799453278(0x2fa6b05e, float:3.032054E-10)
            goto L_0x0e78
        L_0x0cd0:
            r0 = -1359743622(0xffffffffaef3f57a, float:-1.1093966E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X9R r2 = (X.X9R) r2
            java.lang.Object r1 = r4.A02
            X.Tzd r1 = (X.C14631Tzd) r1
            r2.DzU(r1)
            r1 = -703571356(0xffffffffd6105a64, float:-3.9679475E13)
            goto L_0x0e78
        L_0x0ce7:
            r0 = -1659612764(0xffffffff9d1451a4, float:-1.9629844E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X9R r2 = (X.X9R) r2
            java.lang.Object r1 = r4.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r2.Drw(r1)
            r1 = -555800763(0xffffffffdedf2745, float:-8.0399484E18)
            goto L_0x0e78
        L_0x0cfe:
            r0 = -1408572843(0xffffffffac0ae255, float:-1.973662E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X9R r2 = (X.X9R) r2
            java.lang.Object r1 = r4.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r2.Drw(r1)
            r1 = -796683753(0xffffffffd0839217, float:-1.76591155E10)
            goto L_0x0e78
        L_0x0d15:
            r0 = 1715699547(0x66437f5b, float:2.3080269E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X9R r2 = (X.X9R) r2
            java.lang.Object r1 = r4.A02
            X.Tzd r1 = (X.C14631Tzd) r1
            r2.CyQ(r1)
            r1 = 1447608679(0x5648c167, float:5.5183246E13)
            goto L_0x0e78
        L_0x0d2c:
            r0 = 1845745376(0x6e03d6e0, float:1.0200576E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X9R r2 = (X.X9R) r2
            java.lang.Object r1 = r4.A02
            X.Tzd r1 = (X.C14631Tzd) r1
            r2.DVp(r1)
            r1 = -1347954509(0xffffffffafa7d8b3, float:-3.0531097E-10)
            goto L_0x0e78
        L_0x0d43:
            r0 = -2145610042(0xffffffff801c96c6, float:-2.625481E-39)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X9R r2 = (X.X9R) r2
            java.lang.Object r1 = r4.A02
            X.VW6 r1 = (X.VW6) r1
            r2.Drv(r1)
            r1 = 751069342(0x2cc4689e, float:5.58227E-12)
            goto L_0x0e78
        L_0x0d5a:
            r0 = -1290668929(0xffffffffb311f47f, float:-3.398281E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.X9R r2 = (X.X9R) r2
            java.lang.Object r1 = r4.A02
            X.Tzd r1 = (X.C14631Tzd) r1
            X.VW6 r1 = r1.A0I
            r1.getClass()
            r2.Cun(r1)
            r1 = 1908624662(0x71c34d16, float:1.9341686E30)
            goto L_0x0e78
        L_0x0d76:
            java.lang.Object r1 = r4.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r1 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r1
            java.lang.Object r0 = r4.A02
            X.VcV r0 = (X.C17700VcV) r0
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment.A07(r0, r1)
            return
        L_0x0d82:
            r0 = 920801326(0x36e2502e, float:6.744659E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r4.A02
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r3 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r3
            java.lang.Object r1 = r4.A01
            X.VWC r1 = (X.VWC) r1
            X.0qQ.A0A(r1)
            java.lang.Integer r2 = r1.A01
            X.3uh r1 = r1.A00
            r3.A0H(r5, r1, r2)
            r1 = -1127694350(0xffffffffbcc8bff2, float:-0.02450559)
            goto L_0x0e78
        L_0x0da0:
            java.lang.Object r0 = r4.A01
            X.TzX r0 = (X.C14625TzX) r0
            java.lang.Object r1 = r4.A02
            X.1Xj r1 = (X.1Xj) r1
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = r0.A0B
            r0.A0I(r1)
            return
        L_0x0dae:
            java.lang.Object r0 = r4.A01
            X.TzX r0 = (X.C14625TzX) r0
            java.lang.Object r1 = r4.A02
            X.3uh r1 = (X.C255773uh) r1
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = r0.A0B
            r0.A0J(r1)
            return
        L_0x0dbc:
            java.lang.Object r2 = r4.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r2 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r2
            java.lang.Object r4 = r4.A02
            X.1Xj r4 = (X.1Xj) r4
            com.instagram.common.session.UserSession r3 = r2.A06
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            r0 = 189(0xbd, float:2.65E-43)
            java.lang.String r5 = X.C273654mx.A00(r0)
            r6 = 0
            X.1OP.A09(r1, r2, r3, r4, r5, r6)
            return
        L_0x0dd5:
            r0 = -661488496(0xffffffffd8927c90, float:-1.28850952E15)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r4.A01
            X.UiS r0 = (X.C15783UiS) r0
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r3 = r0.A02
            java.lang.Object r0 = r4.A02
            X.WSX r0 = (X.WSX) r0
            X.3uh r2 = r0.A03
            java.lang.String r1 = r0.A04
            boolean r0 = r2.A1C()
            if (r0 != 0) goto L_0x0df3
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment.A06(r2, r3, r1)
        L_0x0df3:
            r0 = -1501662159(0xffffffffa67e7431, float:-8.828142E-16)
            goto L_0x0eb2
        L_0x0df8:
            r0 = 876875148(0x34440d8c, float:1.8258851E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.Ue9 r1 = (X.C15520Ue9) r1
            X.VOi r1 = r1.A00
            java.lang.Object r3 = r4.A01
            X.1Xj r3 = (X.1Xj) r3
            X.TrF r2 = r1.A00
            com.facebook.common.callercontext.CallerContext r1 = X.C14176TrF.A11
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r1 = r2.A0U
            r1.A0I(r3)
            r1 = -1643351900(0xffffffff9e0c70a4, float:-7.434832E-21)
            goto L_0x0e78
        L_0x0e16:
            r0 = -2106873968(0xffffffff826ba790, float:-1.7313161E-37)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r4.A01
            X.VcU r0 = (X.C17699VcU) r0
            X.X4O r1 = r0.A03
            if (r1 == 0) goto L_0x0e2e
            java.lang.Object r0 = r4.A02
            X.Vc6 r0 = (X.C17675Vc6) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r0.A08
            r1.Dc9(r0)
        L_0x0e2e:
            r0 = -264068380(0xfffffffff042a2e4, float:-2.4094806E29)
            goto L_0x0eb2
        L_0x0e33:
            r0 = 640528510(0x262db07e, float:6.0260624E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r4.A02
            X.Uj6 r6 = (X.C15823Uj6) r6
            com.instagram.common.session.UserSession r5 = r6.A02
            java.lang.Object r1 = r4.A01
            X.UNq r1 = (X.C15073UNq) r1
            X.UKX r1 = r1.A00
            java.lang.String r3 = r1.A02
            java.lang.String r2 = r6.A03
            java.lang.String r1 = "reel_context_sheet_mentions"
            X.Dfc r1 = X.C46548Dgp.A01(r5, r3, r1, r2)
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r3 = X.C51973G9u.A0A(r5, r1)
            android.app.Activity r2 = r6.A00
            java.lang.String r1 = "profile"
            X.DbU.A0w(r2, r3, r5, r4, r1)
            r1 = 225338364(0xd6e63fc, float:7.3459764E-31)
            goto L_0x0e78
        L_0x0e61:
            r0 = -2090018165(0xffffffff836cda8b, float:-6.960504E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.WZN r1 = (X.WZN) r1
            com.instagram.profile.fragment.UserDetailFragment r2 = r1.A01
            java.lang.Object r1 = r4.A01
            X.5m9 r1 = (X.C294255m9) r1
            r2.A0v(r1)
            r1 = 1289375506(0x4cda4f12, float:1.1445672E8)
        L_0x0e78:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0e7c:
            r0 = 1078594352(0x404a0b30, float:3.1569328)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r4.A01
            com.instagram.ui.emptystaterow.EmptyStateView r0 = (com.instagram.ui.emptystaterow.EmptyStateView) r0
            r0.A0L()
            java.lang.Object r4 = r4.A02
            X.Ubh r4 = (X.C15383Ubh) r4
            X.Vgl r3 = r4.A09
            r1 = 0
            if (r3 != 0) goto L_0x0e9d
            java.lang.String r1 = "dataFetcher"
        L_0x0e95:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0e9d:
            java.lang.String r2 = r4.A0F
            if (r2 != 0) goto L_0x0ea4
            java.lang.String r1 = "adId"
            goto L_0x0e95
        L_0x0ea4:
            X.1Xl r0 = r4.A06
            if (r0 != 0) goto L_0x0eaa
            java.lang.String r1 = r4.A0G
        L_0x0eaa:
            java.lang.String r0 = r4.A0H
            r3.A00(r2, r1, r0)
            r0 = 102447527(0x61b39a7, float:2.9194616E-35)
        L_0x0eb2:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x0eb6:
            android.net.Uri r1 = X.0cp.A03(r1)
            android.content.Context r0 = r2.requireContext()
            X.0kR.A0F(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WBD.onClick(android.view.View):void");
    }

    public WBD(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
