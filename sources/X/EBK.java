package X;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class EBK extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C270074g9 A01;
    public final /* synthetic */ C309426Yf A02;
    public final /* synthetic */ C67602Mqa A03;

    public EBK(C270074g9 r1, C309426Yf r2, C67602Mqa mqa, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = mqa;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list;
        int i;
        C255773uh r0;
        C270074g9 r1;
        Object remove;
        C270074g9 r02;
        int A032 = AnonymousClass0fD.A03(219000891);
        int A033 = AnonymousClass0fD.A03(-1513859514);
        C45236Csr csr = ((CFQ) obj).A00;
        if (!(csr == null || (list = csr.A00) == null)) {
            C309426Yf r8 = this.A02;
            if (r8.A11) {
                C270074g9 r7 = this.A01;
                List A012 = r7.A01();
                List list2 = (List) A012.stream().map(new C51568FwI(2)).collect(Collectors.toList());
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C306876Nw r12 = (C306876Nw) list.get(i2);
                    if (!list2.contains(r12.A02.getId())) {
                        A012.add(r12);
                    }
                }
                r7.A02(A012);
                C67602Mqa mqa = this.A03;
                AnonymousClass6N0 r6 = mqa.A0V;
                C250973mM r5 = mqa.A07;
                if (r5 != null) {
                    C306866Nv[] A04 = r6.A04();
                    int length = A04.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        } else if (A04[i3].A05.getVisibility() == 4) {
                            C309426Yf r03 = r6.A09;
                            if (!(r03 == null || (i = r03.A0M) == 0)) {
                                C255773uh r04 = r6.A08;
                                ArrayList arrayList = null;
                                if (!(r04 == null || (r02 = r04.A09) == null)) {
                                    arrayList = AnonymousClass7TE.A1D(r02.A01());
                                }
                                for (int i4 = 0; i4 < i; i4++) {
                                    if (!(arrayList == null || (remove = arrayList.remove(i4)) == null)) {
                                        arrayList.add(i + i4 + 1, remove);
                                    }
                                }
                                C309426Yf r05 = r6.A09;
                                if (r05 != null) {
                                    r05.A0M = 0;
                                }
                                if (!(arrayList == null || (r0 = r6.A08) == null || (r1 = r0.A09) == null)) {
                                    r1.A02(00k.A0a(arrayList));
                                }
                            }
                            C306846Nt.A01.A04(r5, r6, false);
                        } else {
                            i3++;
                        }
                    }
                }
                C306896Ny.A03(r7, r8);
            } else if (list.size() > this.A00) {
                this.A01.A02(list);
            }
        }
        AnonymousClass0fD.A0A(304939277, A033);
        AnonymousClass0fD.A0A(2012479806, A032);
    }
}
