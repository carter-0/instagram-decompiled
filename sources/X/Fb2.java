package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

public final class Fb2 implements C74469PvP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public final void Cye(boolean z) {
    }

    public Fb2(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public final void DEp(String str) {
        UserSession userSession;
        int i = this.A00;
        String str2 = str;
        0qQ.A0B(str, 0);
        1Yy A012 = FC8.A01();
        Object obj = this.A03;
        if (i != 0) {
            userSession = ((C50672FgX) obj).A02;
        } else {
            userSession = ((C65274LqT) obj).A00;
        }
        Set set = C49280EsP.A00;
        A012.A06(userSession, (C331157Pu) this.A01, (C331127Pr) this.A02, str2, "profile_subscriber_channel_click");
    }

    public final void DIJ() {
    }

    public final void DTc() {
    }
}
