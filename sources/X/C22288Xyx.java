package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Xyx  reason: case insensitive filesystem */
public abstract class C22288Xyx implements Y9U {
    public static final ArrayList A00(List list) {
        int i;
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C256773wK r1 = (C256773wK) it.next();
            if (r1 != null && r1.A01 == 2) {
                A1F.add(Integer.toString(r1.A00));
            }
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C256773wK r12 = (C256773wK) it2.next();
            if (r12 == null || (i = r12.A01) != 2) {
                A1C.add(r12);
            } else {
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                for (C256533vv r2 : r12.A08) {
                    if (r2 != null && A1F.contains(r2.A02)) {
                        A1C2.add(r2);
                    }
                }
                int i2 = r12.A00;
                List list2 = r12.A07;
                List list3 = r12.A05;
                List list4 = r12.A06;
                String str = r12.A03;
                String str2 = r12.A04;
                String str3 = r12.A02;
                ArrayList arrayList = A1C2;
                List list5 = list4;
                List list6 = list3;
                List list7 = list2;
                String str4 = str3;
                String str5 = str2;
                String str6 = str;
                A1C.add(new C256773wK(str6, str5, str4, list7, list6, list5, arrayList, i2, i, r12.A09, r12.A0A));
            }
        }
        return A1C;
    }
}
