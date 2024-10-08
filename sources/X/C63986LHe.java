package X;

/* renamed from: X.LHe  reason: case insensitive filesystem */
public abstract class C63986LHe {
    public static Integer A00(String str) {
        if (str.equals("ONE_DAY")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("ONE_WEEK")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("TWO_WEEKS")) {
            return AnonymousClass05K.A0C;
        }
        if (str.equals("ONE_MONTH")) {
            return AnonymousClass05K.A0N;
        }
        if (str.equals("THREE_MONTHS")) {
            return AnonymousClass05K.A0Y;
        }
        if (str.equals("SIX_MONTHS")) {
            return AnonymousClass05K.A0j;
        }
        if (str.equals("SIX_WEEKS")) {
            return AnonymousClass05K.A0u;
        }
        if (str.equals("ONE_YEAR")) {
            return AnonymousClass05K.A15;
        }
        if (str.equals("TWO_YEARS")) {
            return AnonymousClass05K.A1F;
        }
        if (str.equals("LIFETIME")) {
            return AnonymousClass05K.A1I;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ONE_DAY";
            case 1:
                return "ONE_WEEK";
            case 2:
                return "TWO_WEEKS";
            case 3:
                return "ONE_MONTH";
            case 4:
                return "THREE_MONTHS";
            case 5:
                return "SIX_MONTHS";
            case 6:
                return "SIX_WEEKS";
            case 7:
                return "ONE_YEAR";
            case 8:
                return "TWO_YEARS";
            default:
                return "LIFETIME";
        }
    }
}
