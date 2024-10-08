package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.math.BigDecimal;
import java.util.Arrays;

public final class SNB {
    public final char[] A00;

    private BigDecimal A00(int i, int i2, int i3, int i4) {
        if (i2 > i4) {
            int i5 = i2 / 2;
            return A00(i, i5, (i3 + i2) - i5, i4).add(A00(i + i5, i2 - i5, i3, i4));
        } else if (i2 == 0) {
            return BigDecimal.ZERO;
        } else {
            return new BigDecimal(this.A00, i, i2).movePointRight(i3);
        }
    }

    public static BigDecimal A01(char[] cArr) {
        int i;
        int i2;
        BigDecimal bigDecimal;
        NumberFormatException numberFormatException;
        String A06;
        char[] cArr2 = cArr;
        int length = cArr2.length;
        if (length < 500) {
            try {
                return new BigDecimal(cArr2);
            } catch (NumberFormatException e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "Not a valid number representation";
                }
                if (length <= 1000) {
                    A06 = new String(cArr2);
                } else {
                    A06 = 002.A06(length, new String(Arrays.copyOfRange(cArr2, 0, IgNetworkConsentStorage.MAX_ENTRIES)), "(truncated, full length is ", " chars)");
                }
                throw new NumberFormatException(002.A0u("Value \"", A06, "\" can not be represented as `java.math.BigDecimal`, reason: ", message));
            }
        } else {
            SNB snb = new SNB(cArr2);
            int i3 = length / 10;
            char[] cArr3 = snb.A00;
            int length2 = cArr3.length;
            int i4 = 0;
            int i5 = -1;
            int i6 = 0;
            int i7 = -1;
            boolean z = false;
            boolean z2 = false;
            int i8 = 0;
            boolean z3 = false;
            while (true) {
                if (i4 < length2) {
                    char c = cArr3[i4];
                    if (c == '+') {
                        if (i5 < 0) {
                            if (z) {
                                numberFormatException = new NumberFormatException("Multiple signs in number");
                                break;
                            }
                            i8 = i4 + 1;
                            z = true;
                        } else {
                            if (z2) {
                                numberFormatException = new NumberFormatException("Multiple signs in exponent");
                                break;
                            }
                            z2 = true;
                        }
                    } else if (c != 'E' && c != 'e') {
                        if (c == '-') {
                            if (i5 < 0) {
                                if (z) {
                                    numberFormatException = new NumberFormatException("Multiple signs in number");
                                    break;
                                }
                                i8 = i4 + 1;
                                z = true;
                                z3 = true;
                            } else {
                                if (z2) {
                                    numberFormatException = new NumberFormatException("Multiple signs in exponent");
                                    break;
                                }
                                z2 = true;
                            }
                        } else if (c == '.') {
                            if (i7 >= 0) {
                                numberFormatException = new NumberFormatException("Multiple decimal points");
                                break;
                            }
                            i7 = i4;
                        } else if (i7 >= 0 && i5 == -1) {
                            i6++;
                        }
                    } else if (i5 >= 0) {
                        numberFormatException = new NumberFormatException("Multiple exponent markers");
                        break;
                    } else {
                        i5 = i4;
                    }
                    i4++;
                } else {
                    if (i5 >= 0) {
                        i = 1;
                        i2 = Integer.parseInt(new String(cArr3, i5 + 1, (length2 - i5) - 1));
                        long j = (long) i2;
                        long j2 = ((long) i6) - j;
                        if (j2 > 2147483647L || j2 < -2147483648L) {
                            StringBuilder A1A = AnonymousClass7TE.A1A();
                            A1A.append("Scale out of range: ");
                            A1A.append(j2);
                            A1A.append(" while adjusting scale ");
                            A1A.append(i6);
                            numberFormatException = new NumberFormatException(Pxg.A0u(" to exponent ", A1A, j));
                        } else {
                            i6 = (int) j2;
                            length2 = i5;
                        }
                    } else {
                        i = 1;
                        i2 = 0;
                    }
                    if (i7 >= 0) {
                        int i9 = (length2 - i7) - i;
                        bigDecimal = snb.A00(i8, i7 - i8, i2, i3).add(snb.A00(i7 + 1, i9, i2 - i9, i3));
                    } else {
                        bigDecimal = snb.A00(i8, length2 - i8, i2, i3);
                    }
                    if (i6 != 0) {
                        bigDecimal = bigDecimal.setScale(i6);
                    }
                    if (z3) {
                        return bigDecimal.negate();
                    }
                    return bigDecimal;
                }
            }
            throw numberFormatException;
        }
    }

    public SNB(char[] cArr) {
        this.A00 = cArr;
    }
}
