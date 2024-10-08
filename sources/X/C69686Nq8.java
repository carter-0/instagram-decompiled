package X;

/* renamed from: X.Nq8  reason: case insensitive filesystem */
public abstract class C69686Nq8 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "NO_DECISION_MADE";
            case 2:
                return "BACKUP_CREATED";
            case 3:
                return "LOCAL_DEVICE_ONLY";
            default:
                return "FAILURE";
        }
    }
}
