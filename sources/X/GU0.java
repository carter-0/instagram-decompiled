package X;

import com.instagram.user.model.User;
import java.util.Locale;

public abstract class GU0 {
    public static final void A00(0jB r3, User user) {
        r3.A04(C297705sC.A01, user.getId());
        r3.A04(C297705sC.A02, user.getUsername());
        0j9 r2 = C297705sC.A06;
        Locale locale = Locale.getDefault();
        0qQ.A07(locale);
        r3.A04(r2, DbT.A12(locale, "USER"));
        r3.A04(C297705sC.A00, GTN.A00(GTO.A00(user.B6o())));
    }
}
