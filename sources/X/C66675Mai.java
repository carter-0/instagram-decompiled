package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mai  reason: case insensitive filesystem */
public abstract class C66675Mai implements 2IR {
    public final UserSession A00;

    public void A00(AnonymousClass3JD r7, UserSession userSession) {
        C250663lr A0U;
        C250663lr optionalTreeField;
        C69032NdK ndK = (C69032NdK) this;
        if (r7 != null && (A0U = C41845B3m.A0U(r7)) != null && (optionalTreeField = A0U.getOptionalTreeField(0, "xfb_igd_pending_request_count(pending_thread_filters:$pending_thread_filters)", C7771QWi.class, 2024816836)) != null) {
            AnonymousClass43G.A01(ndK.A00, optionalTreeField.getCoercedIntField(0, "pending_requests_total"), optionalTreeField.getCoercedIntField(1, "unread_pending_requests"));
        }
    }

    public void A01(UserSession userSession, Throwable th) {
        AnonymousClass7TE.A0e(AnonymousClass0kN.A01(((C69032NdK) this).A00.A00, userSession), "direct_gql_fetch_pending_request_fail_falco_event").Cgf();
    }

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        UserSession userSession = this.A00;
        if (!userSession.hasEnded()) {
            A01(userSession, th);
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass3JD r3 = (AnonymousClass3JD) obj;
        UserSession userSession = this.A00;
        if (!userSession.hasEnded()) {
            A00(r3, userSession);
        }
    }

    public C66675Mai(UserSession userSession) {
        this.A00 = userSession;
    }
}
