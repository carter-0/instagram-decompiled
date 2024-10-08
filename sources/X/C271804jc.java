package X;

/* renamed from: X.4jc  reason: invalid class name and case insensitive filesystem */
public abstract class C271804jc {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "prefetch";
            case 2:
                return "cross_session";
            case 3:
                return "pool_refresh";
            case 4:
                return "invalid";
            default:
                return "server";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PREFETCH";
            case 2:
                return "CROSS_SESSION";
            case 3:
                return "POOL_REFRESH";
            case 4:
                return "INVALID";
            default:
                return "SURFACE_FETCH";
        }
    }
}
