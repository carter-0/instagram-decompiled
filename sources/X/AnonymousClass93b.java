package X;

/* renamed from: X.93b  reason: invalid class name */
public abstract class AnonymousClass93b {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "headload";
            case 2:
                return "ptr";
            case 3:
                return "tailload";
            case 4:
                return AnonymousClass000.A00(3166);
            default:
                return "prefetch";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return AnonymousClass000.A00(2290);
            case 2:
                return AnonymousClass000.A00(4387);
            case 3:
                return "TAIL_LOAD";
            case 4:
                return "CACHE_FETCH";
            default:
                return "PREFETCH";
        }
    }
}
