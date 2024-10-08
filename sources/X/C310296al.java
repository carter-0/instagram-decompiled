package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6al  reason: invalid class name and case insensitive filesystem */
public final class C310296al {
    public final UserSession A00;
    public final C61410nE A01;
    public final AnonymousClass2fP A02;
    public final C310286ak A03;

    public C310296al(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        AnonymousClass2fP A002 = AnonymousClass2fO.A00(userSession);
        C310286ak A003 = C310266ai.A00(userSession);
        C61410nE r1 = C61410nE.A00;
        0qQ.A0B(A003, 3);
        0qQ.A0B(r1, 4);
        this.A00 = userSession;
        this.A02 = A002;
        this.A03 = A003;
        this.A01 = r1;
    }

    public final boolean A00(UpcomingEvent upcomingEvent) {
        Long l;
        long A022;
        0qQ.A0B(upcomingEvent, 0);
        Long BLB = upcomingEvent.BLB();
        if (BLB != null) {
            l = Long.valueOf(TimeUnit.SECONDS.toMillis(BLB.longValue()));
        } else {
            l = null;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (l != null) {
            A022 = l.longValue();
        } else {
            A022 = C18810W3l.A02(upcomingEvent);
        }
        if (timeUnit.toMinutes(A022) - 15 <= timeUnit.toMinutes(System.currentTimeMillis())) {
            return false;
        }
        return true;
    }

    public final boolean A01(UpcomingEvent upcomingEvent) {
        0qQ.A0B(upcomingEvent, 0);
        Boolean A0M = this.A02.A0M(upcomingEvent);
        UpcomingEvent A002 = this.A03.A00(upcomingEvent.getId());
        if (A0M != null) {
            return A0M.booleanValue();
        }
        if (A002 != null) {
            return A002.getReminderEnabled();
        }
        return upcomingEvent.getReminderEnabled();
    }
}
