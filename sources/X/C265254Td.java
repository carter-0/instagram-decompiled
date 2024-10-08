package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.4Td  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C265254Td implements Comparator {
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return C7280Q2f.A00.A02(Collections.max(list, new C7260Q1j()), Collections.max(list2, new C7260Q1j()), new C7260Q1j()).A01(list.size(), list2.size()).A02(Collections.max(list, new C7261Q1k()), Collections.max(list2, new C7261Q1k()), new C7261Q1k()).A00();
    }
}
