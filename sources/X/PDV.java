package X;

import com.instagram.common.session.UserSession;

public final class PDV implements C74410PuQ {
    public final /* synthetic */ OGB A00;

    public final boolean ASy(UserSession userSession, Object obj) {
        long j;
        0qQ.A0B(userSession, 1);
        OGB ogb = this.A00;
        long currentTimeMillis = System.currentTimeMillis();
        1Av r3 = (1Av) ogb.A02.invoke(userSession);
        if (182.A06(0Tu.A06, userSession, 36316001482051424L)) {
            j = r3.A01.getLong("quiet_mode_next_end_timestamp", -1) * 1000;
        } else {
            j = -1;
        }
        if (currentTimeMillis >= j) {
            return true;
        }
        return false;
    }

    public final String AUf(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (2Au.A01(userSession)) {
            return "app setting - sleep mode on";
        }
        return "app setting - quiet mode on";
    }

    public PDV(OGB ogb) {
        this.A00 = ogb;
    }
}
