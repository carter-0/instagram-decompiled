package X;

import android.opengl.Matrix;
import java.util.Arrays;

/* renamed from: X.7sr  reason: invalid class name and case insensitive filesystem */
public abstract class C345057sr {
    public String A00;
    public boolean A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public boolean A07;
    public boolean A08;
    public final C345067ss A09;
    public final float[] A0A;
    public final float[] A0B;

    public static void A01(C345067ss r3, float[] fArr) {
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        System.arraycopy(fArr, 0, r3.A03, 0, 16);
    }

    public static void A04(float[] fArr, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = (float) i;
        float f7 = (float) i2;
        float f8 = f6 / f7;
        float f9 = (float) i3;
        float f10 = (float) i4;
        float f11 = f9 / f10;
        if (i < i2) {
            f2 = f8;
            f = 1.0f;
        } else {
            f = f7 / f6;
            f2 = 1.0f;
        }
        if (i3 < i4) {
            f4 = f11;
            f3 = 1.0f;
        } else {
            f3 = f10 / f9;
            f4 = 1.0f;
        }
        if (f8 < f11) {
            f5 = f2 / f4;
        } else {
            f5 = f / f3;
        }
        Matrix.scaleM(fArr, 0, f5, f5, 1.0f);
    }

    public static void A07(float[] fArr, float[] fArr2) {
        System.arraycopy(fArr2, 0, fArr, 0, 16);
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
    }

    public static void A00(C345067ss r12, float f, float f2, float f3, int i, int i2, int i3, int i4, int i5, int i6) {
        float f4;
        float f5;
        int i7 = i5;
        r12.A01 = i7;
        int i8 = i6;
        r12.A00 = i8;
        float f6 = (float) i7;
        float f7 = (f * ((float) i3)) / f6;
        float f8 = (float) i8;
        float f9 = (f2 * ((float) i4)) / f8;
        float f10 = ((float) (((i * 2) + i3) - i5)) / f6;
        float f11 = ((float) (((i2 * 2) + i4) - i6)) / f8;
        float[] fArr = r12.A02;
        Matrix.setIdentityM(fArr, 0);
        float f12 = f3;
        if (f3 != 0.0f) {
            if (i7 < i8) {
                f5 = f8 / f6;
                f4 = 1.0f;
            } else {
                f4 = f6 / f8;
                f5 = 1.0f;
            }
            Matrix.scaleM(fArr, 0, f5, f4, 1.0f);
            Matrix.rotateM(fArr, 0, f12, 0.0f, 0.0f, 1.0f);
            A03(fArr, i7, i8);
        }
        Matrix.translateM(fArr, 0, f10, f11, 0.0f);
        Matrix.scaleM(fArr, 0, f7, f9, 1.0f);
    }

    public static void A02(float[] fArr, int i) {
        if (i != 0) {
            Matrix.rotateM(fArr, 0, (float) i, 0.0f, 0.0f, -1.0f);
        }
    }

    public static void A03(float[] fArr, int i, int i2) {
        float f;
        float f2;
        if (i < i2) {
            f2 = ((float) i) / ((float) i2);
            f = 1.0f;
        } else {
            f = ((float) i2) / ((float) i);
            f2 = 1.0f;
        }
        Matrix.scaleM(fArr, 0, f2, f, 1.0f);
    }

