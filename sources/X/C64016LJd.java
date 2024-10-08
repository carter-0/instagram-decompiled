package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.LJd  reason: case insensitive filesystem */
public abstract class C64016LJd {
    public static final boolean A00(UserSession userSession, AnonymousClass3Q2 r4) {
        long j;
        if (AnonymousClass7TF.A1Y(r4.A20, true)) {
            return false;
        }
        ShareType A0E = r4.A0E();
        if (A0E != null) {
            C63391KwC kwC = C63391KwC.$redex_init_class;
            switch (A0E.ordinal()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 13:
                case 14:
                case 15:
                case 16:
                case 20:
                case 24:
                case 25:
                case 26:
                case 27:
                    return false;
                case 9:
                    if (!r4.A5M) {
                        int i = r4.A05;
                        0Tu r2 = 0Tu.A05;
                        if (i != 0) {
                            j = 36328194894347322L;
                        } else {
                            j = 36328194894216249L;
                        }
                        return !182.A06(r2, userSession, j);
                    }
                    break;
            }
        }
        return true;
    }

    public static final boolean A01(AnonymousClass3Q2 r3) {
        if (AnonymousClass7TF.A1Y(r3.A20, true)) {
            return false;
        }
        ShareType A0E = r3.A0E();
        if (A0E != null) {
            C63391KwC kwC = C63391KwC.$redex_init_class;
            switch (A0E.ordinal()) {
                case 1:
                case 15:
                case 20:
                case 24:
                    return false;
            }
        }
        return true;
    }
}
