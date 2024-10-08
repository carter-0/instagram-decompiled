package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LsH  reason: case insensitive filesystem */
public final class C65376LsH implements MSQ {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = MMJ.A00(this, 0eO.A02, 37);

    public C65376LsH(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void AIG(C65380LsL lsL, C63718L4c l4c, List list) {
        00k.A0P("\n", "", "", 00k.A0S(lsL.A05, list), MON.A00);
        ((MSQ) this.A01.getValue()).AIG(lsL, l4c, list);
    }
}
