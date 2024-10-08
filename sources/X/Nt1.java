package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public abstract class Nt1 {
    public static void A00(GSY gsy, 0wc r5, UserSession userSession, DirectThreadKey directThreadKey, String str) {
        String str2;
        String str3;
        String str4;
        Long l;
        Number number;
        String str5;
        Number number2;
        if (182.A06(0Tu.A05, userSession, 36328328039382254L)) {
            0Aj A0e = AnonymousClass7TE.A0e(r5, "direct_expression_tray_tap");
            if (A0e.isSampled()) {
                String str6 = null;
                if (directThreadKey != null) {
                    str2 = C67003Mgb.A01(directThreadKey);
                } else {
                    str2 = null;
                }
                C66580MXl.A1K(A0e, str2);
                if (gsy != null) {
                    str3 = gsy.A03;
                } else {
                    str3 = null;
                }
                A0e.AAJ("target", str3);
                if (gsy != null && (number2 = (Number) gsy.A00) != null) {
                    switch (number2.intValue()) {
                        case 1:
                            str4 = "tap_hscroll";
                            break;
                        case 2:
                            str4 = "see_more";
                            break;
                        case 3:
                            str4 = "edit_avatar";
                            break;
                        case 4:
                            str4 = "create_sticker";
                            break;
                        default:
                            str4 = "tab_switch";
                            break;
                    }
                } else {
                    str4 = null;
                }
                DbS.A1J(A0e, str4);
                if (gsy == null || (str5 = gsy.A02) == null) {
                    l = null;
                } else {
                    l = AnonymousClass7TE.A10(str5);
                }
                A0e.A9F("pack_id", l);
                if (!(gsy == null || (number = (Number) gsy.A01) == null)) {
                    switch (number.intValue()) {
                        case 1:
                            str6 = "favorite";
                            break;
                        case 2:
                            str6 = "your_sticker";
                            break;
                        case 3:
                            str6 = "create_sticker";
                            break;
                        case 4:
                            str6 = "giphy";
                            break;
                        default:
                            str6 = "recent";
                            break;
                    }
                }
                A0e.AAJ("category", str6);
                A0e.AAJ("bottom_sheet_session_id", str);
                A0e.Cgf();
            }
        }
    }
}
