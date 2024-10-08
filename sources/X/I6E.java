package X;

import android.net.Uri;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;

public final class I6E {
    public static final I6E A00 = new Object();

    public static final void A00(AnonymousClass0iw r3, UserSession userSession, 1Xj r5, Integer num, String str) {
        String str2;
        Integer num2;
        String str3;
        String str4;
        String str5;
        String iconicHorizonWorldDeeplink;
        if (r5 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "ig_iconic_entrypoints");
            if (A0e.isSampled()) {
                A0e.AAJ(TraceFieldType.AdhocEventName, str);
                C51965G9l.A1J(A0e, r5.A0C.getPk());
                switch (num.intValue()) {
                    case 0:
                        str2 = "reels";
                        break;
                    case 1:
                        str2 = "feed";
                        break;
                    default:
                        str2 = "stories";
                        break;
                }
                A0e.AAJ("product_type", str2);
                if (r5.A5F()) {
                    num2 = AnonymousClass05K.A00;
                } else if (r5.CeS()) {
                    num2 = AnonymousClass05K.A0C;
                } else {
                    num2 = AnonymousClass05K.A01;
                }
                switch (num2.intValue()) {
                    case 0:
                        str3 = "carousel";
                        break;
                    case 1:
                        str3 = "photo";
                        break;
                    default:
                        str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
                        break;
                }
                A0e.AAJ("media_type", str3);
                JSO A0l = C51966G9m.A0l(r5);
                String str6 = null;
                if (A0l != null) {
                    str4 = A0l.getIconicHorizonWorldDeeplink();
                } else {
                    str4 = null;
                }
                A0e.AAJ(C66579MXk.A00(286), str4);
                JSO A0l2 = C51966G9m.A0l(r5);
                if (A0l2 != null) {
                    str6 = A0l2.getIconicHorizonWorldDeeplink();
                }
                String str7 = null;
                if (str6 != null) {
                    Matcher matcher = Pattern.compile("[?&]r=([^&]*)").matcher(str6);
                    if (matcher.find()) {
                        str7 = matcher.group(1);
                    }
                }
                A0e.AAJ("referral_source", str7);
                JSO A0l3 = C51966G9m.A0l(r5);
                if (A0l3 == null || (iconicHorizonWorldDeeplink = A0l3.getIconicHorizonWorldDeeplink()) == null) {
                    str5 = null;
                } else {
                    str5 = Uri.parse(iconicHorizonWorldDeeplink).getQueryParameter("hwsh");
                }
                A0e.AAJ("hwsh", str5);
                A0e.Cgf();
            }
        }
    }

    public static final void A01(AnonymousClass0iw r3, UserSession userSession, String str) {
        AnonymousClass7TG.A1O(userSession, r3);
        if (!C69903Nu5.A00(userSession) && str != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "ig_iconic_entrypoints_dm");
            if (A0e.isSampled()) {
                A0e.AAJ(TraceFieldType.AdhocEventName, "impression");
                A0e.Cgf();
            }
        }
    }

    public static final void A02(AnonymousClass0iw r3, UserSession userSession, String str) {
        AnonymousClass7TG.A1O(userSession, r3);
        if (!C69903Nu5.A00(userSession) && str != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "ig_iconic_entrypoints_dm");
            if (A0e.isSampled()) {
                A0e.AAJ(TraceFieldType.AdhocEventName, "cta_tap");
                A0e.Cgf();
            }
        }
    }

    public final void A03(AnonymousClass0iw r2, UserSession userSession, 1Xj r4, Integer num) {
        AnonymousClass7TG.A1N(userSession, r2);
        A00(r2, userSession, r4, num, "cta_tap");
    }

    public final void A04(AnonymousClass0iw r2, UserSession userSession, 1Xj r4, Integer num) {
        AnonymousClass7TG.A1N(userSession, r2);
        A00(r2, userSession, r4, num, "impression");
    }
}
