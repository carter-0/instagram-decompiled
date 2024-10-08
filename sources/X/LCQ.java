package X;

import com.facebook.common.dextricks.DexOptimization;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

public final class LCQ {
    public final 0wc A00;

    public LCQ(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A02(userSession);
    }

    public final void A00(long j, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, AnonymousClass000.A00(304));
        A0e.A9F("ig_userid", Long.valueOf(j));
        A0e.AAJ("product", "network_call");
        DbS.A1H(A0e, "diversity_info_gql_success");
        DbS.A1J(A0e, RealtimeConstants.SEND_SUCCESS);
        A0e.AAJ("event_source", DexOptimization.OPT_KEY_CLIENT);
        DbV.A1J(A0e, str);
    }
}
