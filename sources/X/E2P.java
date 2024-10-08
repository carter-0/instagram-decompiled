package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class E2P extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteNonDiscriminationHECFragment";
    public UserSession A00;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131970635);
    }

    public final String getModuleName() {
        return "promote_non_discrimination_hec";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        View requireViewById = view.requireViewById(R.id.special_considerations_title_row);
        C48747EjW.A00(requireViewById, Dbb.A09(this, requireViewById).getString(2131970633), (String) null, true);
        View requireViewById2 = view.requireViewById(R.id.special_considerations_content_1_row);
        C48747EjW.A00(requireViewById2, (String) null, Dbb.A09(this, requireViewById2).getString(2131970631), false);
        View requireViewById3 = view.requireViewById(R.id.special_considerations_content_2_row);
        C48747EjW.A00(requireViewById3, (String) null, Dbb.A09(this, requireViewById3).getString(2131970632), false);
        View requireViewById4 = view.requireViewById(R.id.acceptable_ad_targeting_row);
        C48747EjW.A00(requireViewById4, Dbb.A09(this, requireViewById4).getString(2131970616), (String) null, true);
        View requireViewById5 = view.requireViewById(R.id.housing_targeting_row);
        C48747EjW.A00(requireViewById5, Dbb.A09(this, requireViewById5).getString(2131970630), DbV.A05(this).getString(2131970629), false);
        View requireViewById6 = view.requireViewById(R.id.employment_targeting_row);
        C48747EjW.A00(requireViewById6, Dbb.A09(this, requireViewById6).getString(2131970625), DbV.A05(this).getString(2131970624), false);
        View requireViewById7 = view.requireViewById(R.id.credit_targeting_row);
        C48747EjW.A00(requireViewById7, Dbb.A09(this, requireViewById7).getString(2131970621), DbV.A05(this).getString(2131970620), false);
        View requireViewById8 = view.requireViewById(R.id.ad_discrimination_row);
        C48747EjW.A00(requireViewById8, Dbb.A09(this, requireViewById8).getString(2131970617), (String) null, true);
        View requireViewById9 = view.requireViewById(R.id.housing_discrimination_row);
        C48747EjW.A00(requireViewById9, Dbb.A09(this, requireViewById9).getString(2131970628), DbV.A05(this).getString(2131970627), false);
        View requireViewById10 = view.requireViewById(R.id.employment_discrimination_row);
        C48747EjW.A00(requireViewById10, Dbb.A09(this, requireViewById10).getString(2131970623), DbV.A05(this).getString(2131970622), false);
        View requireViewById11 = view.requireViewById(R.id.credit_discrimination_row);
        C48747EjW.A00(requireViewById11, Dbb.A09(this, requireViewById11).getString(2131970619), DbV.A05(this).getString(2131970618), false);
        super.onViewCreated(view, bundle);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1016938055);
        XAI requireActivity = requireActivity();
        0qQ.A0C(requireActivity, AnonymousClass000.A00(86));
        this.A00 = requireActivity.Bhh().A0y;
        E2P.super.onCreate(bundle);
        AnonymousClass0fD.A09(-724826683, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(817279390);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_non_discrimination_hec_view, viewGroup, false);
        AnonymousClass0fD.A09(-1129691391, A02);
        return inflate;
    }
}
