package X;

import com.google.common.base.Strings;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: X.S6k  reason: case insensitive filesystem */
public abstract class C11032S6k {
    public static final C11032S6k A00 = new R1V(new C11285SJd("base16()", "0123456789ABCDEF".toCharArray()));
    public static final C11032S6k A01;
    public static final C11032S6k A02;
    public static final C11032S6k A03 = new R1W(new C11285SJd("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
    public static final C11032S6k A04 = new R1W(new C11285SJd("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');

    public final C11032S6k A00() {
        C11285SJd sJd;
        R1W r1w = (R1W) this;
        C11032S6k s6k = r1w.A02;
        if (s6k == null) {
            C11285SJd sJd2 = r1w.A00;
            char[] cArr = sJd2.A07;
            int length = cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    sJd = sJd2;
                    break;
                }
                char c = cArr[i];
                if (c < 'A' || c > 'Z') {
                    i++;
                } else {
                    boolean z = false;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            char c2 = cArr[i2];
                            if (c2 >= 'a' && c2 <= 'z') {
                                z = true;
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    }
                    17k.A0H(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                    char[] cArr2 = new char[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        char c3 = cArr[i3];
                        if (c3 >= 'A' && c3 <= 'Z') {
                            c3 = (char) (c3 ^ ' ');
                        }
                        cArr2[i3] = c3;
                    }
                    sJd = new C11285SJd(002.A0R(sJd2.A04, ".lowerCase()"), cArr2);
                    if (sJd2.A05 && !sJd.A05) {
                        byte[] bArr = sJd.A06;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        int i4 = 65;
                        while (true) {
                            boolean z2 = true;
                            if (i4 > 90) {
                                sJd = new C11285SJd(002.A0R(sJd.A04, ".ignoreCase()"), copyOf, sJd.A07, true);
                                break;
                            }
                            int i5 = i4 | 32;
                            byte b = bArr[i4];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                copyOf[i4] = b2;
                            } else {
                                if (b2 != -1) {
                                    z2 = false;
                                }
                                char c4 = (char) i4;
                                char c5 = (char) i5;
                                if (z2) {
                                    copyOf[i5] = b;
                                } else {
                                    throw AnonymousClass7TE.A0z(Strings.A00("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                }
                            }
                            i4++;
                        }
                    }
                }
            }
            if (sJd == sJd2) {
                s6k = r1w;
            } else {
                Character ch = r1w.A01;
                if (r1w instanceof R1V) {
                    s6k = new R1V(sJd);
                } else if (r1w instanceof R1U) {
                    s6k = new R1W(sJd, ch);
                    17k.A0E(AnonymousClass7TF.A1S(sJd.A07.length, 64));
                } else {
                    s6k = new R1W(sJd, ch);
                }
            }
            r1w.A02 = s6k;
        }
        return s6k;
    }

    public final CharSequence A01(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = ((R1W) this).A01;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0 || charSequence.charAt(length) != charValue) {
            }
            length--;
            break;
        } while (charSequence.charAt(length) != charValue);
        return charSequence.subSequence(0, length + 1);
    }

    public final String A02(byte[] bArr) {
        17k.A03(0, r6, r6);
        R1W r1w = (R1W) this;
        C11285SJd sJd = r1w.A00;
        int i = sJd.A02;
        int i2 = sJd.A01;
        StringBuilder A14 = Pxe.A14(i * SN3.A01(RoundingMode.CEILING, r6, i2));
        try {
            if (r1w instanceof R1V) {
                R1V r1v = (R1V) r1w;
                17k.A03(0, r6, r6);
                for (byte b : bArr) {
                    byte b2 = b & 255;
                    char[] cArr = r1v.A00;
                    A14.append(cArr[b2]);
                    A14.append(cArr[b2 | 256]);
                }
            } else if (r1w instanceof R1U) {
                int i3 = 0;
                17k.A03(0, r6, r6);
                for (int i4 = r6; i4 >= 3; i4 -= 3) {
                    int i5 = i3 + 1;
                    int i6 = i5 + 1;
                    int A0D = Pxf.A0D(bArr, i5, (bArr[i3] & 255) << 16);
                    i3 = i6 + 1;
                    byte b3 = A0D | (bArr[i6] & 255);
                    char[] cArr2 = sJd.A07;
                    A14.append(cArr2[b3 >>> 18]);
                    A14.append(cArr2[(b3 >>> 12) & 63]);
                    A14.append(cArr2[(b3 >>> 6) & 63]);
                    A14.append(cArr2[b3 & 63]);
                }
                if (i3 < r6) {
                    r1w.A04(A14, bArr, i3, r6 - i3);
                }
            } else {
                17k.A03(0, r6, r6);
                for (int i7 = 0; i7 < r6; i7 += i2) {
                    r1w.A04(A14, bArr, i7, Pxh.A04(r6, i7, i2));
                }
            }
            return A14.toString();
        } catch (IOException e) {
            throw Pxe.A0e(e);
        }
    }

    static {
        C11285SJd sJd = new C11285SJd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray());
        R1W r1w = new R1W(sJd, '=');
        17k.A0E(AnonymousClass7TF.A1S(sJd.A07.length, 64));
        A01 = r1w;
        C11285SJd sJd2 = new C11285SJd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray());
        R1W r1w2 = new R1W(sJd2, '=');
        17k.A0E(AnonymousClass7TF.A1S(sJd2.A07.length, 64));
        A02 = r1w2;
    }

    public final byte[] A03(CharSequence charSequence) {
        IOException iOException;
        int i;
        try {
            CharSequence A012 = A01(charSequence);
            int length = A012.length();
            R1W r1w = (R1W) this;
            C11285SJd sJd = r1w.A00;
            int i2 = sJd.A00;
            int i3 = (int) (((((long) i2) * ((long) length)) + 7) / 8);
            byte[] bArr = new byte[i3];
            if (r1w instanceof R1U) {
                CharSequence A013 = r1w.A01(A012);
                if (sJd.A08[A013.length() % sJd.A02]) {
                    int i4 = 0;
                    i = 0;
                    while (i4 < A013.length()) {
                        int i5 = i4 + 1;
                        int i6 = i5 + 1;
                        int A002 = (sJd.A00(A013.charAt(i4)) << 18) | (sJd.A00(A013.charAt(i5)) << 12);
                        int i7 = i + 1;
                        bArr[i] = (byte) (A002 >>> 16);
                        if (i6 < A013.length()) {
                            i4 = i6 + 1;
                            int A003 = A002 | (sJd.A00(A013.charAt(i6)) << 6);
                            i = i7 + 1;
                            Pxe.A1H(A003 >>> 8, bArr, i7);
                            if (i4 < A013.length()) {
                                i6 = i4 + 1;
                                i7 = i + 1;
                                Pxe.A1H(A003 | sJd.A00(A013.charAt(i4)), bArr, i);
                            }
                        }
                        i = i7;
                        i4 = i6;
                    }
                } else {
                    iOException = new IOException(002.A0O("Invalid input length ", A013.length()));
                    throw iOException;
                }
            } else if (!(r1w instanceof R1V)) {
                CharSequence A014 = r1w.A01(A012);
                int length2 = A014.length();
                boolean[] zArr = sJd.A08;
                int i8 = sJd.A02;
                if (zArr[length2 % i8]) {
                    i = 0;
                    for (int i9 = 0; i9 < A014.length(); i9 += i8) {
                        long j = 0;
                        int i10 = 0;
                        for (int i11 = 0; i11 < i8; i11++) {
                            j <<= i2;
                            if (i9 + i11 < A014.length()) {
                                j |= (long) sJd.A00(A014.charAt(i10 + i9));
                                i10++;
                            }
                        }
                        int i12 = sJd.A01;
                        int i13 = (i12 * 8) - (i10 * i2);
                        int i14 = (i12 - 1) * 8;
                        while (i14 >= i13) {
                            bArr[i] = (byte) ((int) ((j >>> i14) & 255));
                            i14 -= 8;
                            i++;
                        }
                    }
                } else {
                    iOException = new IOException(002.A0O("Invalid input length ", A014.length()));
                    throw iOException;
                }
            } else if (A012.length() % 2 != 1) {
                int i15 = 0;
                int i16 = 0;
                while (i15 < A012.length()) {
                    bArr[i] = (byte) ((sJd.A00(A012.charAt(i15)) << 4) | sJd.A00(A012.charAt(i15 + 1)));
                    i15 += 2;
                    i16 = i + 1;
                }
            } else {
                iOException = new IOException(002.A0O("Invalid input length ", A012.length()));
                throw iOException;
            }
            if (i == i3) {
                return bArr;
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            return bArr2;
        } catch (RCO e) {
            throw new IllegalArgumentException(e);
        }
    }
}
