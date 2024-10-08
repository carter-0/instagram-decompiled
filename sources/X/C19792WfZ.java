package X;

import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.WfZ  reason: case insensitive filesystem */
public final class C19792WfZ implements X79 {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ AnonymousClass3W1 A01;
    public final /* synthetic */ X79 A02;
    public final /* synthetic */ C17902Vht A03;
    public final /* synthetic */ C14192TrX A04;

    public final void DoZ(UpcomingEvent upcomingEvent) {
        0qQ.A0B(upcomingEvent, 0);
        C14192TrX trX = this.A04;
        1Xj r3 = this.A00;
        C14192TrX.A00(r3, this.A01, trX);
        C14192TrX.A01(r3, trX);
        this.A03.A00(r3, this.A02, (UpcomingEventReminderRepository) trX.A08.getValue(), upcomingEvent);
    }

    public final void onFailure() {
    }

    public C19792WfZ(1Xj r1, AnonymousClass3W1 r2, X79 x79, C17902Vht vht, C14192TrX trX) {
        this.A04 = trX;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = vht;
        this.A02 = x79;
    }
}
