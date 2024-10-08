package X;

import com.instagram.common.session.UserSession;

public abstract class HZV {
    public static void A00(UserSession userSession, 1Xl r6, AnonymousClass4DU r7, Integer num, String str, int i) {
        long j;
        String str2;
        Long A10;
        0Aj A0e = AnonymousClass7TE.A0e(C51967G9n.A0Z(r7, userSession, r6, 0), "instagram_delayed_skip_ad_timer");
        if (A0e.isSampled()) {
            C254523sc A03 = C254513sb.A03(userSession, r6, r7, "instagram_delayed_skip_ad_timer");
            1Xj BPf = r6.BPf();
            0jB A01 = A03.A01();
            String A07 = C231122qu.A07(userSession, BPf);
            if (A07 == null || (A10 = AnonymousClass7TE.A10(A07)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A17(A0e, j);
            C51972G9s.A16(A0e, BPf, "tracking_token", C294185m0.A07(userSession, BPf, r7));
            A0e.AAJ("a_pk", C51973G9u.A0j(userSession, BPf));
            A0e.AAJ("carousel_media_id", C51966G9m.A1C(C271774jZ.A10, A01));
            switch (num.intValue()) {
                case 0:
                    str2 = "impression";
                    break;
                case 1:
                    str2 = "click";
                    break;
                case 2:
                    str2 = "start";
                    break;
                case 3:
                    str2 = "pause";
                    break;
                case 4:
                    str2 = "resume";
                    break;
                case 5:
                    str2 = "destroy";
                    break;
                case 6:
                    str2 = "complete";
                    break;
                default:
                    str2 = "fragment_paused";
                    break;
            }
            A0e.A9F("remaining_time", DbV.A0p(A0e, "event_type", str2, i));
            A0e.AAJ("reason", str);
            A0e.Cgf();
        }
    }
}
