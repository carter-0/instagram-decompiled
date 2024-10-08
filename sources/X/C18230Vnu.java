package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.Vnu  reason: case insensitive filesystem */
public abstract class C18230Vnu {
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.UKp] */
    public static final C15036UKp A00(User user) {
        0qQ.A0B(user, 0);
        C53387GnJ gnJ = null;
        ? obj = new Object();
        obj.A07 = "";
        obj.A09 = "";
        obj.A06 = null;
        obj.A00 = null;
        obj.A08 = null;
        obj.A04 = null;
        obj.A03 = null;
        obj.A05 = null;
        obj.A01 = null;
        obj.A02 = null;
        obj.A07 = user.getId();
        obj.A09 = user.getUsername();
        obj.A06 = user.getFullName();
        ExtendedImageUrl A0E = user.A0E();
        if (A0E != null) {
            gnJ = new C53387GnJ();
            String str = A0E.A0A;
            0qQ.A0B(str, 0);
            gnJ.A02 = str;
            gnJ.A01 = A0E.getWidth();
            gnJ.A00 = A0E.getHeight();
        }
        obj.A00 = gnJ;
        obj.A08 = DbU.A0p(user);
        obj.A04 = user.A03.CeL();
        obj.A03 = user.A0K();
        return obj;
    }

    public static final User A01(C15036UKp uKp) {
        0qQ.A0B(uKp, 0);
        User user = new User(uKp.A07, uKp.A09);
        user.A0t(uKp.A06);
        C53387GnJ gnJ = uKp.A00;
        if (gnJ != null) {
            user.A0m(new ExtendedImageUrl(gnJ.A02, gnJ.A01, gnJ.A00));
        }
        user.A0u(uKp.A08);
        user.A03.Eq0(uKp.A04);
        user.A0p(uKp.A03);
        return user;
    }
}
