package X;

import com.instagram.user.model.UpcomingEvent;

public final class PRV implements X79 {
    public final /* synthetic */ C67732Mtl A00;
    public final /* synthetic */ UpcomingEvent A01;
    public final /* synthetic */ boolean A02;

    public PRV(C67732Mtl mtl, UpcomingEvent upcomingEvent, boolean z) {
        this.A00 = mtl;
        this.A02 = z;
        this.A01 = upcomingEvent;
    }

    public final void DoZ(UpcomingEvent upcomingEvent) {
        Object value;
        N4F n4f;
        05G r6 = this.A00.A04;
        boolean z = this.A02;
        do {
            value = r6.getValue();
            n4f = (N4F) value;
        } while (!r6.AIY(value, N4F.A01(n4f, AnonymousClass05K.A01, 00k.A0T(new PI7(z), n4f.A04), n4f.A05)));
    }

    public final void onFailure() {
        Object value;
        N4F n4f;
        05G r7 = this.A00.A04;
        UpcomingEvent upcomingEvent = this.A01;
        do {
            value = r7.getValue();
            n4f = (N4F) value;
        } while (!r7.AIY(value, N4F.A01(n4f, AnonymousClass05K.A01, 00k.A0T(PI9.A00, n4f.A04), upcomingEvent.getReminderEnabled())));
    }
}
