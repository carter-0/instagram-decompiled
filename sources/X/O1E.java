package X;

import com.instagram.model.rtc.RtcIgNotification;

public abstract class O1E {
    public static final RtcIgNotification A00(AnonymousClass5HJ r12) {
        String str;
        String str2 = r12.A1V;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = r12.A1I;
        if (str3 == null || str3.length() == 0) {
            str = null;
        } else {
            str = 002.A0R(str2, str3);
        }
        String str4 = r12.A0g;
        String str5 = r12.A0j;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = r12.A0X;
        String str7 = r12.A11;
        String str8 = r12.A12;
        String str9 = r12.A1H;
        if (str9 == null) {
            str9 = r12.A0r;
        }
        return new RtcIgNotification(str4, str5, str6, str7, str8, str9, r12.A1C, str, r12.A17, r12.A18);
    }
}
