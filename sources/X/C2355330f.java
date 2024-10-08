package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.30f  reason: invalid class name and case insensitive filesystem */
public final class C2355330f implements C234192xF {
    public boolean A00;
    public final UserSession A01;
    public final 1Av A02;

    public final boolean EvT() {
        return false;
    }

    public final boolean EvU() {
        return false;
    }

    public final void DsF() {
        0xa r3 = this.A02.A01;
        int i = r3.getInt("topics_nux_count", 0);
        0xY AR4 = r3.AR4();
        AR4.E5Z("topics_nux_count", i + 1);
        AR4.apply();
        0xY AR42 = r3.AR4();
        AR42.E5c("topics_nux_seen_timestamp", System.currentTimeMillis());
        AR42.apply();
        this.A00 = true;
    }

    public final boolean EtP() {
        if (this.A00) {
            return false;
        }
        0xa r6 = this.A02.A01;
        int i = r6.getInt("topics_nux_count", 0);
        long currentTimeMillis = System.currentTimeMillis() - r6.getLong("topics_nux_seen_timestamp", 0);
        if (i >= 3) {
            return false;
        }
        if (i == 0 || currentTimeMillis > TimeUnit.DAYS.toMillis(1)) {
            return true;
        }
        return false;
    }

    public C2355330f(UserSession userSession) {
        this.A01 = userSession;
        this.A02 = 1Au.A00(userSession);
    }
}
