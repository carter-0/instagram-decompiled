package X;

import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.WfW  reason: case insensitive filesystem */
public final class C19789WfW implements X79 {
    public final /* synthetic */ C15374UbS A00;
    public final /* synthetic */ C17902Vht A01;

    public final void DoZ(UpcomingEvent upcomingEvent) {
        0qQ.A0B(upcomingEvent, 0);
        C15374UbS ubS = this.A00;
        C15374UbS.A04(ubS, upcomingEvent);
        this.A01.A00(C15374UbS.A00(ubS), (X79) null, (UpcomingEventReminderRepository) ubS.A0L.getValue(), upcomingEvent);
    }

    public final void onFailure() {
    }

    public C19789WfW(C15374UbS ubS, C17902Vht vht) {
        this.A00 = ubS;
        this.A01 = vht;
    }
}
