package X;

import android.os.Build;
import com.instagram.common.session.UserSession;

public abstract class F74 {
    public static final void A01(UserSession userSession, Integer num, String str) {
        String str2;
        0qQ.A0B(userSession, 0);
        1Q9 A01 = 1Q9.A01(AnonymousClass000.A00(3805));
        switch (num.intValue()) {
            case 0:
                str2 = "profile_wizard_launched";
                break;
            case 1:
                str2 = "profile_wizard_next_pressed";
                break;
            case 2:
                str2 = "profile_wizard_skip_pressed";
                break;
            case 3:
                str2 = "profile_wizard_soft_back_pressed";
                break;
            case 4:
                str2 = "profile_wizard_back_pressed";
                break;
            case 5:
                str2 = "profile_wizard_done_pressed";
                break;
            case 6:
                str2 = "profile_wizard_user_saved";
                break;
            case 7:
                str2 = "profile_wizard_user_save_failed";
                break;
            case 8:
                str2 = "profile_wizard_picture_saved";
                break;
            case 9:
                str2 = "profile_wizard_picture_save_failed";
                break;
            case 10:
                str2 = "profile_wizard_has_pending_changes";
                break;
            case 11:
                str2 = "profile_wizard_pending_changes_saved";
                break;
            default:
                str2 = "profile_wizard_pending_changes_discarded";
                break;
        }
        0xI A04 = A01.A04(str2);
        A04.A08(Integer.valueOf(Build.VERSION.SDK_INT), "os_version");
        A04.A0C("fb_family_device_id", DbT.A0P(userSession).A02(19f.A2C));
        A04.A0C("guid", DbV.A0t());
        A04.A0C(Dbm.A00(), userSession.A06);
        if (str != null) {
            A04.A0C("step", str);
        }
        DbU.A1R(A04, userSession);
    }

    public static final void A00(UserSession userSession, C20863X1p x1p, Integer num) {
        AnonymousClass7TG.A1N(userSession, x1p);
        A01(userSession, num, x1p.toString());
    }
}
