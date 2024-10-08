package X;

/* renamed from: X.EkI  reason: case insensitive filesystem */
public abstract class C48795EkI {
    public static final String A00(String str) {
        int hashCode = str.hashCode();
        String A00 = C66579MXk.A00(716);
        switch (hashCode) {
            case -1063738021:
                if (str.equals("prodash_tools")) {
                    return "prodash_tools";
                }
                break;
            case 3615:
                if (str.equals("qp")) {
                    return "qp";
                }
                break;
            case 3009503:
                if (str.equals("aymt")) {
                    return "aymt";
                }
                break;
            case 900249709:
                if (str.equals("sr_header")) {
                    return "sr_header";
                }
                break;
            case 1874750791:
                if (!str.equals(A00)) {
                    return "unknown";
                }
                return A00;
        }
        return "unknown";
    }
}
