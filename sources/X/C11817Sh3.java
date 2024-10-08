package X;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.Sh3  reason: case insensitive filesystem */
public final class C11817Sh3 implements C13520Tbp {
    public int A00;

    public final /* bridge */ /* synthetic */ Object E1k(C12828T8z t8z, float f) {
        int i;
        float f2;
        int i2;
        float f3;
        float A002;
        float f4;
        ArrayList A1C = AnonymousClass7TE.A1C();
        int i3 = 0;
        boolean z = false;
        if (t8z.A0E() == AnonymousClass05K.A00) {
            z = true;
            t8z.A0I();
        }
        while (t8z.A0Q()) {
            A1C.add(Float.valueOf(Pxh.A02(t8z)));
        }
        if (A1C.size() == 4 && AnonymousClass7TE.A04(A1C.get(0)) == 1.0f) {
            A1C.set(0, C51967G9n.A0g());
            A1C.add(Float.valueOf(1.0f));
            A1C.add(A1C.get(1));
            A1C.add(A1C.get(2));
            A1C.add(A1C.get(3));
            this.A00 = 2;
        }
        if (z) {
            t8z.A0K();
        }
        int i4 = this.A00;
        if (i4 == -1) {
            i4 = A1C.size() / 4;
            this.A00 = i4;
        }
        float[] fArr = new float[i4];
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = this.A00 * 4;
            if (i3 >= i) {
                break;
            }
            int i7 = i3 / 4;
            double A04 = (double) AnonymousClass7TE.A04(A1C.get(i3));
            int i8 = i3 % 4;
            if (i8 == 0) {
                if (i7 > 0) {
                    float f5 = (float) A04;
                    if (fArr[i7 - 1] >= f5) {
                        f4 = f5 + 0.01f;
                        fArr[i7] = f4;
                    }
                }
                f4 = (float) A04;
                fArr[i7] = f4;
            } else if (i8 == 1) {
                i5 = (int) (A04 * 255.0d);
            } else if (i8 == 2) {
                i6 = (int) (A04 * 255.0d);
            } else if (i8 == 3) {
                iArr[i7] = Color.argb(255, i5, i6, (int) (A04 * 255.0d));
            }
            i3++;
        }
        S5S s5s = new S5S(fArr, iArr);
        if (A1C.size() <= i) {
            return s5s;
        }
        float[] fArr2 = s5s.A00;
        int[] iArr2 = s5s.A01;
        int size = (A1C.size() - i) / 2;
        float[] fArr3 = new float[size];
        float[] fArr4 = new float[size];
        int i9 = 0;
        int i10 = 0;
        while (i < A1C.size()) {
            int i11 = i % 2;
            float A042 = AnonymousClass7TE.A04(A1C.get(i));
            if (i11 == 0) {
                fArr3[i10] = A042;
            } else {
                fArr4[i10] = A042;
                i10++;
            }
            i++;
        }
        float[] fArr5 = fArr2;
        int length = fArr2.length;
        if (length == 0) {
            fArr5 = fArr3;
        } else if (size != 0) {
            int i12 = length + size;
            fArr5 = new float[i12];
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                float f6 = Float.NaN;
                if (i14 < length) {
                    f2 = fArr2[i14];
                } else {
                    f2 = Float.NaN;
                }
                if (i15 < size) {
                    f6 = fArr3[i15];
                }
                if (Float.isNaN(f6) || f2 < f6) {
                    fArr5[i16] = f2;
                    i14++;
                } else if (Float.isNaN(f2) || f6 < f2) {
                    fArr5[i16] = f6;
                    i15++;
                } else {
                    fArr5[i16] = f2;
                    i14++;
                    i15++;
                    i13++;
                }
            }
            if (i13 != 0) {
                fArr5 = Arrays.copyOf(fArr5, i12 - i13);
            }
        }
        int length2 = fArr5.length;
        int[] iArr3 = new int[length2];
        while (i9 < length2) {
            float f7 = fArr5[i9];
            int binarySearch = Arrays.binarySearch(fArr2, f7);
            int binarySearch2 = Arrays.binarySearch(fArr3, f7);
            if (binarySearch >= 0) {
                if (binarySearch2 <= 0) {
                    int i17 = iArr2[binarySearch];
                    if (size < 2 || f7 <= fArr3[0]) {
                        i2 = C51973G9u.A01(i17, (int) (fArr4[0] * 255.0f));
                        iArr3[i9] = i2;
                        i9++;
                    } else {
                        int i18 = 1;
                        while (true) {
                            f3 = fArr3[i18];
                            if (f3 < f7 && i18 != size - 1) {
                                i18++;
                                if (i18 >= size) {
                                    throw AnonymousClass7TE.A0w("Unreachable code.");
                                }
                            }
                        }
                        if (f3 <= f7) {
                            A002 = fArr4[i18];
                        } else {
                            int i19 = i18 - 1;
                            float f8 = fArr3[i19];
                            float f9 = f7 - f8;
                            A002 = Pxh.A00(fArr4[i18], fArr4[i19], f9 / (f3 - f8));
                        }
                        i2 = C51973G9u.A01(i17, (int) (A002 * 255.0f));
                        iArr3[i9] = i2;
                        i9++;
                    }
                }
            } else if (binarySearch2 < 0) {
                binarySearch2 = -(binarySearch2 + 1);
            }
            float f10 = fArr4[binarySearch2];
            if (iArr2.length < 2 || f7 == fArr2[0]) {
                i2 = iArr2[0];
                iArr3[i9] = i2;
                i9++;
            } else {
                int i20 = 1;
                while (i20 < length) {
                    float f11 = fArr2[i20];
                    if (f11 < f7 && i20 != length - 1) {
                        i20++;
                    } else if (i20 != length - 1 || f7 < f11) {
                        int i21 = i20 - 1;
                        float f12 = fArr2[i21];
                        i2 = C51973G9u.A01(SKD.A02((f7 - f12) / (f11 - f12), iArr2[i21], iArr2[i20]), (int) (f10 * 255.0f));
                        iArr3[i9] = i2;
                        i9++;
                    } else {
                        i2 = Color.argb((int) (f10 * 255.0f), Color.red(iArr2[i20]), Color.green(iArr2[i20]), Color.blue(iArr2[i20]));
                        iArr3[i9] = i2;
                        i9++;
                    }
                }
                throw AnonymousClass7TE.A0w("Unreachable code.");
            }
        }
        return new S5S(fArr5, iArr3);
    }
}
