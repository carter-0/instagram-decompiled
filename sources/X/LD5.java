package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.Date;

public final class LD5 {
    public OVW A00;
    public final Activity A01;
    public final UserSession A02;

    public final void A00(Date date, C62320sa r22, 0sP r23, boolean z) {
        C331157Pu r0;
        Date date2 = date;
        OVW ovw = this.A00;
        if (ovw == null || (r0 = ovw.A00) == null || !r0.A0S()) {
            Activity activity = this.A01;
            this.A00 = new OVW(activity, this.A02, new C65129Lnr(this, r22, r23), AnonymousClass7TE.A16(activity, 2131956671), activity.getString(2131956670), false, true, z, false);
            Calendar instance = Calendar.getInstance();
            instance.add(12, (5 - (instance.get(12) % 5)) + 20);
            Date time = instance.getTime();
            0qQ.A07(time);
            Calendar instance2 = Calendar.getInstance();
            instance2.add(5, 29);
            Date time2 = instance2.getTime();
            0qQ.A07(time2);
            OVW ovw2 = this.A00;
            if (ovw2 != null) {
                if (date == null) {
                    date2 = time;
                }
                ovw2.A01((Boolean) null, (String) null, date2, time, time2, true);
            }
        }
    }

    public LD5(Activity activity, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = activity;
    }
}
