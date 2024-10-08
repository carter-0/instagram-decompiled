package X;

import java.util.Arrays;

/* renamed from: X.975  reason: invalid class name */
public final class AnonymousClass975 {
    public static final AnonymousClass975 A05;
    public int A00 = 0;
    public int A01 = -1;
    public boolean A02 = true;
    public int[] A03 = new int[8];
    public Object[] A04 = new Object[8];

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.975] */
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
            if (obj != null && (obj instanceof AnonymousClass975)) {
                AnonymousClass975 r9 = (AnonymousClass975) obj;
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

    public static void A00(AnonymousClass975 r3, int i) {
        int[] iArr = r3.A03;
        if (i > iArr.length) {
            int i2 = r3.A00;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            r3.A03 = Arrays.copyOf(iArr, i);
            r3.A04 = Arrays.copyOf(r3.A04, i);
        }
    }

    public final int A01() {
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
                i = C384019gd.A00(i8 << 3);
                i2 = C384019gd.A01(longValue);
                i3 = i + i2;
            } else if (i9 != 1) {
                if (i9 == 2) {
                    i = C384019gd.A00(i8 << 3);
                    int A022 = ((AnonymousClass97R) this.A04[i6]).A02();
                    i2 = C384019gd.A00(A022) + A022;
                } else if (i9 == 3) {
                    i = C384019gd.A00(i8 << 3) * 2;
                    i2 = ((AnonymousClass975) this.A04[i6]).A01();
                } else if (i9 == 5) {
                    i3 = C384019gd.A00(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(AnonymousClass9GO.A00());
                }
                i3 = i + i2;
            } else {
                i3 = C384019gd.A00(i8 << 3) + 8;
            }
            i5 += i3;
        }
        this.A01 = i5;
        return i5;
    }

    public final void A02(int i, Object obj) {
        if (this.A02) {
            A00(this, this.A00 + 1);
            int[] iArr = this.A03;
            int i2 = this.A00;
            iArr[i2] = i;
            this.A04[i2] = obj;
            this.A00 = i2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void A03(A8T a8t) {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    long longValue = ((Number) obj).longValue();
                    C384019gd r1 = a8t.A00;
                    r1.A06(i3 << 3);
                    r1.A0A(longValue);
                } else if (i4 == 1) {
                    long longValue2 = ((Number) obj).longValue();
                    C384019gd r3 = a8t.A00;
                    r3.A06((i3 << 3) | 1);
                    r3.A09(longValue2);
                } else if (i4 == 2) {
                    a8t.A00.A0B((AnonymousClass97R) obj, i3);
                } else if (i4 == 3) {
                    C384019gd r2 = a8t.A00;
                    int i5 = i3 << 3;
                    r2.A06(i5 | 3);
                    ((AnonymousClass975) obj).A03(a8t);
                    r2.A06(i5 | 4);
                } else if (i4 == 5) {
                    int intValue = ((Number) obj).intValue();
                    C384019gd r12 = a8t.A00;
                    r12.A06((i3 << 3) | 5);
                    r12.A05(intValue);
                } else {
                    throw new RuntimeException(AnonymousClass9GO.A00());
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
