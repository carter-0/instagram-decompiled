package X;

/* renamed from: X.30N  reason: invalid class name */
public abstract class AnonymousClass30N {
    public static final Integer A00(Integer num, String str) {
        String str2;
        for (Integer num2 : AnonymousClass05K.A00(3)) {
            switch (num2.intValue()) {
                case 1:
                    str2 = "50_percent_visible";
                    break;
                case 2:
                    str2 = "50_percent_visible_to_start";
                    break;
                default:
                    str2 = "any_visible";
                    break;
            }
            if (str2.equals(str)) {
                return num2;
            }
        }
        return num;
    }
}
