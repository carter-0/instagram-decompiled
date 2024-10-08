package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class PSC implements 1aV {
    public final /* synthetic */ C72204OyU A00;

    public PSC(C72204OyU oyU) {
        this.A00 = oyU;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        int i;
        1iA r1;
        1Xj A02;
        ExtendedImageUrl A1m;
        String str;
        1Xj A022;
        String id;
        2Kb r3 = (2Kb) obj;
        0qQ.A0B(r3, 0);
        C72204OyU oyU = this.A00;
        C254793t3 A023 = C72204OyU.A02(r3, oyU);
        if (A023 != null) {
            List list = r3.A02;
            if (list != null && AnonymousClass7TE.A1b(list)) {
                LinkedList<C71039Oa5> A03 = C72204OyU.A03(oyU, A023, list);
                if (AnonymousClass7TE.A1b(A03)) {
                    C72204OyU.A07(oyU, A023, A03);
                    Integer num = oyU.A00;
                    if (num != null) {
                        int intValue = num.intValue();
                        AnonymousClass3U9 B33 = oyU.A06.B33(C327647Bq.A00(C300965yF.A01(A023)));
                        C300915yA r4 = new C300915yA(oyU.A04);
                        for (C71039Oa5 oa5 : A03) {
                            if (B33 != null) {
                                i = B33.C6a();
                            } else {
                                i = 0;
                            }
                            0qQ.A0B(oa5, 0);
                            if ((A023 instanceof C254773t1) && AnonymousClass48O.A05(i)) {
                                1Xj A024 = oa5.A02();
                                if (A024 != null) {
                                    r1 = A024.BR7();
                                } else {
                                    r1 = null;
                                }
                                if (!(r1 != 1iA.A0Q || !C300915yA.A01(r4, oa5.A01(), 0qQ.A0K(oa5.A03(), true)) || (A02 = oa5.A02()) == null || (A1m = A02.A1m(intValue)) == null || (str = A1m.A0A) == null || (A022 = oa5.A02()) == null || (id = A022.getId()) == null)) {
                                    C300915yA.A00(r4, new C60958JuG(A023, (Long) null, oa5.A05(), id, (String) null, C51966G9m.A1W(r4.A01, oa5.A07()) ^ true ? 1 : 0, 0qQ.A0K(oa5.A03(), true), false), (Integer) null, str);
                                }
                            }
                        }
                    }
                }
            }
            List list2 = r3.A04;
            if (list2 != null && AnonymousClass7TE.A1b(list2)) {
                LinkedList A032 = C72204OyU.A03(oyU, A023, list2);
                if (AnonymousClass7TE.A1b(A032)) {
                    C72204OyU.A07(oyU, A023, A032);
                }
            }
            ArrayList A002 = r3.A00();
            if (A002 != null && DbT.A1b(A002)) {
                C72204OyU.A06(oyU, A023, A002);
            }
        }
    }
}
