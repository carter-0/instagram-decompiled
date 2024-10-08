package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.AUv  reason: case insensitive filesystem */
public final class C40181AUv implements C340147km {
    public C343047pa A00;
    public C343047pa A01;
    public C343047pa A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public final C343137pj Ap9(C340177kp r7, C340177kp r8, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        return A00(list, list2, list3, i, i2);
    }

    public final C343137pj Bc4(C340177kp r7, List list, List list2, int i, int i2, int i3) {
        return A00(list, (List) null, list2, i, i2);
    }

    public final C343137pj Bf6(List list, int i, int i2, int i3) {
        return A00((List) null, (List) null, list, i, i2);
    }

    public final C343137pj CEC(C340177kp r2, List list, List list2, int i, int i2, int i3) {
        return A00((List) null, list, list2, i, i2);
    }

    private C343137pj A00(List list, List list2, List list3, int i, int i2) {
        int i3;
        int i4;
        int i5;
        HashSet hashSet;
        C343047pa r11;
        int i6 = i;
        int i7 = i2;
        List list4 = list2;
        List<C343047pa> list5 = list;
        C343047pa r3 = new C343047pa(Math.max(i6, i7), Math.min(i6, i7));
        int i8 = this.A04;
        if (i8 > 0) {
            float f = (float) i8;
            i4 = (int) (0.8f * f);
            i3 = (int) (f * 1.2f);
        } else {
            i3 = 3145728;
            i4 = 0;
        }
        ArrayList A012 = A01(list3, i3);
        if (list != null) {
            list5 = A01(list5, 10485760);
        }
        if (list2 != null) {
            list4 = A01(list4, 2097152);
        }
        if (list5 != null) {
            int i9 = this.A03;
            if (i9 <= 0) {
                i9 = r3.A02 * r3.A01;
            }
            i5 = 0;
            if (i9 > 0) {
                Iterator it = list5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C343047pa r6 = (C343047pa) it.next();
                    C343047pa A013 = AAH.A01(r6, r3);
                    if (A013 != null) {
                        r6 = A013;
                    }
                    int i10 = r6.A02 * r6.A01;
                    if (i10 > i5) {
                        i5 = i10;
                        if (i10 >= i9) {
                            i5 = i9;
                            break;
                        }
                    }
                }
            }
        } else {
            i5 = 0;
        }
        int i11 = this.A05;
        if (i4 != 0) {
            double A002 = AAH.A00(r3.A02, r3.A01);
            double sqrt = Math.sqrt(((double) i4) / A002);
            r3 = new C343047pa((int) (A002 * sqrt), (int) sqrt);
        }
        int i12 = 0;
        C343047pa r4 = null;
        if (i5 <= 0 || list5 == null) {
            hashSet = null;
        } else {
            i12 = (int) (((double) i5) * 0.85d);
            hashSet = AnonymousClass7TE.A1F();
            for (C343047pa r8 : list5) {
                C343047pa r7 = r8;
                C343047pa A014 = AAH.A01(r8, r3);
                if (A014 != null) {
                    r7 = A014;
                }
                if (r7.A02 * r7.A01 >= i12) {
                    hashSet.add(Double.valueOf(AAH.A00(r8.A02, r8.A01)));
                }
            }
        }
        C343047pa A003 = C392489ut.A00(r3, A012, hashSet, 0.0d);
        if (A003 == null && (A003 = C392489ut.A00(r3, A012, (Set) null, 0.0d)) == null) {
            throw AnonymousClass7TE.A15("Could not calculate preview size.");
        }
        double A004 = AAH.A00(A003.A02, A003.A01);
        if (list5 != null) {
            if (i5 > 0) {
                double sqrt2 = Math.sqrt(((double) i12) / A004);
                r3 = new C343047pa((int) (A004 * sqrt2), (int) sqrt2);
            }
            r11 = C392489ut.A00(r3, list5, (Set) null, A004);
        } else {
            r11 = null;
        }
        if (list4 != null) {
            if (i11 == 0) {
                r4 = C392489ut.A00(A003, list4, (Set) null, A004);
            } else {
                double d = 0.0d;
                if (A004 != 0.0d) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < list4.size(); i14++) {
                        C343047pa r72 = (C343047pa) list4.get(i14);
                        int i15 = r72.A02;
                        int i16 = r72.A01;
                        int i17 = i15 * i16;
                        double A005 = AAH.A00(i15, i16);
                        int abs = Math.abs(i11 - i17);
                        double abs2 = Math.abs(A004 - A005);
                        if (r4 != null) {
                            double d2 = (double) i17;
                            if (((double) (((int) (abs2 * d2)) + abs)) >= ((double) (((int) (d2 * d)) + i13))) {
                            }
                        }
                        r4 = r72;
                        d = abs2;
                        i13 = abs;
                    }
                }
            }
        }
        this.A01 = A003;
        this.A00 = r11;
        this.A02 = r4;
        return new C343137pj(A003, r11, r4, (C343047pa) null);
    }

    public C40181AUv(int i, int i2, int i3) {
        this.A04 = i;
        this.A03 = i2;
        this.A05 = i3;
    }

    public static ArrayList A01(List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        C343047pa r5 = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C343047pa r3 = (C343047pa) list.get(i2);
            if (r3.A02 * r3.A01 <= i) {
                arrayList.add(r3);
            }
            if (r5 == null || r3.A02 * r3.A01 < r5.A02 * r5.A01) {
                r5 = r3;
            }
        }
        if (arrayList.isEmpty() && r5 != null) {
            arrayList.add(r5);
        }
        return arrayList;
    }
}
