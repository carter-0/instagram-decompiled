package X;

public abstract class HWK {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "JOIN_AND_REINVITE";
                break;
            case 2:
                str = "BLEND_CLIPS_VIEWER";
                break;
            default:
                str = "INVITE";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
