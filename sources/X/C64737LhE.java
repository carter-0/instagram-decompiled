package X;

import android.app.Activity;
import android.os.Build;
import java.util.Map;

/* renamed from: X.LhE  reason: case insensitive filesystem */
public final class C64737LhE implements 1DN {
    public C62320sa A00 = MK5.A00;
    public C62320sa A01 = MK6.A00;
    public boolean A02;
    public boolean A03;
    public final Activity A04;

    public final void DWm(Map map) {
        C62320sa r0;
        0qQ.A0B(map, 0);
        boolean z = false;
        this.A03 = false;
        C346927vz A002 = C2604245p.A00(map);
        if (A002 == C346927vz.DENIED_DONT_ASK_AGAIN) {
            z = true;
        }
        this.A02 = z;
        if (A002 == C346927vz.GRANTED || C2604245p.A03(this.A04)) {
            r0 = this.A01;
        } else {
            r0 = this.A00;
        }
        r0.invoke();
    }

    public final String A00() {
        Activity activity;
        int i;
        if (Build.VERSION.SDK_INT >= 33) {
            activity = this.A04;
            if (activity.getApplicationInfo().targetSdkVersion >= 33) {
                i = 2131962962;
                return DbY.A0c(activity, C51967G9n.A0p(activity, i), 2131962971);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        activity = this.A04;
        i = 2131962970;
        if (i2 >= 30) {
            i = 2131962936;
        }
        return DbY.A0c(activity, C51967G9n.A0p(activity, i), 2131962971);
    }

    public C64737LhE(Activity activity) {
        this.A04 = activity;
    }
}
