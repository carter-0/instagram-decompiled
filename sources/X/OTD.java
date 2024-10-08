package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

public final class OTD {
    public final UserSession A00;
    public final C333537Zi A01;

    public OTD(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = C333527Zh.A00(userSession);
    }

    public static final 1aU A00(AnonymousClass2Ep r16, OTD otd, String str) {
        C254763t0 A0g = C66580MXl.A0g(String.valueOf(r16.C6C()));
        return otd.A01.EMt((C70766OKm) null, (C254933tI) null, (OCA) null, (DirectShareTarget) null, 2FW.A1h, A0g, (Integer) null, (Integer) null, str, NetInfoModule.CONNECTION_TYPE_NONE, "external_sheet_send_attribution_text", (String) null, (String) null, (String) null, (List) null, r16.CVE(), false);
    }
}
