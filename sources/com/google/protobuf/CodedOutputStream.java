package com.google.protobuf;

import X.C10094RmW;
import X.C10281Rpf;
import X.C13903TjQ;
import X.C9001RKu;
import X.Pxe;
import X.Pxf;
import X.Pxh;
import X.Pxi;
import X.Pxk;
import X.R36;
import X.R3B;
import X.R3C;
import X.SC5;
import X.SD9;
import X.SQE;
import X.T5J;
import X.TAP;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends SQE {
    public static final Logger A01 = Pxf.A11(CodedOutputStream.class);
    public static final boolean A02 = UnsafeUtil.A04;
    public C10281Rpf A00;

    public static int A00(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int A01(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public final void A05(byte b) {
        if (this instanceof R3C) {
            R3C r3c = (R3C) this;
            if (r3c.A00 == r3c.A02) {
                R3C.A03(r3c);
            }
            byte[] bArr = r3c.A03;
            int i = r3c.A00;
            r3c.A00 = i + 1;
            bArr[i] = b;
            r3c.A01++;
            return;
        }
        R3B r3b = (R3B) this;
        try {
            byte[] bArr2 = r3b.A02;
            int i2 = r3b.A00;
            r3b.A00 = i2 + 1;
            bArr2[i2] = b;
        } catch (IndexOutOfBoundsException e) {
            throw SQE.A07(Pxh.A0i(r3b.A01, Integer.valueOf(r3b.A00)), e);
        }
    }

    public final void A06(int i) {
        if (this instanceof R3C) {
            R3C r3c = (R3C) this;
            R3C.A04(r3c, 4);
            byte[] bArr = r3c.A03;
            int A03 = Pxk.A03(bArr, r3c.A00, i);
            r3c.A00 = A03 + 1;
            Pxe.A1H(i >> 24, bArr, A03);
            r3c.A01 += 4;
            return;
        }
        R3B r3b = (R3B) this;
        try {
            byte[] bArr2 = r3b.A02;
            int A032 = Pxk.A03(bArr2, r3b.A00, i);
            r3b.A00 = A032 + 1;
            Pxe.A1H(i >> 24, bArr2, A032);
        } catch (IndexOutOfBoundsException e) {
            throw SQE.A07(Pxh.A0i(r3b.A01, Integer.valueOf(r3b.A00)), e);
        }
    }

    public final void A07(int i) {
        long j;
        byte b;
        if (this instanceof R3C) {
            R3C r3c = (R3C) this;
            R3C.A04(r3c, 5);
            r3c.A0K(i);
            return;
        }
        R3B r3b = (R3B) this;
        if (A02 && (C10094RmW.A00 == null || C10094RmW.A01)) {
            int i2 = r3b.A01;
            int i3 = r3b.A00;
            if (i2 - i3 >= 5) {
                int i4 = i & -128;
                byte[] bArr = r3b.A02;
                r3b.A00 = i3 + 1;
                if (i4 == 0) {
                    j = (long) i3;
                    b = (byte) i;
                } else {
                    UnsafeUtil.A08(bArr, (byte) (i | 128), (long) i3);
                    int i5 = i >>> 7;
                    if ((i5 & -128) != 0) {
                        int i6 = r3b.A00;
                        r3b.A00 = i6 + 1;
                        UnsafeUtil.A08(bArr, (byte) (i5 | 128), (long) i6);
                        i5 >>>= 7;
                        if ((i5 & -128) != 0) {
                            int i7 = r3b.A00;
                            r3b.A00 = i7 + 1;
                            UnsafeUtil.A08(bArr, (byte) (i5 | 128), (long) i7);
                            i5 >>>= 7;
                            if ((i5 & -128) != 0) {
                                int i8 = r3b.A00;
                                r3b.A00 = i8 + 1;
                                UnsafeUtil.A08(bArr, (byte) (i5 | 128), (long) i8);
                                i5 >>>= 7;
                            }
                        }
                    }
                    int i9 = r3b.A00;
                    r3b.A00 = i9 + 1;
                    j = (long) i9;
                    b = (byte) i5;
                }
                UnsafeUtil.A08(bArr, b, j);
                return;
            }
        }
        while ((i & -128) != 0) {
            try {
                byte[] bArr2 = r3b.A02;
                int i10 = r3b.A00;
                r3b.A00 = i10 + 1;
                bArr2[i10] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw SQE.A07(Pxh.A0i(r3b.A01, Integer.valueOf(r3b.A00)), e);
            }
        }
        byte[] bArr3 = r3b.A02;
        int i11 = r3b.A00;
        r3b.A00 = i11 + 1;
        bArr3[i11] = (byte) i;
    }

    public final void A08(int i, int i2) {
        if (this instanceof R3C) {
            R3C r3c = (R3C) this;
            R3C.A04(r3c, 14);
            r3c.A0K((i << 3) | 5);
            byte[] bArr = r3c.A03;
            int A03 = Pxk.A03(bArr, r3c.A00, i2);
            r3c.A00 = A03 + 1;
            Pxe.A1H(i2 >> 24, bArr, A03);
            r3c.A01 += 4;
            return;
        }
        A07((i << 3) | 5);
        A06(i2);
    }

    public final void A09(int i, int i2) {
        if (this instanceof R3C) {
            R3C r3c = (R3C) this;
            R3C.A04(r3c, 20);
            r3c.A0K(i << 3);
            if (i2 >= 0) {
                r3c.A0K(i2);
            } else {
                r3c.A0M((long) i2);
            }
        } else {
            A07(i << 3);
            if (i2 >= 0) {
                A07(i2);
            } else {
                A0F((long) i2);
            }
        }
    }

    public final void A0A(int i, int i2) {
        if (this instanceof R3C) {
            R3C r3c = (R3C) this;
            R3C.A04(r3c, 20);
            r3c.A0K(i << 3);
            r3c.A0K(i2);
            return;
        }
        A07(i << 3);
        A07(i2);
    }

    public final void A0B(int i, long j) {
        if (this instanceof R3C) {
            R3C r3c = (R3C) this;
            R3C.A04(r3c, 18);
            r3c.A0K((i << 3) | 1);
            r3c.A0L(j);
            return;
        }
        A07((i << 3) | 1);
        A0E(j);
    }

    public final void A0C(int i, long j) {
        if (this instanceof R3C) {
            R3C r3c = (R3C) this;
            R3C.A04(r3c, 20);
            r3c.A0K(i << 3);
            r3c.A0M(j);
            return;
        }
        A07(i << 3);
        A0F(j);
    }

    public final void A0D(int i, boolean z) {
        if (this instanceof R3C) {
            R3C r3c = (R3C) this;
            R3C.A04(r3c, 11);
            r3c.A0K(i << 3);
            byte b = z ? (byte) 1 : 0;
            byte[] bArr = r3c.A03;
            int i2 = r3c.A00;
            r3c.A00 = i2 + 1;
            bArr[i2] = b;
            r3c.A01++;
            return;
        }
        A07(i << 3);
        A05(z ? (byte) 1 : 0);
    }

    public final void A0E(long j) {
        if (this instanceof R3C) {
            R3C r3c = (R3C) this;
            R3C.A04(r3c, 8);
            r3c.A0L(j);
            return;
        }
        R3B r3b = (R3B) this;
        try {
            byte[] bArr = r3b.A02;
            int i = r3b.A00;
            int i2 = i + 1;
            Pxe.A1H((int) j, bArr, i);
            int i3 = i2 + 1;
            Pxi.A0t(j, bArr, 8, i2);
            int i4 = i3 + 1;
            Pxi.A0t(j, bArr, 16, i3);
            Pxi.A0t(j, bArr, 24, i4);
            int A04 = Pxk.A04(bArr, i4 + 1, j);
            r3b.A00 = A04 + 1;
            Pxi.A0t(j, bArr, 56, A04);
        } catch (IndexOutOfBoundsException e) {
            throw SQE.A07(Pxh.A0i(r3b.A01, Integer.valueOf(r3b.A00)), e);
        }
    }

    public final void A0F(long j) {
        if (this instanceof R3C) {
            R3C r3c = (R3C) this;
            R3C.A04(r3c, 10);
            r3c.A0M(j);
            return;
        }
        R3B r3b = (R3B) this;
        if (!A02 || r3b.A01 - r3b.A00 < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = r3b.A02;
                    int i = r3b.A00;
                    r3b.A00 = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw SQE.A07(Pxh.A0i(r3b.A01, Integer.valueOf(r3b.A00)), e);
                }
            }
            byte[] bArr2 = r3b.A02;
            int i2 = r3b.A00;
            r3b.A00 = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while (true) {
            int i3 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
            byte[] bArr3 = r3b.A02;
            int i4 = r3b.A00;
            r3b.A00 = i4 + 1;
            long j2 = (long) i4;
            int i5 = (int) j;
            if (i3 == 0) {
                UnsafeUtil.A08(bArr3, (byte) i5, j2);
                return;
            } else {
                UnsafeUtil.A08(bArr3, (byte) ((i5 & 127) | 128), j2);
                j >>>= 7;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.R3B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.R3C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.R3B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.R3B} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.R3C
            if (r0 == 0) goto L_0x007c
            r4 = r7
            X.R3C r4 = (X.R3C) r4
            int r6 = r8.length()     // Catch:{ RKu -> 0x00ce }
            int r5 = r6 * 3
            int r2 = A00(r5)     // Catch:{ RKu -> 0x00ce }
            int r1 = r2 + r5
            int r3 = r4.A02     // Catch:{ RKu -> 0x00ce }
            if (r1 <= r3) goto L_0x0027
            byte[] r2 = new byte[r5]     // Catch:{ RKu -> 0x00ce }
            r1 = 0
            X.S57 r0 = X.SC5.A00     // Catch:{ RKu -> 0x00ce }
            int r0 = r0.A02(r8, r2, r1, r5)     // Catch:{ RKu -> 0x00ce }
            r4.A07(r0)     // Catch:{ RKu -> 0x00ce }
            r4.A0J(r2, r1, r0)     // Catch:{ RKu -> 0x00ce }
            return
        L_0x0027:
            int r0 = r4.A00     // Catch:{ RKu -> 0x00ce }
            int r0 = r3 - r0
            if (r1 <= r0) goto L_0x0030
            X.R3C.A03(r4)     // Catch:{ RKu -> 0x00ce }
        L_0x0030:
            int r6 = A00(r6)     // Catch:{ RKu -> 0x00ce }
            int r5 = r4.A00     // Catch:{ RKu -> 0x00ce }
            if (r6 != r2) goto L_0x004e
            int r2 = r5 + r6
            r4.A00 = r2     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
            byte[] r1 = r4.A03     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
            int r3 = r3 - r2
            X.S57 r0 = X.SC5.A00     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
            int r0 = r0.A02(r8, r1, r2, r3)     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
            r4.A00 = r5     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
            int r3 = r0 - r5
            int r3 = r3 - r6
            r4.A0K(r3)     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
            goto L_0x005f
        L_0x004e:
            int r3 = X.SC5.A00(r8)     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
            r4.A0K(r3)     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
            byte[] r2 = r4.A03     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
            int r1 = r4.A00     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
            X.S57 r0 = X.SC5.A00     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
            int r0 = r0.A02(r8, r2, r1, r3)     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
        L_0x005f:
            r4.A00 = r0     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
            int r0 = r4.A01     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
            int r0 = r0 + r3
            r4.A01 = r0     // Catch:{ RKu -> 0x0070, ArrayIndexOutOfBoundsException -> 0x0067 }
            return
        L_0x0067:
            r2 = move-exception
            java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space."
            X.RCX r0 = new X.RCX     // Catch:{ RKu -> 0x00ce }
            r0.<init>(r1, r2)     // Catch:{ RKu -> 0x00ce }
            throw r0     // Catch:{ RKu -> 0x00ce }
        L_0x0070:
            r2 = move-exception
            int r1 = r4.A01     // Catch:{ RKu -> 0x00ce }
            int r0 = r4.A00     // Catch:{ RKu -> 0x00ce }
            int r0 = r0 - r5
            int r1 = r1 - r0
            r4.A01 = r1     // Catch:{ RKu -> 0x00ce }
            r4.A00 = r5     // Catch:{ RKu -> 0x00ce }
            throw r2     // Catch:{ RKu -> 0x00ce }
        L_0x007c:
            r4 = r7
            X.R3B r4 = (X.R3B) r4
            int r5 = r4.A00
            int r1 = r8.length()     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            int r0 = r1 * 3
            int r0 = A00(r0)     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            int r6 = A00(r1)     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            if (r6 != r0) goto L_0x00ab
            int r3 = r5 + r6
            r4.A00 = r3     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            byte[] r2 = r4.A02     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            int r1 = r4.A01     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            int r1 = r1 - r3
            X.S57 r0 = X.SC5.A00     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            int r1 = r0.A02(r8, r2, r3, r1)     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            r4.A00 = r5     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            int r0 = r1 - r5
            int r0 = r0 - r6
            r4.A07(r0)     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
        L_0x00a8:
            r4.A00 = r1     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            goto L_0x00c0
        L_0x00ab:
            int r0 = X.SC5.A00(r8)     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            r4.A07(r0)     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            byte[] r3 = r4.A02     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            int r2 = r4.A00     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            int r1 = r4.A01     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            int r1 = r1 - r2
            X.S57 r0 = X.SC5.A00     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            int r1 = r0.A02(r8, r3, r2, r1)     // Catch:{ RKu -> 0x00ca, IndexOutOfBoundsException -> 0x00c1 }
            goto L_0x00a8
        L_0x00c0:
            return
        L_0x00c1:
            r2 = move-exception
            java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space."
            X.RCX r0 = new X.RCX
            r0.<init>(r1, r2)
            throw r0
        L_0x00ca:
            r3 = move-exception
            r4.A00 = r5
            goto L_0x00cf
        L_0x00ce:
            r3 = move-exception
        L_0x00cf:
            java.util.logging.Logger r2 = A01
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r0 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"
            r2.log(r1, r0, r3)
            java.nio.charset.Charset r0 = X.SD9.A04
            byte[] r2 = r8.getBytes(r0)
            int r1 = r2.length     // Catch:{ IndexOutOfBoundsException -> 0x00e9, RCX -> 0x00e7 }
            r4.A07(r1)     // Catch:{ IndexOutOfBoundsException -> 0x00e9, RCX -> 0x00e7 }
            r0 = 0
            r4.A0J(r2, r0, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00e9, RCX -> 0x00e7 }
            return
        L_0x00e7:
            r2 = move-exception
            throw r2
        L_0x00e9:
            r1 = move-exception
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
            X.RCX r2 = new X.RCX
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedOutputStream.A0I(java.lang.String):void");
    }

    public final void A0J(byte[] bArr, int i, int i2) {
        if (this instanceof R3C) {
            ((R3C) this).A0N(bArr, i, i2);
        } else {
            ((R3B) this).A0K(bArr, i, i2);
        }
    }

    public static int A02(String str) {
        int i;
        String str2;
        try {
            str2 = str;
            int A002 = SC5.A00(str);
            str2 = A002;
            i = A002;
        } catch (C9001RKu unused) {
            i = str2.getBytes(SD9.A04).length;
        }
        return A00(i) + i;
    }

    public final void A0G(T5J t5j, C13903TjQ tjQ, int i) {
        SQE.A08(this, i);
        A07(T5J.A0D(tjQ, t5j, t5j));
        tjQ.FOC(this.A00, t5j);
    }

    public final void A0H(TAP tap) {
        A07(tap.A02());
        R36 r36 = (R36) tap;
        A0J(r36.A00, r36.A06(), r36.A02());
    }
}
