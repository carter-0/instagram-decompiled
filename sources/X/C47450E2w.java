package X;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.E2w  reason: case insensitive filesystem */
public final class C47450E2w extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final F5C A01 = new Object();
    public static final String __redex_internal_original_name = "PromoteNonDiscriminationFullPolicyFragment";
    public UserSession A00;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131970635);
    }

    public final String getModuleName() {
        return "promote_non_discrimination_full_policy";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        View requireViewById = view.requireViewById(R.id.full_policy_body_1_row);
        F5C.A00(requireViewById, Dbb.A09(this, requireViewById).getString(2131970602));
        View requireViewById2 = view.requireViewById(R.id.full_policy_body_2_row);
        F5C.A00(requireViewById2, Dbb.A09(this, requireViewById2).getString(2131970603));
        View requireViewById3 = view.requireViewById(R.id.discrimination_guides_title_row);
        String string = Dbb.A09(this, requireViewById3).getString(2131970609);
        TextView A0R = AnonymousClass7TG.A0R(requireViewById3, R.id.primary_text);
        View A0G = AnonymousClass7TF.A0G(requireViewById3, R.id.secondary_text);
        if (string != null) {
            A0R.setText(string);
            A0R.setVisibility(0);
            A0R.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            A0R.setVisibility(8);
        }
        A0G.setVisibility(8);
        View requireViewById4 = view.requireViewById(R.id.department_of_housing_and_urban_link_row);
        A00(requireViewById4, AnonymousClass7TF.A0d(Dbb.A09(this, requireViewById4), 2131970607), "https://www.hud.gov/?fbclid=IwAR1BCtVQIYzgEV-AHKFQ7vnY4BiJoVZP1dPzbEQqpDMj01L7Jc8W39jVabU");
        View requireViewById5 = view.requireViewById(R.id.equal_employment_link_row);
        A00(requireViewById5, AnonymousClass7TF.A0d(Dbb.A09(this, requireViewById5), 2131970610), "https://www.eeoc.gov");
        View requireViewById6 = view.requireViewById(R.id.consumer_financial_protect_link_row);
        A00(requireViewById6, AnonymousClass7TF.A0d(Dbb.A09(this, requireViewById6), 2131970606), "https://www.consumerfinance.gov/?fbclid=IwAR3Zq8i7BOJ14yCUZWYSjN7OHEB3L0aLeG4gzOOMQML0Z6brPvZ8q7k2eH4");
        View requireViewById7 = view.requireViewById(R.id.civil_liberties_union_link_row);
        A00(requireViewById7, AnonymousClass7TF.A0d(Dbb.A09(this, requireViewById7), 2131970605), "https://www.aclu.org/?fbclid=IwAR2DU6KQXc-zOSrjZ4m_0OHP-BTTKG7EEint9fmolzXVRKdzcd9pfiVYIxY");
        View requireViewById8 = view.requireViewById(R.id.civil_and_human_rights_link_row);
        A00(requireViewById8, AnonymousClass7TF.A0d(Dbb.A09(this, requireViewById8), 2131970604), "https://civilrights.org/?fbclid=IwAR3Ejp_5nLJ2Ghi9aHVekHPj2j_V44uct_fy29kq1Lu9OZily5UiqWCYeJ8");
        View requireViewById9 = view.requireViewById(R.id.department_of_justice_link_row);
        A00(requireViewById9, AnonymousClass7TF.A0d(Dbb.A09(this, requireViewById9), 2131970608), "https://www.justice.gov/crt?fbclid=IwAR1FW0uYkUB885SbGjwDs_Rtyv_8KiUFy2M-OUdE95YmYtXmy89Rq_JlDdQ");
        View requireViewById10 = view.requireViewById(R.id.fair_housing_link_row);
        A00(requireViewById10, AnonymousClass7TF.A0d(Dbb.A09(this, requireViewById10), 2131970612), "https://fairhousingresourcecenter.wordpress.com/?fbclid=IwAR036hQB0CW7b-jPAQfoGB8B5kKc0Zt1bN39QBOtY2BDig-JYG-JcdL7zOU");
        View requireViewById11 = view.requireViewById(R.id.facebook_advertising_policies_link_row);
        A00(requireViewById11, AnonymousClass7TF.A0d(Dbb.A09(this, requireViewById11), 2131970611), "https://www.facebook.com/policies/ads/prohibited_content/discriminatory_practices");
        View requireViewById12 = view.requireViewById(R.id.footer_row);
        F5C.A00(requireViewById12, Dbb.A09(this, requireViewById12).getString(2131970613));
        super.onViewCreated(view, bundle);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A00(View view, String str, String str2) {
        AnonymousClass7AV.A07(new C48052ESv(this, str2, DbZ.A01(this)), AnonymousClass7TG.A0R(view, R.id.primary_text), str, str);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(878677658);
        XAI requireActivity = requireActivity();
        0qQ.A0C(requireActivity, AnonymousClass000.A00(86));
        this.A00 = requireActivity.Bhh().A0y;
        C47450E2w.super.onCreate(bundle);
        AnonymousClass0fD.A09(-876528999, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1035917289);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_non_discrimination_full_policy_view, false);
        AnonymousClass0fD.A09(1222304849, A02);
        return A0D;
    }
}
