package X;

/* renamed from: X.Rdy  reason: case insensitive filesystem */
public abstract class C9620Rdy {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "SYSTEM_ERROR";
            case 2:
                return "CHECKOUT_ERROR_RISK";
            case 3:
                return "PAYMENT_REQUEST_CANCELLED";
            case 4:
                return "USER_OPTIONALITY_SELECTION";
            case 5:
                return "INTERNAL_ERROR";
            default:
                return "USER_CANCELLATION";
        }
    }
}
