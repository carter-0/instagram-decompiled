package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

public final class KEL extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final String A02;
    public final String A03 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
    public final boolean A04;

    public KEL(AnonymousClass0iw r3, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r3;
        this.A02 = str;
        this.A04 = true;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        C339657jx A002 = C339637jv.A00(userSession);
        AnonymousClass0iw r4 = this.A00;
        String str = this.A03;
        String str2 = this.A02;
        return new C60204JhN(A002, new C64104LMy(r4, userSession, str, str2, (String) null), str2, this.A04);
    }
}
