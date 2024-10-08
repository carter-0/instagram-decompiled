package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6ub  reason: invalid class name and case insensitive filesystem */
public final class C321696ub {
    public final long A00;
    public final 0wc A01;
    public final String A02;

    public C321696ub(AnonymousClass0iw r3, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 3);
        this.A02 = str;
        this.A01 = AnonymousClass0kN.A01(r3, userSession);
        this.A00 = Long.parseLong(userSession.A06);
    }

    public final void A00(String str, String str2, String str3, String str4, String str5) {
        long j;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        0qQ.A0B(str3, 2);
        0qQ.A0B(str5, 4);
        Long A0n = 00y.A0n(10, str4);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "instagram_smb_partner_flow_consumer");
        long j2 = this.A00;
        A002.A9F("igid", Long.valueOf(j2));
        A002.AAJ("step", "open_deeplink");
        A002.AAJ("action", "open");
        A002.AAJ(Dbp.A00(), this.A02);
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        A002.A7p("is_profile_owner", Boolean.valueOf(z));
        A002.A9F("profile_owner_id", Long.valueOf(j));
        A002.AAJ("service_type", str5);
        A002.A9F("partner_id", 00y.A0n(10, str));
        A002.AAJ("partner_name", str2);
        A002.AAJ("url", str3);
        A002.Cgf();
    }
}
