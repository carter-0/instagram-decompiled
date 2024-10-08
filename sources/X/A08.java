package X;

public abstract class A08 {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "ORGANIC";
                break;
            case 2:
                str = "AD";
                break;
            case 3:
                str = "NETEGO";
                break;
            case 4:
                str = "STATIC_MODEL";
                break;
            default:
                str = "UNDEFINED";
                break;
        }
        return str.hashCode() + intValue;
    }
}
