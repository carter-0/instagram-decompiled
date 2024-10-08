package X;

/* renamed from: X.5RW  reason: invalid class name */
public final class AnonymousClass5RW {
    public static final long A01 = (4278190080L << 32);
    public static final long A02 = (4278190335L << 32);
    public static final long A03 = (4282664004L << 32);
    public static final long A04 = (4287137928L << 32);
    public static final long A05 = (4278255360L << 32);
    public static final long A06 = (4294901760L << 32);
    public static final long A07 = (0 << 32);
    public static final long A08 = C285595Rx.A02(AnonymousClass5RX.A0H, 0.0f, 0.0f, 0.0f, 0.0f);
    public static final long A09 = (4294967295L << 32);
    public final long A00;

    public static final float A00(long j) {
        float A012;
        float f;
        if ((63 & j) == 0) {
            A012 = (float) C291925i6.A01((j >>> 56) & 255);
            f = 255.0f;
        } else {
            A012 = (float) C291925i6.A01((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return A012 / f;
    }

    public static final float A01(long j) {
        int i;
        if ((63 & j) == 0) {
            return ((float) C291925i6.A01((j >>> 32) & 255)) / 255.0f;
        }
        short s = ((short) ((int) ((j >>> 16) & 65535))) & 65535;
        short s2 = 32768 & s;
        int i2 = (s >>> 10) & 31;
        short s3 = s & 1023;
        int i3 = 0;
        if (i2 != 0) {
            i = s3 << 13;
            if (i2 == 31) {
                if (i != 0) {
                    i |= 4194304;
                }
                i3 = 255;
            } else {
                i3 = (i2 - 15) + 127;
            }
        } else if (s3 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s3 + 1056964608) - C9887Rj0.A00;
            if (s2 != 0) {
                return -intBitsToFloat;
            }
            return intBitsToFloat;
        } else {
            i = 0;
        }
        return Float.intBitsToFloat(i | (s2 << 16) | (i3 << 23));
    }

    public static final float A02(long j) {
        int i;
        if ((63 & j) == 0) {
            return ((float) C291925i6.A01((j >>> 40) & 255)) / 255.0f;
        }
        short s = ((short) ((int) ((j >>> 32) & 65535))) & 65535;
        short s2 = 32768 & s;
        int i2 = (s >>> 10) & 31;
        short s3 = s & 1023;
        int i3 = 0;
        if (i2 != 0) {
            i = s3 << 13;
            if (i2 == 31) {
                if (i != 0) {
                    i |= 4194304;
                }
                i3 = 255;
            } else {
                i3 = (i2 - 15) + 127;
            }
        } else if (s3 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s3 + 1056964608) - C9887Rj0.A00;
            if (s2 != 0) {
                return -intBitsToFloat;
            }
            return intBitsToFloat;
        } else {
            i = 0;
        }
        return Float.intBitsToFloat(i | (s2 << 16) | (i3 << 23));
    }

    public static final float A03(long j) {
        int i;
        int i2 = ((63 & j) > 0 ? 1 : ((63 & j) == 0 ? 0 : -1));
        long j2 = j >>> 48;
        if (i2 == 0) {
            return ((float) C291925i6.A01(j2 & 255)) / 255.0f;
        }
        short s = ((short) ((int) (j2 & 65535))) & 65535;
        short s2 = 32768 & s;
        int i3 = (s >>> 10) & 31;
        short s3 = s & 1023;
        int i4 = 0;
        if (i3 != 0) {
            i = s3 << 13;
            if (i3 == 31) {
                if (i != 0) {
                    i |= 4194304;
                }
                i4 = 255;
            } else {
                i4 = (i3 - 15) + 127;
            }
        } else if (s3 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s3 + 1056964608) - C9887Rj0.A00;
            if (s2 != 0) {
                return -intBitsToFloat;
            }
            return intBitsToFloat;
        } else {
            i = 0;
        }
        return Float.intBitsToFloat(i | (s2 << 16) | (i4 << 23));
    }

    public static final long A05(C285385Rc r5, long j) {
        AnonymousClass5SC r0;
        C285385Rc r4 = AnonymousClass5RX.A0K[(int) (j & 63)];
        int i = r4.A00;
        int i2 = r5.A00;
        if ((i | i2) < 0) {
            r0 = C285465Rk.A01(r4, r5);
        } else {
            0yC r1 = AnonymousClass5SA.A00;
            int i3 = i | (i2 << 6);
            Object A032 = r1.A03(i3);
            if (A032 == null) {
                A032 = C285465Rk.A01(r4, r5);
                r1.A08(i3, A032);
            }
            r0 = (AnonymousClass5SC) A032;
        }
        return r0.A00(j);
    }

    public static String A06(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Color(");
        sb.append(A03(j));
        sb.append(", ");
        sb.append(A02(j));
        sb.append(", ");
        sb.append(A01(j));
        sb.append(", ");
        sb.append(A00(j));
        sb.append(", ");
        sb.append(AnonymousClass5RX.A0K[(int) (j & 63)].A02);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass5RW) || j != ((AnonymousClass5RW) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return A06(this.A00);
    }

    public /* synthetic */ AnonymousClass5RW(long j) {
        this.A00 = j;
    }
}
