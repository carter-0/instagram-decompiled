package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3eZ  reason: invalid class name */
public final class AnonymousClass3eZ {
    public final UserSession A00;

    public AnonymousClass3eZ(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final boolean A01(UserSession userSession, 1Xj r7, boolean z) {
        List list;
        0qQ.A0B(r7, 1);
        AnonymousClass3YF r1 = C271604jI.A00;
        ArrayList A3G = r7.A3G();
        if (A3G != null) {
            list = 00k.A0a(A3G);
        } else {
            list = null;
        }
        if (list == null || list.isEmpty() || !z || !r7.A6D() || !AnonymousClass3YG.A00(userSession, r7)) {
            if (!AnonymousClass3YH.A02(r7)) {
                return false;
            }
            if ((r7.CeS() && !C243223Xx.A02(r7)) || r7.A4g() || r7.A5j()) {
                return false;
            }
            if (((!AnonymousClass3YG.A00(userSession, r7) || !AnonymousClass3YG.A01(userSession, r7)) && (AnonymousClass3YG.A00(userSession, r7) || !AnonymousClass3YG.A01(userSession, r7))) || r1.A01(userSession, r7) == -1) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(AnonymousClass0iw r2, 1Xj r3, 1Xj r4) {
        return A00(r2, r3, C243193Xt.A02(this.A00, r3, r4));
    }

    public static final boolean A00(AnonymousClass0iw r1, 1Xj r2, AnonymousClass3VA r3) {
        switch (r3.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 14:
            case 15:
            case 16:
                return true;
            case 4:
                return AnonymousClass595.A03(r2);
            case 10:
                return C48905Em5.A00(r1, r2);
            default:
                return false;
        }
    }
}
