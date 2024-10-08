package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

/* renamed from: X.Rhy  reason: case insensitive filesystem */
public abstract class C9836Rhy {
    public static final void A00(C11242SHc sHc, 0sP r14, 0sP r15, boolean z) {
        0qQ.A0B(sHc, 0);
        UserSession userSession = sHc.A01;
        C11423SSz A00 = Ri1.A00(userSession);
        if (z || !A00.A03.contains("browser_link_history_opt_in_key")) {
            C11242SHc.A00(sHc, "opt_in_status_read_started", (String) null);
            C74188PqU pqU = new C74188PqU(47, (Object) A00, (Object) sHc, (Object) r14);
            MPB mpb = new MPB(11, (Object) sHc, (Object) r15);
            1vn A01 = 1vm.A01(userSession);
            C12090Smk.A00(new C45926DFg(pqU, 18), new PandoGraphQLRequest(C41845B3m.A05(), "IABLinkHistorySettingsQuery", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), C42934Bnc.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xig_link_history_settings_from_ig_user", AnonymousClass7TE.A1C()), A01, mpb, 12);
            return;
        }
        r14.invoke(A00.A05());
    }
}
