package X;

import androidx.media3.common.util.Util;

/* renamed from: X.XvP  reason: case insensitive filesystem */
public final class C22099XvP implements YA3 {
    public final C21505XdL A00;
    public final C11389SRd A01 = new C11389SRd();

    public final void DiN() {
        this.A01.A0Q(Util.A07, 0);
    }

    public final Xn1 EKq(C13910TlA tlA, long j) {
        int A02;
        C13910TlA tlA2 = tlA;
        long Bdl = tlA2.Bdl();
        int min = (int) Math.min(20000, tlA2.getLength() - Bdl);
        C11389SRd sRd = this.A01;
        sRd.A0M(min);
        tlA2.E2F(sRd.A02, 0, min);
        int i = -1;
        long j2 = -9223372036854775807L;
        int i2 = -1;
        while (true) {
            int i3 = sRd.A00;
            int i4 = sRd.A01;
            if (i3 - i4 >= 4) {
                if (C21056XCh.A02(sRd.A02, i4) != 442) {
                    sRd.A0P(1);
                } else {
                    sRd.A0P(4);
                    long A002 = XnI.A00(sRd);
                    if (A002 != -9223372036854775807L) {
                        long A022 = this.A00.A02(A002);
                        if (A022 <= j) {
                            int i5 = ((100000 + A022) > j ? 1 : ((100000 + A022) == j ? 0 : -1));
                            i2 = sRd.A01;
                            if (i5 > 0) {
                                break;
                            }
                            j2 = A022;
                        } else if (j2 == -9223372036854775807L) {
                            return new Xn1(A022, Bdl, -1);
                        }
                    }
                    int i6 = sRd.A00;
                    if (i6 - sRd.A01 >= 10) {
                        sRd.A0P(9);
                        int A05 = sRd.A05() & 7;
                        if (Pxe.A06(sRd) >= A05) {
                            sRd.A0P(A05);
                            int i7 = sRd.A00;
                            int i8 = sRd.A01;
                            if (i7 - i8 >= 4) {
                                if (C21056XCh.A02(sRd.A02, i8) == 443) {
                                    sRd.A0P(4);
                                    int A08 = sRd.A08();
                                    if (Pxe.A06(sRd) >= A08) {
                                        sRd.A0P(A08);
                                    }
                                }
                                while (true) {
                                    int i9 = sRd.A00;
                                    int i10 = sRd.A01;
                                    if (i9 - i10 < 4 || (A02 = C21056XCh.A02(sRd.A02, i10)) == 442 || A02 == 441 || (A02 >>> 8) != 1) {
                                        break;
                                    }
                                    sRd.A0P(4);
                                    int i11 = sRd.A00;
                                    if (i11 - sRd.A01 < 2) {
                                        break;
                                    }
                                    sRd.A0O(Math.min(i11, sRd.A01 + sRd.A08()));
                                }
                                i = sRd.A01;
                            }
                        }
                    }
                    sRd.A0O(i6);
                    i = sRd.A01;
                }
            } else if (j2 != -9223372036854775807L) {
                return new Xn1(j2, Bdl + ((long) i), -2);
            } else {
                return Xn1.A03;
            }
        }
        return new Xn1(-9223372036854775807L, Bdl + ((long) i2), 0);
    }

    public C22099XvP(C21505XdL xdL) {
        this.A00 = xdL;
    }
}
