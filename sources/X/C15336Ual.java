package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.shopping.intf.ProductDetailsPageArguments;

/* renamed from: X.Ual  reason: case insensitive filesystem */
public final class C15336Ual extends AnonymousClass4DH implements AnonymousClass4DU, C249453jo {
    public static final String __redex_internal_original_name = "ReelSwipeUpFragment";
    public Bundle A00;
    public View A01;
    public Fragment A02;
    public 2dZ A03;
    public UserSession A04;
    public TouchInterceptorFrameLayout A05;
    public TouchInterceptorFrameLayout A06;
    public String A07;
    public int A08;
    public C17593Val A09;
    public String A0A;
    public String A0B;

    public final String getModuleName() {
        return "reel_swipe_up";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final 2dZ AYJ() {
        return this.A03;
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(84497824);
        C15336Ual.super.onCreate(bundle);
        this.A00 = requireArguments();
        this.A04 = DbX.A0U(this);
        this.A07 = DbU.A0l(this.A00, "content_fragment_type");
        this.A0A = this.A00.getString("cta_action_source");
        this.A08 = this.A00.getInt("carousel_ad_index", -1);
        ProductDetailsPageArguments productDetailsPageArguments = (ProductDetailsPageArguments) this.A00.getParcelable("pdp_arguments");
        if (productDetailsPageArguments != null) {
            this.A0B = productDetailsPageArguments.A0M;
        }
        String str2 = this.A07;
        switch (str2.hashCode()) {
            case -1744365060:
                str = "product_collection_bloks";
                break;
            case -1610081298:
                str = "product_collection";
                break;
            case -1310090308:
                str = "product_details_page";
                break;
            default:
                AnonymousClass0fD.A09(584136420, A022);
        }
        if (str2.equals(str)) {
            this.A00.putString("shopping_session_id", C228022kf.A00(this.A00));
        }
        AnonymousClass0fD.A09(584136420, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1566495439);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.reel_swipe_up_fragment);
        AnonymousClass0fD.A09(-1258861213, A022);
        return A0C;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPause() {
        /*
            r14 = this;
            r0 = 148067213(0x8d3538d, float:1.2718743E-33)
            int r2 = X.AnonymousClass0fD.A02(r0)
            X.C15336Ual.super.onPause()
            androidx.fragment.app.FragmentActivity r0 = r14.requireActivity()
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x0106
            X.Val r10 = r14.A09
            java.lang.String r1 = r10.A05
            int r0 = r1.hashCode()
            switch(r0) {
                case -1744365060: goto L_0x0070;
                case -1610081298: goto L_0x006d;
                case -1310090308: goto L_0x0026;
                default: goto L_0x001f;
            }
        L_0x001f:
            r0 = -1988653029(0xffffffff8977901b, float:-2.9799302E-33)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x0026:
            java.lang.String r0 = "product_details_page"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            android.os.Bundle r6 = r10.A01
            java.lang.String r0 = "pdp_arguments"
            android.os.Parcelable r0 = r6.getParcelable(r0)
            r0.getClass()
            com.instagram.shopping.intf.ProductDetailsPageArguments r0 = (com.instagram.shopping.intf.ProductDetailsPageArguments) r0
            com.instagram.user.model.Product r4 = r0.A06
            r4.getClass()
            X.4DU r3 = r10.A04
            com.instagram.common.session.UserSession r9 = r10.A03
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r0 = 1811(0x713, float:2.538E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "instagram_shopping_pdp"
            r8.put(r1, r0)
            java.lang.String r1 = r4.A0H
            java.lang.String r0 = "product_id"
            r8.put(r0, r1)
            com.instagram.user.model.User r0 = r4.A0B
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
            if (r1 != 0) goto L_0x0067
        L_0x0065:
            java.lang.String r1 = ""
        L_0x0067:
            java.lang.String r0 = "merchant_id"
            r8.put(r0, r1)
            goto L_0x00bb
        L_0x006d:
            java.lang.String r0 = "product_collection"
            goto L_0x0072
        L_0x0070:
            java.lang.String r0 = "product_collection_bloks"
        L_0x0072:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.4DU r3 = r10.A04
            com.instagram.common.session.UserSession r9 = r10.A03
            android.os.Bundle r6 = r10.A01
            java.lang.String r12 = "merchant_id"
            java.lang.String r11 = r6.getString(r12)
            java.lang.String r13 = "incentive_id"
            java.lang.String r7 = r6.getString(r13)
            java.lang.String r5 = "product_collection_id"
            java.lang.String r4 = r6.getString(r5)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r0 = 1811(0x713, float:2.538E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 3980(0xf8c, float:5.577E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.put(r1, r0)
            r0 = 138(0x8a, float:1.93E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            if (r7 == 0) goto L_0x00fb
            java.lang.String r0 = "incentive_details"
            r8.put(r1, r0)
            r8.put(r13, r7)
        L_0x00b4:
            if (r11 != 0) goto L_0x00b8
            java.lang.String r11 = ""
        L_0x00b8:
            r8.put(r12, r11)
        L_0x00bb:
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r10.A00
            long r4 = r4 - r0
            java.lang.String r7 = "shopping_session_id"
            java.lang.String r6 = r6.getString(r7)
            r0 = 1
            X.0wc r1 = X.DbT.A0Q(r3, r9, r0)
            java.lang.String r0 = "instagram_shopping_swipe_up_time_spent"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x001f
            double r0 = (double) r4
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "timespent"
            r3.A8D(r0, r1)
            java.lang.String r0 = "profile_shop_link"
            r3.A9H(r0, r8)
            java.lang.String r0 = r9.A06
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "pk"
            r3.A9F(r0, r1)
            r3.AAJ(r7, r6)
            r3.Cgf()
            goto L_0x001f
        L_0x00fb:
            if (r4 == 0) goto L_0x00b4
            java.lang.String r0 = "seller_product_collection"
            r8.put(r1, r0)
            r8.put(r5, r4)
            goto L_0x00b4
        L_0x0106:
            android.view.View r0 = r14.mView
            r0.getClass()
            android.view.View r1 = r0.getRootView()
            android.content.Context r0 = r14.requireContext()
            int r0 = X.2Yu.A00(r0)
            r1.setBackgroundColor(r0)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15336Ual.onPause():void");
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1291946640);
        super.onResume();
        View view = this.mView;
        view.getClass();
        view.getRootView().setBackgroundColor(0);
        AnonymousClass0fD.A09(2139039054, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x011e, code lost:
        r11.A02 = r0;
        r3 = X.DbW.A0C(r11);
        r1 = r11.A02;
        r3.A0D(r1, X.Pxf.A0g(r1), com.instagram.android.R.id.swipe_up_fragment_container);
        r3.A00();
        getChildFragmentManager().A0a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008b, code lost:
        throw new java.security.InvalidParameterException(X.002.A0g("Unknown content fragment type ", r1, "."));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            super.onViewCreated(r12, r13)
            r0 = 2131442371(0x7f0b3ac3, float:1.850678E38)
            android.view.View r0 = r12.requireViewById(r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r0
            r11.A06 = r0
            r0 = 2131427520(0x7f0b00c0, float:1.8476659E38)
            android.view.View r0 = r12.requireViewById(r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r0
            r11.A05 = r0
            r2 = 2131442366(0x7f0b3abe, float:1.850677E38)
            android.view.View r0 = r12.requireViewById(r2)
            r11.A01 = r0
            com.instagram.common.session.UserSession r0 = r11.A04
            X.1E8 r1 = X.1E7.A00(r0)
            java.lang.String r0 = r11.A0B
            X.1Xj r7 = r1.A02(r0)
            X.2EG r0 = X.2EG.A3d
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = r11.A0A
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006a
            if (r7 == 0) goto L_0x006a
            com.instagram.common.session.UserSession r0 = r11.A04
            X.3Dp r6 = X.C238833Dp.A00(r0)
            android.view.View r3 = r11.mView
            r3.getClass()
            X.3Ds r1 = X.C238863Ds.SNACKS
            int r0 = r11.A08
            r6.A06(r3, r1, r0)
            android.view.View r5 = r11.mView
            r5.getClass()
            com.instagram.common.session.UserSession r4 = r11.A04
            android.content.Context r3 = r11.requireContext()
            com.instagram.common.session.UserSession r0 = r11.A04
            X.6Q1 r1 = new X.6Q1
            r1.<init>(r3, r0, r7)
            X.3e7 r0 = new X.3e7
            r0.<init>(r1, r4, r7, r11)
            r6.A0A(r5, r0)
        L_0x006a:
            androidx.fragment.app.Fragment r0 = r11.A02
            if (r0 != 0) goto L_0x0137
            r11.requireActivity()
            com.instagram.common.session.UserSession r5 = r11.A04
            java.lang.String r1 = r11.A07
            android.os.Bundle r3 = r11.A00
            int r0 = r1.hashCode()
            switch(r0) {
                case -1744365060: goto L_0x008c;
                case -1689823252: goto L_0x00b2;
                case -1610081298: goto L_0x00c5;
                case -1310090308: goto L_0x00db;
                case 1819173716: goto L_0x00ee;
                default: goto L_0x007e;
            }
        L_0x007e:
            java.lang.String r2 = "Unknown content fragment type "
            java.lang.String r0 = "."
            java.lang.String r1 = X.002.A0g(r2, r1, r0)
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException
            r0.<init>(r1)
            throw r0
        L_0x008c:
            java.lang.String r0 = "product_collection_bloks"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007e
            X.3kF r0 = X.C249713kF.A00
            r0.A0T()
            r10 = 2131627865(0x7f0e0f59, float:1.8883006E38)
            r0 = 37355530(0x23a000a, float:1.3665133E-37)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = "com.bloks.www.minishops.collection.ig_encoded"
            r0 = 19
            java.lang.String r8 = X.Pxd.A00(r0)
            r4 = 0
            r9 = r4
            X.3M3 r0 = X.W3Y.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x011e
        L_0x00b2:
            java.lang.String r0 = "mini_shop_bloks"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007e
            X.3kF r0 = X.C249713kF.A00
            X.W3Y r0 = r0.A0T()
            androidx.fragment.app.Fragment r0 = r0.A09(r3, r5)
            goto L_0x011e
        L_0x00c5:
            java.lang.String r0 = "product_collection"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007e
            X.3kF r0 = X.C249713kF.A00
            r0.A0T()
            com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment r0 = new com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment
            r0.<init>()
            r0.setArguments(r3)
            goto L_0x011e
        L_0x00db:
            java.lang.String r0 = "product_details_page"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007e
            X.3kF r0 = X.C249713kF.A00
            X.W3Y r0 = r0.A0T()
            androidx.fragment.app.Fragment r0 = r0.A0A(r3, r5)
            goto L_0x011e
        L_0x00ee:
            java.lang.String r0 = "product_collection_mini_shops_bloks"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007e
            X.3kF r0 = X.C249713kF.A00
            X.W3Y r4 = r0.A0T()
            java.lang.String r0 = "media_id"
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r0 = "product_collection_title"
            java.lang.String r8 = r3.getString(r0)
            X.1Xj r0 = X.DbV.A0U(r5, r1)
            r0.getClass()
            X.JwE r0 = X.SAZ.A00(r5, r0)
            java.lang.String r6 = r0.A01
            java.lang.Object r9 = r0.A00
            java.util.HashMap r9 = (java.util.HashMap) r9
            r7 = r6
            X.3M3 r0 = r4.A0C(r5, r6, r7, r8, r9)
        L_0x011e:
            r11.A02 = r0
            X.0s1 r3 = X.DbW.A0C(r11)
            androidx.fragment.app.Fragment r1 = r11.A02
            java.lang.String r0 = X.Pxf.A0g(r1)
            r3.A0D(r1, r0, r2)
            r3.A00()
            X.0hq r0 = r11.getChildFragmentManager()
            r0.A0a()
        L_0x0137:
            androidx.fragment.app.Fragment r0 = r11.A02
            boolean r0 = r0 instanceof X.AnonymousClass4DS
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r2 = r11.A05
            if (r0 == 0) goto L_0x01d0
            r1 = 14
            X.WBC r0 = new X.WBC
            r0.<init>(r11, r1)
            X.2dZ r2 = X.2dY.A01(r0, r2)
            r11.A03 = r2
            r1 = 7
            X.LcR r0 = new X.LcR
            r0.<init>(r11, r1)
            r2.A0X(r0)
        L_0x0155:
            android.content.Context r6 = r11.requireContext()
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r5 = r11.A06
            android.view.View r0 = r11.mView
            r0.getClass()
            android.view.View r4 = r0.getRootView()
            r2 = 4632233691727265792(0x4049000000000000, double:50.0)
            r0 = 4620693217682128896(0x4020000000000000, double:8.0)
            X.2co r3 = X.C71392co.A04(r2, r0)
            int r0 = X.0nA.A05(r6)
            float r2 = (float) r0
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r2 = r2 * r0
            X.WeJ r1 = new X.WeJ
            r1.<init>(r4, r3, r11, r2)
            X.6nC r0 = new X.6nC
            r0.<init>(r6, r1)
            X.C317416nE.A00(r5, r0)
            com.instagram.common.session.UserSession r10 = r11.A04
            android.os.Bundle r8 = r11.A00
            java.lang.String r12 = r11.A07
            android.view.View r9 = r11.mView
            r9.getClass()
            X.Val r7 = new X.Val
            r7.<init>(r8, r9, r10, r11, r12)
            r11.A09 = r7
            java.lang.String r1 = r7.A05
            int r0 = r1.hashCode()
            r5 = 2
            r4 = 0
            switch(r0) {
                case -1744365060: goto L_0x01c1;
                case -1610081298: goto L_0x01be;
                case -1310090308: goto L_0x01a0;
                default: goto L_0x019f;
            }
        L_0x019f:
            return
        L_0x01a0:
            java.lang.String r0 = "product_details_page"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x019f
            long r0 = java.lang.System.currentTimeMillis()
            r7.A00 = r0
            com.instagram.common.session.UserSession r0 = r7.A03
            X.3Dp r3 = X.C238833Dp.A00(r0)
            android.view.View r2 = r7.A02
            X.3Ds r1 = X.C238863Ds.SNACKS
            java.lang.String[] r0 = new java.lang.String[r4]
            r3.A07(r2, r1, r0, r5)
            return
        L_0x01be:
            java.lang.String r0 = "product_collection"
            goto L_0x01c3
        L_0x01c1:
            java.lang.String r0 = "product_collection_bloks"
        L_0x01c3:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x019f
            long r0 = java.lang.System.currentTimeMillis()
            r7.A00 = r0
            return
        L_0x01d0:
            r0 = 8
            r2.setVisibility(r0)
            android.view.View r1 = r11.A01
            r0 = 0
            X.0nA.A0e(r1, r0)
            goto L_0x0155
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15336Ual.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
