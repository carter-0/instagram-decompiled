package X;

import com.instagram.common.session.UserSession;

public final class P1J implements C74447Pv2 {
    public final /* synthetic */ C68443NIg A00;

    public P1J(C68443NIg nIg) {
        this.A00 = nIg;
    }

    public final void CuB() {
        String str;
        C68443NIg nIg = this.A00;
        UserSession userSession = nIg.A00;
        if (userSession == null) {
            str = "userSession";
        } else {
            C69670Nps nps = nIg.A01;
            str = "analyticsData";
            if (nps != null) {
                String str2 = nps.A01;
                0qQ.A07(str2);
                C69670Nps nps2 = nIg.A01;
                if (nps2 != null) {
                    String str3 = nps2.A02;
                    0qQ.A07(str3);
                    DbU.A1R(C3265677h.A01(nIg, "list_new_quick_reply_tap", str2, str3), userSession);
                    C68443NIg.A00(nIg, (C67569Mq3) null);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean DM6(C67569Mq3 mq3) {
        C68443NIg.A00(this.A00, mq3);
        return true;
    }

    public final void DLw(C67569Mq3 mq3) {
        String str;
        String A002 = mq3.A00();
        if (A002 != null) {
            C68443NIg nIg = this.A00;
            UserSession userSession = nIg.A00;
            if (userSession == null) {
                str = "userSession";
            } else {
                C69670Nps nps = nIg.A01;
                str = "analyticsData";
                if (nps != null) {
                    String str2 = nps.A01;
                    0qQ.A07(str2);
                    C69670Nps nps2 = nIg.A01;
                    if (nps2 != null) {
                        String str3 = nps2.A02;
                        0qQ.A07(str3);
                        0xI A01 = C3265677h.A01(nIg, "list_item_tap", str2, str3);
                        A01.A0C("quick_reply_id", A002);
                        DbU.A1R(A01, userSession);
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C68443NIg nIg2 = this.A00;
        C74325Pt1 pt1 = nIg2.A02;
        if (pt1 != null) {
            pt1.DbL(mq3);
        }
        DbT.A1J(nIg2);
    }
}
