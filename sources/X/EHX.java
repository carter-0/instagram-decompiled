package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

public final class EHX extends 2Cl {
    public final /* synthetic */ 2Aq A00;

    public final int getRunnableId() {
        return 732786309;
    }

    public EHX(2Aq r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        2Aq r0 = this.A00;
        UserSession userSession = r0.A05;
        List A05 = 2Aq.A05(r0);
        long A0P = r0.A0P();
        AnonymousClass7TG.A1N(userSession, A05);
        ArrayList A04 = C280074zx.A00.A04(userSession);
        Double d = null;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession), "ig_time_spent_screen_time");
        DbS.A1J(A0e, "ig_ts_screen_time_data_fetch_retry_upload");
        A0e.A8D("usage_seconds", Double.valueOf((double) AnonymousClass3FV.A00()));
        A0e.AAe("weekly_screen_time", A05);
        A0e.A8D("session_length", Double.valueOf((double) A0P));
        Number number = (Number) 00k.A0O(A04, A04.size() - 1);
        if (number != null) {
            d = Double.valueOf((double) number.longValue());
        }
        A0e.A8D("aggregated_screen_time_today", d);
        if (!A05.isEmpty()) {
            String id = TimeZone.getDefault().getID();
            0qQ.A07(id);
            A0e.AAJ("timezone", id);
        }
        A0e.Cgf();
        return null;
    }
}
