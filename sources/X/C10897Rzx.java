package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Rzx  reason: case insensitive filesystem */
public final class C10897Rzx {
    public final T7A A00(UserSession userSession) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        T7A t7a = T7A.A07;
        if (t7a == null) {
            synchronized (this) {
                t7a = T7A.A07;
                if (t7a == null) {
                    1wS A01 = 1wS.A01(userSession2);
                    0qQ.A07(A01);
                    0Tu r1 = 0Tu.A05;
                    C11325SNb sNb = new C11325SNb(AnonymousClass1UZ.A00(userSession2.A03.A06()), 182.A00(r1, userSession2, 37157544489779261L), 182.A00(r1, userSession2, 37157544489844798L), 182.A00(r1, userSession2, 37157544489713724L), DbS.A04(r1, userSession2, 36594594536097571L));
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    t7a = new T7A(sNb, A01, timeUnit.toMillis(182.A01(r1, userSession2, 36594594535966497L)), timeUnit.toMillis(182.A01(r1, userSession2, 36594594536163108L)), timeUnit.toMillis(182.A01(r1, userSession2, 36594594535769886L)), timeUnit.toMillis(182.A01(r1, userSession2, 36594594535835423L)), timeUnit.toMillis(182.A01(r1, userSession2, 36594594535900960L)), timeUnit.toMillis(182.A01(r1, userSession2, 36594594536032034L)), timeUnit.toMillis(182.A01(r1, userSession2, 36594594536228645L)));
                    T7A.A07 = t7a;
                }
            }
        }
        return t7a;
    }
}
