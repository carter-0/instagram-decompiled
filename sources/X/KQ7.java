package X;

public final class KQ7 extends C62797KmZ {
    public final Integer A00;

    public final String toString() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "ERROR_NULL_CONFIG";
                    break;
                case 2:
                    str = "ERROR_NULL_STATE";
                    break;
                case 3:
                    str = "EXCLUSIVE_CONTENT";
                    break;
                case 4:
                    str = "LEGACY_NOT_ALLOWED";
                    break;
                case 5:
                    str = "SCHEDULED_CONTENT";
                    break;
                case 6:
                    str = "SHARE_ONLY_TO_PROFILE";
                    break;
                default:
                    str = "CLOSE_FRIENDS";
                    break;
            }
        } else {
            str = "null";
        }
        return G9w.A0k("Unavailable(unavailableReason=", str);
    }

    public KQ7(Integer num) {
        this.A00 = num;
    }
}
