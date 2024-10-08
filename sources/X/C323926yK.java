package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Locale;

/* renamed from: X.6yK  reason: invalid class name and case insensitive filesystem */
public abstract class C323926yK {
    public static final int A00(UserSession userSession) {
        List BlN = AnonymousClass0t1.A01.A01(userSession).A03.BlN();
        if (BlN == null) {
            return 2131976966;
        }
        Object A0I = 00k.A0I(BlN);
        if (0qQ.A0K(A0I, "CA")) {
            return 2131954721;
        }
        if (!0qQ.A0K(A0I, "AU")) {
            return 2131976966;
        }
        return 2131953305;
    }

    public static final String A01(UserSession userSession) {
        String str;
        List BlN = AnonymousClass0t1.A01.A01(userSession).A03.BlN();
        if (BlN != null) {
            str = (String) 00k.A0I(BlN);
        } else {
            str = "";
        }
        String displayCountry = new Locale("", str).getDisplayCountry();
        0qQ.A07(displayCountry);
        return displayCountry;
    }

    public static final boolean A02(UserSession userSession, User user) {
        Boolean CaZ;
        Boolean CV0;
        List BlN;
        Boolean Caa;
        0Tu r4 = 0Tu.A05;
        boolean A06 = 182.A06(r4, userSession, 36323899926916695L);
        User A01 = AnonymousClass0t1.A01.A01(userSession);
        boolean A062 = 182.A06(r4, userSession, 36319441750859163L);
        if (A06) {
            if (!A062 || A01.A03.BlN() == null || (BlN = A01.A03.BlN()) == null || !(!BlN.isEmpty()) || user == null || (Caa = user.A03.Caa()) == null || !Caa.booleanValue()) {
                return false;
            }
            return true;
        } else if (!A062 || user == null || (CaZ = user.A03.CaZ()) == null || !CaZ.booleanValue() || (CV0 = A01.A03.CV0()) == null || !CV0.booleanValue()) {
            return false;
        } else {
            return true;
        }
    }
}
