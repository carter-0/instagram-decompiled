package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.FhJ  reason: case insensitive filesystem */
public final class C50718FhJ implements AnonymousClass5IX {
    public final UserSession A00;
    public final boolean A01;

    public final boolean E1z(AnonymousClass5IY r5) {
        UserSession userSession = this.A00;
        List A0G = 1Au.A00(userSession).A0G();
        1Av A002 = 1Au.A00(userSession);
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 0);
        1Av.A06(A002, AnonymousClass000.A00(1669), r1);
        if ((!A0G.isEmpty()) != this.A01) {
            return false;
        }
        return true;
    }

    public C50718FhJ(UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A01 = z;
    }
}
