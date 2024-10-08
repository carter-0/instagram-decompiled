package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.VhO  reason: case insensitive filesystem */
public final class C17871VhO {
    public final 2el A00;
    public final C229932oe A01 = new C229932oe();
    public final String A02;
    public final C15896UkK A03;

    public final void A00(Set set, boolean z) {
        0qQ.A0B(set, 0);
        C15896UkK ukK = this.A03;
        ukK.A00 = z;
        String A0R = 002.A0R("seller_funded_discounts_banner:", this.A02);
        C13989Tnp.A1Q(ukK, AnonymousClass30Y.A00(set, C60340gF.A00, A0R), this.A01, A0R);
    }

    public C17871VhO(UserSession userSession, 2el r3, C18785W1l w1l, String str, String str2) {
        C51974G9v.A1P(userSession, str, str2, r3);
        this.A02 = str;
        this.A00 = r3;
        this.A03 = new C15896UkK(userSession, w1l, str, str2);
    }
}
