package X;

/* renamed from: X.9Qz  reason: invalid class name and case insensitive filesystem */
public abstract class C378729Qz {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "PREPARE_STARTED";
            case 1:
                return "PREPARED";
            case 2:
                return "RECORDING_STARTING";
            case 3:
                return "RECORDING_STARTED";
            case 4:
                return "RECORDING";
            case 5:
                return "STOP_STARTED";
            default:
                return "STOPPED";
        }
    }
}
