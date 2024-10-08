package X;

/* renamed from: X.3tt  reason: invalid class name and case insensitive filesystem */
public abstract class C255293tt {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "suggested_reply";
            case 2:
                return "emoji_quick_reply";
            case 3:
                return "order_upsell";
            case 4:
                return "order_upsell_v2";
            case 5:
                return "appointment_upsell";
            case 6:
                return "thread_ctd_upsell";
            default:
                return "unknown";
        }
    }

    public static String A01(Integer num) {
        int i;
        switch (num.intValue()) {
            case 1:
                return C273654mx.A00(1367);
            case 2:
                i = 2245;
                break;
            case 3:
                i = 2391;
                break;
            case 4:
                i = 2392;
                break;
            case 5:
                i = 2076;
                break;
            case 6:
                i = 2507;
                break;
            default:
                return "UNKNOWN";
        }
        return AnonymousClass000.A00(i);
    }
}
