package X;

import com.facebook.location.platform.api.Location;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.WorldLocationPagesInfo;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Hdz  reason: case insensitive filesystem */
public abstract class C55209Hdz {
    public static final void A00(HOV hov, AnonymousClass0iw r9, UserSession userSession, 1Xj r11, Integer num, String str, Map map) {
        String str2;
        String str3;
        String str4;
        HOU hou;
        String str5;
        String str6;
        WorldLocationPagesInfo CGk;
        Integer BES;
        JSO A0l = C51966G9m.A0l(r11);
        if (A0l == null || (BES = A0l.BES()) == null) {
            str2 = null;
        } else {
            str2 = BES.toString();
        }
        if (str2 == null) {
            str2 = "";
        }
        JSO A0l2 = C51966G9m.A0l(r11);
        if (A0l2 == null || (str3 = A0l2.getIconicHorizonWorldDeeplink()) == null) {
            str3 = "";
        }
        JSO A0l3 = C51966G9m.A0l(r11);
        if (A0l3 == null || (str4 = A0l3.getIconicHorizonWorldName()) == null) {
            str4 = "";
        }
        0wc A01 = AnonymousClass0kN.A01(r9, userSession);
        String str7 = null;
        Matcher matcher = Pattern.compile("[?&]r=([^&]*)").matcher(str3);
        if (matcher.find()) {
            str7 = matcher.group(1);
        }
        0Aj A0e = AnonymousClass7TE.A0e(A01, C66579MXk.A00(897));
        if (A0e.isSampled()) {
            A0e.A8M(hov, C66579MXk.A00(819));
            if (r11.A5F()) {
                hou = HOU.CAROUSEL;
            } else if (r11.CeS()) {
                hou = HOU.VIDEO;
            } else {
                hou = HOU.PHOTO;
            }
            A0e.A8M(hou, "media_type");
            JSO A0l4 = C51966G9m.A0l(r11);
            if (A0l4 == null || (CGk = A0l4.CGk()) == null || (str5 = CGk.getWorldId()) == null) {
                str5 = "";
            }
            A0e.AAJ(AnonymousClass000.A00(1415), str5);
            switch (num.intValue()) {
                case 0:
                    str6 = "mediaTap";
                    break;
                case 1:
                    str6 = "pageImpression";
                    break;
                case 2:
                    str6 = "report";
                    break;
                case 3:
                    str6 = "ctaTap";
                    break;
                case 4:
                    str6 = "storyRingTap";
                    break;
                case 5:
                    str6 = "paginate";
                    break;
                case 6:
                    str6 = "ctaImpression";
                    break;
                default:
                    str6 = "openHorizonProfile";
                    break;
            }
            A0e.AAJ(TraceFieldType.AdhocEventName, str6);
            String A2n = r11.A2n();
            if (A2n == null) {
                A2n = "";
            }
            A0e.AAJ(AnonymousClass000.A00(3349), A2n);
            A0e.A9H(Location.EXTRAS, 0Yt.A04(map, 0Yt.A07(AnonymousClass7TH.A0h("referralSource", str7, AnonymousClass7TE.A1L("currentPresence", str2), AnonymousClass7TE.A1L("horizonWorldDeeplink", str3), AnonymousClass7TE.A1L("horizonWorldName", str4)))));
            if (str == null) {
                str = "";
            }
            A0e.AAJ("target_media_id", str);
            A0e.Cgf();
        }
    }
}
