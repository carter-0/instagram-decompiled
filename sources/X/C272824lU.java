package X;

import android.util.Pair;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.4lU  reason: invalid class name and case insensitive filesystem */
public final class C272824lU implements AnonymousClass0TL {
    public final UserSession A00;

    public final boolean shouldCollectMetrics(int i) {
        return (i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0;
    }

    public final /* synthetic */ boolean shouldCollectMetrics(int i, 0TA r3) {
        return AnonymousClass0TK.A00(r3, this, i);
    }

    public final Collection getDataPoints() {
        int i;
        int i2;
        C264474Qa r0;
        AnonymousClass4QW Ab1;
        UserSession userSession = this.A00;
        1wS A01 = 1wS.A01(userSession);
        29t r02 = A01.A00.A06;
        if (r02 != null) {
            r02.A03();
        }
        29t r03 = A01.A00.A06;
        if (r03 != null) {
            r03.A03();
        }
        Pair pair = new Pair(0, 0);
        0TJ r7 = 0TJ.A15;
        29n r5 = 1wS.A01(userSession).A00.A0c;
        synchronized (r5) {
            i = 0;
            for (AnonymousClass4OS r3 : r5.A00.snapshot().values()) {
                if (r3.A19 == null || (r0 = r3.A19.A09) == null || (Ab1 = r0.A00.Ab1()) == null) {
                    i2 = 0;
                } else {
                    i2 = Ab1.C8e();
                }
                i += i2;
            }
        }
        0TD[] r04 = {new 0TD(r7, -1, (long) (i / 1024)), new 0TD(0TJ.A16, (long) (((Number) pair.second).intValue() / 1024), (long) (((Number) pair.first).intValue() / 1024))};
        0qQ.A0B(r04, 0);
        return 03t.A0I(r04);
    }

    public final /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    public final /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }

    public C272824lU(UserSession userSession) {
        this.A00 = userSession;
    }
}
