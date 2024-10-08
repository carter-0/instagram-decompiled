package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.DiY  reason: case insensitive filesystem */
public abstract class C46653DiY {
    public static final void A00(AnonymousClass36X r4, UserSession userSession, String str, String str2, String str3, String str4, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "fx_growth_identity_syncing");
        if (A0e.isSampled()) {
            A0e.AAJ(TraceFieldType.AdhocEventName, str);
            if (r4 == null) {
                r4 = AnonymousClass36X.FX_UNKNOWN;
            }
            DbS.A1F(r4, A0e);
            A0e.AAJ("flow_type", str2);
            A0e.A9F("initiator_account_id", AnonymousClass7TE.A10(userSession.A06));
            A0e.A8M(C46397DeK.INSTAGRAM, "initiator_account_type");
            A0e.AAJ("origin", str3);
            A0e.AAJ("from_value", (String) null);
            A0e.AAJ("to_value", str4);
            A0e.A9H("additional_info", map);
            A0e.Cgf();
        }
    }
}
