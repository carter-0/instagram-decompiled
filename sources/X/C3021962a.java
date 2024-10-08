package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.62a  reason: invalid class name and case insensitive filesystem */
public abstract class C3021962a {
    public static final C286025Tq A00;

    public static final List A00(C286025Tq r9, int i, int i2) {
        List list;
        ArrayList arrayList = null;
        if (!(i == i2 || (list = r9.A03) == null)) {
            if (i == 0 && i2 >= r9.A00.length()) {
                return list;
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C3022062b r0 = (C3022062b) obj;
                if (A02(i, i2, r0.A01, r0.A00)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C3022062b r1 = (C3022062b) arrayList2.get(i4);
                arrayList.add(new C3022062b(r1.A02, C229632nm.A03(r1.A01, i, i2) - i, C229632nm.A03(r1.A00, i, i2) - i));
            }
        }
        return arrayList;
    }

    public static final List A01(List list, int i, int i2) {
        if (i <= i2) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj = list.get(i3);
                    C3022062b r0 = (C3022062b) obj;
                    if (A02(i, i2, r0.A01, r0.A00)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    C3022062b r1 = (C3022062b) arrayList.get(i4);
                    arrayList2.add(new C3022062b(r1.A02, r1.A03, Math.max(i, r1.A01) - i, Math.min(i2, r1.A00) - i));
                }
                if (!arrayList2.isEmpty()) {
                    return arrayList2;
                }
            }
            return null;
        }
        throw new IllegalArgumentException(002.A0X("start (", ") should be less than or equal to end (", ')', i, i2));
    }

    static {
        0sn r1 = 0sn.A00;
        A00 = new C286025Tq(r1, r1, "");
    }

    public static final boolean A02(int i, int i2, int i3, int i4) {
        if (Math.max(i, i3) < Math.min(i2, i4)) {
            return true;
        }
        if (i <= i3 && i4 <= i2) {
            if (i2 != i4) {
                return true;
            }
            boolean z = false;
            if (i3 == i4) {
                z = true;
            }
            boolean z2 = false;
            if (i == i2) {
                z2 = true;
            }
            if (z == z2) {
                return true;
            }
        }
        if (i3 > i || i2 > i4) {
            return false;
        }
        if (i4 != i2) {
            return true;
        }
        boolean z3 = false;
        if (i == i2) {
            z3 = true;
        }
        boolean z4 = false;
        if (i3 == i4) {
            z4 = true;
        }
        if (z3 == z4) {
            return true;
        }
        return false;
    }
}
