package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TvS  reason: case insensitive filesystem */
public final class C14399TvS {
    public static long A00 = -1;
    public static boolean A01;
    public static final long A02 = JTR.A0N(TimeUnit.HOURS);
    public static final C14399TvS A03 = new Object();

    public final void A00(UserSession userSession) {
        if (!A01) {
            long j = A00;
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            if (j == -1 || currentThreadTimeMillis < j || currentThreadTimeMillis - j > C14409Tvc.A00) {
                A01 = true;
                1NY A0b = AnonymousClass7TG.A0b(userSession);
                A0b.A0A("fbsearch/recent_searches/");
                1OC A0S = DbU.A0S(A0b, NH9.class, C67392Mn9.class);
                C15622Ufo.A00(A0S, userSession, 3);
                1ES.A03(A0S);
            }
        }
    }
}
