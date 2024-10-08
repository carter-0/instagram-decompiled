package X;

/* renamed from: X.Kso  reason: case insensitive filesystem */
public abstract class C63181Kso {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "CATEGORY_SELECTION";
                break;
            case 2:
                str = "SEARCH_BAR";
                break;
            default:
                str = "ON_LOAD";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
