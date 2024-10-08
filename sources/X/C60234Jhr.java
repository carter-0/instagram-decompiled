package X;

import com.instagram.aistudio.home.repository.AiSearchRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jhr  reason: case insensitive filesystem */
public final class C60234Jhr extends 2YL {
    public final AiSearchRepository A00;
    public final AnonymousClass7I6 A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final UserSession A04;

    public C60234Jhr(AiSearchRepository aiSearchRepository, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = aiSearchRepository;
        this.A04 = userSession;
        02z A10 = DbS.A10(new C61040Jve(182.A06(0Tu.A05, userSession, 36325145467499135L)));
        this.A02 = A10;
        this.A03 = A10;
        this.A01 = AnonymousClass7I4.A00(userSession);
    }

    public final void A00() {
        Object value;
        0sn r5;
        boolean z;
        AnonymousClass7I6 r2 = this.A01;
        r2.A04(AnonymousClass05K.A0C, r2.A00);
        05G r22 = this.A02;
        do {
            value = r22.getValue();
            r5 = 0sn.A00;
            z = ((C61040Jve) value).A06;
            0qQ.A0B(r5, 3);
        } while (!r22.AIY(value, new C61040Jve("", r5, 0, false, false, false, z)));
    }
}
