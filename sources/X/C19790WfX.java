package X;

import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.WfX  reason: case insensitive filesystem */
public final class C19790WfX implements X79 {
    public final /* synthetic */ C15374UbS A00;
    public final /* synthetic */ X79 A01;
    public final /* synthetic */ C17902Vht A02;

    public final void DoZ(UpcomingEvent upcomingEvent) {
        0qQ.A0B(upcomingEvent, 0);
        C15374UbS ubS = this.A00;
        C15374UbS.A04(ubS, upcomingEvent);
        this.A02.A00(C15374UbS.A00(ubS), this.A01, (UpcomingEventReminderRepository) ubS.A0L.getValue(), upcomingEvent);
    }

    public final void onFailure() {
    }

    public C19790WfX(C15374UbS ubS, X79 x79, C17902Vht vht) {
        this.A00 = ubS;
        this.A02 = vht;
        this.A01 = x79;
    }
}
