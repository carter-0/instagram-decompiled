package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Haw  reason: case insensitive filesystem */
public abstract class C55025Haw {
    public static final void A00(UserSession userSession, String str, String str2, String str3, int i, int i2, int i3, boolean z) {
        0qQ.A0B(userSession, 0);
        long parseLong = Long.parseLong(userSession.A06);
        C46398DeL A00 = C46400DeN.A00(str);
        Long valueOf = Long.valueOf(parseLong);
        double A002 = (double) 1Q0.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "switcher_impression");
        long A0P = AnonymousClass7TE.A0P(System.currentTimeMillis() - C64031Cc.A07);
        if (A0e.isSampled()) {
            A0e.A9F("raw_initiator_account_id", valueOf);
            A0e.A9F("initiator_identity_id", valueOf);
            DbW.A12(A0e, A002);
            A0e.AAJ("event_session_id", str2);
            DbS.A1F(A00, A0e);
            A0e.A7p("is_cds", AnonymousClass7TE.A0v());
            C46397DeK deK = C46397DeK.INSTAGRAM;
            0eP A0x = AnonymousClass7TF.A0x(deK, i);
            C46397DeK deK2 = C46397DeK.FACEBOOK;
            Integer valueOf2 = Integer.valueOf(i3);
            A0e.A9H("number_of_account_logged_in_by_type", Dbb.A0e(deK2, valueOf2, A0x));
            A0e.A9H("number_of_account_shown_by_type", Dbb.A0e(deK2, valueOf2, AnonymousClass7TF.A0x(deK, i2)));
            A0e.A8M(deK, "initiator_account_type");
            DbS.A1H(A0e, str3);
            A0e.A7p("snooze_eligible", Boolean.valueOf(z));
            A0e.A9F("num_ig_horizontal_accounts_without_gql_data", Long.valueOf(A0P));
            A0e.A7p("shared_accounts_flows_enabled", false);
            A0e.Cgf();
        }
    }
}
