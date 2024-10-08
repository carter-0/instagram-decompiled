package X;

import com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl;
import com.instagram.user.model.User;

public final class W2B {
    public static final W2B A00 = new Object();

    public final UOL A03(C311716d8 r13, C20851X1d x1d, C18513VtC vtC, C17278VPf vPf, C17805VgI vgI, String str) {
        Integer num;
        UOF uof;
        0qQ.A0B(x1d, 0);
        C17278VPf vPf2 = vPf;
        C17805VgI vgI2 = vgI;
        AnonymousClass7TG.A0w(1, vPf2, vgI2, vtC);
        boolean A01 = A01(x1d);
        C20851X1d x1d2 = x1d;
        boolean z = x1d instanceof UOF;
        if (!z) {
            num = AnonymousClass05K.A00;
        } else if (A02(vtC, vPf2, C17103VHz.A00((UOF) x1d2))) {
            num = AnonymousClass05K.A0C;
        } else {
            if (182.A06(0Tu.A05, vgI2.A00, 36320725946082081L)) {
                num = AnonymousClass05K.A0N;
            } else {
                num = AnonymousClass05K.A01;
            }
        }
        User user = null;
        if (z && (uof = (UOF) x1d) != null) {
            user = C17103VHz.A00(uof);
        }
        return new UOL(A00(r13, vPf2, user, str, vgI2.A00(), false), num, A01);
    }

    public static final boolean A01(C20851X1d x1d) {
        if (!(x1d instanceof UOF)) {
            return false;
        }
        UOF uof = (UOF) x1d;
        if (!uof.A00.A1B) {
            return false;
        }
        1Xj r0 = uof.A01.A0b;
        if (r0 == null) {
            return true;
        }
        Boolean AkR = r0.A0C.AkR();
        if (AkR == null || !AkR.booleanValue()) {
            return false;
        }
        return true;
    }

    public static final C20852X1e A00(C311716d8 r4, C17278VPf vPf, User user, String str, boolean z, boolean z2) {
        C20852X1e x1e;
        boolean A1Y = DbW.A1Y(vPf);
        Integer num = null;
        if (user != null) {
            C17510VYo vYo = vPf.A00;
            num = null;
            if (vYo.A01.A0H(vYo.A00, AnonymousClass6UD.A00(user, false)) && DisappearingModePluginImpl.A01 != null) {
                num = 2131960939;
            }
        }
        if (!z || str == null) {
            if (user != null) {
                user.getUsername();
                if (r4.A00 == AnonymousClass3BQ.DIRECT) {
                    x1e = new UOH(user.getUsername(), A1Y ? 1 : 0);
                }
            }
            if (num != null) {
                x1e = new UOG(num.intValue());
            } else if (z2) {
                x1e = C19663WdR.A00;
            } else {
                x1e = C19662WdQ.A00;
            }
        } else {
            x1e = new UOH(str, 0);
        }
        return x1e;
    }

    public static final boolean A02(C18513VtC vtC, C17278VPf vPf, User user) {
        AnonymousClass7TG.A1O(vPf, vtC);
        if (user == null) {
            return false;
        }
        C17510VYo vYo = vPf.A00;
        if (vYo.A01.A0H(vYo.A00, AnonymousClass6UD.A00(user, false))) {
            return true;
        }
        if (vtC.A01.A0I(vtC.A00, AnonymousClass6UD.A00(user, false))) {
            return true;
        }
        return false;
    }
}
