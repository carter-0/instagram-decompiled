package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;
import com.instagram.profile.fragment.UserDetailTabController;
import java.util.Set;

public final class H1L extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass723 {
    public static final String __redex_internal_original_name = "ProductsTabFragment";
    public int A00 = 2;
    public AnonymousClass2t9 A01;
    public String A02;
    public String A03;
    public String A04;
    public View A05;
    public RecyclerView A06;
    public boolean A07 = true;
    public boolean A08 = true;
    public final H7L A09;
    public final String A0A = AnonymousClass000.A00(3981);
    public final AnonymousClass0eM A0B = C227642jf.A02(this);
    public final AnonymousClass0eM A0C;
    public final 2el A0D = C51969G9p.A0k();
    public final Set A0E = DbS.A0y();

    public final String BhI() {
        return "profile_products";
    }

    public final void Daz(UserDetailTabController userDetailTabController) {
    }

    public final void DqG(boolean z) {
    }

    public final void DqL(boolean z) {
    }

    public final void DqM() {
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C252553pI r8;
        ViewGroup.LayoutParams layoutParams;
        Resources resources;
        1Xj A0U;
        C250513lZ A0w;
        IGAdProfileProductTabDict BhC;
        Boolean CZn;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Context requireContext = requireContext();
        AnonymousClass0eM r9 = this.A0B;
        UserSession A0l = AnonymousClass7TE.A0l(r9);
        0Tu A0J = DbS.A0J(A0l, 1);
        this.A00 = DbS.A04(A0J, A0l, 36610550339278897L);
        String str = this.A03;
        if (!182.A06(A0J, A0l, 36329075362512658L) || !((A0U = DbV.A0U(A0l, str)) == null || (A0w = C51966G9m.A0w(A0U)) == null || (BhC = A0w.BhC()) == null || (CZn = BhC.CZn()) == null || CZn.booleanValue())) {
            z = false;
        } else {
            z = true;
        }
        this.A08 = z;
        this.A06 = DbT.A0I(view2, R.id.product_tab_recyclerview);
        this.A05 = view2.requireViewById(R.id.sponsored_label);
        if (182.A06(A0J, A0l, 36329075362840342L)) {
            TextView A0R = AnonymousClass7TG.A0R(view2, R.id.sponsored_label_text);
            Context context = getContext();
            String str2 = null;
            if (!(context == null || (resources = context.getResources()) == null)) {
                Bundle bundle2 = this.mArguments;
                if (bundle2 != null) {
                    str2 = bundle2.getString(AnonymousClass000.A00(1080));
                }
                str2 = AnonymousClass7TF.A0e(resources, str2, 2131974139);
            }
            A0R.setText(str2);
            C56802ICz.A01(A0R, 23, this);
            C56802ICz.A01(AnonymousClass7TF.A0G(view2, R.id.sponsored_label_more_menu), 24, this);
            0Aj A0N = C51972G9s.A0N(this, DbT.A0X(r9));
            A0N.AAJ("media_thumbnail_section", "ads_products_tab_sponsored_label");
            C51965G9l.A1L(A0N, this.A04);
            A0N.AAJ("position", C320166rs.A01(0, 0));
            G9w.A17(A0N);
        } else {
            AnonymousClass7TH.A0R(this.A05);
        }
        if (!this.A07) {
            RecyclerView recyclerView = this.A06;
            if (recyclerView != null) {
                layoutParams = recyclerView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            0qQ.A0C(layoutParams, AnonymousClass000.A00(18));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, 0, 0, 0);
            RecyclerView recyclerView2 = this.A06;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutParams(marginLayoutParams);
            }
        }
        2el r14 = this.A0D;
        Dba.A0z(view2, r14, this);
        UserSession A0l2 = AnonymousClass7TE.A0l(r9);
        String str3 = this.A03;
        String str4 = this.A04;
        C55648Hl7 hl7 = new C55648Hl7(requireContext, this);
        2el r17 = r14;
        C55648Hl7 hl72 = hl7;
        Context context2 = requireContext;
        H7Q h7q = new H7Q(context2, this, A0l2, r17, hl72, str3, str4, this.A0E, this.A00, this.A08);
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(requireContext);
        A002.A01(h7q);
        this.A01 = DbU.A0U(A002, new Object());
        int i = this.A00;
        Resources resources2 = requireContext.getResources();
        int i2 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        if (i == 3) {
            i2 = R.dimen.account_discovery_bottom_gap;
        }
        int dimensionPixelSize = resources2.getDimensionPixelSize(i2);
        FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext, this.A00);
        fastScrollingGridLayoutManager.A01 = new C53065Ghx(this, 3);
        RecyclerView recyclerView3 = this.A06;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(fastScrollingGridLayoutManager);
        }
        RecyclerView recyclerView4 = this.A06;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(this.A01);
        }
        RecyclerView recyclerView5 = this.A06;
        if (recyclerView5 != null) {
            recyclerView5.A11(new C361648gZ(dimensionPixelSize, C51965G9l.A1a(A0J, A0l, 36329075362840342L)));
        }
        if (182.A06(A0J, AnonymousClass7TF.A0L(r9, 1), 36329075362709268L)) {
            ISY isy = new ISY(this, 2);
            C3251771i r10 = C3251771i.A0C;
            RecyclerView recyclerView6 = this.A06;
            if (recyclerView6 != null) {
                r8 = recyclerView6.A0D;
            } else {
                r8 = null;
            }
            C3251871j r7 = new C3251871j(r8, isy, r10, false, false);
            RecyclerView recyclerView7 = this.A06;
            if (recyclerView7 != null) {
                recyclerView7.A15(r7);
            }
        }
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH5(r3, this, viewLifecycleOwner, (AnonymousClass4D7) null, 11), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final Fragment ACU() {
        return this;
    }

    public final ViewGroup BqB() {
        return this.A06;
    }

    public final String getModuleName() {
        return this.A0A;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0B);
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.H7L, java.lang.Object] */
    public H1L() {
        C51795G2e g2e = new C51795G2e(this, 25);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51795G2e(new C51795G2e(this, 22), 23));
        this.A0C = DbS.A0I(new C51795G2e(A002, 24), g2e, new MJ4(42, (Object) null, A002), DbS.A0z(C60202JhL.class));
        this.A09 = new Object();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-593184261);
        H1L.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = bundle2.getString("source_media_id");
            this.A02 = bundle2.getString("ad_retrieval_key");
            this.A04 = bundle2.getString("tracking_token");
            this.A07 = bundle2.getBoolean("should_show_floating_cta");
            AnonymousClass0fD.A09(1424714812, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-610408302, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1235693739);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_product_tab_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1588323643, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1761389630);
        super.onDestroyView();
        this.A06 = null;
        this.A05 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(-1076630369, A022);
    }
}
