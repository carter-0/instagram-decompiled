package X;

/* renamed from: X.9NW  reason: invalid class name */
public abstract class AnonymousClass9NW {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PREFETCH";
            case 2:
                return "LOAD_ONLY";
            case 3:
                return "SYSTEM_PREFETCH";
            case 4:
                return "FALLBACK_DOWNLOAD";
            case 5:
                return "MERGED";
            case 6:
                return "BACKGROUND";
            case 7:
                return "OPTIMISTIC_LOAD";
            case 8:
                return "UNINSTALL";
            default:
                return "FOREGROUND";
        }
    }
}
