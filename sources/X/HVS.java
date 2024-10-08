package X;

public abstract class HVS {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "LOADING";
                break;
            case 2:
                str = "SUCCESS";
                break;
            case 3:
                str = "ERROR";
                break;
            default:
                str = "UNINITIALIZED";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
