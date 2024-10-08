package X;

import com.instagram.common.session.UserSession;
import com.instagram.remindme.common.data.MediaReminderApi;

/* renamed from: X.Uq2  reason: case insensitive filesystem */
public final class C16177Uq2 extends C252733pa {
    public final UserSession A00;
    public final 1E8 A01;
    public final MediaReminderApi A02;

    public C16177Uq2(UserSession userSession) {
        super("Media Reminders", AnonymousClass43D.A00(1332444357));
        this.A00 = userSession;
        this.A02 = new MediaReminderApi(userSession);
        this.A01 = 1E7.A00(userSession);
    }
}
