package X;

public abstract class RVT {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "AMAZON";
            case 2:
                return "JEST_E2E_AMAZON";
            case 3:
                return "SHOPEE_TH";
            case 4:
                return "WALMART";
            default:
                return "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
        }
    }
}
