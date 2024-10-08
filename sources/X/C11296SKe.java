package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SKe  reason: case insensitive filesystem */
public abstract class C11296SKe {
    public static final List A00(Object obj, List list, 0sP r8, 0sL r9) {
        ArrayList A1D = AnonymousClass7TE.A1D(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C51971G9r.A1a(next, r8)) {
                if (next != null) {
                    Iterator it2 = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (!AnonymousClass7TE.A1a(r9.invoke(it2.next(), next))) {
                            i++;
                        } else if (i != -1) {
                            A1D.set(i, obj);
                        }
                    }
                    throw DbT.A0m();
                }
            }
        }
        return 00k.A0a(A1D);
    }

    public static final List A01(Object obj, List list, 0sL r7) {
        ArrayList A1D = AnonymousClass7TE.A1D(list);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!AnonymousClass7TE.A1a(r7.invoke(it.next(), obj))) {
                i++;
            } else if (i != -1) {
                A1D.remove(i);
            }
        }
        return 00k.A0a(A1D);
    }

    public static final List A02(Object obj, List list, 0sL r7, int i) {
        ArrayList A1D = AnonymousClass7TE.A1D(list);
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (AnonymousClass7TE.A1a(r7.invoke(it.next(), obj))) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i > list.size()) {
            i = 0;
        }
        if (i2 != -1) {
            A1D.set(i2, obj);
        } else {
            A1D.add(i, obj);
        }
        return 00k.A0a(A1D);
    }
}
