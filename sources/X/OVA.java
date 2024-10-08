package X;

public final class OVA {
    public final String A00;
    public final String A01;

    public final boolean A00(char c, char c2) {
        int i = 0;
        while (true) {
            String str = this.A01;
            if (i >= str.length()) {
                return false;
            }
            if (str.charAt(i) == c && this.A00.charAt(i) == c2) {
                return true;
            }
            i++;
        }
    }

    public OVA(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public OVA(OVA... ovaArr) {
        String str = "";
        String str2 = str;
        int i = 0;
        do {
            OVA ova = ovaArr[i];
            str = 002.A0R(str, ova.A01);
            str2 = 002.A0R(str2, ova.A00);
            i++;
        } while (i < 2);
        this.A01 = str;
        this.A00 = str2;
    }
}
