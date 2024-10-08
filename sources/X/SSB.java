package X;

import java.util.regex.Pattern;

public final class SSB {
    public static final Pattern A02 = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public static final Pattern A03 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public final C11389SRd A00 = new C11389SRd();
    public final StringBuilder A01 = AnonymousClass7TE.A1A();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r1 > r0) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r1 != '.') goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r1 == '_') goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.C11389SRd r6, java.lang.StringBuilder r7) {
        /*
            r5 = 0
            r7.setLength(r5)
            int r4 = r6.A01
            r3 = r4
            int r2 = r6.A00
        L_0x0009:
            if (r3 >= r2) goto L_0x0042
            if (r5 != 0) goto L_0x0042
            byte[] r0 = r6.A02
            byte r0 = r0[r3]
            char r1 = (char) r0
            r0 = 65
            if (r1 < r0) goto L_0x0024
            r0 = 90
            if (r1 <= r0) goto L_0x003c
            r0 = 97
            if (r1 < r0) goto L_0x0038
            r0 = 122(0x7a, float:1.71E-43)
        L_0x0020:
            if (r1 <= r0) goto L_0x003c
        L_0x0022:
            r5 = 1
            goto L_0x0009
        L_0x0024:
            r0 = 48
            if (r1 < r0) goto L_0x002b
            r0 = 57
            goto L_0x0020
        L_0x002b:
            r0 = 35
            if (r1 == r0) goto L_0x003c
            r0 = 45
            if (r1 == r0) goto L_0x003c
            r0 = 46
            if (r1 == r0) goto L_0x003c
            goto L_0x0022
        L_0x0038:
            r0 = 95
            if (r1 != r0) goto L_0x0022
        L_0x003c:
            int r3 = r3 + 1
            r7.append(r1)
            goto L_0x0009
        L_0x0042:
            int r3 = r3 - r4
            r6.A0P(r3)
            java.lang.String r0 = r7.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SSB.A00(X.SRd, java.lang.StringBuilder):java.lang.String");
    }

    public static void A02(C11389SRd sRd) {
        int i;
        while (true) {
            boolean z = true;
            while (true) {
                int i2 = sRd.A00;
                int i3 = sRd.A01;
                if (i2 - i3 > 0 && z) {
                    byte[] bArr = sRd.A02;
                    byte b = bArr[i3];
                    char c = (char) b;
                    if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                        i = 1;
                    } else {
                        if (i3 + 2 <= i2) {
                            int i4 = i3 + 1;
                            if (b == 47) {
                                int i5 = i4 + 1;
                                if (bArr[i4] == 42) {
                                    while (true) {
                                        int i6 = i5 + 1;
                                        if (i6 >= i2) {
                                            break;
                                        } else if (((char) bArr[i5]) == '*' && ((char) bArr[i6]) == '/') {
                                            i2 = i6 + 1;
                                            i5 = i2;
                                        } else {
                                            i5 = i6;
                                        }
                                    }
                                    i = i2 - i3;
                                }
                            } else {
                                continue;
                            }
                        }
                        z = false;
                    }
                } else {
                    return;
                }
            }
            i = 1;
            sRd.A0P(i);
        }
    }

    public static String A01(C11389SRd sRd, StringBuilder sb) {
        A02(sRd);
        if (Pxe.A06(sRd) == 0) {
            return null;
        }
        String A002 = A00(sRd, sb);
        if (!"".equals(A002)) {
            return A002;
        }
        return 002.A0C("", (char) sRd.A05());
    }
}
