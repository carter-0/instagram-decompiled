package X;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

public final class ESI extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AccountPrivacyOptionFragment";
    public Dialog A00;
    public Dialog A01;
    public C61057Jvv A02;
    public 0wc A03;
    public 1vn A04;
    public ED2 A05;
    public PR9 A06;
    public PR9 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public PR9 A0D;
    public final AnonymousClass0eM A0E = C227642jf.A02(this);
    public final FX1 A0F = FX1.A00(this, 29);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131962999);
    }

    public final String getModuleName() {
        return "account_privacy_option";
    }

    public static final void A07(UserSession userSession, ESI esi) {
        1vn r2 = esi.A04;
        if (r2 != null) {
            C49794F7e.A00(esi.requireContext(), userSession, r2, "IG_PROFILE_PRIVACY", new C20705Wxc(esi, 17), new C20705Wxc(esi, 18));
        }
    }

    public static final void A08(ESI esi, User user) {
        FPG fpg = new FPG(51, (Object) user, (Object) esi);
        C331127Pr A0f = DbX.A0f(esi.A0E);
        DbZ.A0z(esi.requireActivity(), A0f, 2131973412);
        A0f.A0U = new FmG(esi, 10);
        A0f.A0g = esi.requireActivity().getString(2131973410);
        A0f.A0K = fpg;
        A0f.A16 = false;
        C331157Pu A002 = A0f.A00();
        A002.A0Q(true);
        E1Z e1z = new E1Z();
        e1z.A00 = new C49394Euw(A002);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("ARG_PRIVACY_SWITCH_TO_PRIVATE", false);
        A0a.putBoolean("ARG_IS_REDESIGN", true);
        A002.A02(DbU.A0I(A0a, e1z, esi), e1z);
        esi.A08 = true;
    }

    public static final void A0A(ESI esi, boolean z) {
        2Rw AZK;
        PR9 pr9 = esi.A0D;
        if (pr9 != null) {
            pr9.A0D = z;
        }
        if (esi.mView != null && (AZK = esi.getScrollingViewProxy().AZK()) != null) {
            AZK.notifyDataSetChanged();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    public static final ArrayList A06(ESI esi) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        0eE r0 = AnonymousClass0t1.A01;
        ESI esi2 = esi;
        AnonymousClass0eM r9 = esi2.A0E;
        User A0l = DbX.A0l(r0, r9);
        C61057Jvv jvv = esi2.A02;
        if (jvv != null) {
            A1C.add(jvv);
        }
        PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) new FQ1(11, A0l, esi2), (C358618bC) new FdT(9, A0l, esi2), 2131969756, AnonymousClass7TF.A1W(A0l.A0N(), AnonymousClass05K.A0C));
        esi2.A0D = pr9;
        pr9.A0E = AnonymousClass7TF.A1V(esi2.A02);
        A1C.add(pr9);
        FGF.A01(A1C, 2131970935);
        Uri A092 = DbT.A09(SQU.A01(esi2.requireActivity(), "https://help.instagram.com/116024195217477?ref=igapp"));
        String A0m = DbU.A0m(esi2, 2131964884);
        C47518E6c.A03(A092, esi2, A0m, A1C, 2131969757);
        0lg A0X = DbT.A0X(r9);
        0Tu r8 = 0Tu.A05;
        if (182.A06(r8, A0X, 36315400187022504L)) {
            DbV.A1W(A1C, true);
            PR9 A0f = DbS.A0f(new FQ1(12, A0l, esi2), 2131961853, false);
            esi2.A06 = A0f;
            A0f.A0D = AnonymousClass7TG.A1X(A0l.A03.Ca1());
            A1C.add(esi2.A06);
            C47518E6c.A03(DbT.A09(SQU.A01(esi2.requireActivity(), "https://help.instagram.com/557544397610546?ref=igapp")), esi2, A0m, A1C, 2131961852);
        }
        if (182.A06(r8, DbT.A0X(r9), 36314077336897932L)) {
            if (A0l.A0N() != AnonymousClass05K.A01) {
                esi2.A07 = null;
                esi2.A0A = false;
            } else if (!esi2.A0A) {
                1vn r5 = esi2.A04;
                if (r5 != null) {
                    2IS A042 = C41845B3m.A04();
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(DbU.A0J(A042, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0l.getId()), "IGSeoIndexingOptOut", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), BqK.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fetch__XDTUserDict", AnonymousClass7TE.A1C());
                    r5.ATL(FS2.A00, new FSG(3, A0l, esi2), pandoGraphQLRequest);
                    return A1C;
                }
            } else if (esi2.A07 == null && A0l.A03.CSJ() != null) {
                DbV.A1W(A1C, true);
                PR9 A0f2 = DbS.A0f(new FQ1(10, A0l, esi2), 2131973121, AnonymousClass7TF.A1Y(A0l.A03.CSJ(), true));
                esi2.A07 = A0f2;
                A1C.add(A0f2);
                C47518E6c.A03(DbT.A09(SQU.A01(esi2.requireActivity(), "https://help.instagram.com/147542625391305?ref=igapp")), esi2, DbU.A0m(esi2, 2131964884), A1C, 2131973120);
                return A1C;
            }
        }
        return A1C;
    }

    public static final void A09(ESI esi, User user, Integer num, boolean z) {
        String str;
        user.A0q(num);
        AnonymousClass0eM r3 = esi.A0E;
        C49905FEd.A01(AnonymousClass7TE.A0l(r3));
        if (esi.isVisible()) {
            boolean A1R = AnonymousClass7TF.A1R(C49017Ent.A00(AnonymousClass7TE.A0l(r3)).A00);
            esi.A05 = new ED2(esi.requireContext(), AnonymousClass7TE.A0l(r3), new C47934ENl(esi, user, z));
            1NY A0a = AnonymousClass7TG.A0a(DbT.A0X(r3));
            if (user.A0N() == AnonymousClass05K.A0C) {
                str = "accounts/set_private/";
            } else {
                str = "accounts/set_public/";
            }
            A0a.A0E = str;
            A0a.A0H("send_approved_friendships_notif", A1R);
            FVE fve = new FVE(2);
            int i = 15p.A09;
            Dbb.A1K(A0a, fve, AnonymousClass7TE.A0l(r3));
            1OC A0K = DbW.A0K(A0a);
            A0K.A00 = esi.A05;
            esi.schedule(A0K);
        }
        C229102mq.A00(esi.requireActivity()).A0z("account_privacy_options_fragment_request_key", AnonymousClass7TE.A0a());
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1708076526);
        super.onCreate(bundle);
        AnonymousClass0eM r5 = this.A0E;
        this.A03 = DbX.A0P(this, r5);
        this.A04 = Dba.A0G(r5);
        0lg A0X = DbT.A0X(r5);
        1NY A0M = DbZ.A0M(A0X);
        A0M.A0A("friendships/pending_follow_requests_count/");
        1OC A0S = DbU.A0S(A0M, C47310Dud.class, F4T.class);
        C47696EDf.A01(A0S, A0X, 31);
        1ES.A03(A0S);
        A07(AnonymousClass7TE.A0l(r5), this);
        DbX.A0R(r5).A01(this.A0F, FWR.class);
        AnonymousClass0fD.A09(1902045060, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(2126517251);
        ESI.super.onPause();
        this.A0C = this.A08;
        AnonymousClass0fD.A09(2034380244, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1943588041);
        super.onResume();
        setItems(A06(this));
        if (this.A0C && !this.A08) {
            A08(this, DbX.A0l(AnonymousClass0t1.A01, this.A0E));
        }
        1NY A0M = DbZ.A0M(DbT.A0X(this.A0E));
        A0M.A0A("users/get_is_eligible_restrict_message_settings/");
        C47696EDf.A00(this, DbU.A0S(A0M, DvN.class, C49796F7h.class), 26);
        AnonymousClass0fD.A09(-1361867913, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-235647477);
        ESI.super.onStop();
        ED2 ed2 = this.A05;
        if (ed2 != null) {
            ed2.A00 = null;
        }
        DbX.A0R(this.A0E).A02(this.A0F, FWR.class);
        AnonymousClass0fD.A09(-1656804753, A022);
    }
}
