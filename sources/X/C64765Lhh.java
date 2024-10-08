package X;

import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Lhh  reason: case insensitive filesystem */
public final class C64765Lhh implements C232262tL {
    public final UpcomingEvent A00;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "video_metadata_upcoming_event";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64765Lhh lhh = (C64765Lhh) obj;
        0qQ.A0B(lhh, 0);
        return AnonymousClass7TF.A1P(0qQ.A0K(this.A00, lhh.A00) ? 1 : 0);
    }

    public C64765Lhh(UpcomingEvent upcomingEvent) {
        this.A00 = upcomingEvent;
    }
}
