package X;

import com.instagram.common.session.UserSession;

public final class P1K implements C74447Pv2 {
    public final /* synthetic */ NJP A00;

    public final boolean DM6(C67569Mq3 mq3) {
        return false;
    }

    public P1K(NJP njp) {
        this.A00 = njp;
    }

    public final void CuB() {
        String str;
        NJP njp = this.A00;
        UserSession userSession = njp.A00;
        if (userSession == null) {
            str = "userSession";
        } else {
            C69670Nps nps = njp.A01;
            str = "analyticsData";
            if (nps != null) {
                String str2 = nps.A01;
                0qQ.A07(str2);
                C69670Nps nps2 = njp.A01;
                if (nps2 != null) {
                    String str3 = nps2.A02;
                    0qQ.A07(str3);
                    DbU.A1R(C3265677h.A01(njp, "list_new_quick_reply_tap", str2, str3), userSession);
                    NJP.A00(njp, (C67569Mq3) null);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DLw(C67569Mq3 mq3) {
        String str;
        String A002 = mq3.A00();
        if (A002 != null) {
            NJP njp = this.A00;
            UserSession userSession = njp.A00;
            if (userSession == null) {
                str = "userSession";
            } else {
                C69670Nps nps = njp.A01;
                str = "analyticsData";
                if (nps != null) {
                    String str2 = nps.A01;
                    0qQ.A07(str2);
                    C69670Nps nps2 = njp.A01;
                    if (nps2 != null) {
                        String str3 = nps2.A02;
                        0qQ.A07(str3);
                        0xI A01 = C3265677h.A01(njp, "list_item_tap", str2, str3);
                        A01.A0C("quick_reply_id", A002);
                        DbU.A1R(A01, userSession);
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        NJP.A00(this.A00, mq3);
    }
}
