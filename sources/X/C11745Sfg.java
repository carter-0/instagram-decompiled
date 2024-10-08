package X;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.Sfg  reason: case insensitive filesystem */
public final class C11745Sfg implements C22557YAo {
    public static final byte[] A0M = {73, 68, 51};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public C13900TjN A0A;
    public C13900TjN A0B;
    public C13900TjN A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final int A0H;
    public final ST7 A0I = new ST7(new byte[7]);
    public final C11389SRd A0J;
    public final String A0K;
    public final boolean A0L;

    public final void E1X(boolean z) {
    }

    public final void AJP(C11389SRd sRd) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C13900TjN tjN;
        long j;
        this.A0C.getClass();
        while (true) {
            C11389SRd sRd2 = sRd;
            int i6 = sRd2.A00;
            int i7 = sRd2.A01;
            int i8 = i6 - i7;
            if (i8 > 0) {
                int i9 = this.A06;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            C11389SRd sRd3 = this.A0J;
                            byte[] bArr = sRd3.A02;
                            int i10 = this.A00;
                            int A042 = Pxh.A04(10, i10, i8);
                            sRd2.A0R(bArr, i10, A042);
                            int i11 = this.A00 + A042;
                            this.A00 = i11;
                            if (i11 == 10) {
                                i3 = 10;
                                this.A0B.EJf(sRd3, 10);
                                sRd3.A0O(6);
                                tjN = this.A0B;
                                i5 = sRd3.A04() + 10;
                                j = 0;
                                i4 = 4;
                            }
                        } else if (i9 != 3) {
                            int A043 = Pxh.A04(this.A05, this.A00, i8);
                            this.A0A.EJf(sRd2, A043);
                            int i12 = this.A00 + A043;
                            this.A00 = i12;
                            int i13 = this.A05;
                            if (i12 == i13) {
                                long j2 = this.A09;
                                C11366SPh.A02(AnonymousClass7TF.A1P((j2 > -9223372036854775807L ? 1 : (j2 == -9223372036854775807L ? 0 : -1))));
                                i2 = 0;
                                this.A0A.EJm((S4h) null, 1, i13, 0, j2);
                                this.A09 += this.A07;
                            }
                        } else {
                            int i14 = 5;
                            if (this.A0F) {
                                i14 = 7;
                            }
                            ST7 st7 = this.A0I;
                            byte[] bArr2 = st7.A03;
                            int i15 = this.A00;
                            int A044 = Pxh.A04(i14, i15, i8);
                            sRd2.A0R(bArr2, i15, A044);
                            int i16 = this.A00 + A044;
                            this.A00 = i16;
                            if (i16 == i14) {
                                i3 = 0;
                                st7.A09(0);
                                if (!this.A0G) {
                                    int A062 = st7.A06(2) + 1;
                                    if (A062 != 2) {
                                        STH.A03("AdtsReader", 002.A0c("Detected audio object type: ", ", but assuming AAC LC.", A062));
                                    }
                                    int A002 = ST7.A00(st7, 5, 3);
                                    int i17 = this.A02;
                                    byte[] bArr3 = {(byte) (((i17 >> 1) & 7) | 16), (byte) (((i17 << 7) & 128) | ((A002 << 3) & 120))};
                                    C10509RtO A012 = SMh.A01(new ST7(bArr3), false);
                                    SOW A003 = SOW.A00();
                                    A003.A0T = this.A0D;
                                    A003.A01("audio/mp4a-latm");
                                    A003.A0R = A012.A02;
                                    A003.A04 = A012.A00;
                                    A003.A0G = A012.A01;
                                    A003.A0X = Collections.singletonList(bArr3);
                                    A003.A0V = this.A0K;
                                    A003.A0E = this.A0H;
                                    SJM A0O = Pxe.A0O(A003);
                                    this.A08 = 1024000000 / ((long) A0O.A0I);
                                    this.A0C.AWO(A0O);
                                    this.A0G = true;
                                } else {
                                    st7.A0A(10);
                                }
                                i4 = 4;
                                st7.A0A(4);
                                i5 = (st7.A06(13) - 2) - 5;
                                if (this.A0F) {
                                    i5 -= 2;
                                }
                                tjN = this.A0C;
                                j = this.A08;
                            }
                        }
                        this.A06 = i4;
                        this.A00 = i3;
                        this.A0A = tjN;
                        this.A07 = j;
                        this.A05 = i5;
                    } else {
                        ST7 st72 = this.A0I;
                        i2 = 0;
                        st72.A03[0] = sRd2.A02[i7];
                        st72.A09(2);
                        int A063 = st72.A06(4);
                        int i18 = this.A02;
                        if (i18 == -1 || A063 == i18) {
                            if (!this.A0E) {
                                this.A0E = true;
                                this.A03 = this.A01;
                                this.A02 = A063;
                            }
                            this.A06 = 3;
                            this.A00 = 0;
                        } else {
                            this.A0E = false;
                        }
                    }
                    this.A06 = i2;
                    this.A00 = i2;
                    this.A04 = 256;
                } else {
                    byte[] bArr4 = sRd2.A02;
                    while (i7 < i6) {
                        int i19 = i7 + 1;
                        byte b = bArr4[i7] & 255;
                        if (this.A04 == 512 && ((65280 | (((byte) b) & 255)) & 65526) == 65520) {
                            if (!this.A0E) {
                                int i20 = i19 - 2;
                                sRd2.A0O(i20 + 1);
                                ST7 st73 = this.A0I;
                                byte[] bArr5 = st73.A03;
                                if (Pxe.A06(sRd2) >= 1) {
                                    sRd2.A0R(bArr5, 0, 1);
                                    st73.A09(4);
                                    int A064 = st73.A06(1);
                                    int i21 = this.A03;
                                    if (i21 == -1 || A064 == i21) {
                                        if (this.A02 != -1) {
                                            byte[] bArr6 = st73.A03;
                                            if (Pxe.A06(sRd2) >= 1) {
                                                sRd2.A0R(bArr6, 0, 1);
                                                st73.A09(2);
                                                if (st73.A06(4) == this.A02) {
                                                    sRd2.A0O(i20 + 2);
                                                }
                                            }
                                        }
                                        byte[] bArr7 = st73.A03;
                                        if (Pxe.A06(sRd2) >= 4) {
                                            sRd2.A0R(bArr7, 0, 4);
                                            st73.A09(14);
                                            int A065 = st73.A06(13);
                                            if (A065 >= 7) {
                                                byte[] bArr8 = sRd2.A02;
                                                int i22 = sRd2.A00;
                                                int i23 = i20 + A065;
                                                if (i23 < i22) {
                                                    byte b2 = bArr8[i23];
                                                    if (b2 == -1) {
                                                        int i24 = i23 + 1;
                                                        if (i24 != i22) {
                                                            byte b3 = bArr8[i24];
                                                            if (((65280 | (b3 & 255)) & 65526) == 65520 && ((b3 & 8) >> 3) == A064) {
                                                            }
                                                        }
                                                    } else if (b2 == 73) {
                                                        int i25 = i23 + 1;
                                                        if (i25 != i22) {
                                                            if (bArr8[i25] == 68) {
                                                                int i26 = i23 + 2;
                                                                if (i26 != i22) {
                                                                    if (bArr8[i26] == 51) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            this.A01 = (b & 8) >> 3;
                            boolean z = true;
                            if ((b & 1) != 0) {
                                z = false;
                            }
                            this.A0F = z;
                            int i27 = 3;
                            if (!this.A0E) {
                                i27 = 1;
                            }
                            this.A06 = i27;
                            this.A00 = 0;
                            sRd2.A0O(i19);
                            break;
                        }
                        int i28 = this.A04;
                        byte b4 = b | i28;
                        if (b4 == 329) {
                            i = 768;
                            this.A04 = i;
                        } else if (b4 == 511) {
                            this.A04 = 512;
                        } else if (b4 != 836) {
                            if (b4 == 1075) {
                                this.A06 = 2;
                                this.A00 = 3;
                                this.A05 = 0;
                                this.A0J.A0O(0);
                                sRd2.A0O(i19);
                                break;
                                break;
                            } else if (i28 != 256) {
                                this.A04 = 256;
                                i19--;
                            }
                        } else {
                            i = 1024;
                            this.A04 = i;
                        }
                        i7 = i19;
                    }
                    sRd2.A0O(i7);
                }
            } else {
                return;
            }
        }
    }

    public C11745Sfg(String str, int i, boolean z) {
        char[] cArr = C11389SRd.A04;
        this.A0J = new C11389SRd(Arrays.copyOf(A0M, 10));
        this.A06 = 0;
        this.A00 = 0;
        this.A04 = 256;
        this.A03 = -1;
        this.A02 = -1;
        this.A08 = -9223372036854775807L;
        this.A09 = -9223372036854775807L;
        this.A0L = z;
        this.A0K = str;
        this.A0H = i;
    }

    public final void ANC(YBZ ybz, SR8 sr8) {
        this.A0D = SR8.A01(sr8);
        C13900TjN A002 = SR8.A00(ybz, sr8);
        this.A0C = A002;
        this.A0A = A002;
        if (this.A0L) {
            sr8.A03();
            SR8.A02(sr8);
            C13900TjN FHV = ybz.FHV(sr8.A00, 5);
            this.A0B = FHV;
            SOW A003 = SOW.A00();
            SR8.A02(sr8);
            A003.A0T = sr8.A01;
            A003.A01("application/id3");
            C13900TjN.A00(A003, FHV);
            return;
        }
        this.A0B = new C11715SfC();
    }

    public final void E1Y(long j, int i) {
        this.A09 = j;
    }

    public final void EKt() {
        this.A09 = -9223372036854775807L;
        this.A0E = false;
        this.A06 = 0;
        this.A00 = 0;
        this.A04 = 256;
    }
}
