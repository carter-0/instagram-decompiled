package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public abstract class FCS {
    public static final void A01(UserSession userSession, FragmentActivity fragmentActivity) {
        int i = 2131973999;
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 2342163236943700083L)) {
            i = 2131973998;
        }
        String A16 = AnonymousClass7TE.A16(fragmentActivity, i);
        C46649DiU A04 = C46649DiU.A04(C273654mx.A00(623), A00(userSession));
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0U = A16;
        A0N.A0l = true;
        A04.A0D(fragmentActivity, A0N);
    }

    public static final void A02(UserSession userSession, FragmentActivity fragmentActivity) {
        0qQ.A0B(userSession, 0);
        FCT.A01((AnonymousClass0iw) null, userSession, "settings", "bloks_settings_entrypoint_impression", (String) null);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C359638dF.A04(fragmentActivity2, new C359618dD(userSession), C273654mx.A00(623), A00(userSession), AnonymousClass30M.A06(AnonymousClass30J.SECONDS, AnonymousClass30K.A03(AnonymousClass30J.HOURS, 24)));
    }

    public static final HashMap A00(UserSession userSession) {
        Integer num;
        String str;
        HashMap A02 = 0Yt.A02(new 0eP[]{AnonymousClass7TE.A1L("is_internal_build", String.valueOf(2R8.A00(userSession)))});
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36320227729875058L)) {
            num = AnonymousClass05K.A00;
        } else {
            0qQ.A0B(userSession, 0);
            if (182.A06(r3, userSession, 2342163236943700083L)) {
                num = AnonymousClass05K.A01;
            }
            return A02;
        }
        if (num.intValue() != 0) {
            str = "REMOVED_MENU";
        } else {
            str = "SIMPLIFIED_MENU";
        }
        A02.put("ig_profile_menu_variant", str);
        return A02;
    }
}
