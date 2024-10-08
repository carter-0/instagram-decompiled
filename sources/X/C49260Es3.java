package X;

/* renamed from: X.Es3  reason: case insensitive filesystem */
public abstract class C49260Es3 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "UNSET";
            case 1:
                return "SEND_MESSAGE";
            case 2:
                return "PREFILL_COMPOSER_WITH_PROMPT";
            default:
                return "PREFILL_COMPOSER_WITH_META_AI";
        }
    }
}
