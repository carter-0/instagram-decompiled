package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.948  reason: invalid class name */
public abstract class AnonymousClass948 {
    public static final List A00;
    public static final List A01;

    static {
        ImmutableList A002 = C49155EqM.A00();
        ArrayList arrayList = new ArrayList(0Yv.A1E(A002, 10));
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            arrayList.add(((1QK) it.next()).A05);
        }
        A00 = arrayList;
        ImmutableList A003 = C49155EqM.A00();
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(A003, 10));
        Iterator it2 = A003.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((1QK) it2.next()).A06);
        }
        A01 = arrayList2;
    }
}
