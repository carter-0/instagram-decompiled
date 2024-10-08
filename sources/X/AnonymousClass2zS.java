package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.2zS  reason: invalid class name */
public final class AnonymousClass2zS extends C230502pj {
    public final C235172zO A00;

    public final void ATF(AnonymousClass30Y r4, C252093oY r5) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        C235172zO r2 = this.A00;
        Object obj = r4.A03;
        0qQ.A06(obj);
        r2.A00((View) this.A00.get(obj), r4, r5);
    }

    public AnonymousClass2zS(UserSession userSession) {
        super(userSession);
        this.A00 = new C235172zO(userSession, 0sl.A00, new AnonymousClass9LE(this, 4));
    }
}
