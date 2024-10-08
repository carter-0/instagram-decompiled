package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7h5  reason: invalid class name and case insensitive filesystem */
public final class C337897h5 {
    public static final List A08 = new ArrayList();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C338367hq A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public static C337897h5 A00(C338367hq r6, Object obj, Object obj2, int i, int i2) {
        List list;
        List list2 = null;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        if (obj2 != null) {
            list2 = Collections.singletonList(obj2);
        }
        return new C337897h5(r6, (List) null, list, list2, i, i2, -1, 1);
    }

    public C337897h5(C338367hq r5, List list, List list2, List list3, int i, int i2, int i3, int i4) {
        List list4;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A04 = r5 == null ? C338347ho.A00() : r5;
        if (list == null) {
            this.A07 = A08;
        } else {
            int size = list.size();
            this.A07 = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = list.get(i5);
                List list5 = this.A07;
                if (obj == null) {
                    obj = C338347ho.A00();
                }
                list5.add(obj);
            }
        }
        List list6 = null;
        if (list2 != null) {
            list4 = Collections.unmodifiableList(list2);
        } else {
            list4 = null;
        }
        this.A06 = list4;
        this.A05 = list3 != null ? Collections.unmodifiableList(list3) : list6;
    }
}
