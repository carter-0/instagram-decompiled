package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class IRE implements C59621JQp {
    public final UserSession A00;
    public final C52529GWg A01;
    public final String A02;

    public final int Atn() {
        return 1;
    }

    public final void CIK(Map map) {
    }

    public final void onStart() {
    }

    public final void DED() {
        this.A01.A03(this.A02);
    }

    public final void Dow(C67251sV r3, String str, String str2, String str3, List list) {
        C52551GXc A002 = C52550GXb.A00(this.A00);
        String str4 = this.A02;
        A002.A01(str4, str, str2, list);
        this.A01.A03(str4);
    }

    public IRE(UserSession userSession, C52529GWg gWg, String str) {
        this.A02 = str;
        this.A00 = userSession;
        this.A01 = gWg;
    }
}
