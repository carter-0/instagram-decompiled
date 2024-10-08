package X;

import java.util.ArrayList;
import java.util.List;

public final class XOK extends C22288Xyx {
    public final boolean A00;

    public final C256793wM AV7(C256793wM r30) {
        int i;
        C256793wM r14 = r30;
        if (r30 == null) {
            return null;
        }
        List<C256773wK> list = r14.A03;
        int i2 = 0;
        for (C256773wK r1 : list) {
            if (r1 != null && r1.A01 == 2) {
                i2 = r1.A00;
            }
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C256773wK r12 : list) {
            if (r12 == null || (i = r12.A01) != 2) {
                A1C.add(r12);
            } else {
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                for (C256733wG r2 : r12.A07) {
                    if ((i2 == r12.A00 && !this.A00) || !r2.A02.A0N.A09) {
                        A1C2.add(r2);
                    }
                }
                if (!A1C2.isEmpty()) {
                    int i3 = r12.A00;
                    List list2 = r12.A05;
                    List list3 = r12.A06;
                    List list4 = r12.A08;
                    String str = r12.A03;
                    String str2 = r12.A04;
                    String str3 = r12.A02;
                    List list5 = list3;
                    List list6 = list4;
                    ArrayList arrayList = A1C2;
                    List list7 = list2;
                    String str4 = str2;
                    String str5 = str3;
                    String str6 = str;
                    A1C.add(new C256773wK(str6, str4, str5, arrayList, list7, list5, list6, i3, i, r12.A09, r12.A0A));
                }
            }
        }
        return new C256793wM(r14.A00, r14.A02, C22288Xyx.A00(A1C));
    }

    public XOK(boolean z) {
        this.A00 = z;
    }

    public XOK() {
        this(true);
    }
}
