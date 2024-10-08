package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteIntegrityCheckDataModel;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;

/* renamed from: X.W1k  reason: case insensitive filesystem */
public final class C18784W1k {
    public C18601Vuu A00;
    public C18601Vuu A01;
    public final WGU A02;
    public final PromoteData A03;
    public final PromoteState A04;
    public final AnonymousClass1O8 A05 = new AnonymousClass1O8();
    public final AnonymousClass1O8 A06 = new AnonymousClass1O8();
    public final C228602lw A07;
    public final UserSession A08;
    public final 0mM A09;
    public final 0mM A0A;
    public final FragmentActivity A0B;

    public static AnonymousClass9JK A00(C18784W1k w1k, String str, String str2) {
        String str3 = str;
        BoostFlowType boostFlowType = w1k.A03.A0l;
        CallerContext A012 = CallerContext.A01("PromoteDataFetcher");
        if (str == null) {
            str3 = "";
        }
        if (boostFlowType == null) {
            boostFlowType = BoostFlowType.ORIGINAL;
        }
        return new AnonymousClass9JK(A012, "ig_android_promote_ads_manager_ig_to_fb_boost_media", str3, boostFlowType.toString(), str2);
    }

    public final void A04(C16678UzE uzE, UserSession userSession) {
        String str;
        PromoteData promoteData = this.A03;
        PromoteIntegrityCheckDataModel promoteIntegrityCheckDataModel = promoteData.A0u;
        promoteIntegrityCheckDataModel.A00 = null;
        promoteIntegrityCheckDataModel.A01 = false;
        LeadForm leadForm = promoteData.A16;
        if (leadForm == null) {
            str = null;
        } else {
            str = leadForm.A03;
        }
        String str2 = promoteData.A1A;
        WGU wgu = this.A02;
        String str3 = wgu.A03;
        String str4 = promoteData.A1S;
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        XIGIGBoostCallToAction A012 = C18779W1e.A01(promoteData);
        String str5 = promoteData.A1I;
        1NY A0N = DbU.A0N(userSession);
        C13990Tnq.A1C(A0N, "ads/promote/validate_integrity_v2/", str2);
        A0N.A9m("flow_id", str3);
        JTO.A1W(A0N, str4);
        A0N.A9m("destination", xIGIGBoostDestination.toString());
        A0N.A9m("call_to_action", A012.toString());
        A0N.A9m("is_political_ad", "false");
        A0N.A0G("lead_gen_form_id", str);
        A0N.A0G("website_url", str5);
        A02(this, new C15421UcX(wgu, this, uzE, W2x.A01("/api/v1/ads/promote/validate_integrity_v2/"), 0), DbT.A0S(A0N, UXU.class, C18157VmX.class));
    }

    public static void A02(C18784W1k w1k, 1P0 r1, 1OC r2) {
        r2.A00 = r1;
        w1k.A07.schedule(r2);
    }

    public final String A03(String str, String str2) {
        C375999Gd r2;
        String str3 = this.A03.A1B;
        if (str3 != null) {
            return str3;
        }
        UserSession userSession = this.A08;
        VVL vvl = (VVL) ((AnonymousClass9F7) AnonymousClass9F3.A00(userSession).A00.getValue()).Au3(A00(this, str, str2));
        if (vvl == null || (r2 = vvl.A01) == null || r2.A00(A00(this, str, str2), userSession) == null) {
            return str3;
        }
        return r2.A00(A00(this, str, str2), userSession);
    }

    public final void A05(X6O x6o) {
        String str = this.A03.A1A;
        UserSession userSession = this.A08;
        1NY A0O = DbU.A0O(userSession);
        A0O.A0A("business/account/get_linked_whatsapp_account_info/");
        A0O.A0G("fb_auth_token", str);
        1OC A0S = DbT.A0S(A0O, C15249UXj.class, C18159VmZ.class);
        if (DbT.A0j(userSession).A1d()) {
            C228602lw r1 = this.A07;
            C15619Ufl.A00(A0S, this, x6o, 4);
            r1.schedule(A0S);
        }
    }

    public final void A06(C15623Ufp ufp) {
        String obj;
        UserSession userSession = this.A08;
        PromoteData promoteData = this.A03;
        String str = promoteData.A1S;
        String str2 = promoteData.A1A;
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        String str3 = this.A02.A03;
        ImmutableList A032 = promoteData.A03();
        1NY A0N = DbU.A0N(userSession);
        C51968G9o.A1K(A0N, "ads/promote/available_audiences_v2/", str);
        A0N.A9m("fb_auth_token", str2);
        A0N.A9m("flow_id", str3);
        if (xIGIGBoostDestination == null) {
            obj = null;
        } else {
            obj = xIGIGBoostDestination.toString();
        }
        A0N.A0G("destination", obj);
        A0N.A0R(C15242UXc.class, C18151VmR.class);
        if (A032 != null) {
            A0N.A9m("regulated_categories", C51970G9q.A0k(A032));
        }
        1OC A0M = A0N.A0M();
        ufp.A02 = W2x.A01("/api/v1/ads/promote/available_audiences_v2/");
        A02(this, ufp, A0M);
    }

    public final void A07(String str) {
        UserSession userSession = this.A08;
        C16899VAc.A00(A00(this, str, "initial_fetch"), new WO2(this, 4), userSession);
        AnonymousClass9JK A002 = A00(this, str, "initial_fetch");
        WO2 wo2 = new WO2(this, 5);
        0qQ.A0B(userSession, 0);
        new C17796Vg9(userSession).A00(A002, AnonymousClass9F1.A00, wo2);
    }

    public C18784W1k(FragmentActivity fragmentActivity, AnonymousClass07Z r8, UserSession userSession) {
        C18601Vuu vuu = C18601Vuu.A02;
        this.A01 = vuu;
        this.A00 = vuu;
        0mM r4 = new 0mM(AnonymousClass7TF.A0D(), new C19303WTl(this, 1), 300);
        this.A0A = r4;
        0mM r2 = new 0mM(AnonymousClass7TF.A0D(), new C19303WTl(this, 2), 300);
        this.A09 = r2;
        this.A08 = userSession;
        this.A0B = fragmentActivity;
        this.A07 = DbW.A0Q(fragmentActivity, r8);
        this.A03 = ((XAI) fragmentActivity).Bhh();
        this.A04 = ((XA9) fragmentActivity).Bhj();
        this.A02 = WGU.A00(userSession);
        r4.A00 = new C19300WTi(this);
        r2.A00 = new C19299WTh(this);
    }

    public static C18784W1k A01(Fragment fragment, UserSession userSession) {
        return new C18784W1k(fragment.requireActivity(), fragment, userSession);
    }
}
