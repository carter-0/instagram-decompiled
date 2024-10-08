package X;

/* renamed from: X.48R  reason: invalid class name */
public abstract class AnonymousClass48R {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "READY_TO_UPLOAD";
            case 2:
                return "UPLOADING";
            case 3:
                return "UPLOAD_FAILED";
            case 4:
                return "WILL_NOT_UPLOAD";
            case 5:
                return "UPLOADED";
            default:
                return "UNSET";
        }
    }

    public static boolean A01(Integer num) {
        switch (num.intValue()) {
            case 4:
            case 5:
                return false;
            default:
                return true;
        }
    }
}
