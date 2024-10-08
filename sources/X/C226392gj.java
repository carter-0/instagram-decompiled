package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2gj  reason: invalid class name and case insensitive filesystem */
public final class C226392gj {
    public final long A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9LI(this, 26));

    public C226392gj(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = TimeUnit.HOURS.toSeconds(182.A01(0Tu.A05, userSession, 36597734156798871L));
    }

    public final void A00(Context context) {
        0qQ.A0B(context, 0);
        new C243453Yv(context, this.A01).A00(new C377479Lz(36, context, this));
    }
}
