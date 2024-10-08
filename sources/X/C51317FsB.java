package X;

import android.os.Handler;
import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment;

/* renamed from: X.FsB  reason: case insensitive filesystem */
public final class C51317FsB implements Runnable {
    public final /* synthetic */ TimeSpentReminderFullyBlockingFragment A00;

    public C51317FsB(TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment) {
        this.A00 = timeSpentReminderFullyBlockingFragment;
    }

    public final void run() {
        TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment = this.A00;
        if (timeSpentReminderFullyBlockingFragment.A02.ordinal() == 0) {
            if (Dba.A1W(timeSpentReminderFullyBlockingFragment)) {
                C49253Erw.A00(ScreenTimeScreenType.A04, timeSpentReminderFullyBlockingFragment.A01, AnonymousClass7TG.A0I());
            }
            Handler handler = timeSpentReminderFullyBlockingFragment.A06;
            Runnable runnable = timeSpentReminderFullyBlockingFragment.A07;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 10000);
        }
    }
}
