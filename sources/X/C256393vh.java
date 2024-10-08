package X;

import com.google.common.collect.Lists$TransformingRandomAccessList;
import com.google.common.collect.Lists$TransformingSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.3vh  reason: invalid class name and case insensitive filesystem */
public abstract class C256393vh {
    public static ArrayList A01(Object... objArr) {
        ArrayList arrayList = new ArrayList(computeArrayListCapacity(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static ArrayList A00(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        ArrayList arrayList = new ArrayList();
        C11307SKv.A02(arrayList, it);
        return arrayList;
    }

    public static List A02(AnonymousClass2hV r1, List list) {
        if (list instanceof RandomAccess) {
            return new Lists$TransformingRandomAccessList(r1, list);
        }
        return new Lists$TransformingSequentialList(r1, list);
    }

    public static int computeArrayListCapacity(int i) {
        1J2.A00(i, "arraySize");
        return 1WJ.A02(((long) i) + 5 + ((long) (i / 10)));
    }
}
