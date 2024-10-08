package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Gut  reason: case insensitive filesystem */
public final class C53826Gut extends C251343mx {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final JQ3 A02;
    public final C59620JQo A03;
    public final C52644GaI A04;
    public final HashMap A05;
    public final HashMap A06;

    public final C251263mp A0X(AnonymousClass3Y5 r9) {
        C52644GaI gaI = this.A04;
        if (gaI.A0C) {
            return new GZ9(this.A00, this.A01, this.A02, gaI, this.A03, this.A05, this.A06);
        }
        return null;
    }

    public C53826Gut(AnonymousClass0iw r2, UserSession userSession, JQ3 jq3, C59620JQo jQo, C52644GaI gaI, HashMap hashMap, HashMap hashMap2) {
        C51974G9v.A1L(r2, userSession, hashMap);
        AnonymousClass7TF.A1E(hashMap2, 5, jQo);
        this.A00 = r2;
        this.A01 = userSession;
        this.A04 = gaI;
        this.A06 = hashMap;
        this.A05 = hashMap2;
        this.A02 = jq3;
        this.A03 = jQo;
    }
}
