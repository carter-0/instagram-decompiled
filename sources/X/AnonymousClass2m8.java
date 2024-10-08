package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2m8  reason: invalid class name */
public final class AnonymousClass2m8 extends AnonymousClass2m1 {
    public final Context A00;
    public final UserSession A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    public final void Des(AnonymousClass1GU r7, 1XM r8) {
        UserSession userSession = this.A01;
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36328151947557887L)) {
            return;
        }
        if (182.A06(r2, userSession, 36328151947754498L) && !this.A02.compareAndSet(false, true)) {
            return;
        }
        if (182.A06(r2, userSession, 36328151947492350L)) {
            C61480nO A002 = 0nY.A00();
            0qQ.A07(A002);
            A002.ATE(new C47805EHr(this));
            return;
        }
        C3727392e.A00(userSession).A08(this.A00, userSession.A06, false, true);
    }

    public AnonymousClass2m8(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
