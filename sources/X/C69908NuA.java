package X;

/* renamed from: X.NuA  reason: case insensitive filesystem */
public abstract class C69908NuA {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "WINNER";
                break;
            case 2:
                str = "MEMBER";
                break;
            case 3:
                str = "OTHER";
                break;
            default:
                str = "CREATOR";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
