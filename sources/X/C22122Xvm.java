package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.media3.common.util.Util;
import java.util.List;

/* renamed from: X.Xvm  reason: case insensitive filesystem */
public final class C22122Xvm implements C13684Tf1 {
    public static final byte[] A07 = {0, 7, 8, 15};
    public static final byte[] A08 = {0, 119, -120, -1};
    public static final byte[] A09 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Bitmap A00;
    public final Canvas A01 = new Canvas();
    public final Paint A02;
    public final Paint A03;
    public final C21423XaY A04 = new C21423XaY(new int[]{0, -1, -16777216, -8421505}, A03(), A04(), 0);
    public final C21441Xat A05 = new C21441Xat(719, 575, 0, 719, 0, 575);
    public final XbB A06;

    public static C21423XaY A00(ST7 st7, int i) {
        int[] iArr;
        int A062;
        int A063;
        int A064;
        int A065;
        ST7 st72 = st7;
        int A066 = st72.A06(8);
        st72.A0A(8);
        int i2 = i - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] A032 = A03();
        int[] A042 = A04();
        while (i2 > 0) {
            int A067 = st72.A06(8);
            int A068 = st72.A06(8);
            int i3 = i2 - 2;
            if ((A068 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = A042;
                if ((A068 & 64) != 0) {
                    iArr = A032;
                }
            }
            if ((A068 & 1) != 0) {
                A062 = st72.A06(8);
                A063 = st72.A06(8);
                A064 = st72.A06(8);
                A065 = st72.A06(8);
                i2 = i3 - 4;
            } else {
                A062 = st72.A06(6) << 2;
                A063 = st72.A06(4) << 4;
                A064 = st72.A06(4) << 4;
                A065 = st72.A06(2) << 6;
                i2 = i3 - 2;
            }
            if (A062 == 0) {
                A063 = 0;
                A064 = 0;
                A065 = 255;
            }
            double d = (double) A062;
            double d2 = (double) (A063 - 128);
            double d3 = (double) (A064 - 128);
            iArr[A067] = (((byte) (255 - (A065 & 255))) << 24) | (Pxf.A01((int) (d + (1.402d * d2)), 255, 0) << 16) | (Pxf.A01((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255, 0) << 8) | Pxf.A01((int) (d + (d3 * 1.772d)), 255, 0);
        }
        return new C21423XaY(iArr2, A032, A042, A066);
    }

    public static C21424XaZ A01(ST7 st7) {
        int A062 = st7.A06(16);
        st7.A0A(4);
        int A063 = st7.A06(2);
        boolean A0F = st7.A0F();
        st7.A0A(1);
        byte[] bArr = Util.A07;
        byte[] bArr2 = bArr;
        if (A063 == 1) {
            st7.A0A(st7.A06(8) * 16);
        } else if (A063 == 0) {
            int A064 = st7.A06(16);
            int A065 = st7.A06(16);
            if (A064 > 0) {
                bArr = new byte[A064];
                st7.A0E(bArr, A064);
            }
            if (A065 > 0) {
                bArr2 = new byte[A065];
                st7.A0E(bArr2, A065);
            } else {
                bArr2 = bArr;
            }
        }
        return new C21424XaZ(bArr, bArr2, A062, A0F);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044 A[SYNTHETIC] */
    public static int[] A03() {
        /*
            r7 = 16
            int[] r6 = new int[r7]
            r0 = 0
            r6[r0] = r0
            r5 = 1
        L_0x0008:
            r4 = 255(0xff, float:3.57E-43)
        L_0x000a:
            r0 = r5 & 2
            r3 = 0
            if (r0 == 0) goto L_0x0011
            r3 = 255(0xff, float:3.57E-43)
        L_0x0011:
            r0 = r5 & 4
            r2 = 255(0xff, float:3.57E-43)
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r4 << 16
            r1 = r1 | r0
            int r0 = r3 << 8
            r1 = r1 | r0
            r1 = r1 | r2
            r6[r5] = r1
            int r5 = r5 + 1
            if (r5 >= r7) goto L_0x0044
            r1 = 8
            r0 = r5 & 1
            if (r5 >= r1) goto L_0x0031
            r4 = 0
            if (r0 == 0) goto L_0x000a
            goto L_0x0008
        L_0x0031:
            r2 = 127(0x7f, float:1.78E-43)
            r4 = 0
            if (r0 == 0) goto L_0x0038
            r4 = 127(0x7f, float:1.78E-43)
        L_0x0038:
            r0 = r5 & 2
            r3 = 0
            if (r0 == 0) goto L_0x003f
            r3 = 127(0x7f, float:1.78E-43)
        L_0x003f:
            r0 = r5 & 4
            if (r0 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0044:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22122Xvm.A03():int[]");
    }

    public static int[] A04() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[256];
        iArr[0] = 0;
        int i6 = 0;
        do {
            int i7 = 255;
            if (i6 < 8) {
                i3 = 0;
                if ((i6 & 1) != 0) {
                    i3 = 255;
                }
                i4 = 0;
                if ((i6 & 2) != 0) {
                    i4 = 255;
                }
                if ((i6 & 4) == 0) {
                    i7 = 0;
                }
                i5 = 1056964608;
            } else {
                int i8 = i6 & 136;
                int i9 = C11152SCh.MAX_FACTORIAL;
                int i10 = 85;
                if (i8 == 0) {
                    int i11 = 0;
                    if ((i6 & 1) != 0) {
                        i11 = 85;
                    }
                    int i12 = 0;
                    if ((i6 & 16) != 0) {
                        i12 = C11152SCh.MAX_FACTORIAL;
                    }
                    i = i11 + i12;
                    int i13 = 0;
                    if ((i6 & 2) != 0) {
                        i13 = 85;
                    }
                    int i14 = 0;
                    if ((i6 & 32) != 0) {
                        i14 = C11152SCh.MAX_FACTORIAL;
                    }
                    i2 = i13 + i14;
                    if ((i6 & 4) == 0) {
                        i10 = 0;
                    }
                    if ((i6 & 64) == 0) {
                        i9 = 0;
                    }
                } else if (i8 != 8) {
                    i9 = 43;
                    if (i8 != 128) {
                        if (i8 == 136) {
                            int i15 = 0;
                            if ((i6 & 1) != 0) {
                                i15 = 43;
                            }
                            int i16 = 0;
                            if ((i6 & 16) != 0) {
                                i16 = 85;
                            }
                            i = i15 + i16;
                            int i17 = 0;
                            if ((i6 & 2) != 0) {
                                i17 = 43;
                            }
                            int i18 = 0;
                            if ((i6 & 32) != 0) {
                                i18 = 85;
                            }
                            i2 = i17 + i18;
                            if ((i6 & 4) == 0) {
                                i9 = 0;
                            }
                        }
                        i6++;
                    } else {
                        int i19 = 0;
                        if ((i6 & 1) != 0) {
                            i19 = 43;
                        }
                        int i20 = i19 + 127;
                        int i21 = 0;
                        if ((i6 & 16) != 0) {
                            i21 = 85;
                        }
                        i = i20 + i21;
                        int i22 = 0;
                        if ((i6 & 2) != 0) {
                            i22 = 43;
                        }
                        int i23 = i22 + 127;
                        int i24 = 0;
                        if ((i6 & 32) != 0) {
                            i24 = 85;
                        }
                        i2 = i23 + i24;
                        if ((i6 & 4) == 0) {
                            i9 = 0;
                        }
                        i9 += 127;
                    }
                    if ((i6 & 64) == 0) {
                        i10 = 0;
                    }
                } else {
                    int i25 = 0;
                    if ((i6 & 1) != 0) {
                        i25 = 85;
                    }
                    int i26 = 0;
                    if ((i6 & 16) != 0) {
                        i26 = C11152SCh.MAX_FACTORIAL;
                    }
                    i3 = i25 + i26;
                    int i27 = 0;
                    if ((i6 & 2) != 0) {
                        i27 = 85;
                    }
                    int i28 = 0;
                    if ((i6 & 32) != 0) {
                        i28 = C11152SCh.MAX_FACTORIAL;
                    }
                    i4 = i27 + i28;
                    if ((i6 & 4) == 0) {
                        i10 = 0;
                    }
                    if ((i6 & 64) == 0) {
                        i9 = 0;
                    }
                    i7 = i10 + i9;
                    i5 = 2130706432;
                }
                i7 = i10 + i9;
                i5 = -16777216;
            }
            iArr[i6] = i5 | (i3 << 16) | (i4 << 8) | i7;
            i6++;
        } while (i6 < 256);
        return iArr;
    }

    public final void reset() {
        XbB xbB = this.A06;
        xbB.A08.clear();
        xbB.A06.clear();
        xbB.A07.clear();
        xbB.A04.clear();
        xbB.A05.clear();
        xbB.A00 = null;
        xbB.A01 = null;
    }

    public C22122Xvm(List list) {
        char[] cArr = C11389SRd.A04;
        C11389SRd sRd = new C11389SRd((byte[]) list.get(0));
        int A082 = sRd.A08();
        int A083 = sRd.A08();
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.A03 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.A06 = new XbB(A082, A083);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0199, code lost:
        if (r7.A0F() != false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x019b, code lost:
        r0 = r7.A06(7);
        r13 = true;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a1, code lost:
        if (r0 == 0) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a3, code lost:
        r13 = false;
        r4 = r0;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a7, code lost:
        r4 = r7.A06(7);
        r0 = r7.A06(8);
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01b0, code lost:
        if (r4 == 0) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00aa, code lost:
        if (r0 != 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012c, code lost:
        if (r11 != 0) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x016f, code lost:
        if (r0 == 0) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0171, code lost:
        r13 = false;
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0173, code lost:
        if (r24 == null) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0175, code lost:
        r9.setColor(r26[r0]);
        r17.drawRect((float) r6, (float) r8, (float) (r6 + r4), (float) (r8 + 1), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x018f, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v30, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r10v17, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.graphics.Canvas r23, android.graphics.Paint r24, byte[] r25, int[] r26, int r27, int r28, int r29) {
        /*
            r8 = r29
            X.ST7 r7 = new X.ST7
            r0 = r25
            r7.<init>(r0)
            r16 = 0
            r6 = r28
            r3 = r16
            r1 = r3
            r2 = r3
        L_0x0011:
            int r0 = r7.A04()
            if (r0 == 0) goto L_0x01b9
            r5 = 8
            int r10 = r7.A06(r5)
            r0 = 240(0xf0, float:3.36E-43)
            if (r10 == r0) goto L_0x01b3
            r4 = 3
            r17 = r23
            r9 = r24
            r11 = r27
            switch(r10) {
                case 16: goto L_0x00e4;
                case 17: goto L_0x0060;
                case 18: goto L_0x016b;
                default: goto L_0x002b;
            }
        L_0x002b:
            switch(r10) {
                case 32: goto L_0x003f;
                case 33: goto L_0x002f;
                case 34: goto L_0x004f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0011
        L_0x002f:
            r9 = 4
            byte[] r3 = new byte[r9]
            r4 = 0
        L_0x0033:
            int r0 = r7.A06(r5)
            byte r0 = (byte) r0
            r3[r4] = r0
            int r4 = r4 + 1
            if (r4 >= r9) goto L_0x0011
            goto L_0x0033
        L_0x003f:
            r5 = 4
            byte[] r2 = new byte[r5]
            r4 = 0
        L_0x0043:
            int r0 = r7.A06(r5)
            byte r0 = (byte) r0
            r2[r4] = r0
            int r4 = r4 + 1
            if (r4 >= r5) goto L_0x0011
            goto L_0x0043
        L_0x004f:
            r9 = 16
            byte[] r1 = new byte[r9]
            r4 = 0
        L_0x0054:
            int r0 = r7.A06(r5)
            byte r0 = (byte) r0
            r1[r4] = r0
            int r4 = r4 + 1
            if (r4 >= r9) goto L_0x0011
            goto L_0x0054
        L_0x0060:
            if (r11 != r4) goto L_0x00e1
            if (r1 != 0) goto L_0x00df
            byte[] r15 = A09
        L_0x0066:
            r11 = 4
            int r10 = r7.A06(r11)
            r13 = 2
            r12 = 1
            if (r10 == 0) goto L_0x0099
            r14 = 0
        L_0x0070:
            r0 = 1
        L_0x0071:
            if (r24 == 0) goto L_0x0091
            if (r15 == 0) goto L_0x0077
            byte r10 = r15[r10]
        L_0x0077:
            r10 = r26[r10]
            r9.setColor(r10)
            float r13 = (float) r6
            float r12 = (float) r8
            int r10 = r6 + r0
            float r11 = (float) r10
            int r10 = r8 + 1
            float r10 = (float) r10
            r19 = r12
            r20 = r11
            r21 = r10
            r22 = r9
            r18 = r13
            r17.drawRect(r18, r19, r20, r21, r22)
        L_0x0091:
            int r6 = r6 + r0
            if (r14 == 0) goto L_0x0066
            r7.A07()
            goto L_0x0011
        L_0x0099:
            boolean r0 = r7.A0F()
            if (r0 != 0) goto L_0x00ad
            int r0 = r7.A06(r4)
            r14 = 1
            if (r0 == 0) goto L_0x00c8
            int r0 = r0 + 2
            r14 = 0
            r10 = 0
        L_0x00aa:
            if (r0 == 0) goto L_0x0091
            goto L_0x0071
        L_0x00ad:
            boolean r10 = r7.A0F()
            int r0 = r7.A06(r13)
            if (r10 != 0) goto L_0x00bf
            int r0 = r0 + 4
        L_0x00b9:
            int r10 = r7.A06(r11)
            r14 = 0
            goto L_0x00aa
        L_0x00bf:
            if (r0 == 0) goto L_0x00dc
            if (r0 == r12) goto L_0x00d8
            if (r0 == r13) goto L_0x00d1
            if (r0 == r4) goto L_0x00ca
            r14 = 0
        L_0x00c8:
            r0 = 0
            goto L_0x0091
        L_0x00ca:
            int r0 = r7.A06(r5)
            int r0 = r0 + 25
            goto L_0x00b9
        L_0x00d1:
            int r0 = r7.A06(r11)
            int r0 = r0 + 9
            goto L_0x00b9
        L_0x00d8:
            r14 = 0
            r10 = 0
            r0 = 2
            goto L_0x0071
        L_0x00dc:
            r14 = 0
            r10 = 0
            goto L_0x0070
        L_0x00df:
            r15 = r1
            goto L_0x0066
        L_0x00e1:
            r15 = r16
            goto L_0x0066
        L_0x00e4:
            if (r11 != r4) goto L_0x015e
            if (r3 != 0) goto L_0x015c
            byte[] r15 = A08
        L_0x00ea:
            r10 = 2
            int r0 = r7.A06(r10)
            r11 = 1
            if (r0 == 0) goto L_0x011b
            r14 = 0
        L_0x00f3:
            if (r24 == 0) goto L_0x0113
            if (r15 == 0) goto L_0x00f9
            byte r0 = r15[r0]
        L_0x00f9:
            r0 = r26[r0]
            r9.setColor(r0)
            float r13 = (float) r6
            float r12 = (float) r8
            int r0 = r6 + r11
            float r10 = (float) r0
            int r0 = r8 + 1
            float r0 = (float) r0
            r19 = r12
            r20 = r10
            r21 = r0
            r22 = r9
            r18 = r13
            r17.drawRect(r18, r19, r20, r21, r22)
        L_0x0113:
            int r6 = r6 + r11
            if (r14 == 0) goto L_0x00ea
            r7.A07()
            goto L_0x0011
        L_0x011b:
            boolean r0 = r7.A0F()
            if (r0 == 0) goto L_0x012f
            int r0 = r7.A06(r4)
            int r11 = r0 + 3
        L_0x0127:
            int r0 = r7.A06(r10)
            r14 = 0
            if (r11 == 0) goto L_0x0113
            goto L_0x00f3
        L_0x012f:
            boolean r0 = r7.A0F()
            if (r0 == 0) goto L_0x0138
            r14 = 0
            r0 = 0
            goto L_0x00f3
        L_0x0138:
            int r0 = r7.A06(r10)
            if (r0 == 0) goto L_0x0147
            if (r0 == r11) goto L_0x0158
            if (r0 == r10) goto L_0x0150
            if (r0 == r4) goto L_0x0149
            r14 = 0
        L_0x0145:
            r11 = 0
            goto L_0x0113
        L_0x0147:
            r14 = 1
            goto L_0x0145
        L_0x0149:
            int r0 = r7.A06(r5)
            int r11 = r0 + 29
            goto L_0x0127
        L_0x0150:
            r0 = 4
            int r0 = r7.A06(r0)
            int r11 = r0 + 12
            goto L_0x0127
        L_0x0158:
            r14 = 0
            r0 = 0
            r11 = 2
            goto L_0x00f3
        L_0x015c:
            r15 = r3
            goto L_0x00ea
        L_0x015e:
            r0 = 2
            if (r11 != r0) goto L_0x0168
            if (r2 != 0) goto L_0x0166
            byte[] r15 = A07
            goto L_0x00ea
        L_0x0166:
            r15 = r2
            goto L_0x00ea
        L_0x0168:
            r15 = r16
            goto L_0x00ea
        L_0x016b:
            int r0 = r7.A06(r5)
            if (r0 == 0) goto L_0x0194
            r13 = 0
            r4 = 1
        L_0x0173:
            if (r24 == 0) goto L_0x018f
            r0 = r26[r0]
            r9.setColor(r0)
            float r12 = (float) r6
            float r11 = (float) r8
            int r0 = r6 + r4
            float r10 = (float) r0
            int r0 = r8 + 1
            float r0 = (float) r0
            r19 = r11
            r20 = r10
            r21 = r0
            r22 = r9
            r18 = r12
            r17.drawRect(r18, r19, r20, r21, r22)
        L_0x018f:
            int r6 = r6 + r4
            if (r13 == 0) goto L_0x016b
            goto L_0x0011
        L_0x0194:
            boolean r4 = r7.A0F()
            r0 = 7
            if (r4 != 0) goto L_0x01a7
            int r0 = r7.A06(r0)
            r13 = 1
            r4 = 0
            if (r0 == 0) goto L_0x018f
            r13 = 0
            r4 = r0
            r0 = 0
            goto L_0x0173
        L_0x01a7:
            int r4 = r7.A06(r0)
            int r0 = r7.A06(r5)
            r13 = 0
            if (r4 == 0) goto L_0x018f
            goto L_0x0173
        L_0x01b3:
            int r8 = r8 + 2
            r6 = r28
            goto L_0x0011
        L_0x01b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22122Xvm.A02(android.graphics.Canvas, android.graphics.Paint, byte[], int[], int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: X.XbF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: X.XbF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: X.XaY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: X.XaZ} */
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.ST7] */
    /* JADX WARNING: type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0164, code lost:
        r2.put(r1, r13);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E1l(X.C13507TbY r37, X.C11115SAs r38, byte[] r39, int r40, int r41) {
        /*
            r36 = this;
            r2 = r40
            int r1 = r41 + r40
            X.ST7 r0 = new X.ST7
            r0.<init>()
            r3 = r39
            r0.A03 = r3
            r0.A01 = r1
            r0.A09(r2)
        L_0x0012:
            int r2 = r0.A04()
            r1 = 48
            r6 = r36
            if (r2 < r1) goto L_0x01c6
            r5 = 8
            int r2 = r0.A06(r5)
            r1 = 15
            if (r2 != r1) goto L_0x01c6
            X.XbB r1 = r6.A06
            int r9 = r0.A06(r5)
            r2 = 16
            int r7 = r0.A06(r2)
            int r6 = r0.A06(r2)
            int r3 = r0.A05()
            int r3 = r3 + r6
            int r8 = r6 * 8
            int r4 = r0.A04()
            if (r8 <= r4) goto L_0x0052
            java.lang.String r2 = "DvbParser"
            java.lang.String r1 = "Data field length exceeds limit"
            X.STH.A03(r2, r1)
            int r1 = r0.A04()
            r0.A0A(r1)
            goto L_0x0012
        L_0x0052:
            switch(r9) {
                case 16: goto L_0x0169;
                case 17: goto L_0x00c4;
                case 18: goto L_0x00ab;
                case 19: goto L_0x0092;
                case 20: goto L_0x005e;
                default: goto L_0x0055;
            }
        L_0x0055:
            int r1 = r0.A05()
            int r3 = r3 - r1
            r0.A0B(r3)
            goto L_0x0012
        L_0x005e:
            int r4 = r1.A03
            if (r7 != r4) goto L_0x0055
            r4 = 4
            r0.A0A(r4)
            boolean r5 = r0.A0F()
            r4 = 3
            int r6 = X.ST7.A00(r0, r4, r2)
            int r7 = r0.A06(r2)
            if (r5 == 0) goto L_0x008d
            int r8 = r0.A06(r2)
            int r9 = r0.A06(r2)
            int r10 = r0.A06(r2)
            int r11 = r0.A06(r2)
        L_0x0085:
            X.Xat r5 = new X.Xat
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.A00 = r5
            goto L_0x0055
        L_0x008d:
            r9 = r6
            r11 = r7
            r8 = 0
            r10 = 0
            goto L_0x0085
        L_0x0092:
            int r2 = r1.A03
            if (r7 != r2) goto L_0x00a0
            X.XaZ r13 = A01(r0)
            android.util.SparseArray r2 = r1.A07
        L_0x009c:
            int r1 = r13.A00
            goto L_0x0164
        L_0x00a0:
            int r2 = r1.A02
            if (r7 != r2) goto L_0x0055
            X.XaZ r13 = A01(r0)
            android.util.SparseArray r2 = r1.A05
            goto L_0x009c
        L_0x00ab:
            int r2 = r1.A03
            if (r7 != r2) goto L_0x00b9
            X.XaY r13 = A00(r0, r6)
            android.util.SparseArray r2 = r1.A06
        L_0x00b5:
            int r1 = r13.A00
            goto L_0x0164
        L_0x00b9:
            int r2 = r1.A02
            if (r7 != r2) goto L_0x0055
            X.XaY r13 = A00(r0, r6)
            android.util.SparseArray r2 = r1.A04
            goto L_0x00b5
        L_0x00c4:
            X.XaG r9 = r1.A01
            int r4 = r1.A03
            if (r7 != r4) goto L_0x0055
            if (r9 == 0) goto L_0x0055
            int r15 = r0.A06(r5)
            r7 = 4
            r0.A0A(r7)
            boolean r23 = r0.A0F()
            r4 = 3
            int r16 = X.ST7.A00(r0, r4, r2)
            int r17 = r0.A06(r2)
            r0.A06(r4)
            int r18 = r0.A06(r4)
            r4 = 2
            int r19 = X.ST7.A00(r0, r4, r5)
            int r20 = r0.A06(r5)
            int r21 = r0.A06(r7)
            int r22 = r0.A06(r4)
            r0.A0A(r4)
            int r13 = r6 + -10
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
        L_0x0103:
            if (r13 <= 0) goto L_0x0132
            int r12 = r0.A06(r2)
            int r8 = r0.A06(r4)
            r0.A06(r4)
            r6 = 12
            int r11 = r0.A06(r6)
            int r10 = X.ST7.A00(r0, r7, r6)
            int r13 = r13 + -6
            r6 = 1
            if (r8 == r6) goto L_0x0121
            if (r8 != r4) goto L_0x0129
        L_0x0121:
            r0.A06(r5)
            r0.A06(r5)
            int r13 = r13 + -2
        L_0x0129:
            X.XZn r6 = new X.XZn
            r6.<init>(r11, r10)
            r14.put(r12, r6)
            goto L_0x0103
        L_0x0132:
            X.XbF r13 = new X.XbF
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            int r2 = r9.A00
            if (r2 != 0) goto L_0x0160
            android.util.SparseArray r4 = r1.A08
            int r2 = r13.A03
            java.lang.Object r2 = r4.get(r2)
            X.XbF r2 = (X.C21454XbF) r2
            if (r2 == 0) goto L_0x0160
            android.util.SparseArray r7 = r2.A08
            r6 = 0
        L_0x014a:
            int r2 = r7.size()
            if (r6 >= r2) goto L_0x0160
            android.util.SparseArray r5 = r13.A08
            int r4 = r7.keyAt(r6)
            java.lang.Object r2 = r7.valueAt(r6)
            r5.put(r4, r2)
            int r6 = r6 + 1
            goto L_0x014a
        L_0x0160:
            android.util.SparseArray r2 = r1.A08
            int r1 = r13.A03
        L_0x0164:
            r2.put(r1, r13)
            goto L_0x0055
        L_0x0169:
            int r4 = r1.A03
            if (r7 != r4) goto L_0x0055
            X.XaG r12 = r1.A01
            r0.A06(r5)
            r4 = 4
            int r13 = r0.A06(r4)
            r4 = 2
            int r11 = r0.A06(r4)
            r0.A0A(r4)
            int r6 = r6 - r4
            android.util.SparseArray r10 = new android.util.SparseArray
            r10.<init>()
        L_0x0185:
            if (r6 <= 0) goto L_0x019e
            int r9 = r0.A06(r5)
            int r8 = X.ST7.A00(r0, r5, r2)
            int r7 = r0.A06(r2)
            int r6 = r6 + -6
            X.XZm r4 = new X.XZm
            r4.<init>(r8, r7)
            r10.put(r9, r4)
            goto L_0x0185
        L_0x019e:
            X.XaG r5 = new X.XaG
            r5.<init>(r10, r13, r11)
            int r2 = r5.A00
            if (r2 == 0) goto L_0x01ba
            r1.A01 = r5
            android.util.SparseArray r2 = r1.A08
            r2.clear()
            android.util.SparseArray r2 = r1.A06
            r2.clear()
            android.util.SparseArray r1 = r1.A07
            r1.clear()
            goto L_0x0055
        L_0x01ba:
            if (r12 == 0) goto L_0x0055
            int r4 = r12.A01
            int r2 = r5.A01
            if (r4 == r2) goto L_0x0055
            r1.A01 = r5
            goto L_0x0055
        L_0x01c6:
            X.XbB r8 = r6.A06
            X.XaG r3 = r8.A01
            if (r3 != 0) goto L_0x01e3
            com.google.common.collect.ImmutableList r18 = com.google.common.collect.ImmutableList.of()
        L_0x01d0:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.RtS r1 = new X.RtS
            r2 = r18
            r5 = r3
            r1.<init>(r2, r3, r5)
            r0 = r37
            r0.accept(r1)
            return
        L_0x01e3:
            X.Xat r7 = r8.A00
            if (r7 != 0) goto L_0x01e9
            X.Xat r7 = r6.A05
        L_0x01e9:
            android.graphics.Bitmap r2 = r6.A00
            if (r2 == 0) goto L_0x0203
            int r0 = r7.A05
            int r1 = r0 + 1
            int r0 = r2.getWidth()
            if (r1 != r0) goto L_0x0203
            int r0 = r7.A00
            int r1 = r0 + 1
            android.graphics.Bitmap r0 = r6.A00
            int r0 = r0.getHeight()
            if (r1 == r0) goto L_0x0218
        L_0x0203:
            int r0 = r7.A05
            int r2 = r0 + 1
            int r0 = r7.A00
            int r1 = r0 + 1
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r6.A00 = r1
            android.graphics.Canvas r0 = r6.A01
            r0.setBitmap(r1)
        L_0x0218:
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            android.util.SparseArray r0 = r3.A02
            r35 = r0
            r17 = 0
            r5 = 0
        L_0x0223:
            int r0 = r35.size()
            if (r5 >= r0) goto L_0x01d0
            android.graphics.Canvas r15 = r6.A01
            r15.save()
            r0 = r35
            java.lang.Object r2 = r0.valueAt(r5)
            X.XZm r2 = (X.C21379XZm) r2
            int r1 = r0.keyAt(r5)
            android.util.SparseArray r0 = r8.A08
            java.lang.Object r12 = r0.get(r1)
            X.XbF r12 = (X.C21454XbF) r12
            int r11 = r2.A00
            int r0 = r7.A02
            int r11 = r11 + r0
            int r10 = r2.A01
            int r0 = r7.A04
            int r10 = r10 + r0
            int r1 = r12.A07
            int r1 = r1 + r11
            int r0 = r7.A01
            int r2 = java.lang.Math.min(r1, r0)
            int r1 = r12.A02
            int r1 = r1 + r10
            int r0 = r7.A03
            int r0 = java.lang.Math.min(r1, r0)
            r15.clipRect(r11, r10, r2, r0)
            android.util.SparseArray r1 = r8.A06
            int r0 = r12.A00
            java.lang.Object r13 = r1.get(r0)
            X.XaY r13 = (X.C21423XaY) r13
            if (r13 != 0) goto L_0x027b
            android.util.SparseArray r1 = r8.A04
            int r0 = r12.A00
            java.lang.Object r13 = r1.get(r0)
            X.XaY r13 = (X.C21423XaY) r13
            if (r13 != 0) goto L_0x027b
            X.XaY r13 = r6.A04
        L_0x027b:
            android.util.SparseArray r9 = r12.A08
            r4 = 0
        L_0x027e:
            int r0 = r9.size()
            if (r4 >= r0) goto L_0x02e1
            int r2 = r9.keyAt(r4)
            java.lang.Object r1 = r9.valueAt(r4)
            X.XZn r1 = (X.C21380XZn) r1
            android.util.SparseArray r0 = r8.A07
            java.lang.Object r14 = r0.get(r2)
            X.XaZ r14 = (X.C21424XaZ) r14
            if (r14 != 0) goto L_0x02a2
            android.util.SparseArray r0 = r8.A05
            java.lang.Object r14 = r0.get(r2)
            X.XaZ r14 = (X.C21424XaZ) r14
            if (r14 == 0) goto L_0x02d0
        L_0x02a2:
            boolean r0 = r14.A01
            if (r0 == 0) goto L_0x02dc
            r16 = 0
        L_0x02a8:
            int r3 = r12.A01
            int r2 = r1.A00
            int r2 = r2 + r11
            int r0 = r1.A01
            int r25 = r10 + r0
            r0 = 3
            if (r3 != r0) goto L_0x02d3
            int[] r1 = r13.A03
        L_0x02b6:
            byte[] r0 = r14.A03
            r19 = r15
            r20 = r16
            r21 = r0
            r22 = r1
            r23 = r3
            r24 = r2
            A02(r19, r20, r21, r22, r23, r24, r25)
            byte[] r0 = r14.A02
            int r25 = r25 + 1
            r21 = r0
            A02(r19, r20, r21, r22, r23, r24, r25)
        L_0x02d0:
            int r4 = r4 + 1
            goto L_0x027e
        L_0x02d3:
            r0 = 2
            if (r3 != r0) goto L_0x02d9
            int[] r1 = r13.A02
            goto L_0x02b6
        L_0x02d9:
            int[] r1 = r13.A01
            goto L_0x02b6
        L_0x02dc:
            android.graphics.Paint r0 = r6.A02
            r16 = r0
            goto L_0x02a8
        L_0x02e1:
            boolean r0 = r12.A09
            if (r0 == 0) goto L_0x030e
            int r1 = r12.A01
            r0 = 3
            if (r1 != r0) goto L_0x0360
            int[] r1 = r13.A03
            int r0 = r12.A06
        L_0x02ee:
            r0 = r1[r0]
            android.graphics.Paint r4 = r6.A03
            r4.setColor(r0)
            float r3 = (float) r11
            float r2 = (float) r10
            int r0 = r12.A07
            int r0 = r0 + r11
            float r1 = (float) r0
            int r0 = r12.A02
            int r0 = r0 + r10
            float r0 = (float) r0
            r19 = r15
            r20 = r3
            r21 = r2
            r22 = r1
            r23 = r0
            r24 = r4
            r19.drawRect(r20, r21, r22, r23, r24)
        L_0x030e:
            r21 = 0
            android.graphics.Bitmap r0 = r6.A00
            int r2 = r12.A07
            int r9 = r12.A02
            X.0fO.A03(r0)
            android.graphics.Bitmap r20 = android.graphics.Bitmap.createBitmap(r0, r11, r10, r2, r9)
            float r3 = (float) r11
            int r0 = r7.A05
            float r11 = (float) r0
            float r3 = r3 / r11
            float r4 = (float) r10
            int r0 = r7.A00
            float r1 = (float) r0
            float r4 = r4 / r1
            float r2 = (float) r2
            float r2 = r2 / r11
            float r0 = (float) r9
            float r0 = r0 / r1
            r33 = -2147483648(0xffffffff80000000, float:-0.0)
            r26 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r29 = 0
            X.SIh r1 = new X.SIh
            r22 = r21
            r23 = r21
            r24 = r4
            r25 = r3
            r27 = r2
            r28 = r0
            r30 = r17
            r31 = r17
            r32 = r17
            r34 = r33
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = r18
            r0.add(r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.CLEAR
            r0 = r17
            r15.drawColor(r0, r1)
            r15.restore()
            int r5 = r5 + 1
            goto L_0x0223
        L_0x0360:
            int r1 = r12.A01
            r0 = 2
            if (r1 != r0) goto L_0x036a
            int[] r1 = r13.A02
            int r0 = r12.A05
            goto L_0x02ee
        L_0x036a:
            int[] r1 = r13.A01
            int r0 = r12.A04
            goto L_0x02ee
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22122Xvm.E1l(X.TbY, X.SAs, byte[], int, int):void");
    }
}
