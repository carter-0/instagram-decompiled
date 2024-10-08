package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Uax  reason: case insensitive filesystem */
public final class C15346Uax extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DV, AnonymousClass4DR, C21000X8x, AnonymousClass4DS, AnonymousClass32J, C20920X4l {
    public static final String __redex_internal_original_name = "FeaturedProductSellerManagementFragment";
    public AnonymousClass3AD A00;
    public String A01 = "";
    public RecyclerView A02;
    public RefreshableNestedScrollingParent A03;
    public final AnonymousClass32Q A04 = AnonymousClass32Q.A00;
    public final List A05 = new ArrayList();
    public final Map A06 = new LinkedHashMap();
    public final AnonymousClass0eM A07 = C20692WxO.A00(this, 24);
    public final AnonymousClass0eM A08 = C20692WxO.A00(this, 25);
    public final AnonymousClass0eM A09 = C20692WxO.A00(this, 26);
    public final AnonymousClass0eM A0A = C20692WxO.A00(this, 27);
    public final AnonymousClass0eM A0B = C20692WxO.A00(this, 28);
    public final AnonymousClass0eM A0C = C20692WxO.A00(this, 29);
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final AnonymousClass0eM A0E = C20692WxO.A00(this, 30);
    public final AnonymousClass0eM A0F = C20692WxO.A00(this, 31);
    public final AnonymousClass0eM A0G = C20692WxO.A00(this, 32);
    public final 1wn A0H = new C19221WQb(this, 62);

