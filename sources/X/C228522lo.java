package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2lo  reason: invalid class name and case insensitive filesystem */
public final class C228522lo {
    public AnonymousClass353 A00;
    public boolean A01;
    public final UserSession A02;
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();
    public final boolean A05;

    public final void A00() {
        List list = this.A04;
        if (!list.isEmpty()) {
            list.clear();
            this.A03.clear();
            AnonymousClass353 r0 = this.A00;
            if (r0 != null) {
                C227802jw r1 = r0.A00;
                C238213Az r02 = r1.A0B;
                if (r02 != null) {
                    r02.A08();
                }
                r1.A0P(4);
            }
        }
    }

    public C228522lo(UserSession userSession) {
        this.A02 = userSession;
        0tS A002 = 0tS.A4E.A00();
        this.A05 = ((Boolean) A002.A1B.CDM(A002, 0tS.A4G[204])).booleanValue();
    }
}
