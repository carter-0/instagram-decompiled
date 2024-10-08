package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Locale;

public abstract class GJK {
    public static final boolean A02(UserSession userSession, 1Xj r7) {
        String str;
        String str2;
        Uri A01;
        String host;
        User CCd;
        String str3 = null;
        if (r7 != null) {
            str = r7.A0C.BVF();
            str2 = r7.A0C.Bte();
        } else {
            str = null;
            str2 = null;
        }
        if (str2 == null || str2.length() == 0 || str == null || str.length() == 0 || (A01 = 0cp.A01(new 1Q7("IgSecureUriParser").A00, A01(str))) == null || (host = A01.getHost()) == null || host.length() == 0) {
            return false;
        }
        if (!(r7 == null || (CCd = r7.A0C.CCd()) == null)) {
            str3 = CCd.getId();
        }
        if ((!0qQ.A0K(str3, userSession.A06) || !182.A06(0Tu.A05, userSession, 36322821890779604L)) && !182.A06(0Tu.A05, userSession, 36322821890189776L)) {
            return false;
        }
        return true;
    }

    public static final String A00(String str) {
        String host;
        String A01 = A01(str);
        Uri A012 = 0cp.A01(DbW.A0G(), A01(str));
        if (!(A012 == null || (host = A012.getHost()) == null)) {
            A01 = host;
        }
        Locale locale = Locale.getDefault();
        0qQ.A07(locale);
        return new 11S("^www\\.").A01(DbT.A12(locale, A01), "");
    }

    public static final String A01(String str) {
        String A12 = DbV.A12(str);
        if (A12.length() <= 0 || new 11S(AnonymousClass000.A00(491)).A08(A12)) {
            return A12;
        }
        return 002.A0R(AnonymousClass000.A00(3246), A12);
    }
}