    public static void A05(float[] fArr, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i < i2) {
            f2 = ((float) i) / ((float) i2);
            f = 1.0f;
        } else {
            f = ((float) i2) / ((float) i);
            f2 = 1.0f;
        }
        if (i3 < i4) {
            f4 = ((float) i3) / ((float) i4);
            f3 = 1.0f;
        } else {
            f3 = ((float) i4) / ((float) i3);
            f4 = 1.0f;
        }
        Matrix.scaleM(fArr, 0, f2 / f4, f / f3, 1.0f);
    }

    public static void A06(float[] fArr, boolean z, boolean z2) {
        if (z || z2) {
            float f = -1.0f;
            float f2 = 1.0f;
            if (z) {
                f2 = -1.0f;
            }
            if (!z2) {
                f = 1.0f;
            }
            Matrix.scaleM(fArr, 0, f2, f, 1.0f);
        }
    }

    public final C345067ss A08() {
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f4;
        int i7;
        int i8;
        float f5;
        float f6;
        if (this.A01) {
            this.A01 = false;
            C345067ss r15 = this.A09;
            float[] fArr = this.A0B;
            int i9 = this.A06;
            int i10 = this.A05;
            int i11 = this.A03;
            int i12 = this.A02;
            int i13 = this.A04;
            boolean z = this.A07;
            boolean z2 = this.A08;
            if (this instanceof C345047sq) {
                C345047sq r6 = (C345047sq) this;
                int i14 = i9;
                int i15 = i10;
                if (i13 % 180 != 0) {
                    i14 = i10;
                    i15 = i9;
                }
                float[] fArr2 = r6.A00;
                A07(fArr2, fArr);
                if (i9 < i10) {
                    f6 = ((float) i10) / ((float) i9);
                    f5 = 1.0f;
                } else {
                    f5 = ((float) i9) / ((float) i10);
                    f6 = 1.0f;
                }
                Matrix.scaleM(fArr2, 0, f6, f5, 1.0f);
                A02(fArr2, i13);
                A04(fArr2, i14, i15, i11, i12);
                A06(fArr2, z, z2);
                A01(r15, fArr2);
                float f7 = (float) i14;
                float f8 = (float) i15;
                float f9 = ((float) i11) / ((float) i12);
                if (f9 < f7 / f8) {
                    i14 = Math.round(f8 * f9);
                } else {
                    i15 = Math.round(f7 / f9);
                }
                r15.A01 = i14;
                r15.A00 = i15;
            } else {
                if (this instanceof AnonymousClass800) {
                    AnonymousClass800 r62 = (AnonymousClass800) this;
                    boolean z3 = true;
                    boolean z4 = false;
                    int i16 = i9;
                    if (i13 % 180 != 0) {
                        i16 = i10;
                        i10 = i9;
                    }
                    if (r62.A00) {
                        if (Math.abs(((((float) i16) / ((float) i10)) / (((float) i11) / ((float) i12))) - 1.0f) >= 0.015f) {
                            z3 = false;
                        }
                        z4 = z3;
                    }
                    float[] fArr3 = r62.A01;
                    A07(fArr3, fArr);
                    A02(fArr3, i13);
                    if (z4) {
                        A04(fArr3, i16, i10, i11, i12);
                    } else {
                        A05(fArr3, i16, i10, i11, i12);
                    }
                    A06(fArr3, z, z2);
                    A03(fArr3, i11, i12);
                    A01(r15, fArr3);
                    if (!z4) {
                        f = 0.0f;
                        float f10 = ((float) i16) / ((float) i10);
                        float f11 = (float) i11;
                        float f12 = (float) i12;
                        if (f10 < f11 / f12) {
                            i3 = Math.round(f12 * f10);
                            i4 = i12;
                        } else {
                            i4 = Math.round(f11 / f10);
                            i3 = i11;
                        }
                        f2 = 1.0f;
                        f3 = 1.0f;
                        i = (i11 - i3) / 2;
                        i2 = (i12 - i4) / 2;
                    }
                    f = 0.0f;
                    f2 = 1.0f;
                    f3 = 1.0f;
                    i = 0;
                    i2 = 0;
                    i3 = i11;
                    i4 = i12;
                } else if (this instanceof C345077st) {
                    C345077st r63 = (C345077st) this;
                    int i17 = i9;
                    if (i13 % 180 != 0) {
                        i17 = i10;
                        i10 = i9;
                    }
                    float[] fArr4 = r63.A00;
                    A07(fArr4, fArr);
                    A02(fArr4, i13);
                    A04(fArr4, i17, i10, i11, i12);
                    A06(fArr4, z, z2);
                    A03(fArr4, i11, i12);
                    A01(r15, fArr4);
                    f = 0.0f;
                    f2 = 1.0f;
                    f3 = 1.0f;
                    i = 0;
                    i2 = 0;
                    i3 = i11;
                    i4 = i12;
                } else {
                    if (this instanceof C382349dY) {
                        C382349dY r64 = (C382349dY) this;
                        int i18 = i9;
                        if (i13 % 180 != 0) {
                            i18 = i10;
                            i10 = i9;
                        }
                        float f13 = ((float) i18) / ((float) i10);
                        float f14 = (float) i11;
                        float f15 = (float) i12;
                        float f16 = f14 / f15;
                        if (f16 > f13) {
                            f4 = f16 / f13;
                        } else {
                            f4 = 1.0f;
                        }
                        float[] fArr5 = r64.A04;
                        A07(fArr5, fArr);
                        A02(fArr5, i13);
                        A05(fArr5, i18, i10, i11, i12);
                        A06(fArr5, z, z2);
                        A03(fArr5, i11, i12);
                        A01(r15, fArr5);
                        if (f13 < f16) {
                            i8 = (int) (f13 * f15);
                            i7 = i12;
                        } else {
                            i7 = (int) (f14 / f13);
                            i8 = i11;
                        }
                        int i19 = ((int) (r64.A02 * f14)) + ((i11 - i8) / 2);
                        int i20 = ((i12 - i7) / 2) - ((int) (r64.A03 * f15));
                        f3 = f4 * r64.A01;
                        f2 = f3 * 1.0f;
                        i = i19;
                        i2 = i20;
                        i3 = i8;
                        i4 = i7;
                        i5 = i11;
                        i6 = i12;
                        f = r64.A00;
                    } else if (this instanceof C365458n9) {
                        C365458n9 r65 = (C365458n9) this;
                        int i21 = i9;
                        if (i13 % 180 != 0) {
                            i21 = i10;
                            i10 = i9;
                        }
                        float[] fArr6 = r65.A07;
                        A07(fArr6, fArr);
                        A02(fArr6, i13);
                        A04(fArr6, i21, i10, i11, i12);
                        float f17 = (float) r65.A05;
                        float f18 = (float) r65.A06;
                        float f19 = (float) r65.A04;
                        float f20 = (float) r65.A03;
                        float f21 = (float) i21;
                        float f22 = (float) i10;
                        float max = Math.max(f21, f22);
                        float max2 = Math.max(f19, f20) / max;
                        Matrix.translateM(fArr6, 0, (f17 + ((f19 - f21) / 2.0f)) / max, -((f18 + ((f20 - f22) / 2.0f)) / max), 0.0f);
                        Matrix.scaleM(fArr6, 0, max2, max2, 1.0f);
                        A06(fArr6, z, z2);
                        A01(r15, fArr6);
                        int i22 = r65.A04;
                        int i23 = r65.A03;
                        i = 0;
                        i2 = 0;
                        i3 = i22;
                        i4 = i23;
                        i5 = i22;
                        i6 = i23;
                        f2 = r65.A01;
                        f3 = r65.A02;
                        f = r65.A00;
                    } else {
                        C382339dX r66 = (C382339dX) this;
                        int i24 = i9;
                        if (i13 % 180 != 0) {
                            i24 = i10;
                            i10 = i9;
                        }
                        float[] fArr7 = r66.A04;
                        A07(fArr7, fArr);
                        A02(fArr7, i13);
                        A04(fArr7, i24, i10, r66.A01, r66.A00);
                        A06(fArr7, z, z2);
                        A03(fArr7, r66.A01, r66.A00);
                        A01(r15, fArr7);
                        int i25 = r66.A02;
                        int i26 = r66.A00;
                        i2 = (i12 - r66.A03) - i26;
                        f = 0.0f;
                        f2 = 1.0f;
                        f3 = 1.0f;
                        i = i25;
                        i3 = r66.A01;
                        i4 = i26;
                    }
                    A00(r15, f2, f3, f, i, i2, i3, i4, i5, i6);
                }
                i5 = i11;
                i6 = i12;
                A00(r15, f2, f3, f, i, i2, i3, i4, i5, i6);
            }
        }
        return this.A09;
    }

    public final void A09(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        if (i != this.A06 || i2 != this.A05 || i3 != this.A03 || i4 != this.A02 || i5 != this.A04 || z != this.A07 || z2 != this.A08) {
            this.A06 = i;
            this.A05 = i2;
            this.A03 = i3;
            this.A02 = i4;
            this.A04 = i5;
            this.A07 = z;
            this.A08 = z2;
            this.A01 = true;
        }
    }

    public final void A0A(float[] fArr) {
        float[] fArr2 = this.A0B;
        if (!Arrays.equals(fArr2, fArr)) {
            System.arraycopy(fArr, 0, fArr2, 0, 16);
            this.A01 = true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BaseScaleType{");
        String str = this.A00;
        if (str == null) {
            str = Arrays.toString(Arrays.copyOfRange(Thread.currentThread().getStackTrace(), 4, 15));
        }
        sb.append(str);
        sb.append(", mBaseMatrix=");
        sb.append(Arrays.toString(this.A0B));
        sb.append(", mBaseContentMatrix=");
        sb.append(Arrays.toString(this.A0A));
        sb.append(", mViewport=");
        sb.append(this.A09);
        sb.append(", mSrcWidth=");
        sb.append(this.A06);
        sb.append(", mSrcHeight=");
        sb.append(this.A05);
        sb.append(", mDstWidth=");
        sb.append(this.A03);
        sb.append(", mDstHeight=");
        sb.append(this.A02);
        sb.append(", mOrientation=");
        sb.append(this.A04);
        sb.append(", mFlipX=");
        sb.append(this.A07);
        sb.append(", mFlipY=");
        sb.append(this.A08);
        sb.append('}');
        return sb.toString();
    }

    public C345057sr() {
        float[] fArr = new float[16];
        this.A0B = fArr;
        float[] fArr2 = new float[16];
        this.A0A = fArr2;
        C345067ss r2 = new C345067ss();
        this.A09 = r2;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        System.arraycopy(fArr, 0, r2.A03, 0, 16);
        System.arraycopy(fArr2, 0, r2.A02, 0, 16);
    }
}
