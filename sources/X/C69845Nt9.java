package X;

/* renamed from: X.Nt9  reason: case insensitive filesystem */
public abstract class C69845Nt9 {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "FULL_VIEW";
                break;
            case 2:
                str = "THREAD_DETAILS";
                break;
            case 3:
                str = "OTHER";
                break;
            default:
                str = "CHAT_THREAD";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
