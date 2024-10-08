package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.7TN  reason: invalid class name */
public final class AnonymousClass7TN implements 0lm {
    public long A00;
    public String A01;
    public final 1QP A02;
    public final Set A03 = new LinkedHashSet();

    public AnonymousClass7TN(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = AnonymousClass1QO.A00(userSession);
    }

    public static final void A00(AnonymousClass7TN r4, C62320sa r5) {
        if (r4.A00 != 0) {
            r5.invoke();
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        long j = this.A00;
        if (j != 0) {
            this.A02.flowEndCancel(j, CancelReason.USER_CANCELLED);
            this.A00 = 0;
        }
    }
}
