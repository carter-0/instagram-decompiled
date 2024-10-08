package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Map;

/* renamed from: X.8KY  reason: invalid class name */
public final class AnonymousClass8KY {
    public final UserSession A00;

    public AnonymousClass8KY(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final C254923tH A01(DirectShareTarget directShareTarget, Boolean bool, Integer num, boolean z, boolean z2) {
        C254743sy r0;
        Integer num2 = num;
        0qQ.A0B(num, 0);
        C254743sy r1 = null;
        if (directShareTarget != null) {
            r0 = directShareTarget.A02();
        } else {
            r0 = null;
        }
        if (!(r0 instanceof MsysThreadId)) {
            if (directShareTarget != null) {
                r1 = directShareTarget.A02();
            }
            Boolean A02 = A02(r1, bool, num2, z, z2);
            if (A02 != null) {
                if (!A02.booleanValue()) {
                    if (directShareTarget != null) {
                        C254783t2 r02 = directShareTarget.A09;
                        r02.getClass();
                        C254923tH A002 = AnonymousClass6W3.A00(r02);
                        if (A002 != null) {
                            return A002;
                        }
                    }
                }
            }
            return C254923tH.DJANGO;
        }
        return C254923tH.ACT;
    }

    public final Boolean A02(C254743sy r8, Boolean bool, Integer num, boolean z, boolean z2) {
        DirectThreadKey A04;
        Integer num2 = num;
        0qQ.A0B(num, 0);
        if (!(r8 instanceof DirectThreadKey) || r8 == null || (A04 = C66647MaG.A04(r8)) == null) {
            return null;
        }
        return Boolean.valueOf(AnonymousClass796.A02(this.A00, A04, bool, num2, z, z2, false).A00());
    }

    public static final Map A00(Boolean bool, boolean z, boolean z2) {
        boolean z3;
        if (bool != null) {
            z3 = bool.booleanValue();
        } else {
            z3 = false;
        }
        return 0Yt.A06(new 0eP[]{new 0eP("is_vm", Boolean.valueOf(z3)), new 0eP("is_mixvm", Boolean.valueOf(z)), new 0eP("is_mixvm_eligible", Boolean.valueOf(z2))});
    }
}
