package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class OR3 {
    /* JADX WARNING: type inference failed for: r13v0, types: [X.Gyv, X.Nfc] */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.5ot, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v30, types: [java.lang.Object, X.5oq] */
    public static C69153Nfc parseFromJson(16F r28) {
        ArrayList arrayList;
        Integer num;
        ArrayList arrayList2;
        16F r3 = r28;
        0qQ.A0B(r3, 0);
        try {
            ? gyv = new C54072Gyv();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("has_more".equals(A17)) {
                    gyv.A04 = r3.A0d();
                } else if ("page_index".equals(A17)) {
                    gyv.A00 = AnonymousClass7TF.A0X(r3);
                } else {
                    ArrayList arrayList3 = null;
                    if ("rank_token".equals(A17)) {
                        gyv.A01 = AnonymousClass7TG.A0l(r3);
                    } else if ("reels_max_id".equals(A17)) {
                        gyv.A02 = AnonymousClass7TG.A0l(r3);
                    } else if ("reels_serp_modules".equals(A17)) {
                        if (r3.A11() == 16L.A0C) {
                            arrayList3 = AnonymousClass7TE.A1C();
                            while (r3.A1J() != 16L.A08) {
                                C70592OCp parseFromJson = O2V.parseFromJson(r3);
                                if (parseFromJson != null) {
                                    arrayList3.add(parseFromJson);
                                }
                            }
                        }
                        gyv.A03 = arrayList3;
                    } else {
                        C55140Hco.A00(r3, gyv, A17);
                    }
                }
                r3.A0z();
            }
            List list = gyv.A03;
            String str = gyv.A02;
            boolean z = gyv.A04;
            if (list != null) {
                ArrayList<C70592OCp> A1C = AnonymousClass7TE.A1C();
                for (Object next : list) {
                    JTR.A1P(((C70592OCp) next).A00, "clips", next, A1C);
                }
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                for (C70592OCp oCp : A1C) {
                    0sn r0 = oCp.A01;
                    if (r0 == null) {
                        r0 = 0sn.A00;
                    }
                    018.A16(r0, A1C2);
                }
                ArrayList A0Q = 00k.A0Q(A1C2, 3);
                arrayList = AnonymousClass7TF.A0p(A0Q);
                Iterator it = A0Q.iterator();
                while (it.hasNext()) {
                    List<C276014sL> list2 = (List) it.next();
                    ArrayList A0p = AnonymousClass7TF.A0p(list2);
                    for (C276014sL r02 : list2) {
                        C295825oy r32 = new C295825oy();
                        r32.A00 = 0;
                        1Xj r1 = r02.A00;
                        String A0R = 002.A0R("clips-", r1.getId());
                        0qQ.A0B(A0R, 0);
                        r32.A0A = A0R;
                        C292525j6 r03 = C292525j6.NO_DESIGN;
                        0qQ.A0B(r03, 0);
                        r32.A06 = r03;
                        C298855u9 A00 = C276114sa.A00.A00(z);
                        A00.A00 = str;
                        r32.A03 = A00.A00();
                        C292535j7 r04 = C292535j7.MINOR;
                        0qQ.A0B(r04, 0);
                        r32.A07 = r04;
                        ArrayList A1M = 0sr.A1M(new C276014sL[]{new C276014sL(r1, (Integer) null)});
                        0qQ.A0B(A1M, 0);
                        r32.A0E = A1M;
                        C295795ov r05 = new C295795ov(C295805ow.CLIPS, r32, (C298795u2) null, (1Xj) null);
                        r05.A01();
                        A0p.add(r05);
                    }
                    ? obj = new Object();
                    obj.A03 = null;
                    obj.A0D = null;
                    obj.A0E = A0p;
                    obj.A04 = null;
                    obj.A0G = null;
                    obj.A08 = null;
                    obj.A0A = null;
                    obj.A09 = null;
                    obj.A05 = null;
                    obj.A06 = null;
                    obj.A01 = null;
                    obj.A02 = null;
                    obj.A0F = null;
                    obj.A0H = null;
                    obj.A0B = null;
                    obj.A07 = null;
                    obj.A00 = null;
                    obj.A0C = null;
                    C298685tr r2 = C70388O4p.A00;
                    C295755or r12 = C295755or.DYNAMIC_GRID;
                    ? obj2 = new Object();
                    obj2.A01 = obj;
                    obj2.A00 = r2;
                    obj2.A02 = r12;
                    arrayList.add(obj2);
                }
            } else {
                arrayList = 0sn.A00;
            }
            if (AnonymousClass7TE.A1b(arrayList)) {
                C55853Hoa hoa = new C55853Hoa();
                String str2 = gyv.A02;
                hoa.A02 = str2;
                hoa.A06 = gyv.A04;
                hoa.A03 = gyv.A01;
                hoa.A00 = str2;
                hoa.A04 = String.valueOf(gyv.A00);
                hoa.A01 = String.valueOf(gyv.A04);
                hoa.A05 = arrayList;
                gyv.A02 = hoa;
            }
            N3M n3m = gyv.A01;
            if (n3m == null || (num = n3m.A01) == null || num.intValue() != 1) {
                return gyv;
            }
            boolean z2 = n3m.A0D;
            String str3 = n3m.A02;
            String str4 = n3m.A03;
            String str5 = n3m.A04;
            String str6 = n3m.A05;
            String str7 = n3m.A06;
            Boolean bool = n3m.A00;
            List<C21018X9v> list3 = n3m.A0A;
            String str8 = n3m.A07;
            List<X9z> list4 = n3m.A0B;
            List list5 = n3m.A0C;
            String str9 = n3m.A08;
            String str10 = n3m.A09;
            ArrayList arrayList4 = null;
            new 1E9(new 1hu((UserSession) null), 6, false);
            if (list3 != null) {
                arrayList2 = AnonymousClass7TF.A0p(list3);
                for (C21018X9v x9v : list3) {
                    arrayList2.add((UNB) x9v);
                }
            } else {
                arrayList2 = null;
            }
            if (list4 != null) {
                arrayList4 = AnonymousClass7TF.A0p(list4);
                for (X9z x9z : list4) {
                    arrayList4.add((UNP) x9z);
                }
            }
            Boolean bool2 = bool;
            gyv.A01 = new N3M(bool2, 0, str3, str4, str5, str6, str7, str8, str9, str10, arrayList2, arrayList4, list5, z2);
            return gyv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
