package X;

import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

/* renamed from: X.Ene  reason: case insensitive filesystem */
public abstract class C49002Ene {
    public static final String A00(String str) {
        String str2;
        boolean z;
        if (str != null) {
            str2 = AnonymousClass7TF.A0k(str);
        } else {
            str2 = null;
        }
        String A00 = C273654mx.A00(1242);
        String A002 = C273654mx.A00(1202);
        String str3 = "SETTINGS";
        if (str2 == null) {
            return null;
        }
        switch (str2.hashCode()) {
            case -2077709277:
                z = str2.equals(str3);
                break;
            case -1382453013:
                str3 = "NOTIFICATION";
                z = str2.equals("NOTIFICATION");
                break;
            case -787777531:
                str3 = "STORY_INSIGHTS";
                z = str2.equals("STORY_INSIGHTS");
                break;
            case -602962448:
                if (str2.equals("MONETIZATION_INBOX")) {
                    return "MONETIZATION_INBOX";
                }
                break;
            case -196575407:
                if (str2.equals("PRO_HOME")) {
                    return "PRO_HOME";
                }
                break;
            case 2591:
                if (str2.equals("QP")) {
                    return "QP";
                }
                break;
            case 2511386:
                if (str2.equals("REEL")) {
                    return "REEL";
                }
                break;
            case 41965244:
                if (str2.equals("PAYOUT_HUB")) {
                    return "PAYOUT_HUB";
                }
                break;
            case 66081660:
                if (str2.equals(PaymentDetailChangeTypes$Companion.EMAIL)) {
                    return PaymentDetailChangeTypes$Companion.EMAIL;
                }
                break;
            case 177370949:
                if (str2.equals(A002)) {
                    return A002;
                }
                break;
            case 408556937:
                if (str2.equals("PROFILE")) {
                    return "PROFILE";
                }
                break;
            case 523908395:
                if (str2.equals("POST_LIVE")) {
                    return "POST_LIVE";
                }
                break;
            case 746833344:
                if (str2.equals("NATIVE_PROMO_DIALOG")) {
                    return "NATIVE_PROMO_DIALOG";
                }
                break;
            case 755272608:
                if (str2.equals("ADVANCED_SETTINGS")) {
                    return "ADVANCED_SETTINGS";
                }
                break;
            case 1261689812:
                if (str2.equals(A00)) {
                    return A00;
                }
                break;
            case 1915236889:
                if (str2.equals("LIVE_SCHEDULE_AUDIENCE")) {
                    return "LIVE_SCHEDULE_AUDIENCE";
                }
                break;
            case 1960100960:
                if (str2.equals("REEL_INSIGHTS")) {
                    return "REEL_INSIGHTS";
                }
                break;
        }
        if (!z) {
            return "UNKNOWN";
        }
        return str3;
    }
}
