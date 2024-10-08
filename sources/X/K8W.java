package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class K8W extends K82 implements AnonymousClass4DR, C66531MVj, C74380Ptv {
    public static final String __redex_internal_original_name = "BrandedContentDisclosureFragment";
    public C231002qi A00;
    public boolean A01 = true;
    public final AnonymousClass2qU A02;
    public final AnonymousClass0eM A03;

    public final /* synthetic */ void Cqk(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        C63092KrL.A00(fragmentActivity, userSession, user, str);
    }

    public final boolean Cts(boolean z) {
        return false;
    }

    public final void DWd(User user) {
        0qQ.A0B(user, 0);
        A02(this).A05(user);
        AnonymousClass0eM r2 = this.A01;
        C64186LSt.A05(this, AnonymousClass7TE.A0l(r2), __redex_internal_original_name);
        JVF.A05(this, AnonymousClass7TE.A0l(r2), AnonymousClass05K.A0U, AnonymousClass7TF.A0w("brand_id", user.getId()));
    }

    public final boolean Dil() {
        return false;
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        1YN A002 = AnonymousClass2bO.A00();
        UserSession A0l = AnonymousClass7TE.A0l(this.A01);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0C;
        AnonymousClass2bO.A00();
        C231002qi A012 = A002.A01(this, this, A0l, 2bV.A02(new LvT(this, 2), LvX.A00), quickPromotionSlot);
        this.A00 = A012;
        EnumSet of = EnumSet.of(Trigger.A0F);
        0qQ.A07(of);
        A012.AVg(of);
        View A0C = JTS.A0C(view, R.id.action_bar);
        TextView A0R = AnonymousClass7TG.A0R(A0C, R.id.action_bar_title);
        int i = 2131972391;
        if (A02(this).A0D) {
            i = 2131961445;
        }
        DbU.A1G(A0R, this, i);
        LYC.A00(AnonymousClass7TF.A0G(A0C, R.id.action_bar_button_back), 70, this);
        View A0G = AnonymousClass7TF.A0G(A0C, R.id.action_bar_button_done);
        AnonymousClass0fU.A00(new LY8(20, A0G, this), A0G);
        Dba.A16(getViewLifecycleOwner(), A02(this).A00, new C58728Iwb(this, 17), 43);
        if (A02(this).A0A) {
            MH8.A03(this, DbV.A0J(this), 19);
        }
        BrandedContentDisclosureViewModel A022 = A02(this);
        String str2 = "";
        if (C63982LHa.A00(A02(this).A01)) {
            str = getString(2131968777);
        } else {
            str = str2;
        }
        0qQ.A0A(str);
        if (C63982LHa.A01(A02(this).A01)) {
            str2 = C49946FGa.A03(requireContext(), A02(this).A01);
        }
        AnonymousClass7TF.A1H(str, str2);
        A022.A04();
        A02(this).A04();
        DbZ.A1C(this, new C59819JZr((AnonymousClass4D7) null, (Object) this, (Object) view, 14), A02(this).A0H);
    }

    public static final BrandedContentDisclosureViewModel A02(K8W k8w) {
        return (BrandedContentDisclosureViewModel) k8w.A03.getValue();
    }

    public static final void A03(K8W k8w) {
        boolean z;
        String str;
        AnonymousClass0eM r2 = k8w.A01;
        0lg A0X = DbT.A0X(r2);
        boolean z2 = A02(k8w).A0D;
        BrandedContentDisclosureViewModel A022 = A02(k8w);
        if (AnonymousClass7TE.A1b(A022.A06)) {
            z = ((BrandedContentTag) A022.A06.get(0)).A04;
        } else {
            z = false;
        }
        String A0z = DbT.A0z(", ", A02(k8w).A06, C66322MNf.A00);
        String str2 = A02(k8w).A05;
        0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(k8w, A0X, 0), "instagram_bc_settings_exit");
        A0e.A7p("is_editing", Boolean.valueOf(z2));
        A0e.A7p("is_permission_enabled", Boolean.valueOf(z));
        DbU.A1N(A0e, "sponsor_igid", A0z, (String) null);
        A0e.AAJ("media_type", str2);
        A0e.AAJ("prior_module", __redex_internal_original_name);
        A0e.Cgf();
        if (!A02(k8w).A0D) {
            String str3 = A02(k8w).A05;
            switch (str3.hashCode()) {
                case 3138974:
                    if (str3.equals("feed")) {
                        C59888JbD.A02(r2);
                        if (k8w.A01) {
                            C59888JbD.A02(r2);
                            return;
                        }
                        return;
                    }
                    return;
                case 3230752:
                    str = "igtv";
                    break;
                case 3322092:
                    if (str3.equals("live")) {
                        DbX.A1I(k8w);
                        return;
                    }
                    return;
                case 3496474:
                    str = "reel";
                    break;
                case 109770997:
                    str = "story";
                    break;
                default:
                    return;
            }
            if (str3.equals(str)) {
                DbT.A1I(k8w);
                if (!k8w.A01) {
                    return;
                }
            } else {
                return;
            }
        }
        DbT.A1I(k8w);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tE, java.lang.Object] */
    public final Collection getDefinitions() {
        KFC kfc = new KFC(this);
        AnonymousClass0eM r1 = this.A01;
        return 0sr.A1P(new C232222tE[]{kfc, new NOT(this, this, this, AnonymousClass7TE.A0l(r1)), new EG1(this, AnonymousClass7TE.A0l(r1)), new Object()});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(C66323MNg.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.2qU] */
    public K8W() {
        MMG A002 = MMG.A00(this, 20);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, MMG.A00(MMG.A00(this, 17), 18));
        this.A03 = DbS.A0I(MMG.A00(A003, 19), A002, new C58716IwP(42, (Object) null, (Object) A003), DbS.A0z(BrandedContentDisclosureViewModel.class));
        AnonymousClass2bO.A00();
        this.A02 = new Object();
    }

    public static final void A04(K8W k8w) {
        C358248ab A0U = DbW.A0U(k8w);
        A0U.A09(2131974965);
        A0U.A08(2131960799);
        A0U.A0K(LV3.A00(k8w, 18), 2131960790);
        A0U.A0G((DialogInterface.OnClickListener) null, 2131964550);
        DbT.A1V(A0U);
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.KP8, X.JbE] */
    public final void Cu0() {
        AnonymousClass0eM r5;
        if (!0qQ.A0K(A02(this).A05, "feed") || A02(this).A0D) {
            FragmentActivity requireActivity = requireActivity();
            r5 = this.A01;
            C309516Yo A0N = DbX.A0N(requireActivity, r5);
            C49892FBu.A02();
            A0N.A0D(LSU.A01(A02(this).A01, A02(this).A05, A02(this).A0D, false));
            A0N.A04();
        } else {
            r5 = this.A01;
            UserSession A0l = AnonymousClass7TE.A0l(r5);
            BrandedContentGatingInfo brandedContentGatingInfo = A02(this).A01;
            ? jbE = new C59889JbE("media_audience_restrictions");
            jbE.A00 = brandedContentGatingInfo;
            C59888JbD.A01(A0l, jbE);
        }
        JVF.A01(this, AnonymousClass7TE.A0l(r5), AnonymousClass05K.A0V);
    }

    public final void Cu1() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A02(this).A06.iterator();
        while (it.hasNext()) {
            BrandedContentTag A0l = JTO.A0l(it);
            User user = A0l.A00;
            if (user != null || (user = JTR.A0u(this.A01).A02(A0l.A01)) != null) {
                A1C.add(user);
            }
        }
        C64517LdJ ldJ = new C64517LdJ(this);
        C61446K8a k8a = new C61446K8a();
        String str = A02(this).A05;
        boolean z = A02(this).A0D;
        BrandedContentGatingInfo brandedContentGatingInfo = A02(this).A01;
        boolean z2 = A02(this).A09;
        k8a.A01 = ldJ;
        k8a.A07 = true;
        JTS.A1M(brandedContentGatingInfo, k8a, str, A1C, z);
        k8a.A08 = z2;
        AnonymousClass6SR.A01().A0E = true;
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r0 = this.A01;
        Dbc.A0S(k8a, requireActivity, r0);
        JVF.A01(this, AnonymousClass7TE.A0l(r0), AnonymousClass05K.A0T);
    }

    public final boolean CuC(boolean z) {
        BrandedContentDisclosureViewModel A022 = A02(this);
        A022.A0E = z;
        if (!z) {
            A022.A06 = AnonymousClass7TE.A1C();
            A022.A01 = new BrandedContentGatingInfo((Integer) null, (String) null, (HashMap) null, (List) null, (List) null);
        }
        A022.A04();
        return true;
    }

    public final boolean Cv5(boolean z) {
        return A0C(A02(this), this.A00, z);
    }

    public final void DOk(View view) {
        String str;
        Context A0B = JTT.A0B(this, view);
        UserSession A0l = AnonymousClass7TE.A0l(this.A01);
        List list = A02(this).A01.A04;
        if (list != null) {
            str = C51970G9q.A0k(list);
            0qQ.A0A(str);
        } else {
            str = "";
        }
        Map singletonMap = Collections.singletonMap("blocked_countries_str", str);
        0qQ.A07(singletonMap);
        LHX.A01(A0B, view, this, A0l, singletonMap);
    }

    public final void DS8(View view) {
        Context A0B = JTT.A0B(this, view);
        UserSession A0l = AnonymousClass7TE.A0l(this.A01);
        BrandedContentGatingInfo brandedContentGatingInfo = A02(this).A01;
        HashMap A1E = AnonymousClass7TE.A1E();
        Integer num = brandedContentGatingInfo.A00;
        if (num != null) {
            A1E.put(AnonymousClass000.A00(1268), num);
        }
        HashMap hashMap = brandedContentGatingInfo.A02;
        if (hashMap != null) {
            A1E.putAll(hashMap);
        }
        Map singletonMap = Collections.singletonMap("countries_and_ages_str", DbT.A10(new JSONObject(A1E)));
        0qQ.A07(singletonMap);
        LHX.A00(A0B, view, this, A0l, singletonMap);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 32779 && i2 == -1 && intent != null) {
            String A002 = AnonymousClass000.A00(131);
            if (intent.hasExtra(A002)) {
                BrandedContentDisclosureViewModel A022 = A02(this);
                UserSession A0l = AnonymousClass7TE.A0l(this.A01);
                BrandedContentGatingInfo brandedContentGatingInfo = A02(this).A01;
                Serializable serializableExtra = intent.getSerializableExtra(A002);
                0qQ.A0C(serializableExtra, C66579MXk.A00(37));
                A022.A01 = C347037wA.A00(brandedContentGatingInfo, this, A0l, (BrandedContentTag) 00k.A0O(00k.A0a(A02(this).A06), 0), (HashMap) serializableExtra);
                BrandedContentDisclosureViewModel A023 = A02(this);
                String str2 = "";
                if (C63982LHa.A00(A02(this).A01)) {
                    str = getString(2131968777);
                } else {
                    str = str2;
                }
                0qQ.A0A(str);
                if (C63982LHa.A01(A02(this).A01)) {
                    str2 = C49946FGa.A03(requireContext(), A02(this).A01);
                }
                AnonymousClass7TF.A1H(str, str2);
                A023.A04();
            }
        }
    }

    public final boolean onBackPressed() {
        BrandedContentDisclosureViewModel A022 = A02(this);
        if (!0qQ.A0K(A022.A06, A022.A07) || !0qQ.A0K(A022.A02, A022.A01) || this.A01) {
            A04(this);
            return true;
        }
        A03(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        ArrayList A0U;
        DU2 du2;
        int A022 = AnonymousClass0fD.A02(-177280278);
        K8W.super.onCreate(bundle);
        this.A00 = requireArguments().getString("ARGUMENT_MEDIA_ID");
        BrandedContentDisclosureViewModel A023 = A02(this);
        List A0t = JTT.A0t(requireArguments().getParcelableArrayList("brand_partners"));
        BrandedContentGatingInfo brandedContentGatingInfo = (BrandedContentGatingInfo) requireArguments().getParcelable("BRANDED_CONTENT_GATING_INFO");
        if (brandedContentGatingInfo == null) {
            brandedContentGatingInfo = new BrandedContentGatingInfo((Integer) null, (String) null, (HashMap) null, (List) null, (List) null);
        }
        boolean z = requireArguments().getBoolean("disclosure_fragment_is_edit_flow");
        boolean z2 = requireArguments().getBoolean("disclosure_fragment_is_paid_partnership_on");
        String string = requireArguments().getString("ARGUMENT_MEDIA_TYPE");
        if (string == null) {
            string = "feed";
        }
        String str = this.A00;
        boolean z3 = requireArguments().getBoolean("has_interactive_elements_for_story");
        boolean z4 = requireArguments().getBoolean("includes_suspected_sponsor");
        boolean z5 = requireArguments().getBoolean("argument_create_ad_code");
        if (z4) {
            A023.A0A = z4;
            A023.A0E = true;
            A023.A08 = A0t;
            0sn r0 = 0sn.A00;
            0qQ.A0B(r0, 0);
            A023.A07 = r0;
            A0U = AnonymousClass7TE.A1C();
        } else {
            A023.A0E = z2;
            A023.A07 = A0t;
            ArrayList A0r = AnonymousClass7TG.A0r(A0t);
            Iterator it = A0t.iterator();
            while (it.hasNext()) {
                A0r.add(new BrandedContentTag(JTO.A0l(it)));
            }
            A0U = 00k.A0U(A0r);
        }
        A023.A06 = A0U;
        A023.A02 = brandedContentGatingInfo;
        HashMap hashMap = brandedContentGatingInfo.A02;
        A023.A01 = CV8.A00(brandedContentGatingInfo.A00, brandedContentGatingInfo.A01, brandedContentGatingInfo.A03, brandedContentGatingInfo.A04, hashMap);
        A023.A0D = z;
        A023.A05 = string;
        A023.A04 = str;
        A023.A09 = z3;
        A023.A0B = z5;
        if (str != null) {
            1Xj A0U2 = DbV.A0U(A023.A02, str);
            if (A0U2 != null) {
                du2 = A0U2.A1E();
            } else {
                du2 = null;
            }
            A023.A00 = du2;
            if (du2 != null) {
                A023.A0B = true;
            }
        }
        this.A01 = requireArguments().getBoolean("disclosure_fragment_entered_from_brand_search");
        06F.A00(this, "request_key_audience_restrictions", new C59111J6t(this, 34));
        AnonymousClass0fD.A09(2017930012, A022);
    }
}
