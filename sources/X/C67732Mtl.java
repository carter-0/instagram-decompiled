package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;

/* renamed from: X.Mtl  reason: case insensitive filesystem */
public final class C67732Mtl extends 2YL {
    public final 1Xj A00;
    public final UpcomingEventReminderRepository A01;
    public final UpcomingEvent A02;
    public final AnonymousClass0r6 A03;
    public final 05G A04;
    public final UserSession A05;

    public C67732Mtl(UserSession userSession, 1Xj r11, UpcomingEventReminderRepository upcomingEventReminderRepository, UpcomingEvent upcomingEvent) {
        N4F n4f;
        ImageUrl imageUrl;
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
        this.A02 = upcomingEvent;
        this.A00 = r11;
        this.A01 = upcomingEventReminderRepository;
        if (upcomingEvent != null) {
            boolean A06 = 182.A06(0Tu.A05, userSession, 36324282179137470L);
            Integer num = AnonymousClass05K.A01;
            boolean reminderEnabled = upcomingEvent.getReminderEnabled();
            User BZw = upcomingEvent.BZw();
            if (BZw == null && (r11 == null || (BZw = C51966G9m.A11(r11)) == null)) {
                imageUrl = null;
            } else {
                imageUrl = BZw.Bh3();
            }
            n4f = new N4F(imageUrl, num, upcomingEvent.getTitle(), 0sn.A00, upcomingEvent.getStartTime(), reminderEnabled, A06);
        } else {
            n4f = new N4F((ImageUrl) null, AnonymousClass05K.A00, "", 0sn.A00, 0, false, false);
        }
        02z A012 = 106.A01(n4f);
        this.A04 = A012;
        this.A03 = 10b.A03(A012);
    }
}
