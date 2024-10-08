package X;

public abstract class HZH {
    public static final C53266GlE A00(String str, String str2, String str3, String str4) {
        if (str.equals("SINGULAR_FACT")) {
            if (str4 == null) {
                str4 = "";
            }
            return new C53266GlE(str2, str4, (String) null);
        } else if (str.equals("AFFILIATE_LINKS")) {
            if (str4 == null) {
                str4 = "";
            }
            if (str3 == null) {
                str3 = "";
            }
            return new C53266GlE(str2, str4, str3);
        } else {
            if (str3 == null) {
                str3 = "";
            }
            if (str4 == null) {
                str4 = "";
            }
            return new C53266GlE(str2, str3, str4);
        }
    }
}
