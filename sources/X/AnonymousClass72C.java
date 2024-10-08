package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.72C  reason: invalid class name */
public final class AnonymousClass72C implements AnonymousClass0lh {
    public final 0wc A00;
    public final AnonymousClass72D A01;
    public final AnonymousClass6W2 A02 = new AnonymousClass6W2(new AnonymousClass72E(this));
    public final HashSet A03 = new HashSet();
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new AnonymousClass9LO(this, 6));

    public AnonymousClass72C(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A02(userSession);
        this.A01 = (AnonymousClass72D) userSession.A01(AnonymousClass72D.class, new C73899Pla(userSession, 49));
    }

    public final void A00() {
        AnonymousClass72D r5 = this.A01;
        r5.A00();
        long j = r5.A00;
        if (j != 0) {
            r5.A02.flowEndSuccess(j);
            r5.A00 = 0;
            r5.A04.clear();
        }
        this.A02.A01();
        this.A03.clear();
    }

    public final void onSessionWillEnd() {
        AnonymousClass0gd A002 = AnonymousClass0gd.A00();
        Object value = this.A04.getValue();
        if (value != null) {
            A002.A00.remove(value);
        }
        this.A02.A00();
    }
}
