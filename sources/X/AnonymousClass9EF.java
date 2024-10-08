package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9EF  reason: invalid class name */
public final class AnonymousClass9EF implements AnonymousClass0lh {
    public long A00;
    public C61110lV A01;
    public String A02;
    public boolean A03;
    public final Context A04;
    public final UserSession A05;

    public static final boolean A00(AnonymousClass9EF r6) {
        UserSession userSession = r6.A05;
        if (182.A06(0Tu.A06, userSession, 36311397277172233L)) {
            return true;
        }
        if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - 1Au.A00(userSession).A01.getLong(C66579MXk.A00(346), 0)) < 90) {
            return false;
        }
        return true;
    }

    public final void onSessionWillEnd() {
        C61110lV r0 = this.A01;
        if (r0 != null) {
            14i.A06(r0);
        }
        AnonymousClass2yJ.A00.clear();
    }

    public AnonymousClass9EF(UserSession userSession, Context context) {
        this.A05 = userSession;
        this.A04 = context;
    }
}
