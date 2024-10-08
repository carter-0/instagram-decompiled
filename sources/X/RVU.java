package X;

public abstract class RVU {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CUSTOM_IAB_FOR_1P";
            case 2:
                return "CUSTOM_IAB_FOR_DTC";
            case 3:
                return "STANDARD_IAB";
            default:
                return "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
        }
    }
}
