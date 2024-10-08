package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Lc  reason: invalid class name and case insensitive filesystem */
public final class C330017Lc {
    public static final C330017Lc A00 = new Object();

    public final Long A00(UserSession userSession, AnonymousClass7SD r7) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(userSession, 1);
        Integer num = r7.A0N.A03;
        boolean COV = C329737Ka.A01(userSession, r7, true).COV(userSession, r7);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue <= -1 && (intValue != -1 || !COV)) {
            return null;
        }
        long j = (long) intValue;
        if (j >= 0) {
            j = TimeUnit.SECONDS.toMillis(j);
        }
        return Long.valueOf(j);
    }

    public final Long A01(UserSession userSession, AnonymousClass2Ep r7) {
        Integer num;
        0qQ.A0B(userSession, 1);
        C272964li Axk = r7.Axk();
        if (Axk != null) {
            num = Axk.A03;
        } else {
            num = null;
        }
        boolean COW = C329737Ka.A03(userSession, r7).COW(userSession, r7);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue <= -1 && (intValue != -1 || !COW)) {
            return null;
        }
        long j = (long) intValue;
        if (j >= 0) {
            j = TimeUnit.SECONDS.toMillis(j);
        }
        return Long.valueOf(j);
    }
}
