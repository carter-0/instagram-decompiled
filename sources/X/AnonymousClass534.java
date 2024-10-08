package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.534  reason: invalid class name */
public abstract class AnonymousClass534 {
    public static AnonymousClass535 parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            User user = null;
            String str = null;
            String str2 = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("is_pending".equals(A0q)) {
                    bool = Boolean.valueOf(r11.A0d());
                } else if ("permission".equals(A0q)) {
                    bool2 = Boolean.valueOf(r11.A0d());
                } else if ("sponsor".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r11, false);
                } else if ("sponsor_id".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if (Dbh.A01(10, 8, 29).equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (user != null || !(r11 instanceof 0c9)) {
                return new AnonymousClass535(user, bool, bool2, str, str2);
            }
            ((0c9) r11).A03.A00("sponsor", "SponsorTag");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, AnonymousClass535 r3) {
        r2.A0c();
        Boolean bool = r3.A01;
        if (bool != null) {
            r2.A0S("is_pending", bool.booleanValue());
        }
        Boolean bool2 = r3.A02;
        if (bool2 != null) {
            r2.A0S("permission", bool2.booleanValue());
        }
        User user = r3.A00;
        if (user != null) {
            r2.A0q("sponsor");
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r2, user);
        }
        String str = r3.A03;
        if (str != null) {
            r2.A0R("sponsor_id", str);
        }
        String str2 = r3.A04;
        if (str2 != null) {
            r2.A0R(Dbh.A00(), str2);
        }
        r2.A0Z();
    }
}
