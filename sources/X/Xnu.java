package X;

public final class Xnu {
    public final int A00;
    public final String A01;
    public final XRO A02;

    public static Xnu A00(String str) {
        XRO xro;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw C21055XCg.A0V("Unexpected status line: ", str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                xro = XRO.HTTP_1_0;
            } else if (charAt == 1) {
                xro = XRO.HTTP_1_1;
            } else {
                throw C21055XCg.A0V("Unexpected status line: ", str);
            }
        } else if (str.startsWith("ICY ")) {
            xro = XRO.HTTP_1_0;
            i = 4;
        } else {
            throw C21055XCg.A0V("Unexpected status line: ", str);
        }
        int length = str.length();
        int i2 = i + 3;
        if (length >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (length <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw C21055XCg.A0V("Unexpected status line: ", str);
                }
                return new Xnu(str2, xro, parseInt);
            } catch (NumberFormatException unused) {
                throw C21055XCg.A0V("Unexpected status line: ", str);
            }
        } else {
            throw C21055XCg.A0V("Unexpected status line: ", str);
        }
    }

    public Xnu(String str, XRO xro, int i) {
        this.A02 = xro;
        this.A00 = i;
        this.A01 = str;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (this.A02 == XRO.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        A1A.append(str);
        A1A.append(' ');
        A1A.append(this.A00);
        String str2 = this.A01;
        if (str2 != null) {
            A1A.append(' ');
            A1A.append(str2);
        }
        return A1A.toString();
    }
}
