package X;

/* renamed from: X.486  reason: invalid class name */
public class AnonymousClass486 {
    public boolean A00 = true;
    public final AnonymousClass481 A01;

    public AnonymousClass486(AnonymousClass481 r2) {
        this.A01 = r2;
    }

    public void A02(String str) {
        int i;
        int i2;
        byte b;
        0qQ.A0B(str, 0);
        AnonymousClass480 r6 = (AnonymousClass480) this.A01;
        int length = str.length();
        AnonymousClass480.A00(r6, r6.A00, length + 2);
        char[] cArr = r6.A01;
        int i3 = r6.A00;
        int i4 = i3 + 1;
        cArr[i3] = '\"';
        str.getChars(0, length, cArr, i4);
        int i5 = length + i4;
        int i6 = i4;
        while (true) {
            if (i >= i5) {
                i2 = i5 + 1;
                cArr[i5] = '\"';
                break;
            }
            char c = cArr[i];
            byte[] bArr = C255563uL.A00;
            if (c >= ']' || bArr[c] == 0) {
                i6 = i + 1;
            } else {
                for (int i7 = i - i4; i7 < length; i7++) {
                    AnonymousClass480.A00(r6, i, 2);
                    char charAt = str.charAt(i7);
                    if (charAt >= ']' || (b = bArr[charAt]) == 0) {
                        r6.A01[i] = (char) charAt;
                        i++;
                    } else {
                        if (b == 1) {
                            String str2 = C255563uL.A01[charAt];
                            0qQ.A0A(str2);
                            int length2 = str2.length();
                            AnonymousClass480.A00(r6, i, length2);
                            str2.getChars(0, length2, r6.A01, i);
                            i += length2;
                        } else {
                            char[] cArr2 = r6.A01;
                            cArr2[i] = '\\';
                            cArr2[i + 1] = (char) b;
                            i += 2;
                        }
                        r6.A00 = i;
                    }
                }
                AnonymousClass480.A00(r6, i, 1);
                i2 = i + 1;
                r6.A01[i] = '\"';
            }
        }
        r6.A00 = i2;
    }

    public final void A03(String str) {
        0qQ.A0B(str, 0);
        this.A01.FNf(str);
    }

    public final void A00() {
        if (this instanceof AnonymousClass489) {
            AnonymousClass489 r3 = (AnonymousClass489) this;
            r3.A00 = false;
            r3.A03("\n");
            int i = r3.A00;
            for (int i2 = 0; i2 < i; i2++) {
                r3.A03(r3.A01.A00.A02);
            }
            return;
        }
        this.A00 = false;
    }

    public final void A01(char c) {
        AnonymousClass480 r3 = (AnonymousClass480) this.A01;
        AnonymousClass480.A00(r3, r3.A00, 1);
        char[] cArr = r3.A01;
        int i = r3.A00;
        r3.A00 = i + 1;
        cArr[i] = c;
    }
}
