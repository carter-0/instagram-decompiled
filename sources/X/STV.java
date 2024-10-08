package X;

import java.util.Arrays;

public final class STV {
    public static final STV A05 = new STV(new int[0], new Object[0], 0, false);
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;
    public Object[] A04;

    public STV(int[] iArr, Object[] objArr, int i, boolean z) {
        this.A01 = -1;
        this.A00 = i;
        this.A03 = iArr;
        this.A04 = objArr;
        this.A02 = z;
    }

    public static STV A00() {
        return A05;
    }

    public static STV A01() {
        return new STV(new int[8], new Object[8], 0, true);
    }

    public final void A07() {
        if (this.A02) {
            this.A02 = false;
        }
    }

    public final void A0B(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.A00; i2++) {
            C11402SRy.A02(this.A04[i2], String.valueOf(this.A03[i2] >>> 3), sb, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof STV)) {
                STV stv = (STV) obj;
                int i = this.A00;
                if (i == stv.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = stv.A03;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = stv.A04;
                            int i3 = 0;
                            while (i3 < i) {
                                if (objArr[i3].equals(objArr2[i3])) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public STV() {
        this(new int[8], new Object[8], 0, true);
    }

    public static STV A02(STV stv, STV stv2) {
        int i = stv.A00 + stv2.A00;
        int[] copyOf = Arrays.copyOf(stv.A03, i);
        System.arraycopy(stv2.A03, 0, copyOf, stv.A00, stv2.A00);
        Object[] copyOf2 = Arrays.copyOf(stv.A04, i);
        System.arraycopy(stv2.A04, 0, copyOf2, stv.A00, stv2.A00);
        return new STV(copyOf, copyOf2, i, true);
    }

    private final void A03(int i) {
        int[] iArr = this.A03;
        if (i > iArr.length) {
            int i2 = this.A00;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.A03 = Arrays.copyOf(iArr, i);
            this.A04 = Arrays.copyOf(this.A04, i);
        }
    }

    public final int A04() {
        int i;
        int i2;
        int i3;
        int i4 = this.A01;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.A00; i6++) {
            int i7 = this.A03[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                long A0R = AnonymousClass7TE.A0R(this.A04[i6]);
                i = C8567Qx5.A00(i8 << 3);
                i2 = C8567Qx5.A01(A0R);
                i3 = i + i2;
            } else if (i9 != 1) {
                if (i9 == 2) {
                    i = C8567Qx5.A00(i8 << 3);
                    int A052 = ((TAQ) this.A04[i6]).A05();
                    i2 = C8567Qx5.A00(A052) + A052;
                } else if (i9 == 3) {
                    int A07 = SA4.A07(i8);
                    i = A07 + A07;
                    i2 = ((STV) this.A04[i6]).A04();
                } else if (i9 == 5) {
                    i3 = SA4.A07(i8) + 4;
                } else {
                    throw new IllegalStateException(C8842RCi.A00());
                }
                i3 = i + i2;
            } else {
                i3 = SA4.A07(i8) + 8;
            }
            i5 += i3;
        }
        this.A01 = i5;
        return i5;
    }

    public final int A05() {
        int i = this.A01;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.A00; i3++) {
            int i4 = this.A03[i3] >>> 3;
            int A002 = C8567Qx5.A00(8);
            int A003 = C8567Qx5.A00(16) + C8567Qx5.A00(i4);
            int A004 = C8567Qx5.A00(24);
            int A052 = ((TAQ) this.A04[i3]).A05();
            i2 += A002 + A002 + A003 + A004 + C8567Qx5.A00(A052) + A052;
        }
        this.A01 = i2;
        return i2;
    }

    public final void A06() {
        if (!this.A02) {
            throw C66580MXl.A11();
        }
    }

    public final void A09(STV stv) {
        if (!stv.equals(A05)) {
            A06();
            int i = this.A00 + stv.A00;
            A03(i);
            System.arraycopy(stv.A03, 0, this.A03, this.A00, stv.A00);
            System.arraycopy(stv.A04, 0, this.A04, this.A00, stv.A00);
            this.A00 = i;
        }
    }

    public final void A0A(C13865Tim tim) {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    tim.FQN(i4, AnonymousClass7TE.A0R(obj));
                } else if (i3 == 1) {
                    tim.FQF(i4, AnonymousClass7TE.A0R(obj));
                } else if (i3 == 2) {
                    tim.FPY((TAQ) obj, i4);
                } else if (i3 == 3) {
                    tim.FOm(i4);
                    ((STV) obj).A0A(tim);
                    tim.FPw(i4);
                } else if (i3 == 5) {
                    tim.FQ9(i4, AnonymousClass7TE.A0M(obj));
                } else {
                    throw C41845B3m.A0j(C8842RCi.A00());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = i + 527;
        int[] iArr = this.A03;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.A04;
        for (int i7 = 0; i7 < i; i7++) {
            i3 = AnonymousClass7TE.A0N(objArr[i7], i3 * 31);
        }
        return i6 + i3;
    }

    public final void A08(int i, Object obj) {
        A06();
        A03(this.A00 + 1);
        int[] iArr = this.A03;
        int i2 = this.A00;
        iArr[i2] = i;
        this.A04[i2] = obj;
        this.A00 = i2 + 1;
    }
}