    public final void DIH(View view, 1Xj r17, int i) {
        1Xj r1 = r17;
        0qQ.A0B(r1, 0);
        C249713kF r2 = C249713kF.A00;
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r0 = this.A0D;
        UserSession A0l = AnonymousClass7TE.A0l(r0);
        String str = this.A01;
        String A0u = DbU.A0u(r0);
        String str2 = ((C19742Wej) this.A0E.getValue()).A01.A03.A07;
        List list = this.A05;
        String id = r1.getId();
        if (id != null) {
            r2.A0x(requireActivity, A0l, this, (ProductDetailsPageLoggingInfo) null, str, "commerce/community/featured_products/merchant_management/approved/", A0u, str2, id, "approved", DbS.A0t(this.A0F), list);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DIr(X.C17840Vgt r24) {
        /*
            r23 = this;
            r14 = 0
            X.3kF r15 = X.C249713kF.A00
            r0 = r23
            androidx.fragment.app.FragmentActivity r16 = r0.requireActivity()
            X.0eM r4 = r0.A0D
            com.instagram.common.session.UserSession r17 = X.AnonymousClass7TE.A0l(r4)
            r2 = r24
            java.lang.Integer r1 = r2.A00()
            java.lang.String r21 = X.C17064VGm.A00(r1)
            X.0eM r1 = r0.A0F
            java.lang.String r22 = X.DbS.A0t(r1)
            java.lang.String r5 = r2.A02
            if (r5 == 0) goto L_0x00e1
            java.lang.Integer r1 = r2.A00()
            int r3 = r1.intValue()
            r1 = 3
            if (r3 == r1) goto L_0x00d1
            if (r3 == r14) goto L_0x00cd
            r1 = 1
            if (r3 == r1) goto L_0x00c9
            r1 = 2
            if (r3 != r1) goto L_0x00db
            java.lang.String r6 = "commerce/community/featured_products/merchant_management/recently_edited/"
        L_0x0038:
            java.lang.String r7 = X.DbU.A0u(r4)
            java.lang.Integer r1 = r2.A00()
            int r3 = r1.intValue()
            r1 = 3
            if (r3 == r1) goto L_0x00bf
            if (r3 == r14) goto L_0x00bc
            r1 = 1
            if (r3 == r1) goto L_0x00c2
            r1 = 2
            if (r3 != r1) goto L_0x00d5
            X.0sn r12 = X.0sn.A00
        L_0x0051:
            java.lang.Integer r1 = r2.A00()
            int r3 = r1.intValue()
            r9 = 0
            if (r3 == r14) goto L_0x00b8
            r1 = 1
            if (r3 == r1) goto L_0x00b4
            r1 = 2
            if (r3 != r1) goto L_0x0073
            r1 = 2131962257(0x7f132991, float:1.9561234E38)
        L_0x0065:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x0073
            int r1 = r1.intValue()
            java.lang.String r9 = r0.getString(r1)
        L_0x0073:
            java.lang.Integer r1 = r2.A00()
            int r2 = r1.intValue()
            r10 = 0
            if (r2 == r14) goto L_0x00b0
            r1 = 1
            if (r2 == r1) goto L_0x00ac
            r1 = 2
            if (r2 != r1) goto L_0x0095
            r1 = 2131962256(0x7f132990, float:1.9561232E38)
        L_0x0087:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x0095
            int r1 = r1.intValue()
            java.lang.String r10 = r0.getString(r1)
        L_0x0095:
            r8 = 0
            r1 = 298(0x12a, float:4.18E-43)
            java.lang.String r11 = X.AnonymousClass000.A00(r1)
            com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration r4 = new com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration
            r13 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r18 = r0
            r19 = r4
            r20 = r8
            r15.A0v(r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x00ac:
            r1 = 2131962248(0x7f132988, float:1.9561216E38)
            goto L_0x0087
        L_0x00b0:
            r1 = 2131962254(0x7f13298e, float:1.9561228E38)
            goto L_0x0087
        L_0x00b4:
            r1 = 2131962249(0x7f132989, float:1.9561218E38)
            goto L_0x0065
        L_0x00b8:
            r1 = 2131962255(0x7f13298f, float:1.956123E38)
            goto L_0x0065
        L_0x00bc:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.PENDING
            goto L_0x00c4
        L_0x00bf:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.APPROVED
            goto L_0x00c4
        L_0x00c2:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.DECLINED
        L_0x00c4:
            java.util.List r12 = X.AnonymousClass7TE.A1I(r1)
            goto L_0x0051
        L_0x00c9:
            java.lang.String r6 = "commerce/community/featured_products/merchant_management/declined/"
            goto L_0x0038
        L_0x00cd:
            java.lang.String r6 = "commerce/community/featured_products/merchant_management/pending/"
            goto L_0x0038
        L_0x00d1:
            java.lang.String r6 = "commerce/community/featured_products/merchant_management/approved/"
            goto L_0x0038
        L_0x00d5:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00db:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00e1:
            java.lang.String r0 = "title"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15346Uax.DIr(X.Vgt):void");
    }

    public final String getModuleName() {
        return "instagram_shopping_featured_product_seller_management";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A03;
        String str = "refreshableContainer";
        if (refreshableNestedScrollingParent != null) {
            C13990Tnq.A1O(refreshableNestedScrollingParent);
            AnonymousClass0eM r6 = this.A0D;
            this.A00 = C3253672c.A01(view, AnonymousClass7TE.A0l(r6), new C19760Wf1(this, 10));
            RecyclerView A0G2 = C13990Tnq.A0G(view);
            A0G2.setItemAnimator((AnonymousClass3AS) null);
            DbU.A15(requireContext(), A0G2, 1, false);
            AnonymousClass0eM r4 = this.A07;
            Dba.A17(A0G2, r4);
            JTQ.A0y(A0G2.A0D, A0G2, new WWL(this, 7), C3251771i.A06);
            this.A02 = A0G2;
            if (getScrollingViewProxy() instanceof C238143As) {
                boolean A1a = C13991Tnr.A1a(r6);
                C238133Ar scrollingViewProxy = getScrollingViewProxy();
                0qQ.A0C(scrollingViewProxy, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<*>");
                C238143As r2 = (C238143As) scrollingViewProxy;
                if (A1a) {
                    AnonymousClass3AD r1 = this.A00;
                    str = "pullToRefresh";
                    if (r1 != null) {
                        C18948WEb.A00(r2, (C19763Wf4) r1, r1, this, 7);
                    }
                } else {
                    r2.ErF(new C20078Wkc(this));
                }
            }
            C15486Udb.A00(r4);
            ((C19612Wcb) this.A09.getValue()).FKG();
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C15346Uax uax) {
        ((C18000Vjc) uax.A0A.getValue()).A00(new C20705Wxc(uax, 44), new C20705Wxc(uax, 45));
    }

    public final 1NY Abz() {
        AnonymousClass0eM r1 = this.A0D;
        1NY A0b = AnonymousClass7TG.A0b(DbT.A0X(r1));
        A0b.A9m("merchant_id", DbU.A0u(r1));
        A0b.A0A("commerce/community/featured_products/merchant_management/approved/");
        A0b.A0Q(1XO.class, 1XW.class);
        return A0b;
    }

    public final void DkL() {
        C15486Udb.A00(this.A07);
    }

    public final /* bridge */ /* synthetic */ void DkM(AnonymousClass1XV r4, boolean z, boolean z2) {
        1XO r42 = (1XO) r4;
        0qQ.A0B(r42, 0);
        List list = this.A05;
        List list2 = r42.A06;
        0qQ.A07(list2);
        list.addAll(list2);
        C15486Udb udb = (C15486Udb) this.A07.getValue();
        List list3 = r42.A06;
        0qQ.A07(list3);
        C273674n0 r0 = udb.A02;
        r0.A04();
        r0.A0A(list3);
        udb.A01();
        C13990Tnq.A1V(this.A08);
    }

    public final C238133Ar getScrollingViewProxy() {
        RecyclerView recyclerView = this.A02;
        if (recyclerView == null) {
            C66580MXl.A19();
            throw AnonymousClass00P.createAndThrow();
        }
        C238133Ar A002 = C238103Ao.A00(recyclerView);
        0qQ.A07(A002);
        return A002;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final boolean isEmpty() {
        return ((2Rv) this.A07.getValue()).isEmpty();
    }

    public final boolean onBackPressed() {
        return ((AnonymousClass2uE) this.A0C.getValue()).onBackPressed();
    }

    public final boolean DII(MotionEvent motionEvent, View view, AnonymousClass1Xq r4, int i) {
        AnonymousClass7TG.A1T(view, motionEvent, r4);
        return ((AnonymousClass2uE) this.A0C.getValue()).Dsa(motionEvent, view, r4, i);
    }

    public final void DkK(C268654dm r4, boolean z) {
        C59689JTv.A0F(getActivity(), "shopping_feed_failed", 2131956760);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.setTitle(DbS.A0t(this.A0G));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(201939039);
        C15346Uax.super.onCreate(bundle);
        ((C19612Wcb) this.A09.getValue()).Epa();
        A00(this);
        C13990Tnq.A1E(this, this.A0B);
        C13990Tnq.A1D(this, this.A08);
        C13990Tnq.A1D(this, this.A0C);
        AnonymousClass0eM r3 = this.A0D;
        DbX.A0R(r3).A01(this.A0H, C19218WPy.class);
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0P(this, r3), "instagram_shopping_seller_management_entry");
        C13989Tnp.A1E(A0e, C13992Tns.A06(this), DbS.A0t(this.A0F));
        A0e.Cgf();
        AnonymousClass0fD.A09(581753611, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View A0F2;
        View view;
        int A022 = AnonymousClass0fD.A02(1430670453);
        0qQ.A0B(layoutInflater, 0);
        if (C13991Tnr.A1a(this.A0D)) {
            A0F2 = layoutInflater.inflate(R.layout.layout_swipe_refresh_hscroll_recyclerview, viewGroup, false);
            view = A0F2.findViewById(R.id.refreshable_container);
        } else {
            A0F2 = C13990Tnq.A0F(layoutInflater, viewGroup, R.layout.layout_refreshable_recyclerview);
            view = A0F2;
        }
        this.A03 = (RefreshableNestedScrollingParent) view;
        0qQ.A0A(A0F2);
        AnonymousClass0fD.A09(-80386010, A022);
        return A0F2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1218601207);
        super.onDestroy();
        C13990Tnq.A1G(this, this.A0B);
        C13990Tnq.A1F(this, this.A08);
        C13990Tnq.A1F(this, this.A0C);
        DbX.A0R(this.A0D).A02(this.A0H, C19218WPy.class);
        AnonymousClass0fD.A09(465352449, A022);
    }
}
