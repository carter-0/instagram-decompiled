package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9C5  reason: invalid class name */
public final class AnonymousClass9C5 extends AnonymousClass9C4 {
    public static final Class A00 = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public static List A00(Object obj, int i, long j) {
        AbstractList r1;
        List list = (List) AnonymousClass9CA.A01.A06(obj, j);
        if (list.isEmpty()) {
            if (list instanceof C41844B3l) {
                C41844B3l b3l = C384009gc.A01;
                list = new C384009gc(new ArrayList(i));
            } else {
                list = new ArrayList(i);
            }
            AnonymousClass9CA.A05(obj, j, list);
        } else {
            if (A00.isAssignableFrom(list.getClass())) {
                r1 = new ArrayList(list.size() + i);
            } else if (list instanceof C13254TRu) {
                C41844B3l b3l2 = C384009gc.A01;
                r1 = new C384009gc(new ArrayList(list.size() + i));
            }
            r1.addAll(list);
            AnonymousClass9CA.A05(obj, j, r1);
            return r1;
        }
        return list;
    }
}
