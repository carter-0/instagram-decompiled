package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PPh  reason: case insensitive filesystem */
public final class C72923PPh implements C336227eH {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C72923PPh(UserSession userSession, String str, String str2, boolean z) {
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = z;
        this.A01 = str2;
    }

    public final 1OC AMt(String str) {
        UserSession userSession = this.A00;
        String str2 = this.A02;
        boolean z = this.A03;
        String str3 = this.A01;
        1NY A0O = DbU.A0O(userSession);
        A0O.A0A("direct_v2/direct_invite_main/");
        A0O.A0F = str2;
        A0O.A0R(CGT.class, D15.class);
        if (z && str3 != null) {
            A0O.A9m("next_page_cursor", str3);
        }
        return A0O.A0M();
    }
}
