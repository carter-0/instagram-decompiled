package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.57M  reason: invalid class name */
public final class AnonymousClass57M {
    public final 2el A00;
    public final C230752qC A01;

    public AnonymousClass57M(UserSession userSession, 2el r4, AnonymousClass2qB r5, Integer num) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r4, 3);
        this.A00 = r4;
        this.A01 = new C230752qC(userSession, r5, num, false);
    }

    public final void A00(View view, Object obj) {
        String A0O = 002.A0O("load-more:", obj.hashCode());
        C60340gF r2 = C60340gF.A00;
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r1 = new C2354830a(obj, r2, A0O);
        r1.A00(this.A01);
        this.A00.A05(view, r1.A01());
    }
}
