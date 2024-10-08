package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.78t  reason: invalid class name and case insensitive filesystem */
public abstract class C3269478t {
    public static final boolean A00(UserSession userSession, 2Er r6) {
        AnonymousClass914 Amp = r6.Amp();
        if (Amp != null && Amp.A00()) {
            return true;
        }
        String C6C = r6.C6C();
        if (r6.BJz() instanceof DirectThreadKey) {
            DirectThreadKey A03 = C66647MaG.A03(r6.BJz());
            if (C6C != null) {
                return C3269778w.A01(userSession, A03, (String) ((C3269678v) userSession.A01(C3269678v.class, C3269578u.A00)).A00.get(C6C));
            }
        }
        return false;
    }

    public static final boolean A01(2Er r3) {
        AnonymousClass914 Amp = r3.Amp();
        if (Amp == null) {
            return true;
        }
        if (!Amp.A00()) {
            return !Amp.A06 || Amp.A05;
        }
        return false;
    }
}
