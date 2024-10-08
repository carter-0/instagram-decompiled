package X;

/* renamed from: X.Ero  reason: case insensitive filesystem */
public abstract class C49245Ero {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass05K.A00(6)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "reporter_appeal";
                    break;
                case 2:
                    str2 = "actor_appeal";
                    break;
                case 3:
                    str2 = "actor_violation";
                    break;
                case 4:
                    str2 = "fbga";
                    break;
                case 5:
                    str2 = "ob_decision_notice";
                    break;
                default:
                    str2 = "report";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return null;
    }
}
