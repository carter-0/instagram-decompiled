package X;

import android.graphics.Rect;
import android.os.MemoryFile;
import java.io.IOException;

public final class XPT extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C21451Xb3 A01;
    public final /* synthetic */ C387389m8 A02;
    public final /* synthetic */ byte[] A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XPT(C21451Xb3 xb3, C387389m8 r5, byte[] bArr, int i) {
        super(81, 2, false, false);
        this.A02 = r5;
        this.A01 = xb3;
        this.A03 = bArr;
        this.A00 = i;
    }

    public static void A00(byte[] bArr, int i, int i2, int i3, int i4) {
        byte b = bArr[i];
        byte b2 = bArr[i2];
        bArr[i] = bArr[i3];
        bArr[i2] = bArr[i4];
        bArr[i3] = b;
        bArr[i4] = b2;
    }

    public final void run() {
        byte[] bArr;
        MemoryFile memoryFile;
        C21451Xb3 xb3 = this.A01;
        Rect rect = xb3.A04;
        rect.getClass();
        int width = rect.width();
        int height = rect.height();
        int i = xb3.A03;
        int i2 = xb3.A02;
        if (i > width) {
            i = width;
        }
        if (i2 > height) {
            i2 = height;
        }
        byte[] bArr2 = this.A03;
        boolean z = xb3.A06;
        int i3 = xb3.A00;
        int i4 = xb3.A01;
        if (i3 == 19) {
            byte[] A002 = XXz.A00(bArr2, width, height, i, i2);
            int length = A002.length;
            bArr = new byte[length];
            System.arraycopy(A002, 0, bArr, 0, length);
            int i5 = i * i2;
            int i6 = i5 / 4;
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = (i7 * 2) + i5;
                byte b = A002[i8];
                byte b2 = A002[i8 + 1];
                int i9 = i5 + i7;
                bArr[i9 + i6] = b;
                bArr[i9] = b2;
            }
            if (z) {
                int i10 = ((i4 + 45) / 90) * 90;
                if (i10 == 90 || i10 == 270) {
                    for (int i11 = 0; i11 < i; i11++) {
                        int i12 = i2 / 2;
                        for (int i13 = 0; i13 < i12; i13++) {
                            int i14 = (i13 * i) + i11;
                            int i15 = (((i2 - i13) - 1) * i) + i11;
                            byte b3 = bArr[i14];
                            bArr[i14] = bArr[i15];
                            bArr[i15] = b3;
                        }
                    }
                    int i16 = (length - i5) / i;
                    for (int i17 = 0; i17 < i; i17++) {
                        int i18 = i16 / 4;
                        for (int i19 = 0; i19 < i18; i19++) {
                            int i20 = (i19 * i) + i5 + i17;
                            int i21 = ((((i16 / 2) - 1) - i19) * i) + i5 + i17;
                            A00(bArr, i20, i20 + i6, i21, i21 + i6);
                        }
                    }
                } else {
                    int i22 = i / 2;
                    for (int i23 = 0; i23 < i22; i23++) {
                        for (int i24 = 0; i24 < i2; i24++) {
                            int i25 = i24 * i;
                            int i26 = i25 + i23;
                            int i27 = i25 + ((i - i23) - 1);
                            byte b4 = bArr[i26];
                            bArr[i26] = bArr[i27];
                            bArr[i27] = b4;
                        }
                    }
                    int i28 = (length - i5) / i;
                    for (int i29 = 0; i29 < i22; i29++) {
                        int i30 = i28 / 2;
                        for (int i31 = 0; i31 < i30; i31++) {
                            int i32 = (i31 * i) + i5;
                            int i33 = i32 + i29;
                            int i34 = i32 + ((i - i29) - 1);
                            A00(bArr, i33, i33 + i6, i34, i34 + i6);
                        }
                    }
                }
            }
        } else if (i3 == 21) {
            bArr = XXz.A00(bArr2, width, height, i, i2);
            int length2 = bArr.length;
            int i35 = (length2 / 3) * 2;
            int i36 = i35;
            while (i35 < length2) {
                byte b5 = bArr[i35];
                int i37 = i35 + 1;
                bArr[i35] = bArr[i37];
                bArr[i37] = b5;
                i35 += 2;
            }
            if (z) {
                int i38 = ((i4 + 45) / 90) * 90;
                if (i38 == 90 || i38 == 270) {
                    for (int i39 = 0; i39 < i; i39++) {
                        int i40 = (i36 / i) / 2;
                        for (int i41 = 0; i41 < i40; i41++) {
                            int i42 = (i41 * i) + i39;
                            int i43 = (((i2 - i41) - 1) * i) + i39;
                            byte b6 = bArr[i42];
                            bArr[i42] = bArr[i43];
                            bArr[i43] = b6;
                        }
                    }
                    int i44 = i2 / 2;
                    for (int i45 = 0; i45 < i; i45 += 2) {
                        int i46 = i44 / 2;
                        for (int i47 = 0; i47 < i46; i47++) {
                            int i48 = (i47 * i) + i36 + i45;
                            int i49 = (((i44 - i47) - 1) * i) + i36 + i45;
                            A00(bArr, i48, i48 + 1, i49, i49 + 1);
                        }
                    }
                } else {
                    int i50 = i / 2;
                    for (int i51 = 0; i51 < i50; i51++) {
                        int i52 = i36 / i;
                        for (int i53 = 0; i53 < i52; i53++) {
                            int i54 = i53 * i;
                            int i55 = i54 + i51;
                            int i56 = i54 + ((i - i51) - 1);
                            byte b7 = bArr[i55];
                            bArr[i55] = bArr[i56];
                            bArr[i56] = b7;
                        }
                    }
                    int i57 = i2 / 2;
                    for (int i58 = 0; i58 < i50; i58 += 2) {
                        for (int i59 = 0; i59 < i57; i59++) {
                            int i60 = (i59 * i) + i36;
                            int i61 = i60 + i58;
                            int i62 = i - i58;
                            A00(bArr, i61, i61 + 1, (i62 - 2) + i60, i60 + (i62 - 1));
                        }
                    }
                }
            }
        } else {
            throw new RuntimeException("Unsupported color format");
        }
        MemoryFile memoryFile2 = null;
        try {
            int length3 = bArr.length;
            memoryFile = new MemoryFile((String) null, length3);
            try {
                memoryFile.writeBytes(bArr, 0, 0, length3);
            } catch (IOException e) {
                e = e;
            }
        } catch (IOException e2) {
            e = e2;
            memoryFile = null;
            String A003 = Pxd.A00(364);
            0kD.A0B(A003, "Failed to create MemoryFile", e);
            0KC.A0F(A003, "Failed to create MemoryFile", e);
            if (memoryFile != null) {
                memoryFile.close();
                11Z.A03(new C41210Aq8(memoryFile2, this, xb3, this.A00));
            }
            memoryFile2 = memoryFile;
            11Z.A03(new C41210Aq8(memoryFile2, this, xb3, this.A00));
        }
        memoryFile2 = memoryFile;
        11Z.A03(new C41210Aq8(memoryFile2, this, xb3, this.A00));
    }
}
