package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.Locale;

/* renamed from: X.F6z  reason: case insensitive filesystem */
public abstract class C49791F6z {
    public static final void A00(UserSession userSession, Integer num) {
        0qQ.A0B(userSession, 1);
        A01(userSession, num, AnonymousClass05K.A00, (String) null);
    }

    public static final void A01(UserSession userSession, Integer num, Integer num2, String str) {
        String str2;
        String str3;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_profile_data_transparency");
        if (A0e.isSampled()) {
            switch (num2.intValue()) {
                case 0:
                    str2 = "CLICK_LEARN_MORE";
                    break;
                case 1:
                    str2 = "OPEN_BOTTOM_SHEET";
                    break;
                default:
                    str2 = "TRY_SHOW_SURVEY";
                    break;
            }
            Locale locale = Locale.ROOT;
            DbS.A1I(A0e, DbT.A12(locale, str2));
            switch (num.intValue()) {
                case 0:
                    str3 = "EDIT_BIO";
                    break;
                case 1:
                    str3 = "EDIT_LINKS";
                    break;
                case 2:
                    str3 = "EDIT_NAME";
                    break;
                case 3:
                    str3 = "EDIT_PICTURE";
                    break;
                case 4:
                    str3 = "EDIT_PROFILE";
                    break;
                case 5:
                    str3 = "EDIT_USERNAME";
                    break;
                default:
                    str3 = "PROFILE";
                    break;
            }
            DbS.A1L(A0e, DbT.A12(locale, str3));
            A0e.AAJ(DevServerEntity.COLUMN_DESCRIPTION, str);
            A0e.Cgf();
        }
    }
}
