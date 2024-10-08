package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

public final class NVZ extends P1Z {
    public String A00;
    public final O6T A01;
    public final OJX A02;
    public final 1P0 A03 = new NMI((Object) this, 10);
    public final UserSession A04;
    public final AnonymousClass4D6 A05 = 1ES.A01();
    public final String A06;

    public final void CgL() {
        String str = this.A06;
        if (str != null) {
            super.CgL();
            AnonymousClass4D6 r5 = this.A05;
            UserSession userSession = this.A04;
            String str2 = this.A00;
            int i = this.A00;
            1NY A0b = AnonymousClass7TG.A0b(userSession);
            A0b.A0A("direct_v2/in_thread_message_search/");
            A0b.A9m("query", str2);
            A0b.A9m(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
            A0b.A0C("offset", i);
            1OC A0S = DbU.A0S(A0b, NHI.class, OQF.class);
            A0S.A00 = this.A03;
            r5.schedule(A0S);
            return;
        }
        this.A02 = AnonymousClass05K.A0C;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NVZ(UserSession userSession, O6T o6t, OJX ojx, String str, String str2) {
        super(o6t);
        AnonymousClass7TG.A1O(userSession, str);
        this.A04 = userSession;
        this.A00 = str;
        this.A06 = str2;
        this.A01 = o6t;
        this.A02 = ojx;
    }
}
