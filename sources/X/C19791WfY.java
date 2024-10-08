package X;

import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.WfY  reason: case insensitive filesystem */
public final class C19791WfY implements X79 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C19791WfY(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public final void DoZ(UpcomingEvent upcomingEvent) {
        int i = this.A00;
        0qQ.A0B(upcomingEvent, 0);
        if (i != 0) {
            C14192TrX trX = (C14192TrX) this.A04;
            1Xj r3 = (1Xj) this.A01;
            C14192TrX.A00(r3, (AnonymousClass3W1) this.A03, trX);
            C14192TrX.A01(r3, trX);
            ((C17902Vht) this.A02).A00(r3, (X79) null, (UpcomingEventReminderRepository) trX.A08.getValue(), upcomingEvent);
            return;
        }
        ((C310326ao) ((C17932ViN) this.A04).A06.getValue()).A00((1Xj) this.A01, (C69634NpG) this.A02, (UpcomingEvent) this.A03, (Integer) null).A01(upcomingEvent.getReminderEnabled());
    }

    public final void onFailure() {
    }
}
