package X;

/* renamed from: X.NuV  reason: case insensitive filesystem */
public abstract class C69929NuV {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "plain mode";
            case 1:
                return "vanish mode";
            case 2:
                return "mixed vanish mode";
            case 3:
                return "legacy_armadillo_cutover";
            case 4:
                return "maybe cutover";
            case 5:
                return "instamadillo_cutover";
            default:
                return "instamadillo_ttlc";
        }
    }
}
