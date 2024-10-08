package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.9xl  reason: invalid class name and case insensitive filesystem */
public abstract class C394239xl {
    public static final boolean A00(UserSession userSession, String str, List list) {
        C317876nz r0;
        int i;
        String str2;
        0qQ.A0B(userSession, 0);
        boolean z = false;
        if (list.size() == 1 && AnonymousClass7TF.A0j(str).equals("new-single-sticker") && (r0 = (C317876nz) 00k.A0J(list)) != null) {
            switch (r0.A00().ordinal()) {
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 20:
                case 21:
                    return true;
                case 63:
                    1Av A00 = 1Au.A00(userSession);
                    if (1Av.A07(A00, "music_pick_template_new_sticker_time_stamp", 4)) {
                        i = (AnonymousClass7TE.A0R(A00.A6X.CDM(A00, 1Av.A8a[133])) > 0 ? 1 : (AnonymousClass7TE.A0R(A00.A6X.CDM(A00, 1Av.A8a[133])) == 0 ? 0 : -1));
                        break;
                    } else {
                        return true;
                    }
                case 94:
                    1Av A002 = 1Au.A00(userSession);
                    if (1Av.A07(A002, "stories_template_new_sticker_time_stamp", 4)) {
                        i = (A002.A01.getLong("stories_template_new_sticker_time_stamp", 0) > 0 ? 1 : (A002.A01.getLong("stories_template_new_sticker_time_stamp", 0) == 0 ? 0 : -1));
                        break;
                    } else {
                        return true;
                    }
                case 97:
                    C314996jB A003 = C314986jA.A00(userSession);
                    0eE r02 = AnonymousClass0t1.A01;
                    UserSession userSession2 = A003.A00;
                    FanClubInfoDict B3v = r02.A01(userSession2).A03.B3v();
                    if (B3v != null) {
                        str2 = B3v.getFanClubId();
                    } else {
                        str2 = null;
                    }
                    if (str2 != null && 182.A06(0Tu.A05, userSession2, 36323775372864980L)) {
                        0xa r2 = A003.A01;
                        if (r2.getInt("uprank_story_sticker_last_seen_month", 0) != Calendar.getInstance().get(2) || r2.getInt("uprank_story_sticker_impression_for_current_month", 0) < 3) {
                            return true;
                        }
                    }
                    break;
                case 110:
                    int i2 = AnonymousClass7TE.A0q(userSession).getInt("seen_whatsapp_sticker_nux_times", 0);
                    if (i2 <= 2) {
                        AnonymousClass7TG.A1M(1Au.A00(userSession).A01, "seen_whatsapp_sticker_nux_times", i2 + 1);
                        return true;
                    }
                    break;
            }
            z = false;
            if (i == 0) {
                return true;
            }
        }
        return z;
    }
}
