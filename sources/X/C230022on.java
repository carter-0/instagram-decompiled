package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;

/* renamed from: X.2on  reason: invalid class name and case insensitive filesystem */
public final class C230022on {
    public final 2el A00;
    public final C229932oe A01 = new C229932oe();
    public final C230032oo A02;

    public C230022on(UserSession userSession, 2el r5, C229992ok r6, C249763kK r7) {
        0qQ.A0B(r7, 2);
        this.A00 = r5;
        1Bk r2 = C229232n3.A00(userSession).A00.A00;
        0qQ.A07(r2);
        this.A02 = new C230032oo(r2, r6, r7.getSessionId());
    }

    public final void A00(AnonymousClass3UH r7, AnonymousClass3UL r8) {
        int A012 = r7.A01(r8);
        C229932oe r5 = this.A01;
        if (0qQ.A0K(r5.A00(r8.A03.getId()), AnonymousClass30Y.A07)) {
            String id = r8.A03.getId();
            C2354830a r1 = new C2354830a(new Pair(r7, r8), Integer.valueOf(A012), r8.A03.getId());
            r1.A00(this.A02);
            r5.A01(r1.A01(), id);
        }
    }
}
