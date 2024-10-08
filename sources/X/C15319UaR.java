package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.UaR  reason: case insensitive filesystem */
public final class C15319UaR extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, X3L {
    public static final String __redex_internal_original_name = "PromoteNonDiscriminationFragment";
    public C18654Vw9 A00;
    public UserSession A01;
    public boolean A02;
    public C18784W1k A03;
    public PromoteData A04;
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C20690WxM(this, 40));

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131970635);
    }

    public final String getModuleName() {
        return "promote_non_discrimination";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        WGU A0M = C13990Tnq.A0M(this.A05);
        C16678UzE uzE = C16678UzE.NON_DISCRIMINATION;
        C13988Tno.A1J(A0M, uzE);
        View requireViewById = view.requireViewById(R.id.about_policy_title_row);
        C16898VAb.A00(requireViewById, Dbb.A09(this, requireViewById).getString(2131970588), (String) null, true);
        View requireViewById2 = view.requireViewById(R.id.about_policy_content_row_1);
        C16898VAb.A00(requireViewById2, (String) null, Dbb.A09(this, requireViewById2).getString(2131970586), false);
        View requireViewById3 = view.requireViewById(R.id.about_policy_content_row_2);
        C16898VAb.A00(requireViewById3, (String) null, Dbb.A09(this, requireViewById3).getString(2131970587), false);
        View requireViewById4 = view.requireViewById(R.id.acceptable_ad_targeting_row);
        C16898VAb.A00(requireViewById4, Dbb.A09(this, requireViewById4).getString(2131970591), DbV.A05(this).getString(2131970590), false);
        View requireViewById5 = view.requireViewById(R.id.ad_discrimination_row);
        C16898VAb.A00(requireViewById5, Dbb.A09(this, requireViewById5).getString(2131970596), DbV.A05(this).getString(2131970595), false);
        View requireViewById6 = view.requireViewById(R.id.hec_row_with_chevron);
        String A0d = AnonymousClass7TF.A0d(Dbb.A09(this, requireViewById6), 2131970634);
        FP5 fp5 = new FP5(this, 13);
        ImageView A0J = DbX.A0J(requireViewById6, R.id.front_icon);
        A0J.setImageResource(R.drawable.instagram_info_pano_outline_24);
        A0J.setVisibility(0);
        DbX.A1E(requireViewById6, A0d, R.id.primary_text);
        AnonymousClass0fU.A00(fp5, requireViewById6);
        View requireViewById7 = view.requireViewById(R.id.full_policy_row_with_chevron);
        String A0d2 = AnonymousClass7TF.A0d(Dbb.A09(this, requireViewById7), 2131970615);
        FP5 fp52 = new FP5(this, 14);
        ImageView A0J2 = DbX.A0J(requireViewById7, R.id.front_icon);
        A0J2.setImageResource(R.drawable.instagram_licensing_pano_outline_24);
        A0J2.setVisibility(0);
        DbX.A1E(requireViewById7, A0d2, R.id.primary_text);
        AnonymousClass0fU.A00(fp52, requireViewById7);
        View requireViewById8 = view.requireViewById(R.id.footer_message_row);
        C16898VAb.A00(requireViewById8, (String) null, Dbb.A09(this, requireViewById8).getString(2131970601), false);
        View requireViewById9 = view.requireViewById(R.id.acceptance_claim_title_row);
        C16898VAb.A00(requireViewById9, Dbb.A09(this, requireViewById9).getString(2131970594), (String) null, false);
        View requireViewById10 = view.requireViewById(R.id.acceptance_first_claim_check_mark_row);
        A00(requireViewById10, AnonymousClass7TF.A0d(Dbb.A09(this, requireViewById10), 2131970592));
        View requireViewById11 = view.requireViewById(R.id.acceptance_second_claim_check_mark_row);
        A00(requireViewById11, AnonymousClass7TF.A0d(Dbb.A09(this, requireViewById11), 2131970593));
        C18654Vw9 vw9 = new C18654Vw9(view, uzE);
        this.A00 = vw9;
        vw9.A01();
        C18654Vw9 vw92 = this.A00;
        if (vw92 == null) {
            0qQ.A0F("acceptButtonHolder");
            throw AnonymousClass00P.createAndThrow();
        }
        vw92.A05(false);
        vw92.A03(this);
        vw92.A02(2131970589);
        super.onViewCreated(view, bundle);
    }

    public final void CtD() {
        C18784W1k w1k = this.A03;
        if (w1k == null) {
            0qQ.A0F("dataFetcher");
            throw AnonymousClass00P.createAndThrow();
        }
        C15621Ufn ufn = new C15621Ufn(this, 20);
        PromoteData promoteData = w1k.A03;
        UserSession userSession = promoteData.A0y;
        String str = promoteData.A1A;
        1NY r2 = new 1NY(userSession);
        r2.A9m("fb_auth_token", str);
        r2.A04();
        r2.A0A("ads/promote/accept_non_disc_policy/");
        C18784W1k.A02(w1k, ufn, DbT.A0S(r2, UXA.class, C18161Vmb.class));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        if (this.A02) {
            C358248ab A0H = Dba.A0H(this);
            A0H.A0s(false);
            A0H.A09(2131970600);
            A0H.A08(2131970597);
            A0H.A0I((DialogInterface.OnClickListener) null, 2131970599);
            W5U.A01(A0H, this, 7, 2131970598);
            DbT.A1V(A0H);
            return true;
        }
        WGU A0M = C13990Tnq.A0M(this.A05);
        PromoteData promoteData = this.A04;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
        A0M.A0B(C16678UzE.NON_DISCRIMINATION, promoteData);
        return false;
    }

    private final void A00(View view, String str) {
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.primary_text);
        View A0G = AnonymousClass7TF.A0G(view, R.id.secondary_text);
        ((CompoundButton) AnonymousClass7TF.A0F(view, R.id.promote_row_checkbox)).setChecked(true);
        A0R.setText(str);
        A0R.setTextSize(0, (float) DbV.A05(this).getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
        A0G.setVisibility(8);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(252716012);
        PromoteData A002 = XAI.A00(this);
        this.A04 = A002;
        UserSession userSession = A002.A0y;
        this.A01 = userSession;
        this.A03 = C18784W1k.A01(this, userSession);
        this.A02 = true;
        C15319UaR.super.onCreate(bundle);
        AnonymousClass0fD.A09(715706506, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(64056957);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_non_discrimination_view, false);
        AnonymousClass0fD.A09(-607454681, A022);
        return A0D;
    }
}
