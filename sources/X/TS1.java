package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class TS1 extends AbstractList<TAH> implements RandomAccess {
    public final int[] A00;
    public final TAH[] A01;

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.TPe] */
    public static TS1 A00(TAH... tahArr) {
        ArrayList A0q = Pxf.A0q(tahArr);
        Collections.sort(A0q);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (int i = 0; i < A0q.size(); i++) {
            AnonymousClass7TF.A1M(A1C, -1);
        }
        for (int i2 = 0; i2 < A0q.size(); i2++) {
            A1C.set(Collections.binarySearch(A0q, tahArr[i2]), Integer.valueOf(i2));
        }
        if (((TAH) A0q.get(0)).A05() != 0) {
            int i3 = 0;
            while (i3 < A0q.size()) {
                TAH tah = (TAH) A0q.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < A0q.size()) {
                    TAH tah2 = (TAH) A0q.get(i5);
                    if (!tah2.A0C(tah, tah.A05())) {
                        continue;
                        break;
                    } else if (tah2.A05() == tah.A05()) {
                        throw C51973G9u.A0g(tah2, "duplicate option: ", AnonymousClass7TE.A1A());
                    } else if (AnonymousClass7TE.A0M(A1C.get(i5)) > AnonymousClass7TE.A0M(A1C.get(i3))) {
                        A0q.remove(i5);
                        A1C.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            ? obj = new Object();
            A01(A0q, A1C, obj, 0, 0, A0q.size(), 0);
            int i6 = (int) (obj.A00 / 4);
            int[] iArr = new int[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                iArr[i7] = obj.readInt();
            }
            if (obj.ATS()) {
                return new TS1(iArr, (TAH[]) tahArr.clone());
            }
            throw Pxe.A0d();
        }
        throw AnonymousClass7TE.A0w("the empty byte string is not a supported option");
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Object, X.TPe] */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.lang.Object, X.TPe] */
    public static void A01(List list, List list2, C13198TPe tPe, int i, int i2, int i3, long j) {
        int i4;
        C13198TPe tPe2;
        int i5;
        int i6 = i3;
        int i7 = i2;
        if (i7 < i6) {
            int i8 = i7;
            while (true) {
                List list3 = list;
                int i9 = i;
                if (i8 >= i6) {
                    TAH tah = (TAH) list3.get(i7);
                    TAH tah2 = (TAH) list3.get(i3 - 1);
                    int i10 = -1;
                    List list4 = list2;
                    if (i9 == tah.A05()) {
                        i10 = C51971G9r.A0I(list4, i7);
                        i7 = i2 + 1;
                        tah = (TAH) list3.get(i7);
                    }
                    C13198TPe tPe3 = tPe;
                    if (tah.A04(i9) != tah2.A04(i9)) {
                        int i11 = 1;
                        for (int i12 = i4 + 1; i12 < i6; i12++) {
                            if (((TAH) list3.get(i12 - 1)).A04(i9) != ((TAH) list3.get(i12)).A04(i9)) {
                                i11++;
                            }
                        }
                        long j2 = j + ((long) ((int) (tPe3.A00 / 4))) + 2 + ((long) (i11 * 2));
                        tPe3.A0C(i11);
                        tPe3.A0C(i10);
                        for (int i13 = i4; i13 < i6; i13++) {
                            byte A04 = ((TAH) list3.get(i13)).A04(i9);
                            if (i13 == i4 || A04 != ((TAH) list3.get(i13 - 1)).A04(i9)) {
                                tPe3.A0C(A04 & 255);
                            }
                        }
                        ? obj = new Object();
                        while (true) {
                            int i14 = i4;
                            if (i4 >= i6) {
                                tPe2 = obj;
                                break;
                            }
                            byte A042 = ((TAH) list3.get(i4)).A04(i9);
                            int i15 = i4 + 1;
                            i4 = i15;
                            while (true) {
                                if (i4 < i6) {
                                    if (A042 != ((TAH) list3.get(i4)).A04(i9)) {
                                        break;
                                    }
                                    i4++;
                                } else {
                                    i4 = i6;
                                    break;
                                }
                            }
                            if (i15 == i4 && i + 1 == ((TAH) list3.get(i14)).A05()) {
                                tPe3.A0C(C51971G9r.A0I(list4, i14));
                            } else {
                                tPe3.A0C((int) (-(((long) ((int) (obj.A00 / 4))) + j2)));
                                A01(list3, list4, obj, i + 1, i14, i4, j2);
                            }
                        }
                    } else {
                        int i16 = 0;
                        int min = Math.min(tah.A05(), tah2.A05());
                        int i17 = i9;
                        while (i17 < min && tah.A04(i17) == tah2.A04(i17)) {
                            i16++;
                            i17++;
                        }
                        long j3 = 1 + j + ((long) ((int) (tPe3.A00 / 4))) + 2 + ((long) i16);
                        tPe3.A0C(-i16);
                        tPe3.A0C(i10);
                        int i18 = i9;
                        while (true) {
                            i5 = i + i16;
                            if (i18 >= i5) {
                                break;
                            }
                            tPe3.A0C(tah.A04(i18) & 255);
                            i18++;
                        }
                        if (i4 + 1 != i6) {
                            ? obj2 = new Object();
                            tPe3.A0C((int) (-(((long) ((int) (obj2.A00 / 4))) + j3)));
                            A01(list3, list4, obj2, i5, i4, i6, j3);
                            tPe2 = obj2;
                        } else if (i5 == ((TAH) list3.get(i4)).A05()) {
                            tPe3.A0C(C51971G9r.A0I(list4, i4));
                            return;
                        } else {
                            throw Pxe.A0d();
                        }
                    }
                    tPe3.FNi(tPe2, tPe2.A00);
                    return;
                } else if (((TAH) list3.get(i8)).A05() >= i9) {
                    i8++;
                } else {
                    throw Pxe.A0d();
                }
            }
        } else {
            throw Pxe.A0d();
        }
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.A01[i];
    }

    public final int size() {
        return this.A01.length;
    }

    public TS1(int[] iArr, TAH[] tahArr) {
        this.A01 = tahArr;
        this.A00 = iArr;
    }
}
