package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Xt4  reason: case insensitive filesystem */
public final class C22023Xt4 {
    public final String[] A00;

    public static void A01(String str) {
        if (str == null) {
            throw AnonymousClass7TE.A11("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    Object[] objArr = {Integer.valueOf(charAt), Integer.valueOf(i), str};
                    C22023Xt4 xt4 = SUS.A04;
                    throw C21056XCh.A07("Unexpected char %#04x at %d in header name: %s", objArr);
                }
            }
        } else {
            throw AnonymousClass7TE.A0w("name is empty");
        }
    }

    public static void A02(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31) {
                    if (charAt != 9) {
                        Object[] objArr = {Integer.valueOf(charAt), Integer.valueOf(i), str2, str};
                        C22023Xt4 xt4 = SUS.A04;
                        throw C21056XCh.A07("Unexpected char %#04x at %d in %s value: %s", objArr);
                    }
                } else if (charAt >= 127) {
                    Object[] objArr2 = {Integer.valueOf(charAt), Integer.valueOf(i), str2, str};
                    C22023Xt4 xt42 = SUS.A04;
                    throw C21056XCh.A07("Unexpected char %#04x at %d in %s value: %s", objArr2);
                }
            }
            return;
        }
        throw AnonymousClass7TE.A11(002.A0g("value for name ", str2, AnonymousClass000.A00(1978)));
    }

    public final String A03(String str) {
        String[] strArr = this.A00;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22023Xt4) || !Arrays.equals(((C22023Xt4) obj).A00, this.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public C22023Xt4(C21971XoG xoG) {
        List list = xoG.A00;
        this.A00 = (String[]) list.toArray(new String[list.size()]);
    }

    public static C22023Xt4 A00(String... strArr) {
        String[] strArr2 = (String[]) strArr.clone();
        int i = 0;
        while (true) {
            int length = strArr2.length;
            if (i < length) {
                String str = strArr2[i];
                if (str != null) {
                    strArr2[i] = str.trim();
                    i++;
                } else {
                    throw AnonymousClass7TE.A0w("Headers cannot be null");
                }
            } else {
                for (int i2 = 0; i2 < length; i2 += 2) {
                    String str2 = strArr2[i2];
                    String str3 = strArr2[i2 + 1];
                    A01(str2);
                    A02(str3, str2);
                }
                return new C22023Xt4(strArr2);
            }
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        String[] strArr = this.A00;
        int length = strArr.length / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            A1A.append(strArr[i2]);
            A1A.append(": ");
            A1A.append(strArr[i2 + 1]);
            A1A.append("\n");
        }
        return A1A.toString();
    }

    public C22023Xt4(String[] strArr) {
        this.A00 = strArr;
    }
}
