package X;

import android.widget.RadioGroup;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class FQZ implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 2Cd A01;
    public final /* synthetic */ C48026ERp A02;
    public final /* synthetic */ List A03;

    public FQZ(2Cd r1, C48026ERp eRp, List list, long j) {
        this.A03 = list;
        this.A00 = j;
        this.A01 = r1;
        this.A02 = eRp;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        long j;
        String str = ((C70953OTa) this.A03.get(i)).A02;
        if (!0qQ.A0K(str, "off")) {
            0qQ.A0A(str);
            j = (long) Integer.parseInt(str);
        } else {
            j = 0;
        }
        long j2 = j * this.A00;
        long A002 = AnonymousClass3FV.A00();
        2Cd r3 = this.A01;
        long A003 = r3.A00();
        C48026ERp eRp = this.A02;
        r3.A02(eRp, j2);
        AnonymousClass0eM r32 = eRp.A01;
        UserSession A0l = AnonymousClass7TE.A0l(r32);
        EWJ ewj = EWJ.IG_TS_ENTRY_POINT_ACTIVITY_CENTER;
        2Ci.A06(A0l, ewj, "daily_limit", A002, A003, Dba.A01(AnonymousClass7TE.A0l(r32)));
        if (j2 <= 0) {
            UserSession A0l2 = AnonymousClass7TE.A0l(r32);
            2Ci.A02(A0l2, ewj, AnonymousClass05K.A15, Long.valueOf(A003), Long.valueOf(A002), Long.valueOf(Dba.A02(2Aq.A03(AnonymousClass7TE.A0l(r32)), A0l2)), "daily_limit", (Map) null);
        }
    }
}
