package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment;
import java.util.BitSet;
import java.util.HashMap;

public final class FNG implements View.OnClickListener {
    public final int A00;
    public final long A01;
    public final Object A02;

    public FNG(Object obj, long j, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }

    public final void onClick(View view) {
        int A05;
        String str;
        int i;
        if (this.A00 != 0) {
            A05 = AnonymousClass0fD.A05(-695790679);
            FO6 fo6 = (FO6) this.A02;
            UserSession userSession = ((TimeSpentReminderFullyBlockingFragment) fo6.A01).A01;
            Fragment fragment = (Fragment) fo6.A04;
            C229382nI A0M = DbT.A0M(fragment, userSession);
            HashMap A1E = AnonymousClass7TE.A1E();
            HashMap A1E2 = AnonymousClass7TE.A1E();
            new BitSet(0);
            A1E.put("requested_extension_time_seconds", Long.valueOf(this.A01));
            A1E.put(AnonymousClass000.A00(806), Long.valueOf(1G0.A00()));
            FBO.A00(new FVR(this, 5), "com.bloks.www.yp.time_limits.time_limit_extension_request_time.async", A1E, A1E2).A01(fragment.requireActivity(), A0M);
            i = 1821583227;
        } else {
            A05 = AnonymousClass0fD.A05(1342525570);
            C49430EvW evW = ((C48013ERa) this.A02).A00;
            if (evW == null) {
                0qQ.A0F("dailyLimitRemindAgainMenuItemListener");
                throw AnonymousClass00P.createAndThrow();
            }
            long j = this.A01;
            TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment = (TimeSpentReminderFullyBlockingFragment) evW.A00.A01;
            0wc A0O = DbX.A0O((AnonymousClass0iw) null, timeSpentReminderFullyBlockingFragment.A01);
            if (j == 300) {
                str = "daily_limit_reminder_in_5_mins_button";
            } else {
                str = "daily_limit_reminder_in_15_mins_button";
            }
            Dbc.A0U(A0O, "daily_limit_reminder", str);
            long A0I = AnonymousClass7TG.A0I();
            2B0.A01.A09(timeSpentReminderFullyBlockingFragment.A01, A0I + j);
            DbT.A1K(timeSpentReminderFullyBlockingFragment);
            2Aq.A03(timeSpentReminderFullyBlockingFragment.A01).A0R();
            i = -1345813632;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
