package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public abstract class F5v {
    public static C48144EZm A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return C48144EZm.CHANGE_PROFILE_PICTURE_FIRST_TIME;
        }
        if (intValue == 1) {
            return C48144EZm.SET_AVATAR_PROFILE_PICTURE;
        }
        if (intValue == 2) {
            return C48144EZm.EDIT_PHOTO_REMINDER;
        }
        if (intValue != 4) {
            return C48144EZm.REMOVE_PROFILE_PICTURE;
        }
        return C48144EZm.NAME_CHANGE_REMINDER;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.ELT, X.FBc] */
    public static void A01(Fragment fragment, UserSession userSession, Integer num) {
        FGS.A02(A00(num), userSession, "reminder_manage_settings");
        AnonymousClass1ZD r2 = AnonymousClass1ZD.A02;
        if (r2 != null) {
            0qQ.A0B(userSession, 0);
            ? fBc = new C49878FBc(fragment, (0lg) userSession);
            fBc.A00 = 0;
            r2.A00 = fBc;
            fBc.A04("TOGGLE_CENTRAL_IDENTITY_SYNC");
            return;
        }
        DbS.A15();
        throw AnonymousClass00P.createAndThrow();
    }
}
