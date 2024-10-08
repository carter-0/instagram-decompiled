package X;

import java.util.Arrays;

/* renamed from: X.5Ko  reason: invalid class name and case insensitive filesystem */
public final class C284015Ko {
    public static final C284015Ko A05;
    public int A00 = 0;
    public int A01 = -1;
    public boolean A02 = true;
    public int[] A03 = new int[8];
    public Object[] A04 = new Object[8];

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.5Ko] */
    static {
        ? obj = new Object();
        obj.A01 = -1;
        obj.A00 = 0;
        obj.A03 = new int[0];
        obj.A04 = new Object[0];
        obj.A02 = false;
        A05 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C284015Ko)) {
                C284015Ko r9 = (C284015Ko) obj;
                int i = this.A00;
                if (i == r9.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = r9.A03;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = r9.A04;
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

    public final int A00() {
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
                long longValue = ((Number) this.A04[i6]).longValue();
                i = C7189Pyc.A00(i8 << 3);
                i2 = C7189Pyc.A01(longValue);
                i3 = i + i2;
            } else if (i9 == 1) {
                i3 = C7189Pyc.A00(i8 << 3) + 8;
            } else if (i9 == 2) {
                i3 = C7189Pyc.A02((AnonymousClass5L9) this.A04[i6], i8);
            } else if (i9 == 3) {
                i = C7189Pyc.A00(i8 << 3) * 2;
                i2 = ((C284015Ko) this.A04[i6]).A00();
                i3 = i + i2;
            } else if (i9 == 5) {
                i3 = C7189Pyc.A00(i8 << 3) + 4;
            } else {
                throw new IllegalStateException(new C289845eJ("Protocol message tag had invalid wire type."));
            }
            i5 += i3;
        }
        this.A01 = i5;
        return i5;
    }

    public final void A01(int i, Object obj) {
        if (this.A02) {
            int i2 = this.A00;
            int[] iArr = this.A03;
            if (i2 == iArr.length) {
                int i3 = i2 >> 1;
                if (i2 < 4) {
                    i3 = 8;
                }
                int i4 = i2 + i3;
                this.A03 = Arrays.copyOf(iArr, i4);
                this.A04 = Arrays.copyOf(this.A04, i4);
            }
            int[] iArr2 = this.A03;
            int i5 = this.A00;
            iArr2[i5] = i;
            this.A04[i5] = obj;
            this.A00 = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void A02(C13831Ti3 ti3) {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ((C7194Pyh) ti3).A00.A0B(i3, ((Number) obj).longValue());
                } else if (i4 == 1) {
                    ((C7194Pyh) ti3).A00.A0A(i3, ((Number) obj).longValue());
                } else if (i4 == 2) {
                    ti3.FNo((AnonymousClass5L9) obj, i3);
                } else if (i4 == 3) {
                    C7189Pyc pyc = ((C7194Pyh) ti3).A00;
                    int i5 = i3 << 3;
                    pyc.A07(i5 | 3);
                    ((C284015Ko) obj).A02(ti3);
                    pyc.A07(i5 | 4);
                } else if (i4 == 5) {
                    ((C7194Pyh) ti3).A00.A08(i3, ((Number) obj).intValue());
                } else {
                    throw new RuntimeException(new C289845eJ("Protocol message tag had invalid wire type."));
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = (527 + i) * 31;
        int[] iArr = this.A03;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.A04;
        int i6 = 17;
        for (int i7 = 0; i7 < i; i7++) {
            i6 = (i6 * 31) + objArr[i7].hashCode();
        }
        return i5 + i6;
    }
}
