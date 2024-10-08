package X;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ta  reason: invalid class name and case insensitive filesystem */
public final class C232362ta {
    public final int A00;
    public final int A01;
    public final C232322tW A02;
    public final List A03;
    public final int[] A04;
    public final int[] A05;

    public final int A01(int i) {
        if (i < 0 || i >= this.A01) {
            throw new IndexOutOfBoundsException(002.A02(i, this.A01, "Index out of bounds - passed position = ", ", old list size = "));
        }
        int i2 = this.A05[i];
        int i3 = i2 & 15;
        int i4 = i2 >> 4;
        if (i3 == 0) {
            return -1;
        }
        return i4;
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [java.lang.Object, X.XTt] */
    /* JADX WARNING: type inference failed for: r0v22, types: [java.lang.Object, X.XTt] */
    public final void A02(C231452rh r15) {
        C232382tc r152;
        int i;
        if (r15 instanceof C232382tc) {
            r152 = (C232382tc) r15;
        } else {
            r152 = new C232382tc(r15);
        }
        int i2 = this.A01;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = i2;
        int i4 = this.A00;
        List list = this.A03;
        for (int size = list.size() - 1; size >= 0; size--) {
            C232372tb r5 = (C232372tb) list.get(size);
            int i5 = r5.A01;
            int i6 = r5.A00;
            int i7 = i5 + i6;
            int i8 = r5.A02 + i6;
            while (true) {
                if (i3 <= i7) {
                    break;
                }
                i3--;
                int i9 = this.A05[i3];
                if ((i9 & 12) != 0) {
                    int i10 = i9 >> 4;
                    C21298XTt A002 = A00(arrayDeque, i10, false);
                    if (A002 != null) {
                        int i11 = (i2 - A002.A00) - 1;
                        r152.DSU(i3, i11);
                        if ((i9 & 4) != 0) {
                            r152.D1O(i11, 1, this.A02.A01(i3, i10));
                        }
                    } else {
                        ? obj = new Object();
                        obj.A01 = i3;
                        obj.A00 = (i2 - i3) - 1;
                        obj.A02 = true;
                        arrayDeque.add(obj);
                    }
                } else {
                    r152.Ddf(i3, 1);
                    i2--;
                }
            }
            while (i4 > i8) {
                i4--;
                int i12 = this.A04[i4];
                if ((i12 & 12) != 0) {
                    int i13 = i12 >> 4;
                    C21298XTt A003 = A00(arrayDeque, i13, true);
                    if (A003 == null) {
                        ? obj2 = new Object();
                        obj2.A01 = i4;
                        obj2.A00 = i2 - i3;
                        obj2.A02 = false;
                        arrayDeque.add(obj2);
                    } else {
                        r152.DSU((i2 - A003.A00) - 1, i3);
                        if ((i12 & 4) != 0) {
                            r152.D1O(i3, 1, this.A02.A01(i13, i4));
                        }
                    }
                } else {
                    r152.DKr(i3, 1);
                    i2++;
                }
            }
            int i14 = r5.A01;
            int i15 = r5.A02;
            for (i = 0; i < r5.A00; i++) {
                if ((this.A05[i14] & 15) == 2) {
                    r152.D1O(i14, 1, this.A02.A01(i14, i15));
                }
                i14++;
                i15++;
            }
            i3 = r5.A01;
            i4 = r5.A02;
        }
        r152.A00();
    }

    public final void A03(2Rw r2) {
        A02(new C231442rg(r2));
    }

    public C232362ta(C232322tW r13, List list, int[] iArr, int[] iArr2) {
        int i;
        C232372tb r1;
        this.A03 = list;
        this.A05 = iArr;
        int[] iArr3 = iArr2;
        this.A04 = iArr3;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr3, 0);
        this.A02 = r13;
        this.A01 = r13.A03();
        this.A00 = r13.A02();
        List list2 = this.A03;
        if (list2.isEmpty() || (r1 = (C232372tb) list2.get(0)) == null || r1.A01 != 0 || r1.A02 != 0) {
            list2.add(0, new C232372tb(0, 0, 0));
        }
        list2.add(new C232372tb(this.A01, this.A00, 0));
        List<C232372tb> list3 = this.A03;
        for (C232372tb r7 : list3) {
            for (int i2 = 0; i2 < r7.A00; i2++) {
                int i3 = r7.A01 + i2;
                int i4 = r7.A02 + i2;
                int i5 = 2;
                if (this.A02.A04(i3, i4)) {
                    i5 = 1;
                }
                this.A05[i3] = (i4 << 4) | i5;
                this.A04[i4] = (i3 << 4) | i5;
            }
        }
        int i6 = 0;
        for (C232372tb r5 : list3) {
            while (true) {
                i = r5.A01;
                if (i6 >= i) {
                    break;
                }
                int[] iArr4 = this.A05;
                if (iArr4[i6] == 0) {
                    int size = list3.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (i7 >= size) {
                            break;
                        }
                        C232372tb r3 = (C232372tb) list3.get(i7);
                        while (i8 < r3.A02) {
                            int[] iArr5 = this.A04;
                            if (iArr5[i8] == 0) {
                                C232322tW r2 = this.A02;
                                if (r2.A05(i6, i8)) {
                                    int i9 = r2.A04(i6, i8) ? 8 : 4;
                                    iArr4[i6] = (i8 << 4) | i9;
                                    iArr5[i8] = (i6 << 4) | i9;
                                }
                            }
                            i8++;
                        }
                        i8 = r3.A02 + r3.A00;
                        i7++;
                    }
                }
                i6++;
            }
            i6 = i + r5.A00;
        }
    }

    public static C21298XTt A00(Collection collection, int i, boolean z) {
        C21298XTt xTt;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                xTt = null;
                break;
            }
            xTt = (C21298XTt) it.next();
            if (xTt.A01 == i && xTt.A02 == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C21298XTt xTt2 = (C21298XTt) it.next();
            int i2 = xTt2.A00;
            int i3 = i2 + 1;
            if (z) {
                i3 = i2 - 1;
            }
            xTt2.A00 = i3;
        }
        return xTt;
    }
}
