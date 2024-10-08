package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;

/* renamed from: X.2p3  reason: invalid class name and case insensitive filesystem */
public final class C230162p3 {
    public final 2el A00;
    public final C229932oe A01 = new C229932oe();
    public final AnonymousClass2p4 A02;

    public final void A00(AnonymousClass3UH r6, C17674Vc5 vc5) {
        C229932oe r4 = this.A01;
        String str = vc5.A04;
        AnonymousClass30Y A002 = r4.A00(str);
        int A003 = r6.A00(vc5);
        if (A002 == AnonymousClass30Y.A07) {
            C2354830a r1 = new C2354830a(new Pair(r6, vc5), Integer.valueOf(A003), str);
            r1.A00(this.A02);
            r4.A01(r1.A01(), str);
        }
    }

    public C230162p3(UserSession userSession, 2el r5, AnonymousClass2p0 r6, C249763kK r7) {
        this.A00 = r5;
        1Bk r2 = C229232n3.A00(userSession).A00.A00;
        0qQ.A07(r2);
        this.A02 = new AnonymousClass2p4(r2, r6, r7.getSessionId());
    }
}
