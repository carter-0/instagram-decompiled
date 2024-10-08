package X;

import java.lang.reflect.Array;

public final class R79 extends C10282Rpg {
    public static final byte[] A03 = new byte[0];
    public C19872Wgz A00;
    public byte[] A01 = A03;
    public final int[] A02 = new int[32];

    public final C19872Wgz A00() {
        C19872Wgz wgz;
        int[] iArr;
        int i;
        C19872Wgz wgz2 = this.A00;
        if (wgz2 != null) {
            return wgz2;
        }
        C11013S5k s5k = this.A00;
        int i2 = s5k.A01;
        int i3 = s5k.A00;
        if (i2 < 40 || i3 < 40) {
            wgz = new C19872Wgz(i2, i3);
            if (this.A01.length < i2) {
                this.A01 = new byte[i2];
            }
            int i4 = 0;
            do {
                iArr = this.A02;
                iArr[i4] = 0;
                i4++;
            } while (i4 < 32);
            for (int i5 = 1; i5 < 5; i5++) {
                byte[] A012 = s5k.A01(this.A01, (i3 * i5) / 5);
                int i6 = (i2 * 4) / 5;
                for (int i7 = i2 / 5; i7 < i6; i7++) {
                    int i8 = (A012[i7] & 255) >> 3;
                    iArr[i8] = iArr[i8] + 1;
                }
            }
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            do {
                int i14 = iArr[i10];
                if (i14 > i11) {
                    i13 = i10;
                    i11 = i14;
                }
                if (i14 > i12) {
                    i12 = i14;
                }
                i10++;
            } while (i10 < 32);
            int i15 = 0;
            int i16 = 0;
            do {
                int i17 = i9 - i13;
                int i18 = iArr[i9] * i17 * i17;
                if (i18 > i16) {
                    i15 = i9;
                    i16 = i18;
                }
                i9++;
            } while (i9 < 32);
            if (i13 <= i15) {
                int i19 = i13;
                i13 = i15;
                i15 = i19;
            }
            if (i13 - i15 > 2) {
                int i20 = i13 - 1;
                int i21 = i20;
                int i22 = -1;
                while (i20 > i15) {
                    int i23 = i20 - i15;
                    int i24 = i23 * i23 * (i13 - i20) * (i12 - iArr[i20]);
                    if (i24 > i22) {
                        i21 = i20;
                        i22 = i24;
                    }
                    i20--;
                }
                int i25 = i21 << 3;
                byte[] A002 = s5k.A00();
                for (int i26 = 0; i26 < i3; i26++) {
                    int i27 = i26 * i2;
                    for (int i28 = 0; i28 < i2; i28++) {
                        if ((A002[i27 + i28] & 255) < i25) {
                            wgz.A01(i28, i26);
                        }
                    }
                }
            } else {
                throw R7E.A00;
            }
        } else {
            byte[] A003 = s5k.A00();
            int i29 = i2 >> 3;
            if ((i2 & 7) != 0) {
                i29++;
            }
            int i30 = i3 >> 3;
            if ((i3 & 7) != 0) {
                i30++;
            }
            int i31 = i3 - 8;
            int i32 = i2 - 8;
            int[] iArr2 = new int[2];
            iArr2[1] = i29;
            iArr2[0] = i30;
            int[][] iArr3 = (int[][]) Array.newInstance(Integer.TYPE, iArr2);
            for (int i33 = 0; i33 < i30; i33++) {
                int i34 = i33 << 3;
                int i35 = i31;
                if (i34 > i35) {
                    i34 = i35;
                }
                for (int i36 = 0; i36 < i29; i36++) {
                    int i37 = i36 << 3;
                    int i38 = i32;
                    if (i37 > i38) {
                        i37 = i38;
                    }
                    int i39 = (i34 * i2) + i37;
                    byte b = 255;
                    int i40 = 0;
                    int i41 = 0;
                    byte b2 = 0;
                    do {
                        int i42 = 0;
                        do {
                            byte b3 = A003[i39 + i42] & 255;
                            i41 += b3;
                            if (b3 < b) {
                                b = b3;
                            }
                            if (b3 > b2) {
                                b2 = b3;
                            }
                            i42++;
                        } while (i42 < 8);
                        i = b2 - b;
                        if (i > 24) {
                            while (true) {
                                i40++;
                                i39 += i2;
                                if (i40 >= 8) {
                                    break;
                                }
                                int i43 = 0;
                                do {
                                    i41 += A003[i39 + i43] & 255;
                                    i43++;
                                } while (i43 < 8);
                            }
                        }
                        i40++;
                        i39 += i2;
                    } while (i40 < 8);
                    int i44 = i41 >> 6;
                    if (i <= 24) {
                        i44 = b / 2;
                        if (i33 > 0 && i36 > 0) {
                            int[] iArr4 = iArr3[i33 - 1];
                            int i45 = i36 - 1;
                            int i46 = ((iArr4[i36] + (iArr3[i33][i45] * 2)) + iArr4[i45]) / 4;
                            if (b < i46) {
                                i44 = i46;
                            }
                        }
                    }
                    iArr3[i33][i36] = i44;
                }
            }
            wgz = new C19872Wgz(i2, i3);
            for (int i47 = 0; i47 < i30; i47++) {
                int i48 = i47 << 3;
                int i49 = i31;
                if (i48 > i49) {
                    i48 = i49;
                }
                int i50 = i30 - 3;
                int i51 = 2;
                if (i47 >= 2) {
                    i51 = Math.min(i47, i50);
                }
                for (int i52 = 0; i52 < i29; i52++) {
                    int i53 = i52 << 3;
                    int i54 = i32;
                    if (i53 > i54) {
                        i53 = i54;
                    }
                    int i55 = i29 - 3;
                    int i56 = 2;
                    if (i52 >= 2) {
                        i56 = Math.min(i52, i55);
                    }
                    int i57 = -2;
                    int i58 = 0;
                    do {
                        int[] iArr5 = iArr3[i51 + i57];
                        i58 += iArr5[i56 - 2] + iArr5[i56 - 1] + iArr5[i56] + iArr5[i56 + 1] + iArr5[i56 + 2];
                        i57++;
                    } while (i57 <= 2);
                    byte b4 = i58 / 25;
                    int i59 = (i48 * i2) + i53;
                    int i60 = 0;
                    while (i60 < 8) {
                        int i61 = 0;
                        do {
                            if ((A003[i59 + i61] & 255) <= b4) {
                                wgz.A01(i53 + i61, i48 + i60);
                            }
                            i61++;
                        } while (i61 < 8);
                        i60++;
                        i59 += i2;
                    }
                }
            }
        }
        this.A00 = wgz;
        return wgz;
    }

    public R79(C11013S5k s5k) {
        super(s5k);
    }
}
