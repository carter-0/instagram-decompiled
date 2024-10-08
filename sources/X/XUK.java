package X;

import android.graphics.PointF;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;

public abstract class XUK {
    public static final C21499Xcz A00(int[] iArr, int i, int i2, int i3, int i4) {
        int i5;
        float[][] fArr;
        int i6;
        int i7 = i4;
        int[][] iArr2 = new int[i7][];
        int i8 = 0;
        while (true) {
            i5 = i3;
            if (i8 >= i7) {
                break;
            }
            iArr2[i8] = new int[i5];
            i8++;
        }
        for (int i9 = 0; i9 < i7; i9++) {
            for (int i10 = 0; i10 < i5; i10++) {
                iArr2[i9][i10] = Math.max(Math.min(iArr[(i9 * i3) + i10], 255), 0);
            }
        }
        ArrayList arrayList = new ArrayList(i7);
        for (int i11 = 0; i11 < i7; i11++) {
            ArrayList arrayList2 = new ArrayList(r3);
            for (int i12 : iArr2[i11]) {
                JTP.A1V(arrayList2, (float) i12);
            }
            arrayList.add(00k.A0w(arrayList2));
        }
        float[][] fArr2 = (float[][]) arrayList.toArray(new float[0][]);
        if (i5 == 100 && i7 == 100) {
            fArr = fArr2;
        } else {
            0qQ.A0B(fArr2, 0);
            int length = fArr2[0].length;
            int length2 = fArr2.length;
            double d = ((double) length) / 100.0d;
            double d2 = ((double) length2) / 100.0d;
            fArr = new float[100][];
            int i13 = 0;
            do {
                fArr[i13] = new float[100];
                i13++;
            } while (i13 < 100);
            int i14 = 0;
            do {
                int i15 = 0;
                do {
                    double d3 = ((double) i15) * d;
                    double d4 = ((double) i14) * d2;
                    int i16 = (int) d3;
                    int i17 = (int) d4;
                    double[] A00 = C22003XqD.A00(d3 - ((double) i16));
                    double[] A002 = C22003XqD.A00(d4 - ((double) i17));
                    double d5 = 0.0d;
                    int i18 = 0;
                    do {
                        int i19 = 0;
                        do {
                            int i20 = (i16 - 1) + i18;
                            int i21 = length - 1;
                            if (i20 < 0) {
                                i20 = 0;
                            } else if (i20 > i21) {
                                i20 = i21;
                            }
                            int i22 = (i17 - 1) + i19;
                            int i23 = length2 - 1;
                            if (i22 < 0) {
                                i22 = 0;
                            } else if (i22 > i23) {
                                i22 = i23;
                            }
                            d5 += ((double) fArr2[i22][i20]) * A00[i18] * A002[i19];
                            i19++;
                        } while (i19 < 4);
                        i18++;
                    } while (i18 < 4);
                    float[] fArr3 = fArr[i14];
                    float f = (float) d5;
                    if (f < 0.0f) {
                        f = 0.0f;
                    } else if (f > 255.0f) {
                        f = 255.0f;
                    }
                    fArr3[i15] = f;
                    i15++;
                } while (i15 < 100);
                i14++;
            } while (i14 < 100);
        }
        ArrayList arrayList3 = new ArrayList(r7);
        for (float[] fArr4 : fArr) {
            ArrayList arrayList4 = new ArrayList(r3);
            for (float f2 : fArr[r5]) {
                AnonymousClass7TF.A1M(arrayList4, (int) f2);
            }
            arrayList3.add(00k.A0x(arrayList4));
        }
        int[][] iArr3 = (int[][]) arrayList3.toArray(new int[0][]);
        int length3 = iArr3[0].length;
        int length4 = iArr3[1].length;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (int i24 = 0; i24 < i7; i24++) {
            for (int i25 = 0; i25 < i5; i25++) {
                JTP.A1V(A1C, fArr2[i24][i25]);
            }
        }
        int length5 = iArr3.length;
        int i26 = length3 * length5;
        int[] iArr4 = new int[i26];
        for (int i27 = 0; i27 < length5; i27++) {
            for (int i28 = 0; i28 < length3; i28++) {
                iArr4[(i27 * length3) + i28] = iArr3[i27][i28];
            }
        }
        int i29 = Integer.MAX_VALUE;
        int i30 = AnonymousClass972.MUTABLE_FLAG_MASK;
        for (int i31 = 0; i31 < i26; i31++) {
            int i32 = iArr4[i31];
            i29 = Math.min(i29, i32);
            i30 = Math.max(i30, i32);
        }
        0eP A1L = AnonymousClass7TE.A1L(Integer.valueOf(i29), Integer.valueOf(i30));
        int A0M = AnonymousClass7TE.A0M(A1L.A00);
        int A0M2 = AnonymousClass7TE.A0M(A1L.A01);
        int[] iArr5 = new int[256];
        for (int i33 = 0; i33 < i26; i33++) {
            int i34 = iArr4[i33];
            iArr5[i34] = iArr5[i34] + 1;
        }
        int i35 = 0;
        int i36 = 0;
        do {
            i36 += iArr5[i35] * i35;
            i35++;
        } while (i35 < 256);
        double d6 = (double) i26;
        double d7 = ((double) i36) / d6;
        int max = Math.max(A0M - 1, 0);
        double d8 = Double.NEGATIVE_INFINITY;
        double d9 = 0.0d;
        double d10 = 0.0d;
        while (max <= A0M2) {
            double d11 = d7 - d10;
            double d12 = d9 * d6 * d11 * d11;
            if (d12 > d8) {
                A0M = max;
                d8 = d12;
            }
            while (max <= A0M2 && iArr5[max] == 0) {
                max++;
            }
            int i37 = iArr5[max];
            double d13 = (double) (i37 * max);
            double d14 = (double) i37;
            d9 = d14 + d9;
            d10 = ((d10 * d9) + d13) / d9;
            d6 -= d14;
            d7 = ((d7 * d6) - d13) / d6;
            max++;
        }
        0eP A003 = ADY.A00.A00(iArr3, A0M);
        int i38 = 0;
        for (int i39 = 0; i39 < length5; i39++) {
            int[] iArr6 = iArr3[i39];
            0qQ.A0B(iArr6, 0);
            int i40 = 0;
            for (int i41 : iArr6) {
                i40 += i41;
            }
            i38 += i40;
        }
        if (i38 == 0) {
            return null;
        }
        int[][] iArr7 = (int[][]) A003.A01;
        int A0M3 = AnonymousClass7TE.A0M(A003.A00);
        float f3 = ((float) i) / ((float) length3);
        float f4 = ((float) i2) / ((float) length4);
        0qQ.A0B(iArr7, 1);
        int length6 = iArr3[0].length;
        int i42 = A0M3 + 1;
        for (int i43 = 0; i43 < i42; i43++) {
        }
        int[] iArr8 = new int[i42];
        for (int i44 = 0; i44 < i42; i44++) {
            iArr8[i44] = 0;
        }
        int[] iArr9 = new int[i42];
        for (int i45 = 0; i45 < i42; i45++) {
            iArr9[i45] = 1;
        }
        int[] iArr10 = new int[i42];
        for (int i46 = 0; i46 < i42; i46++) {
            iArr10[i46] = 0;
        }
        for (int i47 = 0; i47 < length5; i47++) {
            for (int i48 = 0; i48 < length6; i48++) {
                int i49 = iArr7[i47][i48];
                if (i49 != 0) {
                    int i50 = iArr3[i47][i48];
                    int i51 = iArr8[i49];
                    if (i50 > i51) {
                        iArr8[i49] = i50;
                        iArr9[i49] = 1;
                    } else if (i50 == i51) {
                        iArr9[i49] = iArr9[i49] + 1;
                    }
                    iArr10[i49] = iArr10[i49] + 1;
                }
            }
        }
        if (1 <= A0M3) {
            int i52 = 1;
            int i53 = 0;
            i6 = 1;
            while (true) {
                int i54 = iArr8[i52];
                if (i54 > i53 || (i54 == i53 && iArr9[i52] > iArr9[i6])) {
                    i6 = i52;
                    i53 = i54;
                }
                if (i52 == A0M3) {
                    break;
                }
                i52++;
            }
        } else {
            i6 = 1;
        }
        int i55 = length5;
        int i56 = length6;
        int i57 = 0;
        int i58 = 0;
        for (int i59 = 0; i59 < length5; i59++) {
            for (int i60 = 0; i60 < length6; i60++) {
                if (iArr7[i59][i60] == i6) {
                    i56 = Math.min(i56, i60);
                    i55 = Math.min(i55, i59);
                    i57 = Math.max(i57, i60);
                    i58 = Math.max(i58, i59);
                }
            }
        }
        if (i56 == i57) {
            i57 = i56 + 1;
        }
        if (i55 == i58) {
            i58 = i55 + 1;
        }
        float f5 = (((float) iArr10[i6]) / ((float) length6)) / ((float) length5);
        int i61 = i57 - i56;
        int i62 = i61 + 1;
        int i63 = i58 - i55;
        int i64 = i63 + 1;
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        int i65 = 1;
        while (true) {
            boolean z = false;
            if (i62 > i64) {
                z = true;
            }
            int i66 = i56;
            int i67 = i55;
            int[] iArr11 = new int[i65];
            for (int i68 = 0; i68 < i65; i68++) {
                iArr11[i68] = 0;
            }
            int[] iArr12 = new int[i65];
            for (int i69 = 0; i69 < i65; i69++) {
                iArr12[i69] = 0;
            }
            int[] iArr13 = new int[i65];
            for (int i70 = 0; i70 < i65; i70++) {
                iArr13[i70] = 0;
            }
            int i71 = i65 + 1;
            int[] iArr14 = new int[i71];
            for (int i72 = 0; i72 < i71; i72++) {
                iArr14[i72] = 0;
            }
            int i73 = i55;
            if (z) {
                i73 = i56;
            }
            iArr14[0] = i73;
            int i74 = i71 - 1;
            int i75 = i58 + 1;
            if (z) {
                i75 = i57 + 1;
            }
            iArr14[i74] = i75;
            for (int i76 = 1; i76 < i74; i76++) {
                int i77 = i63;
                if (z) {
                    i77 = i61;
                }
                int i78 = ((int) ((((float) i77) / ((float) i65)) * ((float) i76))) + i55;
                int i79 = i58;
                if (z) {
                    i79 = i57;
                }
                iArr14[i76] = Math.min(i78, i79);
            }
            if (i55 <= i58) {
                int i80 = i55;
                while (true) {
                    if (i56 <= i57) {
                        int i81 = i56;
                        while (true) {
                            if (iArr7[i80][i81] == i6) {
                                for (int i82 = 0; i82 < i74; i82++) {
                                    int i83 = iArr14[i82];
                                    if (!z ? !(i80 < i83 || i80 >= iArr14[i82 + 1]) : !(i81 < i83 || i81 >= iArr14[i82 + 1])) {
                                        iArr11[i82] = iArr11[i82] + i81;
                                        iArr12[i82] = iArr12[i82] + i80;
                                        iArr13[i82] = iArr13[i82] + 1;
                                    }
                                }
                            }
                            if (i81 == i57) {
                                break;
                            }
                            i81++;
                        }
                    }
                    if (i80 == i58) {
                        break;
                    }
                    i80++;
                }
            }
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            int i84 = 0;
            while (i84 < i65) {
                float f6 = (float) iArr11[i84];
                float f7 = (float) iArr13[i84];
                float f8 = f6 / f7;
                float f9 = ((float) iArr12[i84]) / f7;
                float f10 = Float.MAX_VALUE;
                int i85 = i56;
                int i86 = i55;
                if (i55 <= i58) {
                    while (true) {
                        if (i56 <= i57) {
                            while (true) {
                                if (iArr7[i67][i66] == i6) {
                                    float abs = Math.abs(f8 - ((float) i66)) + Math.abs(f9 - ((float) i67));
                                    if (abs < f10) {
                                        i85 = i66;
                                        i86 = i67;
                                        f10 = abs;
                                    }
                                }
                                if (i66 == i57) {
                                    break;
                                }
                                i66++;
                            }
                        }
                        if (i67 == i58) {
                            break;
                        }
                        i67++;
                        i66 = i56;
                    }
                }
                A1C3.add(new PointF(((float) i85) * f3, ((float) i86) * f4));
                i84++;
                i66 = i56;
                i67 = i55;
            }
            while (true) {
                A1C2.add(A1C3);
                i65++;
                if (i65 >= 6) {
                    return new C21499Xcz(new Rect((int) (((float) i56) * f3), (int) (((float) i55) * f4), (int) (((float) i57) * f3), (int) (((float) i58) * f4)), A1C2, f5);
                }
                if (i65 >= 4) {
                    if (i65 == 4) {
                        int i87 = i56;
                        int[] iArr15 = new int[4];
                        int i88 = 0;
                        do {
                            iArr15[i88] = 0;
                            i88++;
                        } while (i88 < 4);
                        int[] iArr16 = new int[4];
                        int i89 = 0;
                        do {
                            iArr16[i89] = 0;
                            i89++;
                        } while (i89 < 4);
                        int[] iArr17 = new int[4];
                        int i90 = 0;
                        do {
                            iArr17[i90] = 0;
                            i90++;
                        } while (i90 < 4);
                        Integer[] numArr = {Integer.valueOf(i56), Integer.valueOf((i61 / 2) + i56), Integer.valueOf(i57)};
                        Integer[] numArr2 = {Integer.valueOf(i55), Integer.valueOf((i63 / 2) + i55), Integer.valueOf(i58)};
                        if (i55 <= i58) {
                            int i91 = i55;
                            while (true) {
                                if (i56 <= i57) {
                                    int i92 = i56;
                                    while (true) {
                                        if (iArr7[i91][i92] == i6) {
                                            int i93 = 0;
                                            do {
                                                int i94 = 0;
                                                do {
                                                    int i95 = i93 + (i94 * 2);
                                                    if (i92 >= numArr[i93].intValue() && i92 < numArr[i93 + 1].intValue() && i91 >= numArr2[i94].intValue() && i91 < numArr2[i94 + 1].intValue()) {
                                                        iArr15[i95] = iArr15[i95] + i92;
                                                        iArr16[i95] = iArr16[i95] + i91;
                                                        iArr17[i95] = iArr17[i95] + 1;
                                                    }
                                                    i94++;
                                                } while (i94 < 2);
                                                i93++;
                                            } while (i93 < 2);
                                        }
                                        if (i92 == i57) {
                                            break;
                                        }
                                        i92++;
                                    }
                                }
                                if (i91 == i58) {
                                    break;
                                }
                                i91++;
                            }
                        }
                        A1C3 = AnonymousClass7TE.A1C();
                        int i96 = 0;
                        do {
                            float f11 = (float) iArr15[i96];
                            float f12 = (float) iArr17[i96];
                            float f13 = f11 / f12;
                            float f14 = ((float) iArr16[i96]) / f12;
                            float f15 = Float.MAX_VALUE;
                            int i97 = i56;
                            int i98 = i55;
                            if (i55 <= i58) {
                                int i99 = i55;
                                while (true) {
                                    if (i56 <= i57) {
                                        while (true) {
                                            if (iArr7[i99][i87] == i6) {
                                                float abs2 = Math.abs(f13 - ((float) i87)) + Math.abs(f14 - ((float) i99));
                                                if (abs2 < f15) {
                                                    i97 = i87;
                                                    f15 = abs2;
                                                    i98 = i99;
                                                }
                                            }
                                            if (i87 == i57) {
                                                break;
                                            }
                                            i87++;
                                        }
                                    }
                                    if (i99 == i58) {
                                        break;
                                    }
                                    i99++;
                                    i87 = i56;
                                }
                            }
                            A1C3.add(new PointF(((float) i97) * f3, ((float) i98) * f4));
                            i96++;
                            i87 = i56;
                        } while (i96 < 4);
                    } else {
                        ArrayList arrayList5 = A1C2;
                        A1C3 = 00k.A0S((Iterable) arrayList5.get(3), (Collection) arrayList5.get(0));
                    }
                }
            }
        }
    }
}
