package X;

import com.instagram.common.session.UserSession;
import com.instagram.remindme.common.data.MediaReminderRepository$toggleReminderState$1;

/* renamed from: X.Vgr  reason: case insensitive filesystem */
public final class C17838Vgr {
    public final 1Ng A00;
    public final C56037Hrk A01;
    public final C16177Uq2 A02;

    public C17838Vgr(AnonymousClass0iw r2, UserSession userSession, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A02 = new C16177Uq2(userSession);
        this.A01 = new C56037Hrk(r2, userSession, str);
        this.A00 = AnonymousClass1Nd.A00(userSession);
    }

    public final void A00(1Xj r6, C17260VOn vOn) {
        String str;
        if (r6.A5L()) {
            C56037Hrk hrk = this.A01;
            if (r6.A5w()) {
                str = "reminder_unset";
            } else {
                str = "reminder_set";
            }
            hrk.A00(r6, str);
            C16177Uq2 uq2 = this.A02;
            VWM vwm = new VWM(r6, this, vOn);
            AnonymousClass7TE.A1Z(new MediaReminderRepository$toggleReminderState$1(r6, uq2, vwm, (AnonymousClass4D7) null), uq2.A01);
        }
    }
}
