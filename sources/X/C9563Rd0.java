package X;

/* renamed from: X.Rd0  reason: case insensitive filesystem */
public abstract class C9563Rd0 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "UNKNOWN";
            case 1:
                return "DEFAULT";
            case 2:
                return "SEQ_PREFERRED";
            case 3:
                return "SEQ_NONPREFERRED";
            case 4:
                return "HE_PREFERRED";
            default:
                return "HE_NONPREFERRED";
        }
    }
}
