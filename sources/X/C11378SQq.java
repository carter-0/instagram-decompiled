package X;

import android.graphics.Color;

/* renamed from: X.SQq  reason: case insensitive filesystem */
public final class C11378SQq {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public static boolean A02(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            STH.A05("SsaStyle", 002.A0g("Failed to parse boolean value: '", str, "'"), e);
            return false;
        }
    }

    public static Integer A01(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            C11366SPh.A01(Dba.A1U((j > 4294967295L ? 1 : (j == 4294967295L ? 0 : -1))));
            int A012 = 1WJ.A01(((j >> 24) & 255) ^ 255);
            int A013 = 1WJ.A01((j >> 16) & 255);
            return Integer.valueOf(Color.argb(A012, 1WJ.A01(j & 255), 1WJ.A01((j >> 8) & 255), A013));
        } catch (IllegalArgumentException e) {
            STH.A05("SsaStyle", 002.A0g("Failed to parse color expression: '", str, "'"), e);
            return null;
        }
    }

    public C11378SQq(Integer num, Integer num2, String str, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = str;
        this.A01 = i;
        this.A04 = num;
        this.A03 = num2;
        this.A00 = f;
        this.A06 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A08 = z4;
        this.A02 = i2;
    }

    public static int A00(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        STH.A03("SsaStyle", 002.A0R("Ignoring unknown alignment: ", str));
        return -1;
    }
}
