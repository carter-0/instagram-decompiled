package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.2zN  reason: invalid class name and case insensitive filesystem */
public final class C235162zN extends C230502pj {
    public final C231502rm A00;
    public final C235172zO A01;

    public final void ATF(AnonymousClass30Y r4, C252093oY r5) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        C235172zO r2 = this.A01;
        Object obj = r4.A03;
        0qQ.A06(obj);
        r2.A00((View) this.A00.get(obj), r4, r5);
    }

    public C235162zN(UserSession userSession) {
        super(userSession);
        Set set;
        C231502rm A002 = C231492rl.A00(userSession);
        this.A00 = A002;
        if (A002.A0I) {
            set = 0sc.A07(new C244053aZ[]{C244053aZ.A03, C244053aZ.A05, C244053aZ.A04});
        } else {
            set = 0sl.A00;
        }
        this.A01 = new C235172zO(userSession, set, new AnonymousClass9LE(this, 5));
    }
}
