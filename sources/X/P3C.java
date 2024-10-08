package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class P3C implements C74452Pv7 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C62564Khu A02;

    public final 1OC AEX(AnonymousClass1O9 r5, String str) {
        String str2;
        boolean A1W = AnonymousClass7TF.A1W(this.A02, C62564Khu.GIPHY_GIFS);
        1NY A0O = DbU.A0O(this.A01);
        A0O.A02();
        A0O.A0D = "api.giphy.com";
        A0O.A0Q = true;
        A0O.A9m("api_key", "BuzY9ZS4YEbDjxEaN2ZfsOqm1TUD85Ax");
        A0O.A9m("rating", "PG");
        A0O.A9m("lang", "en");
        A0O.A9m("limit", "44");
        A0O.A0R(CGH.class, C45706D2f.class);
        if (!str.isEmpty()) {
            A0O.A9m("q", str);
            if (A1W) {
                str2 = "/v1/gifs/search";
            } else {
                str2 = "/v1/stickers/search";
            }
        } else if (A1W) {
            str2 = "/v1/gifs/trending";
        } else {
            str2 = "/v1/stickers/trending";
        }
        A0O.A0E = str2;
        return A0O.A0M();
    }

    public final /* bridge */ /* synthetic */ List E1w(1XP r6, C62564Khu khu, String str) {
        CGH cgh = (CGH) r6;
        AnonymousClass7TG.A1N(khu, cgh);
        List list = cgh.A01;
        boolean z = true;
        boolean A1W = AnonymousClass7TF.A1W(khu, C62564Khu.GIPHY_STICKERS);
        UserSession userSession = this.A01;
        Boolean valueOf = Boolean.valueOf(A1W);
        if (str.length() != 0) {
            z = false;
        }
        ArrayList A012 = C64129LPd.A01(userSession, valueOf, list, z);
        list.size();
        A012.size();
        return A012;
    }

    public P3C(AnonymousClass0iw r1, UserSession userSession, C62564Khu khu) {
        this.A02 = khu;
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final /* synthetic */ String E1v(1XP r2) {
        return null;
    }
}
