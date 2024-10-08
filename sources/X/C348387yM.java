package X;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7yM  reason: invalid class name and case insensitive filesystem */
public final class C348387yM {
    public final SparseArray A00;

    public C348387yM(AnonymousClass87G r5, List list, List list2, List list3) {
        List list4;
        0qQ.A0B(list2, 4);
        SparseArray sparseArray = new SparseArray();
        this.A00 = sparseArray;
        if (r5 != null) {
            list4 = Collections.singletonList(r5);
            0qQ.A07(list4);
        } else {
            list4 = 0sn.A00;
        }
        sparseArray.put(0, list4);
        sparseArray.put(4, 0sn.A00);
        sparseArray.put(1, list);
        sparseArray.put(2, list2);
        sparseArray.put(3, list3);
    }
}
