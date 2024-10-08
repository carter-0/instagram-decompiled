package X;

import androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5P8  reason: invalid class name */
public final class AnonymousClass5P8 implements Iterable, C62650uo {
    public static final AnonymousClass5P8 A04 = new AnonymousClass5P8(0, 0, (int[]) null, 0);
    public final int A00;
    public final long A01;
    public final long A02;
    public final int[] A03;

    public final Iterator iterator() {
        return AnonymousClass2YZ.A03(new SnapshotIdSet$iterator$1(this, (AnonymousClass4D7) null));
    }

    public final AnonymousClass5P8 A00(int i) {
        int i2;
        long j;
        long j2;
        int[] iArr;
        int i3 = this.A00;
        int i4 = i;
        int i5 = i - i3;
        if (i5 >= 0) {
            if (i5 < 64) {
                long j3 = 1 << i5;
                long j4 = this.A01;
                if ((j4 & j3) != 0) {
                    j = this.A02;
                    j2 = j4 & (j3 ^ -1);
                }
                return this;
            }
            if (i5 < 128) {
                long j5 = 1 << (i5 - 64);
                long j6 = this.A02;
                if ((j6 & j5) != 0) {
                    j = j6 & (j5 ^ -1);
                    j2 = this.A01;
                }
            }
            return this;
            iArr = this.A03;
        } else {
            int[] iArr2 = this.A03;
            if (iArr2 != null) {
                int length = iArr2.length - 1;
                int i6 = length;
                int i7 = 0;
                while (true) {
                    if (i7 <= length) {
                        i2 = (i7 + length) >>> 1;
                        int i8 = iArr2[i2];
                        if (i4 <= i8) {
                            if (i4 >= i8) {
                                break;
                            }
                            length = i2 - 1;
                        } else {
                            i7 = i2 + 1;
                        }
                    } else {
                        i2 = -(i7 + 1);
                        break;
                    }
                }
                if (i2 >= 0) {
                    if (i6 == 0) {
                        j = this.A02;
                        j2 = this.A01;
                        iArr = null;
                    } else {
                        int[] iArr3 = new int[i6];
                        if (i2 > 0) {
                            0Yw.A0T(iArr2, iArr3, 0, 0, i2);
                        }
                        if (i2 < i6) {
                            0Yw.A0T(iArr2, iArr3, i2, i2 + 1, i6 + 1);
                        }
                        return new AnonymousClass5P8(this.A02, this.A01, iArr3, i3);
                    }
                }
            }
            return this;
        }
        return new AnonymousClass5P8(j, j2, iArr, i3);
    }

