package X;

import com.instagram.common.session.UserSession;

public final class GEZ extends C247303g7 {
    public final UserSession A00;

    public final JN0 A05(C52058GDe gDe) {
        AnonymousClass3W9 r0;
        int i;
        boolean A06 = 182.A06(0Tu.A05, this.A00, 36330286543290928L);
        AnonymousClass3W1 r02 = gDe.A0E;
        if (r02 != null) {
            r0 = (AnonymousClass3W9) r02.A3b.A00;
        } else {
            r0 = null;
        }
        if (!A06 || r0 == null) {
            return GK2.A00;
        }
        int ordinal = r0.ordinal();
        if (ordinal == 3 || ordinal == 1) {
            i = 2131973006;
        } else {
            i = 2131965496;
            if (ordinal != 2) {
                i = 2131973013;
            }
        }
        return new GNC(i);
    }

    public GEZ(UserSession userSession) {
        this.A00 = userSession;
    }
}
