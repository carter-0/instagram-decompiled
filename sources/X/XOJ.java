package X;

import java.util.ArrayList;
import java.util.List;

public final class XOJ extends C22288Xyx {
    public final C256793wM AV7(C256793wM r30) {
        int i;
        C256793wM r14 = r30;
        if (r30 == null) {
            return null;
        }
        List<C256773wK> list = r14.A03;
        int i2 = 0;
        int i3 = 0;
        for (C256773wK r0 : list) {
            if (r0 != null && r0.A01 == 2) {
                i3++;
            }
        }
        if (i3 == 1) {
            return r14;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C256773wK r1 : list) {
            if (r1 == null || (i = r1.A01) != 2) {
                A1C.add(r1);
            } else {
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                int i4 = i2;
                for (C256733wG r2 : r1.A07) {
                    int i5 = r2.A02.A0A;
                    if (i5 > i2) {
                        A1C2.add(r2);
                        i4 = Math.max(i4, i5);
                    }
                }
                if (!A1C2.isEmpty()) {
                    int i6 = r1.A00;
                    List list2 = r1.A05;
                    List list3 = r1.A06;
                    List list4 = r1.A08;
                    String str = r1.A03;
                    String str2 = r1.A04;
                    String str3 = r1.A02;
                    List list5 = list3;
                    List list6 = list4;
                    ArrayList arrayList = A1C2;
                    List list7 = list2;
                    String str4 = str2;
                    String str5 = str3;
                    String str6 = str;
                    A1C.add(new C256773wK(str6, str4, str5, arrayList, list7, list5, list6, i6, i, r1.A09, r1.A0A));
                }
                i2 = i4;
            }
        }
        return new C256793wM(r14.A00, r14.A02, C22288Xyx.A00(A1C));
    }
}
