package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.Set;

public final class Fb4 implements C74469PvP {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C331127Pr A02;
    public final /* synthetic */ 1Yk A03;

    public final void Cye(boolean z) {
    }

    public final void DIJ() {
    }

    public final void DTc() {
    }

    public Fb4(Bundle bundle, UserSession userSession, C331127Pr r3, 1Yk r4) {
        this.A03 = r4;
        this.A01 = userSession;
        this.A00 = bundle;
        this.A02 = r3;
    }

    public final void DEp(String str) {
        1Yy A012 = FC8.A01();
        UserSession userSession = this.A01;
        Bundle bundle = this.A00;
        Set set = C49280EsP.A00;
        String string = bundle.getString("origin", "ssc_invite_notification");
        A012.A06(userSession, this.A03.A00, this.A02, str, string);
    }
}
