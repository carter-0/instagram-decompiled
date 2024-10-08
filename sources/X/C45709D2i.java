package X;

import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.common.session.UserSession;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;

/* renamed from: X.D2i  reason: case insensitive filesystem */
public abstract class C45709D2i {
    public static final 1OC A00(UpcomingEventIDType upcomingEventIDType, UserSession userSession, UpcomingEventReminderAction upcomingEventReminderAction, String str, String str2) {
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("upcoming_events/%s/%s/", new Object[]{upcomingEventReminderAction, str});
        A0a.A9m(AnonymousClass000.A00(1316), upcomingEventIDType.A00);
        if (str2 != null && (!00l.A0W(str2))) {
            A0a.A9m("media_pk", str2);
        }
        A0a.A0Q(1XP.class, 1XY.class);
        A0a.A0R = true;
        return A0a.A0M();
    }

    public static final 1OC A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("upcoming_events/add_event_list/");
        A0b.A0Q(C342577op.class, C342587oq.class);
        return A0b.A0M();
    }
}
