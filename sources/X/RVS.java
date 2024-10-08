package X;

public abstract class RVS {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CUSTOM_IAB_FOR_1P_BWP";
            case 2:
                return "STANDARD_IAB";
            case 3:
                return "BWI_STANDARD_IAB";
            default:
                return "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
        }
    }
}
