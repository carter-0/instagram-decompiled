package X;

/* renamed from: X.EqO  reason: case insensitive filesystem */
public abstract class C49157EqO {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass05K.A00(5)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "approved";
                    break;
                case 2:
                    str2 = "rejected";
                    break;
                case 3:
                    str2 = "pending";
                    break;
                case 4:
                    str2 = "outdated";
                    break;
                default:
                    str2 = "";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return null;
    }
}
