package X;

import android.content.Context;
import android.os.PersistableBundle;
import android.util.Range;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2jI  reason: invalid class name */
public final class AnonymousClass2jI implements AnonymousClass0lh {
    public static final C227432jJ A03 = new Object();
    public final Context A00;
    public final UserSession A01;
    public final C62320sa A02;

    public AnonymousClass2jI(Context context, UserSession userSession, C62320sa r4) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r4, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r4;
    }

    public static final Range A00(AnonymousClass2jI r6, long j) {
        long millis = TimeUnit.MINUTES.toMillis(182.A01(0Tu.A05, r6.A01, 36602643304551106L));
        long j2 = j - millis;
        long j3 = 0;
        if (0 < j2) {
            j3 = j2;
        }
        return new Range(Long.valueOf(j3), Long.valueOf(j + millis));
    }

    public final void A02() {
        PersistableBundle persistableBundle;
        UserSession userSession = this.A01;
        if (C227452jL.A00(userSession).booleanValue() || 182.A06(0Tu.A05, userSession, 36321168327713931L)) {
            if (C227452jL.A00(userSession).booleanValue() || 182.A06(0Tu.A05, userSession, 36321168327976077L)) {
                try {
                    C227512jS A012 = C227462jM.A00(this.A00, userSession).A01();
                    if (!(A012 == null || (persistableBundle = A012.A05) == null)) {
                        long j = persistableBundle.getLong("estimated_execution_time", -1);
                        if (j >= 0 && A00(this, TimeUnit.MINUTES.toMillis(182.A01(0Tu.A05, userSession, 36602643304485569L)) + ((Number) this.A02.invoke()).longValue()).contains(Long.valueOf(j))) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    new 0eQ(th);
                }
            }
            A01(this);
        }
    }

    public static final void A01(AnonymousClass2jI r2) {
        try {
            C61480nO A002 = 0nY.A00();
            0qQ.A07(A002);
            A002.ATE(new C273464mc(r2));
        } catch (Throwable th) {
            new 0eQ(th);
        }
    }

    public final void onSessionWillEnd() {
        try {
            C61480nO A002 = 0nY.A00();
            0qQ.A07(A002);
            A002.ATE(new C386459kd(this));
        } catch (Throwable th) {
            new 0eQ(th);
        }
    }
}
