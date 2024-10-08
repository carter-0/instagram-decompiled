package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HRf  reason: case insensitive filesystem */
public abstract class C54747HRf {
    public static final boolean A00(List list) {
        ArrayList arrayList;
        Object A0I;
        if (list.size() >= 2) {
            if (list.size() == 0 || list.size() == 1) {
                arrayList = 0sn.A00;
            } else {
                arrayList = AnonymousClass7TE.A1C();
                Object obj = list.get(0);
                int A06 = C51966G9m.A06(list);
                int i = 0;
                while (i < A06) {
                    i++;
                    Object obj2 = list.get(i);
                    AnonymousClass5SX r8 = (AnonymousClass5SX) obj2;
                    AnonymousClass5SX r9 = (AnonymousClass5SX) obj;
                    arrayList.add(C51975G9x.A0J(AnonymousClass7TE.A00(C289295dM.A01(r9.A03().A00()), C289295dM.A01(r8.A03().A00())), AnonymousClass7TE.A00(C289295dM.A02(r9.A03().A00()), C289295dM.A02(r8.A03().A00()))));
                    obj = obj2;
                }
            }
            if (arrayList.size() == 1) {
                A0I = 00k.A0I(arrayList);
            } else if (!arrayList.isEmpty()) {
                A0I = 00k.A0I(arrayList);
                int A062 = C51966G9m.A06(arrayList);
                if (1 <= A062) {
                    int i2 = 1;
                    while (true) {
                        A0I = C51965G9l.A0M(C289295dM.A07(((C289295dM) A0I).A00, ((C289295dM) arrayList.get(i2)).A00));
                        if (i2 == A062) {
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                throw AnonymousClass7TE.A1B(AnonymousClass000.A00(932));
            }
            long j = ((C289295dM) A0I).A00;
            if (C289295dM.A02(j) >= C289295dM.A01(j)) {
                return false;
            }
        }
        return true;
    }
}
