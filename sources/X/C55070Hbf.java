package X;

/* renamed from: X.Hbf  reason: case insensitive filesystem */
public abstract class C55070Hbf {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "Selected";
                break;
            case 2:
                str = "Suggested";
                break;
            default:
                str = "Search";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
