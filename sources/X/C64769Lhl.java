package X;

import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Lhl  reason: case insensitive filesystem */
public final class C64769Lhl implements C232262tL {
    public final UpcomingEvent A00;

    public C64769Lhl(UpcomingEvent upcomingEvent) {
        0qQ.A0B(upcomingEvent, 1);
        this.A00 = upcomingEvent;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A00.getId();
        if (id == null) {
            return "";
        }
        return id;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C64769Lhl lhl = (C64769Lhl) obj;
        UpcomingEvent upcomingEvent = this.A00;
        String id = upcomingEvent.getId();
        if (id == null) {
            id = "";
        }
        if (lhl != null) {
            str = lhl.A00.getId();
            if (str == null) {
                str = "";
            }
        } else {
            str = null;
        }
        if (!id.equals(str) || lhl == null) {
            return false;
        }
        if (upcomingEvent.getReminderEnabled() == lhl.A00.getReminderEnabled()) {
            return true;
        }
        return false;
    }
}
