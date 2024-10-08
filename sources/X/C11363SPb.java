package X;

import com.google.protobuf.UnsafeUtil;
import java.nio.ByteBuffer;

/* renamed from: X.SPb  reason: case insensitive filesystem */
public abstract class C11363SPb {
    public int A00;
    public SUM A01;

    public static long A06(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static R38 A07(byte[] bArr, int i, int i2) {
        R38 r38 = new R38(bArr, i, i2);
        try {
            r38.A0I(i2);
            return r38;
        } catch (AnonymousClass5I7 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final double A08() {
        long A0Y;
        if (this instanceof R39) {
            A0Y = ((R39) this).A0Y();
        } else if (this instanceof R3A) {
            A0Y = ((R3A) this).A0Y();
        } else {
            A0Y = ((R38) this).A0Y();
        }
        return Double.longBitsToDouble(A0Y);
    }

    public final float A09() {
        int A0W;
        if (this instanceof R39) {
            A0W = ((R39) this).A0W();
        } else if (this instanceof R3A) {
            A0W = ((R3A) this).A0W();
        } else {
            A0W = ((R38) this).A0W();
        }
        return Float.intBitsToFloat(A0W);
    }

    public final int A0A() {
        if (this instanceof R39) {
            R39 r39 = (R39) this;
            return (int) (r39.A03 - r39.A04);
        } else if (this instanceof R3A) {
            R3A r3a = (R3A) this;
            return r3a.A04 + r3a.A03;
        } else {
            R38 r38 = (R38) this;
            return r38.A03 - r38.A04;
        }
    }

    public final int A0B() {
        if (this instanceof R39) {
            return ((R39) this).A0X();
        }
        if (this instanceof R3A) {
            return ((R3A) this).A0X();
        }
        return ((R38) this).A0X();
    }

    public final int A0C() {
        if (this instanceof R39) {
            return ((R39) this).A0W();
        }
        if (this instanceof R3A) {
            return ((R3A) this).A0W();
        }
        return ((R38) this).A0W();
    }

    public final int A0D() {
        if (this instanceof R39) {
            return ((R39) this).A0X();
        }
        if (this instanceof R3A) {
            return ((R3A) this).A0X();
        }
        return ((R38) this).A0X();
    }

    public final int A0E() {
        if (this instanceof R39) {
            return ((R39) this).A0W();
        }
        if (this instanceof R3A) {
            return ((R3A) this).A0W();
        }
        return ((R38) this).A0W();
    }

    public final int A0F() {
        int A0X;
        if (this instanceof R39) {
            A0X = ((R39) this).A0X();
        } else if (this instanceof R3A) {
            A0X = ((R3A) this).A0X();
        } else {
            A0X = ((R38) this).A0X();
        }
        return (-(A0X & 1)) ^ (A0X >>> 1);
    }

    public final int A0G() {
        if (this instanceof R39) {
            R39 r39 = (R39) this;
            if (r39.A0T()) {
                r39.A01 = 0;
                return 0;
            }
            int A0X = r39.A0X();
            r39.A01 = A0X;
            if ((A0X >>> 3) != 0) {
                return A0X;
            }
            throw Pxg.A0T("Protocol message contained an invalid tag (zero).");
        } else if (this instanceof R3A) {
            R3A r3a = (R3A) this;
            if (r3a.A0T()) {
                r3a.A02 = 0;
                return 0;
            }
            int A0X2 = r3a.A0X();
            r3a.A02 = A0X2;
            if ((A0X2 >>> 3) != 0) {
                return A0X2;
            }
            throw Pxg.A0T("Protocol message contained an invalid tag (zero).");
        } else {
            R38 r38 = (R38) this;
            if (r38.A0T()) {
                r38.A01 = 0;
                return 0;
            }
            int A0X3 = r38.A0X();
            r38.A01 = A0X3;
            if ((A0X3 >>> 3) != 0) {
                return A0X3;
            }
            throw Pxg.A0T("Protocol message contained an invalid tag (zero).");
        }
    }

    public final int A0H() {
        if (this instanceof R39) {
            return ((R39) this).A0X();
        }
        if (this instanceof R3A) {
            return ((R3A) this).A0X();
        }
        return ((R38) this).A0X();
    }

    public final int A0I(int i) {
        if (this instanceof R38) {
            R38 r38 = (R38) this;
            if (i >= 0) {
                int i2 = i + (r38.A03 - r38.A04);
                if (i2 >= 0) {
                    int i3 = r38.A00;
                    if (i2 <= i3) {
                        r38.A00 = i2;
                        R38.A00(r38);
                        return i3;
                    }
                } else {
                    throw Pxg.A0T("Failed to parse the message.");
                }
            }
            throw AnonymousClass5I7.A01();
        } else if (this instanceof R39) {
            R39 r39 = (R39) this;
            if (i >= 0) {
                int i4 = i + ((int) (r39.A03 - r39.A04));
                int i5 = r39.A00;
                if (i4 <= i5) {
                    r39.A00 = i4;
                    R39.A00(r39);
                    return i5;
                }
            }
            throw AnonymousClass5I7.A01();
        } else {
            R3A r3a = (R3A) this;
            if (i >= 0) {
                int i6 = i + r3a.A04 + r3a.A03;
                int i7 = r3a.A01;
                if (i6 <= i7) {
                    r3a.A01 = i6;
                    R3A.A01(r3a);
                    return i7;
                }
            }
            throw AnonymousClass5I7.A01();
        }
        throw AnonymousClass5I7.A02();
    }

    public final long A0J() {
        if (this instanceof R39) {
            return ((R39) this).A0Y();
        }
        if (this instanceof R3A) {
            return ((R3A) this).A0Y();
        }
        return ((R38) this).A0Y();
    }

    public final long A0K() {
        if (this instanceof R39) {
            return ((R39) this).A0Z();
        }
        if (this instanceof R3A) {
            return ((R3A) this).A0Z();
        }
        return ((R38) this).A0Z();
    }

    public final long A0L() {
        if (this instanceof R39) {
            return ((R39) this).A0Y();
        }
        if (this instanceof R3A) {
            return ((R3A) this).A0Y();
        }
        return ((R38) this).A0Y();
    }

    public final long A0M() {
        if (this instanceof R39) {
            return Pxg.A0D(((R39) this).A0Z());
        }
        if (this instanceof R3A) {
            return Pxg.A0D(((R3A) this).A0Z());
        }
        return Pxg.A0D(((R38) this).A0Z());
    }

    public final long A0N() {
        if (this instanceof R39) {
            return ((R39) this).A0Z();
        }
        if (this instanceof R3A) {
            return ((R3A) this).A0Z();
        }
        return ((R38) this).A0Z();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.TAP A0O() {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.R39
            if (r0 == 0) goto L_0x002a
            r4 = r14
            X.R39 r4 = (X.R39) r4
            int r3 = r4.A0X()
            if (r3 <= 0) goto L_0x00ad
            long r1 = r4.A02
            long r8 = r4.A03
            long r1 = r1 - r8
            int r0 = (int) r1
            if (r3 > r0) goto L_0x00a8
            byte[] r7 = new byte[r3]
            long r12 = (long) r3
            r10 = 0
            X.SK5 r6 = com.google.protobuf.UnsafeUtil.A02
            r6.A0I(r7, r8, r10, r12)
            long r0 = r4.A03
            long r0 = r0 + r12
            r4.A03 = r0
        L_0x0024:
            X.R36 r1 = new X.R36
            r1.<init>(r7)
            return r1
        L_0x002a:
            boolean r0 = r14 instanceof X.R3A
            if (r0 == 0) goto L_0x008c
            r6 = r14
            X.R3A r6 = (X.R3A) r6
            int r5 = r6.A0X()
            int r0 = r6.A00
            int r1 = r6.A03
            int r0 = r0 - r1
            if (r5 > r0) goto L_0x004a
            if (r5 <= 0) goto L_0x004a
            byte[] r0 = r6.A07
            X.R36 r1 = X.TAP.A01(r0, r1, r5)
            int r0 = r6.A03
            int r0 = r0 + r5
            r6.A03 = r0
            return r1
        L_0x004a:
            if (r5 == 0) goto L_0x00b4
            byte[] r2 = X.R3A.A05(r6, r5)
            if (r2 == 0) goto L_0x0059
            int r1 = r2.length
            r0 = 0
            X.R36 r1 = X.TAP.A01(r2, r0, r1)
            return r1
        L_0x0059:
            int r2 = r6.A03
            int r1 = r6.A00
            int r4 = r1 - r2
            int r0 = r6.A04
            int r0 = r0 + r1
            r6.A04 = r0
            r3 = 0
            r6.A03 = r3
            r6.A00 = r3
            int r0 = r5 - r4
            java.util.ArrayList r1 = X.R3A.A00(r6, r0)
            byte[] r7 = new byte[r5]
            byte[] r0 = r6.A07
            java.lang.System.arraycopy(r0, r2, r7, r3, r4)
            java.util.Iterator r2 = r1.iterator()
        L_0x007a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = r2.next()
            byte[] r1 = (byte[]) r1
            int r0 = r1.length
            java.lang.System.arraycopy(r1, r3, r7, r4, r0)
            int r4 = r4 + r0
            goto L_0x007a
        L_0x008c:
            r2 = r14
            X.R38 r2 = (X.R38) r2
            int r3 = r2.A0X()
            if (r3 <= 0) goto L_0x00ad
            int r0 = r2.A02
            int r1 = r2.A03
            int r0 = r0 - r1
            if (r3 > r0) goto L_0x00a8
            byte[] r0 = r2.A06
            X.R36 r1 = X.TAP.A01(r0, r1, r3)
            int r0 = r2.A03
            int r0 = r0 + r3
            r2.A03 = r0
            return r1
        L_0x00a8:
            X.5I7 r0 = X.AnonymousClass5I7.A02()
            throw r0
        L_0x00ad:
            if (r3 == 0) goto L_0x00b4
            X.5I7 r0 = X.AnonymousClass5I7.A01()
            throw r0
        L_0x00b4:
            X.TAP r1 = X.TAP.A01
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11363SPb.A0O():X.TAP");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0P() {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.R39
            if (r0 == 0) goto L_0x002c
            r3 = r12
            X.R39 r3 = (X.R39) r3
            int r4 = r3.A0X()
            if (r4 <= 0) goto L_0x006c
            long r1 = r3.A02
            long r6 = r3.A03
            long r1 = r1 - r6
            int r0 = (int) r1
            if (r4 > r0) goto L_0x008a
            byte[] r5 = new byte[r4]
            long r10 = (long) r4
            r8 = 0
            X.SK5 r4 = com.google.protobuf.UnsafeUtil.A02
            r4.A0I(r5, r6, r8, r10)
            java.nio.charset.Charset r0 = X.SD9.A04
            java.lang.String r2 = new java.lang.String
            r2.<init>(r5, r0)
            long r0 = r3.A03
            long r0 = r0 + r10
            r3.A03 = r0
            return r2
        L_0x002c:
            boolean r0 = r12 instanceof X.R3A
            if (r0 == 0) goto L_0x004e
            r4 = r12
            X.R3A r4 = (X.R3A) r4
            int r3 = r4.A0X()
            if (r3 <= 0) goto L_0x0073
            int r0 = r4.A00
            int r2 = r4.A03
            int r0 = r0 - r2
            if (r3 > r0) goto L_0x0078
            byte[] r1 = r4.A07
            java.nio.charset.Charset r0 = X.SD9.A04
            java.lang.String r2 = X.Pxe.A11(r0, r1, r2, r3)
        L_0x0048:
            int r0 = r4.A03
            int r0 = r0 + r3
            r4.A03 = r0
            return r2
        L_0x004e:
            r3 = r12
            X.R38 r3 = (X.R38) r3
            int r4 = r3.A0X()
            if (r4 <= 0) goto L_0x006c
            int r0 = r3.A02
            int r2 = r3.A03
            int r0 = r0 - r2
            if (r4 > r0) goto L_0x008a
            byte[] r1 = r3.A06
            java.nio.charset.Charset r0 = X.SD9.A04
            java.lang.String r2 = X.Pxe.A11(r0, r1, r2, r4)
            int r0 = r3.A03
            int r0 = r0 + r4
            r3.A03 = r0
            return r2
        L_0x006c:
            if (r4 == 0) goto L_0x0075
            X.5I7 r0 = X.AnonymousClass5I7.A01()
            throw r0
        L_0x0073:
            if (r3 != 0) goto L_0x0078
        L_0x0075:
            java.lang.String r2 = ""
            return r2
        L_0x0078:
            int r0 = r4.A00
            if (r3 > r0) goto L_0x008f
            X.R3A.A02(r4, r3)
            byte[] r2 = r4.A07
            int r1 = r4.A03
            java.nio.charset.Charset r0 = X.SD9.A04
            java.lang.String r2 = X.Pxe.A11(r0, r2, r1, r3)
            goto L_0x0048
        L_0x008a:
            X.5I7 r0 = X.AnonymousClass5I7.A02()
            throw r0
        L_0x008f:
            byte[] r1 = X.R3A.A04(r4, r3)
            java.nio.charset.Charset r0 = X.SD9.A04
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11363SPb.A0P():java.lang.String");
    }

    public final String A0Q() {
        byte[] A04;
        String A012;
        int i;
        long j;
        int i2;
        byte A013;
        byte A014;
        if (this instanceof R39) {
            R39 r39 = (R39) this;
            int A0X = r39.A0X();
            if (A0X > 0) {
                long j2 = r39.A02;
                long j3 = r39.A03;
                if (A0X <= ((int) (j2 - j3))) {
                    int i3 = (int) (j3 - r39.A06);
                    ByteBuffer byteBuffer = r39.A07;
                    S57 s57 = SC5.A00;
                    if (byteBuffer.hasArray()) {
                        A012 = s57.A04(byteBuffer.array(), byteBuffer.arrayOffset() + i3, A0X);
                    } else if (!byteBuffer.isDirect() || !(s57 instanceof R5k)) {
                        A012 = S57.A01(byteBuffer, i3, A0X);
                    } else if ((i3 | A0X | ((byteBuffer.limit() - i3) - A0X)) >= 0) {
                        SK5 sk5 = UnsafeUtil.A02;
                        long A07 = sk5.A07(byteBuffer, UnsafeUtil.A00) + ((long) i3);
                        long j4 = ((long) A0X) + A07;
                        char[] cArr = new char[A0X];
                        int i4 = 0;
                        while (j < j4 && (A014 = sk5.A01(j)) >= 0) {
                            A07 = j + 1;
                            cArr[i] = (char) A014;
                            i4 = i + 1;
                        }
                        loop1:
                        while (true) {
                            int i5 = i2;
                            while (j < j4) {
                                long j5 = j + 1;
                                byte A015 = sk5.A01(j);
                                if (A015 < 0) {
                                    if (A015 >= -32) {
                                        if (A015 >= -16) {
                                            if (j5 >= j4 - 2) {
                                                break;
                                            }
                                            long j6 = j5 + 1;
                                            byte A016 = sk5.A01(j5);
                                            long j7 = j6 + 1;
                                            byte A017 = sk5.A01(j6);
                                            j = j7 + 1;
                                            C11311SKz.A00(cArr, A015, A016, A017, sk5.A01(j7), i2);
                                            i = i2 + 1 + 1;
                                        } else if (j5 >= j4 - 1) {
                                            break;
                                        } else {
                                            long j8 = j5 + 1;
                                            j = j8 + 1;
                                            i = i2 + 1;
                                            C11311SKz.A01(cArr, A015, sk5.A01(j5), sk5.A01(j8), i5);
                                        }
                                    } else if (j5 >= j4) {
                                        break;
                                    } else {
                                        j = j5 + 1;
                                        i = i2 + 1;
                                        C11311SKz.A02(cArr, A015, sk5.A01(j5), i5);
                                    }
                                } else {
                                    i2++;
                                    cArr[i5] = (char) A015;
                                    while (j5 < j4 && (A013 = sk5.A01(j5)) >= 0) {
                                        j5++;
                                        cArr[i2] = (char) A013;
                                        i2++;
                                    }
                                    i5 = i2;
                                    j = j5;
                                }
                            }
                            A012 = new String(cArr, 0, i2);
                            break loop1;
                        }
                        throw Pxg.A0T("Protocol message had invalid UTF-8.");
                    } else {
                        throw Pxf.A0V("buffer limit=%d, index=%d, limit=%d", Pxh.A1a(byteBuffer.limit(), i3, A0X));
                    }
                    r39.A03 += (long) A0X;
                    return A012;
                }
            } else {
                if (A0X == 0) {
                    return "";
                }
                throw AnonymousClass5I7.A01();
            }
        } else if (this instanceof R3A) {
            R3A r3a = (R3A) this;
            int A0X2 = r3a.A0X();
            int i6 = r3a.A03;
            int i7 = r3a.A00;
            if (A0X2 <= i7 - i6 && A0X2 > 0) {
                A04 = r3a.A07;
                r3a.A03 = i6 + A0X2;
            } else if (A0X2 == 0) {
                return "";
            } else {
                if (A0X2 <= i7) {
                    R3A.A02(r3a, A0X2);
                    A04 = r3a.A07;
                    r3a.A03 = A0X2;
                } else {
                    A04 = R3A.A04(r3a, A0X2);
                }
                i6 = 0;
            }
            return SC5.A00.A04(A04, i6, A0X2);
        } else {
            R38 r38 = (R38) this;
            int A0X3 = r38.A0X();
            if (A0X3 > 0) {
                int i8 = r38.A02;
                int i9 = r38.A03;
                if (A0X3 <= i8 - i9) {
                    String A042 = SC5.A00.A04(r38.A06, i9, A0X3);
                    r38.A03 += A0X3;
                    return A042;
                }
            } else {
                if (A0X3 == 0) {
                    return "";
                }
                throw AnonymousClass5I7.A01();
            }
        }
        throw AnonymousClass5I7.A02();
    }

    public final void A0R(int i) {
        if (this instanceof R39) {
            if (((R39) this).A01 != i) {
                throw Pxg.A0T("Protocol message end-group tag did not match expected tag.");
            }
        } else if (this instanceof R3A) {
            if (((R3A) this).A02 != i) {
                throw Pxg.A0T("Protocol message end-group tag did not match expected tag.");
            }
        } else if (((R38) this).A01 != i) {
            throw Pxg.A0T("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void A0S(int i) {
        if (this instanceof R39) {
            R39 r39 = (R39) this;
            r39.A00 = i;
            R39.A00(r39);
        } else if (this instanceof R3A) {
            R3A r3a = (R3A) this;
            r3a.A01 = i;
            R3A.A01(r3a);
        } else {
            R38 r38 = (R38) this;
            r38.A00 = i;
            R38.A00(r38);
        }
    }

    public final boolean A0T() {
        if (this instanceof R39) {
            R39 r39 = (R39) this;
            return AnonymousClass7TF.A1Q((r39.A03 > r39.A02 ? 1 : (r39.A03 == r39.A02 ? 0 : -1)));
        } else if (this instanceof R3A) {
            R3A r3a = (R3A) this;
            if (r3a.A03 != r3a.A00 || R3A.A03(r3a, 1)) {
                return false;
            }
            return true;
        } else {
            R38 r38 = (R38) this;
            return AnonymousClass7TF.A1S(r38.A03, r38.A02);
        }
    }

    public final boolean A0U() {
        if (this instanceof R39) {
            return AnonymousClass7TF.A1P((((R39) this).A0Z() > 0 ? 1 : (((R39) this).A0Z() == 0 ? 0 : -1)));
        }
        if (this instanceof R3A) {
            return AnonymousClass7TF.A1P((((R3A) this).A0Z() > 0 ? 1 : (((R3A) this).A0Z() == 0 ? 0 : -1)));
        }
        return AnonymousClass7TF.A1P((((R38) this).A0Z() > 0 ? 1 : (((R38) this).A0Z() == 0 ? 0 : -1)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.R3A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.R39} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.R3A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.R3A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.R3A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.R3A} */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x016b, code lost:
        throw X.AnonymousClass5I7.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r2 == 5) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0188, code lost:
        throw X.AnonymousClass5I7.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        if (r1 >= 0) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00e8, code lost:
        if (r1 == 5) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00f9, code lost:
        if (r2 >= 0) goto L_0x00ea;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0V(int r11) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.R39
            if (r0 == 0) goto L_0x0076
            r5 = r10
            X.R39 r5 = (X.R39) r5
            r2 = r11 & 7
            r7 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r7) goto L_0x002e
            r0 = 2
            if (r2 == r0) goto L_0x0027
            r0 = 3
            r1 = 4
            if (r2 == r0) goto L_0x0139
            if (r2 == r1) goto L_0x016c
            r0 = 5
            if (r2 != r0) goto L_0x0167
        L_0x001a:
            long r8 = r5.A02
            long r2 = r5.A03
            long r8 = r8 - r2
            int r0 = (int) r8
            if (r1 > r0) goto L_0x0189
            long r0 = (long) r1
            long r2 = r2 + r0
            r5.A03 = r2
        L_0x0026:
            return r7
        L_0x0027:
            int r1 = r5.A0X()
            if (r1 < 0) goto L_0x0184
            goto L_0x001a
        L_0x002e:
            r1 = 8
            goto L_0x001a
        L_0x0031:
            long r2 = r5.A02
            long r0 = r5.A03
            long r2 = r2 - r0
            int r0 = (int) r2
            r6 = 10
            r4 = 0
            if (r0 < r6) goto L_0x0056
        L_0x003c:
            long r2 = r5.A03
            r0 = 1
            long r0 = r0 + r2
            r5.A03 = r0
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            byte r0 = r0.A01(r2)
            if (r0 >= 0) goto L_0x0026
            int r4 = r4 + 1
            if (r4 < r6) goto L_0x003c
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.5I7 r0 = X.Pxg.A0T(r0)
            throw r0
        L_0x0056:
            long r2 = r5.A03
            long r0 = r5.A02
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0189
            r0 = 1
            long r0 = r0 + r2
            r5.A03 = r0
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            byte r0 = r0.A01(r2)
            if (r0 >= 0) goto L_0x0026
            int r4 = r4 + 1
            if (r4 < r6) goto L_0x0056
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.5I7 r0 = X.Pxg.A0T(r0)
            throw r0
        L_0x0076:
            boolean r0 = r10 instanceof X.R3A
            if (r0 == 0) goto L_0x00d4
            r5 = r10
            X.R3A r5 = (X.R3A) r5
            r2 = r11 & 7
            r7 = 1
            if (r2 == 0) goto L_0x0095
            if (r2 == r7) goto L_0x015c
            r0 = 2
            if (r2 == r0) goto L_0x015f
            r0 = 3
            r1 = 4
            if (r2 == r0) goto L_0x0146
            if (r2 == r1) goto L_0x016c
            r0 = 5
            if (r2 == r0) goto L_0x0163
            X.R5c r0 = X.AnonymousClass5I7.A00()
            throw r0
        L_0x0095:
            int r0 = r5.A00
            int r2 = r5.A03
            r1 = r2
            int r0 = r0 - r2
            r4 = 10
            r3 = 0
            if (r0 < r4) goto L_0x00b6
        L_0x00a0:
            byte[] r2 = r5.A07
            r0 = r1
            int r1 = r1 + 1
            r5.A03 = r1
            byte r0 = r2[r0]
            if (r0 >= 0) goto L_0x0026
            int r3 = r3 + 1
            if (r3 < r4) goto L_0x00a0
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.5I7 r0 = X.Pxg.A0T(r0)
            throw r0
        L_0x00b6:
            int r0 = r5.A00
            if (r2 != r0) goto L_0x00bd
            X.R3A.A02(r5, r7)
        L_0x00bd:
            byte[] r1 = r5.A07
            int r0 = r5.A03
            int r2 = r0 + 1
            r5.A03 = r2
            byte r0 = r1[r0]
            if (r0 >= 0) goto L_0x0026
            int r3 = r3 + 1
            if (r3 < r4) goto L_0x00b6
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.5I7 r0 = X.Pxg.A0T(r0)
            throw r0
        L_0x00d4:
            r6 = r10
            X.R38 r6 = (X.R38) r6
            r1 = r11 & 7
            r7 = 1
            if (r1 == 0) goto L_0x00ff
            if (r1 == r7) goto L_0x00fc
            r0 = 2
            if (r1 == r0) goto L_0x00f5
            r0 = 3
            r2 = 4
            if (r1 == r0) goto L_0x016e
            if (r1 == r2) goto L_0x016c
            r0 = 5
            if (r1 != r0) goto L_0x0167
        L_0x00ea:
            int r1 = r6.A02
            int r0 = r6.A03
            int r1 = r1 - r0
            if (r2 > r1) goto L_0x0189
            int r0 = r0 + r2
            r6.A03 = r0
            return r7
        L_0x00f5:
            int r2 = r6.A0X()
            if (r2 < 0) goto L_0x0184
            goto L_0x00ea
        L_0x00fc:
            r2 = 8
            goto L_0x00ea
        L_0x00ff:
            int r5 = r6.A02
            int r2 = r6.A03
            r1 = r2
            int r0 = r5 - r2
            r4 = 10
            r3 = 0
            if (r0 < r4) goto L_0x0121
        L_0x010b:
            byte[] r2 = r6.A06
            r0 = r1
            int r1 = r1 + 1
            r6.A03 = r1
            byte r0 = r2[r0]
            if (r0 >= 0) goto L_0x0026
            int r3 = r3 + 1
            if (r3 < r4) goto L_0x010b
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.5I7 r0 = X.Pxg.A0T(r0)
            throw r0
        L_0x0121:
            r1 = r2
            if (r2 == r5) goto L_0x0189
            byte[] r0 = r6.A06
            int r2 = r2 + 1
            r6.A03 = r2
            byte r0 = r0[r1]
            if (r0 >= 0) goto L_0x0026
            int r3 = r3 + 1
            if (r3 < r4) goto L_0x0121
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.5I7 r0 = X.Pxg.A0T(r0)
            throw r0
        L_0x0139:
            int r0 = r5.A0G()
            if (r0 == 0) goto L_0x0152
            boolean r0 = r5.A0V(r0)
            if (r0 != 0) goto L_0x0139
            goto L_0x0152
        L_0x0146:
            int r0 = r5.A0G()
            if (r0 == 0) goto L_0x0152
            boolean r0 = r5.A0V(r0)
            if (r0 != 0) goto L_0x0146
        L_0x0152:
            int r0 = r11 >>> 3
            int r0 = r0 << 3
            r0 = r0 | 4
            r5.A0R(r0)
            return r7
        L_0x015c:
            r1 = 8
            goto L_0x0163
        L_0x015f:
            int r1 = r5.A0X()
        L_0x0163:
            r5.A0b(r1)
            return r7
        L_0x0167:
            X.R5c r0 = X.AnonymousClass5I7.A00()
            throw r0
        L_0x016c:
            r7 = 0
            return r7
        L_0x016e:
            int r0 = r6.A0G()
            if (r0 == 0) goto L_0x017a
            boolean r0 = r6.A0V(r0)
            if (r0 != 0) goto L_0x016e
        L_0x017a:
            int r0 = r11 >>> 3
            int r0 = r0 << 3
            r0 = r0 | 4
            r6.A0R(r0)
            return r7
        L_0x0184:
            X.5I7 r0 = X.AnonymousClass5I7.A01()
            throw r0
        L_0x0189:
            X.5I7 r0 = X.AnonymousClass5I7.A02()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11363SPb.A0V(int):boolean");
    }
}
