package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.3S1  reason: invalid class name */
public abstract class AnonymousClass3S1 {
    public static final Object A00(1UV r3, List list) {
        0qQ.A0B(list, 0);
        0qQ.A0B(r3, 1);
        for (Object next : list) {
            if (r3.apply(next)) {
                return next;
            }
        }
        return null;
    }

    public static final Object A01(1UV r3, List list) {
        0qQ.A0B(list, 0);
        0qQ.A0B(r3, 1);
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            Object previous = listIterator.previous();
            if (r3.apply(previous)) {
                return previous;
            }
        }
        return null;
    }

    public static final ArrayList A02(Comparator comparator, List list, List list2) {
        0qQ.A0B(list, 0);
        0qQ.A0B(list2, 1);
        0qQ.A0B(comparator, 2);
        int size = list.size();
        int size2 = list2.size();
        ArrayList arrayList = new ArrayList(size + size2);
        int i = 0;
        int i2 = 0;
        while (i < size && i2 < size2) {
            Object obj = list.get(i);
            Object obj2 = list2.get(i2);
            int compare = comparator.compare(obj, obj2);
            if (compare == 0) {
                arrayList.add(obj);
                i++;
            } else if (compare < 0) {
                arrayList.add(obj);
                i++;
            } else {
                arrayList.add(obj2);
            }
            i2++;
        }
        while (i < size) {
            arrayList.add(list.get(i));
            i++;
        }
        while (i2 < size2) {
            arrayList.add(list2.get(i2));
            i2++;
        }
        return arrayList;
    }

    public static final List A03(1UV r4, List list) {
        0qQ.A0B(list, 0);
        0qQ.A0B(r4, 1);
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (r4.apply(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final boolean A04(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }
}
