package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Hr2  reason: case insensitive filesystem */
public final class C55996Hr2 {
    public int A00;
    public C62320sa A01;
    public C62320sa A02;
    public C62320sa A03;
    public 0sP A04;
    public final List A05 = AnonymousClass7TE.A1C();
    public final UserSession A06;

    public final void A00(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            for (0sP A0w : this.A05) {
                C51967G9n.A0w(i, A0w);
            }
        }
    }

    public C55996Hr2(UserSession userSession) {
        this.A06 = userSession;
        this.A00 = (int) 182.A00(0Tu.A06, userSession, 37167341309657536L);
    }
}
