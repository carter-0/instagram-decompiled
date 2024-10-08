package X;

/* renamed from: X.HxG  reason: case insensitive filesystem */
public abstract class C56363HxG {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "Center";
                break;
            case 2:
                str = "End";
                break;
            default:
                str = "Start";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "Center";
            case 2:
                return "End";
            default:
                return "Start";
        }
    }
}
