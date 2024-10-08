package X;

/* renamed from: X.Mlm  reason: case insensitive filesystem */
public abstract class C67312Mlm {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "INBOX";
            case 1:
                return "PENDING_INBOX";
            case 2:
                return "TOP_THREADS";
            case 3:
                return "SPAM_INBOX";
            case 4:
                return "BC_PARTNERSHIP_INBOX";
            default:
                return "LOCKED_CHAT";
        }
    }
}
