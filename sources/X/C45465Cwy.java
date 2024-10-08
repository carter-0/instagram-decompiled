package X;

import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.common.session.UserSession;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;

/* renamed from: X.Cwy  reason: case insensitive filesystem */
public final class C45465Cwy {
    public UpcomingEventIDType A00;
    public UpcomingEventReminderAction A01;
    public String A02;
    public String A03;

    public final UpcomingEventReminderAction A01() {
        UpcomingEventReminderAction upcomingEventReminderAction = this.A01;
        if (upcomingEventReminderAction != null) {
            return upcomingEventReminderAction;
        }
        0qQ.A0F("eventReminderAction");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A02() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        0qQ.A0F("upcomingEventId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1OC A00(UserSession userSession) {
        String A022 = A02();
        UpcomingEventIDType upcomingEventIDType = this.A00;
        if (upcomingEventIDType != null) {
            return C45709D2i.A00(upcomingEventIDType, userSession, A01(), A022, this.A02);
        }
        0qQ.A0F("eventIdType");
        throw AnonymousClass00P.createAndThrow();
    }
}