    public final AnonymousClass5P8 A01(int i) {
        int i2;
        long j;
        long j2;
        int[] iArr;
        int[] iArr2;
        int i3 = this.A00;
        int i4 = i;
        int i5 = i - i3;
        if (i5 >= 0) {
            if (i5 < 64) {
                long j3 = 1 << i5;
                long j4 = this.A01;
                if ((j4 & j3) == 0) {
                    j = this.A02;
                    j2 = j4 | j3;
                }
                return this;
            }
            if (i5 < 128) {
                long j5 = 1 << (i5 - 64);
                long j6 = this.A02;
                if ((j6 & j5) == 0) {
                    j = j6 | j5;
                    j2 = this.A01;
                }
            } else if (!A04(i4)) {
                long j7 = this.A02;
                long j8 = this.A01;
                ArrayList arrayList = null;
                int i6 = ((i + 1) / 64) * 64;
                while (true) {
                    if (i3 >= i6) {
                        i6 = i3;
                        break;
                    }
                    if (j8 != 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            int[] iArr3 = this.A03;
                            if (iArr3 != null) {
                                for (int valueOf : iArr3) {
                                    arrayList.add(Integer.valueOf(valueOf));
                                }
                            }
                        }
                        int i7 = 0;
                        do {
                            if (((1 << i7) & j8) != 0) {
                                arrayList.add(Integer.valueOf(i7 + i3));
                            }
                            i7++;
                        } while (i7 < 64);
                    }
                    if (j7 == 0) {
                        j8 = 0;
                        break;
                    }
                    i3 += 64;
                    j8 = j7;
                    j7 = 0;
                }
                if (arrayList != null) {
                    iArr2 = 00k.A0x(arrayList);
                } else {
                    iArr2 = this.A03;
                }
                return new AnonymousClass5P8(j7, j8, iArr2, i6).A01(i4);
            }
            return this;
            iArr = this.A03;
        } else {
            int[] iArr4 = this.A03;
            if (iArr4 == null) {
                j = this.A02;
                j2 = this.A01;
                iArr = new int[]{i4};
            } else {
                int length = iArr4.length;
                int i8 = length - 1;
                int i9 = 0;
                while (true) {
                    if (i9 <= i8) {
                        i2 = (i9 + i8) >>> 1;
                        int i10 = iArr4[i2];
                        if (i4 <= i10) {
                            if (i4 >= i10) {
                                break;
                            }
                            i8 = i2 - 1;
                        } else {
                            i9 = i2 + 1;
                        }
                    } else {
                        i2 = -(i9 + 1);
                        break;
                    }
                }
                if (i2 < 0) {
                    int i11 = -(i2 + 1);
                    int i12 = length + 1;
                    int[] iArr5 = new int[i12];
                    0Yw.A0T(iArr4, iArr5, 0, 0, i11);
                    0Yw.A0T(iArr4, iArr5, i11 + 1, i11, i12 - 1);
                    iArr5[i11] = i;
                    return new AnonymousClass5P8(this.A02, this.A01, iArr5, i3);
                }
                return this;
            }
        }
        return new AnonymousClass5P8(j, j2, iArr, i3);
    }

    public final AnonymousClass5P8 A02(AnonymousClass5P8 r18) {
        AnonymousClass5P8 r0;
        int[] iArr;
        AnonymousClass5P8 r02 = A04;
        AnonymousClass5P8 r12 = r18;
        if (r12 == r02) {
            return this;
        }
        if (this == r02) {
            return r02;
        }
        int i = r12.A00;
        int i2 = this.A00;
        if (i == i2 && r12.A03 == (iArr = this.A03)) {
            return new AnonymousClass5P8((r12.A02 ^ -1) & this.A02, (-1 ^ r12.A01) & this.A01, iArr, i2);
        }
        int[] iArr2 = r12.A03;
        int i3 = 0;
        if (iArr2 != null) {
            r0 = this;
            for (int A002 : iArr2) {
                r0 = r0.A00(A002);
            }
        } else {
            r0 = this;
        }
        long j = r12.A01;
        if (j != 0) {
            int i4 = 0;
            do {
                if ((j & (1 << i4)) != 0) {
                    r0 = r0.A00(i + i4);
                }
                i4++;
            } while (i4 < 64);
        }
        long j2 = r12.A02;
        if (j2 == 0) {
            return r0;
        }
        do {
            if ((j2 & (1 << i3)) != 0) {
                r0 = r0.A00(i3 + 64 + i);
            }
            i3++;
        } while (i3 < 64);
        return r0;
    }

    public final AnonymousClass5P8 A03(AnonymousClass5P8 r20) {
        AnonymousClass5P8 r0;
        int[] iArr;
        AnonymousClass5P8 r12 = r20;
        AnonymousClass5P8 r02 = A04;
        if (r12 == r02) {
            return this;
        }
        if (this == r02) {
            return r20;
        }
        int i = r12.A00;
        int i2 = this.A00;
        if (i == i2 && r12.A03 == (iArr = this.A03)) {
            return new AnonymousClass5P8(r12.A02 | this.A02, r12.A01 | this.A01, iArr, i2);
        }
        int i3 = 0;
        if (this.A03 == null) {
            long j = this.A01;
            if (j != 0) {
                int i4 = 0;
                do {
                    if ((j & (1 << i4)) != 0) {
                        r12 = r12.A01(i2 + i4);
                    }
                    i4++;
                } while (i4 < 64);
            }
            long j2 = this.A02;
            if (j2 == 0) {
                return r12;
            }
            do {
                if ((j2 & (1 << i3)) != 0) {
                    r12 = r12.A01(i3 + 64 + i2);
                }
                i3++;
            } while (i3 < 64);
            return r12;
        }
        int[] iArr2 = r12.A03;
        if (iArr2 != null) {
            r0 = this;
            for (int A012 : iArr2) {
                r0 = r0.A01(A012);
            }
        } else {
            r0 = this;
        }
        long j3 = r12.A01;
        if (j3 != 0) {
            int i5 = 0;
            do {
                if ((j3 & (1 << i5)) != 0) {
                    r0 = r0.A01(i + i5);
                }
                i5++;
            } while (i5 < 64);
        }
        long j4 = r12.A02;
        if (j4 != 0) {
            do {
                if ((j4 & (1 << i3)) != 0) {
                    r0 = r0.A01(i3 + 64 + i);
                }
                i3++;
            } while (i3 < 64);
        }
        return r0;
    }

    public final boolean A04(int i) {
        int i2;
        long j;
        long j2;
        int i3 = i - this.A00;
        if (i3 >= 0) {
            if (i3 < 64) {
                j = 1 << i3;
                j2 = this.A01;
            } else if (i3 < 128) {
                j = 1 << (i3 - 64);
                j2 = this.A02;
            }
            if ((j & j2) == 0) {
                return false;
            }
            return true;
        }
        int[] iArr = this.A03;
        if (iArr != null) {
            int length = iArr.length - 1;
            int i4 = 0;
            while (true) {
                if (i4 <= length) {
                    i2 = (i4 + length) >>> 1;
                    int i5 = iArr[i2];
                    if (i <= i5) {
                        if (i >= i5) {
                            break;
                        }
                        length = i2 - 1;
                    } else {
                        i4 = i2 + 1;
                    }
                } else {
                    i2 = -(i4 + 1);
                    break;
                }
            }
            if (i2 < 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass5P8(long j, long j2, int[] iArr, int i) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
        this.A03 = iArr;
    }

    public final String toString() {
        String obj = super.toString();
        ArrayList arrayList = new ArrayList(0Yv.A1E(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append(", ");
            }
            if (obj2 != null && !(obj2 instanceof CharSequence)) {
                if (obj2 instanceof Character) {
                    sb.append(((Character) obj2).charValue());
                } else {
                    obj2 = String.valueOf(obj2);
                }
            }
            sb.append((CharSequence) obj2);
        }
        sb.append("");
        return 002.A0h(obj, " [", sb.toString(), ']');
    }
}
