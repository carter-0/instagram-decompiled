package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Oro  reason: case insensitive filesystem */
public final class C71847Oro implements X6L {
    public final int A00;
    public final Object A01;

    public C71847Oro(C66762Mc7 mc7, int i) {
        this.A00 = i;
        this.A01 = mc7;
    }

    public final void DED() {
        String str;
        int i = this.A00;
        C66762Mc7 mc7 = (C66762Mc7) this.A01;
        if (i != 0) {
            C59689JTv.A0F(mc7.A0E, "promote_ads_manager_toast_update_error_rebranding", 2131970170);
            return;
        }
        C3725791l r4 = mc7.A07;
        String str2 = mc7.A0D;
        if (str2 == null) {
            str = "threadIdV2";
        } else {
            String str3 = mc7.A0C;
            if (str3 == null) {
                str = "participantId";
            } else {
                String str4 = mc7.A0B;
                if (str4 == null) {
                    str = "adMediaId";
                } else {
                    C3725791l.A00(r4, "direct_in_thread_ctd_banner_access_token_fetch_failed", str2, str3, AnonymousClass7TF.A0w("media_id", str4));
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Doe(String str) {
        1OC r1;
        1P0 r0;
        String str2;
        if (this.A00 != 0) {
            0qQ.A0B(str, 0);
            C66762Mc7 mc7 = (C66762Mc7) this.A01;
            UserSession userSession = mc7.A0G;
            N3P n3p = mc7.A08;
            if (n3p == null) {
                str2 = "activeAdModel";
            } else {
                String str3 = n3p.A0D;
                String str4 = WGU.A00(userSession).A03;
                0qQ.A07(str4);
                r1 = C18146VmM.A01(userSession, str3, (String) null, str, str4);
                mc7.A04 = r1;
                r0 = mc7.A0I;
                r1.A00 = r0;
                1ES.A03(r1);
                return;
            }
        } else {
            0qQ.A0B(str, 0);
            C66762Mc7 mc72 = (C66762Mc7) this.A01;
            UserSession userSession2 = mc72.A0G;
            String str5 = mc72.A0B;
            if (str5 == null) {
                str2 = "adMediaId";
            } else {
                String str6 = mc72.A0C;
                if (str6 == null) {
                    str2 = "participantId";
                } else {
                    0qQ.A0B(userSession2, 0);
                    1NY A0a = AnonymousClass7TG.A0a(userSession2);
                    A0a.A0A("direct_v2/in_thread_ctd_banner_context/");
                    A0a.A9m("ig_media_id", str5);
                    A0a.A0C("page_id", 0);
                    A0a.A9m("other_participant_id", str6);
                    A0a.A9m("fb_auth_token", str);
                    r1 = DbU.A0S(A0a, C15236UWw.class, C18112Vlg.class);
                    mc72.A03 = r1;
                    r0 = mc72.A0H;
                    r1.A00 = r0;
                    1ES.A03(r1);
                    return;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
