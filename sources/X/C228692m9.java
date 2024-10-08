package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2m9  reason: invalid class name and case insensitive filesystem */
public final class C228692m9 extends AnonymousClass2m1 {
    public final UserSession A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);

    public final void Des(AnonymousClass1GU r7, 1XM r8) {
        if (this.A01.compareAndSet(false, true)) {
            UserSession userSession = this.A00;
            0Tu r3 = 0Tu.A05;
            if (182.A06(r3, userSession, 36328151947820035L)) {
                boolean A06 = 182.A06(r3, userSession, 36328151947885572L);
                boolean A062 = 182.A06(r3, userSession, 36328151947951109L);
                if (A06) {
                    AnonymousClass1HI.A02.Eyo(new C59685JTr(this));
                } else if (A062) {
                    AnonymousClass1HI.A02.Eym(new C282035Bd(this));
                } else {
                    AnonymousClass4HO.A00(userSession, new AnonymousClass4HN(userSession)).A03(false);
                }
            }
        }
    }

    public C228692m9(UserSession userSession) {
        this.A00 = userSession;
    }
}
