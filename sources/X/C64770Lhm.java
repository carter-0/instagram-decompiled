package X;

import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Lhm  reason: case insensitive filesystem */
public final class C64770Lhm implements C232262tL {
    public final UpcomingEvent A00;

    public C64770Lhm(UpcomingEvent upcomingEvent) {
        0qQ.A0B(upcomingEvent, 1);
        this.A00 = upcomingEvent;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C64770Lhm lhm = (C64770Lhm) obj;
        String id = this.A00.getId();
        if (lhm != null) {
            str = lhm.A00.getId();
        } else {
            str = null;
        }
        return 0qQ.A0K(id, str);
    }
}
