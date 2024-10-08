package X;

import java.util.Locale;

/* renamed from: X.Xq2  reason: case insensitive filesystem */
public final class C21995Xq2 {
    public static final TAH A00 = TAH.A02("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] A01 = new String[256];
    public static final String[] A02 = new String[64];
    public static final String[] A03 = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = A01;
            if (i2 >= 256) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i2)};
            C22023Xt4 xt4 = SUS.A04;
            strArr[i2] = String.format(Locale.US, "%8s", objArr).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = A02;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (char c = 0; c < 1; c = 1) {
            int i3 = iArr[c];
            strArr2[i3 | 8] = 002.A0R(strArr2[i3], "|PADDED");
        }
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i4 = 0;
        do {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            int i7 = i6 | i5;
            strArr2[i7] = 002.A0T(strArr2[i6], strArr2[i5], '|');
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(strArr2[i6]);
            A1A.append('|');
            A1A.append(strArr2[i5]);
            strArr2[i7 | 8] = AnonymousClass7TF.A0l("|PADDED", A1A);
            i4++;
        } while (i4 < 3);
        do {
            if (strArr2[i] == null) {
                strArr2[i] = A01[i];
            }
            i++;
        } while (i < 64);
    }

    public static String A00(byte b, byte b2, int i, int i2, boolean z) {
        String format;
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr = A03;
        if (b < 10) {
            format = strArr[b];
        } else {
            Object[] objArr = {Byte.valueOf(b)};
            C22023Xt4 xt4 = SUS.A04;
            format = String.format(Locale.US, "0x%02x", objArr);
        }
        if (b2 == 0) {
            str = "";
        } else {
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    if (b2 == 1) {
                        str = "ACK";
                    }
                } else if (!(b == 7 || b == 8)) {
                    String[] strArr2 = A02;
                    if (b2 >= 64) {
                        strArr2 = A01;
                    }
                    str = strArr2[b2];
                    if (b == 5) {
                        if ((b2 & 4) != 0) {
                            str2 = "HEADERS";
                            str3 = "PUSH_PROMISE";
                        }
                    } else if (b == 0 && (b2 & 32) != 0) {
                        str2 = "PRIORITY";
                        str3 = "COMPRESSED";
                    }
                    str = str.replace(str2, str3);
                }
            }
            str = A01[b2];
        }
        if (z) {
            str4 = "<<";
        } else {
            str4 = ">>";
        }
        Object[] objArr2 = {str4, Integer.valueOf(i), Integer.valueOf(i2), format, str};
        C22023Xt4 xt42 = SUS.A04;
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", objArr2);
    }
}
