package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.48i  reason: invalid class name and case insensitive filesystem */
public abstract class C2611248i {
    public static int A01(C2611148h r2, C2610448a r3, List list) {
        2Ed r1 = r2.A00;
        Object obj = r1.A01;
        Object obj2 = r2.A01;
        if (obj.equals(obj2)) {
            return 0;
        }
        if (r1.A00.equals(obj2)) {
            return list.size();
        }
        int A00 = A00(r3.A00, obj2, r3.A01.A02, list);
        if (A00 < 0) {
            return A00 ^ -1;
        }
        return A00;
    }

    public static int A02(C2611148h r2, C2610448a r3, List list) {
        2Ed r1 = r2.A00;
        Object obj = r1.A01;
        Object obj2 = r2.A02;
        if (obj.equals(obj2)) {
            return 0;
        }
        if (r1.A00.equals(obj2)) {
            return list.size();
        }
        int A00 = A00(r3.A00, obj2, r3.A01.A02, list);
        int i = A00 ^ -1;
        if (A00 >= 0) {
            return A00 + 1;
        }
        return i;
    }

    public static List A03(C2611148h r4, C2610448a r5, List list) {
        boolean z = false;
        if (r4.A00 == r5.A01) {
            z = true;
        }
        17k.A0E(z);
        int A02 = A02(r4, r5, list);
        int A01 = A01(r4, r5, list);
        if (A02 <= A01) {
            return list.subList(A02, A01);
        }
        return list.subList(0, 0);
    }

    public static int A00(AnonymousClass2hV r4, Object obj, Comparator comparator, List list) {
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int compare = comparator.compare(r4.apply(list.get(i2)), obj);
            if (compare < 0) {
                i = i2 + 1;
            } else if (compare <= 0) {
                return i2;
            } else {
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }
}
