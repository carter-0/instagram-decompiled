package X;

/* renamed from: X.52X  reason: invalid class name */
public abstract class AnonymousClass52X {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CONNECTED";
            case 2:
                return "UNMETERED";
            case 3:
                return "NOT_ROAMING";
            case 4:
                return "METERED";
            case 5:
                return "TEMPORARILY_UNMETERED";
            default:
                return "NOT_REQUIRED";
        }
    }
}
