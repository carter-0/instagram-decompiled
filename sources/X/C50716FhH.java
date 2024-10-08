package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.FhH  reason: case insensitive filesystem */
public final class C50716FhH implements AnonymousClass5IX {
    public final UserSession A00;
    public final boolean A01;

    public final boolean E1z(AnonymousClass5IY r6) {
        UserSession userSession = this.A00;
        List A04 = 1Av.A04(1Au.A00(userSession), "parenting_accounts_followed");
        if (A04.isEmpty()) {
            A04 = AnonymousClass7TE.A1C();
        }
        1Av A002 = 1Au.A00(userSession);
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 0);
        1Av.A06(A002, "parenting_accounts_followed", r1);
        if ((!A04.isEmpty()) != this.A01) {
            return false;
        }
        return true;
    }

    public C50716FhH(UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A01 = z;
    }
}
