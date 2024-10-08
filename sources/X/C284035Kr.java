package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5Kr  reason: invalid class name and case insensitive filesystem */
public abstract class C284035Kr {
    public int A00;
    public C284155Le A01;

    public final AnonymousClass5L9 A08() {
        AnonymousClass5Kq r6 = (AnonymousClass5Kq) this;
        int A0F = r6.A0F();
        int i = r6.A00;
        int i2 = r6.A03;
        if (A0F <= i - i2 && A0F > 0) {
            byte[] bArr = r6.A07;
            AnonymousClass5L9.A00(i2, i2 + A0F, bArr.length);
            AnonymousClass5LA r0 = new AnonymousClass5LA(AnonymousClass5L9.A01.AKl(bArr, i2, A0F));
            r6.A03 += A0F;
            return r0;
        } else if (A0F == 0) {
            return AnonymousClass5L9.A02;
        } else {
            byte[] A05 = AnonymousClass5Kq.A05(r6, A0F);
            if (A05 != null) {
                int length = A05.length;
                AnonymousClass5L9.A00(0, length, length);
                return new AnonymousClass5LA(AnonymousClass5L9.A01.AKl(A05, 0, length));
            }
            int i3 = r6.A03;
            int i4 = r6.A00;
            int i5 = i4 - i3;
            r6.A04 += i4;
            r6.A03 = 0;
            r6.A00 = 0;
            ArrayList A002 = AnonymousClass5Kq.A00(r6, A0F - i5);
            byte[] bArr2 = new byte[A0F];
            System.arraycopy(r6.A07, i3, bArr2, 0, i5);
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i5, length2);
                i5 += length2;
            }
            return new AnonymousClass5LA(bArr2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A09() {
        /*
            r6 = this;
            r5 = r6
            X.5Kq r5 = (X.AnonymousClass5Kq) r5
            int r4 = r5.A0F()
            if (r4 <= 0) goto L_0x001f
            int r0 = r5.A00
            int r2 = r5.A03
            int r0 = r0 - r2
            if (r4 > r0) goto L_0x0024
            byte[] r1 = r5.A07
            java.nio.charset.Charset r0 = X.C284045Ks.A03
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1, r2, r4, r0)
        L_0x0019:
            int r0 = r5.A03
            int r0 = r0 + r4
            r5.A03 = r0
            return r3
        L_0x001f:
            if (r4 != 0) goto L_0x0024
            java.lang.String r3 = ""
            return r3
        L_0x0024:
            int r0 = r5.A00
            if (r4 > r0) goto L_0x0037
            X.AnonymousClass5Kq.A02(r5, r4)
            byte[] r2 = r5.A07
            int r1 = r5.A03
            java.nio.charset.Charset r0 = X.C284045Ks.A03
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2, r1, r4, r0)
            goto L_0x0019
        L_0x0037:
            byte[] r1 = X.AnonymousClass5Kq.A04(r5, r4)
            java.nio.charset.Charset r0 = X.C284045Ks.A03
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284035Kr.A09():java.lang.String");
    }

    public final String A0A() {
        byte[] A04;
        AnonymousClass5Kq r4 = (AnonymousClass5Kq) this;
        int A0F = r4.A0F();
        int i = r4.A03;
        int i2 = r4.A00;
        if (A0F <= i2 - i && A0F > 0) {
            A04 = r4.A07;
            r4.A03 = i + A0F;
        } else if (A0F == 0) {
            return "";
        } else {
            if (A0F <= i2) {
                AnonymousClass5Kq.A02(r4, A0F);
                A04 = r4.A07;
                r4.A03 = A0F;
            } else {
                A04 = AnonymousClass5Kq.A04(r4, A0F);
            }
            i = 0;
        }
        return C284185Lh.A00.A02(A04, i, A0F);
    }

    public final int A06() {
        if (this instanceof AnonymousClass5Kq) {
            AnonymousClass5Kq r2 = (AnonymousClass5Kq) this;
            if (r2.A0C()) {
                r2.A02 = 0;
                return 0;
            }
            int A0F = r2.A0F();
            r2.A02 = A0F;
            if ((A0F >>> 3) != 0) {
                return A0F;
            }
            throw new C289845eJ(Pxd.A00(16));
        }
        AnonymousClass5Kt r22 = (AnonymousClass5Kt) this;
        if (r22.A0C()) {
            r22.A02 = 0;
            return 0;
        }
        int A0E = r22.A0E();
        r22.A02 = A0E;
        if ((A0E >>> 3) != 0) {
            return A0E;
        }
        throw new C289845eJ(Pxd.A00(16));
    }

    public final int A07(int i) {
        if (this instanceof AnonymousClass5Kq) {
            AnonymousClass5Kq r2 = (AnonymousClass5Kq) this;
            if (i >= 0) {
                int i2 = i + r2.A04 + r2.A03;
                int i3 = r2.A01;
                if (i2 <= i3) {
                    r2.A01 = i2;
                    AnonymousClass5Kq.A01(r2);
                    return i3;
                }
                throw new C289845eJ("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new C289845eJ("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        AnonymousClass5Kt r22 = (AnonymousClass5Kt) this;
        if (i >= 0) {
            int i4 = i + r22.A04;
            int i5 = r22.A01;
            if (i4 <= i5) {
                r22.A01 = i4;
                int i6 = r22.A03 + r22.A00;
                r22.A03 = i6;
                if (i6 > i4) {
                    int i7 = i6 - i4;
                    r22.A00 = i7;
                    r22.A03 = i6 - i7;
                    return i5;
                }
                r22.A00 = 0;
                return i5;
            }
            throw new C289845eJ("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C289845eJ("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final void A0B(int i) {
        if (this instanceof AnonymousClass5Kq) {
            if (((AnonymousClass5Kq) this).A02 != i) {
                throw new C289845eJ(Pxd.A00(11));
            }
        } else if (((AnonymousClass5Kt) this).A02 != i) {
            throw new C289845eJ(Pxd.A00(11));
        }
    }

    public final boolean A0C() {
        boolean z;
        if (this instanceof AnonymousClass5Kq) {
            AnonymousClass5Kq r3 = (AnonymousClass5Kq) this;
            z = true;
            if (r3.A03 != r3.A00 || AnonymousClass5Kq.A03(r3, 1)) {
                return false;
            }
        } else {
            AnonymousClass5Kt r0 = (AnonymousClass5Kt) this;
            z = false;
            if (r0.A04 == r0.A03) {
                return true;
            }
        }
        return z;
    }

    public final boolean A0D(int i) {
        boolean z;
        int i2;
        int A06;
        int i3;
        int A062;
        if (this instanceof AnonymousClass5Kq) {
            AnonymousClass5Kq r5 = (AnonymousClass5Kq) this;
            int i4 = i & 7;
            z = true;
            if (i4 != 0) {
                if (i4 == 1) {
                    i3 = 8;
                } else if (i4 != 2) {
                    i3 = 4;
                    if (i4 == 3) {
                        do {
                            A062 = r5.A06();
                            if (A062 == 0 || !r5.A0D(A062)) {
                                r5.A0B(((i >>> 3) << 3) | 4);
                            }
                            A062 = r5.A06();
                            break;
                        } while (!r5.A0D(A062));
                        r5.A0B(((i >>> 3) << 3) | 4);
                        return true;
                    } else if (i4 == 4) {
                        return false;
                    } else {
                        if (i4 != 5) {
                            throw new C289845eJ("Protocol message tag had invalid wire type.");
                        }
                    }
                } else {
                    i3 = r5.A0F();
                }
                r5.A0J(i3);
            } else {
                int i5 = r5.A00;
                int i6 = r5.A03;
                int i7 = i6;
                int i8 = 0;
                if (i5 - i6 >= 10) {
                    do {
                        byte[] bArr = r5.A07;
                        int i9 = i7;
                        i7++;
                        r5.A03 = i7;
                        if (bArr[i9] < 0) {
                            i8++;
                        }
                    } while (i8 < 10);
                    throw new C289845eJ(Pxd.A00(5));
                }
                do {
                    if (i6 == r5.A00) {
                        AnonymousClass5Kq.A02(r5, 1);
                    }
                    byte[] bArr2 = r5.A07;
                    int i10 = r5.A03;
                    i6 = i10 + 1;
                    r5.A03 = i6;
                    if (bArr2[i10] < 0) {
                        i8++;
                    }
                } while (i8 < 10);
                throw new C289845eJ(Pxd.A00(5));
            }
        } else {
            AnonymousClass5Kt r6 = (AnonymousClass5Kt) this;
            int i11 = i & 7;
            z = true;
            if (i11 != 0) {
                if (i11 == 1) {
                    i2 = 8;
                } else if (i11 != 2) {
                    i2 = 4;
                    if (i11 == 3) {
                        do {
                            A06 = r6.A06();
                            if (A06 == 0 || !r6.A0D(A06)) {
                                r6.A0B(((i >>> 3) << 3) | 4);
                            }
                            A06 = r6.A06();
                            break;
                        } while (!r6.A0D(A06));
                        r6.A0B(((i >>> 3) << 3) | 4);
                        return true;
                    } else if (i11 == 4) {
                        return false;
                    } else {
                        if (i11 != 5) {
                            throw new C289845eJ("Protocol message tag had invalid wire type.");
                        }
                    }
                } else {
                    i2 = r6.A0E();
                    if (i2 < 0) {
                        throw new C289845eJ("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                }
                int i12 = r6.A03;
                int i13 = r6.A04;
                if (i2 <= i12 - i13) {
                    r6.A04 = i13 + i2;
                    return true;
                }
                throw new C289845eJ("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            int i14 = r6.A03;
            int i15 = r6.A04;
            int i16 = i15;
            int i17 = 0;
            if (i14 - i15 >= 10) {
                do {
                    byte[] bArr3 = r6.A05;
                    int i18 = i16;
                    i16++;
                    r6.A04 = i16;
                    if (bArr3[i18] < 0) {
                        i17++;
                    }
                } while (i17 < 10);
                throw new C289845eJ(Pxd.A00(5));
            }
            do {
                int i19 = i15;
                if (i15 != i14) {
                    byte[] bArr4 = r6.A05;
                    i15++;
                    r6.A04 = i15;
                    if (bArr4[i19] < 0) {
                        i17++;
                    }
                } else {
                    throw new C289845eJ("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            } while (i17 < 10);
            throw new C289845eJ(Pxd.A00(5));
        }
        return z;
    }
}
