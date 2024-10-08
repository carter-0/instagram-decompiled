package X;

import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.VIl  reason: case insensitive filesystem */
public abstract class C17115VIl {
    public static final String A00(UpcomingEvent upcomingEvent) {
        Integer num;
        if (C18810W3l.A0B(upcomingEvent)) {
            num = AnonymousClass05K.A01;
        } else if (!C18810W3l.A0B(upcomingEvent)) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0C;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue != 1) {
            return "online_event";
        }
        return AnonymousClass000.A00(1777);
    }
}
