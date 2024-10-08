package X;

/* renamed from: X.5px  reason: invalid class name and case insensitive filesystem */
public abstract class C296375px {
    public static Integer A00(String str) {
        if (str.equals("UNKNOWN")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("DASH")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("DASH_LIVE")) {
            return AnonymousClass05K.A0C;
        }
        if (str.equals("PROGRESSIVE_DOWNLOAD")) {
            return AnonymousClass05K.A0N;
        }
        if (str.equals("RTC_LIVE")) {
            return AnonymousClass05K.A0Y;
        }
        if (str.equals("HLS")) {
            return AnonymousClass05K.A0j;
        }
        throw new IllegalArgumentException(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "dash";
            case 2:
                return "dash_live";
            case 3:
                return "progressive";
            case 4:
                return "rtc_live";
            case 5:
                return "hls";
            default:
                return "unknown";
        }
    }
}
