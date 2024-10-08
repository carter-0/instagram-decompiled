package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Oyl  reason: case insensitive filesystem */
public final class C72217Oyl implements 1NU {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C72217Oyl(C72201OyQ oyQ, String str, int i) {
        this.A00 = i;
        this.A01 = oyQ;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        String str;
        String str2;
        String str3;
        1GK r15 = (1GK) obj;
        if (this.A00 != 0) {
            0qQ.A0B(r15, 0);
            if (r15.A0B() || r15.A0D()) {
                Exception A06 = r15.A06();
                if (A06 == null) {
                    A06 = new Exception("Render cancelled");
                }
                OO2 oo2 = ((C72201OyQ) this.A01).A07;
                String str4 = this.A02;
                oo2.A02.A00(str4);
                C71033OZu oZu = oo2.A01;
                oZu.A03(str4, "render_failure_reason", A06.getMessage());
                oZu.A04(str4, 3);
                throw A06;
            }
            Object A07 = r15.A07();
            if (A07 != null) {
                List list = (List) A07;
                OO2 oo22 = ((C72201OyQ) this.A01).A07;
                String str5 = this.A02;
                0qQ.A0B(list, 1);
                C71033OZu oZu2 = oo22.A01;
                oZu2.A02(str5, "render_end");
                ArrayList A0p = AnonymousClass7TF.A0p(list);
                for (Object next : list) {
                    if (next instanceof C68978Nc9) {
                        str3 = "replace_message";
                    } else if (next instanceof C68979NcA) {
                        str3 = "remove_message";
                    } else if (next instanceof C68980NcB) {
                        str3 = "noop";
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                    A0p.add(str3);
                }
                String[] A1b = DbU.A1b(A0p, 0);
                0qQ.A0B(A1b, 2);
                if (C71033OZu.A01(oZu2, str5)) {
                    oZu2.A00.markerAnnotate(724174487, C71033OZu.A00(oZu2, str5), "render_results", A1b);
                }
                ArrayList<C68981NcC> A1C = AnonymousClass7TE.A1C();
                for (Object next2 : list) {
                    if (next2 instanceof C68981NcC) {
                        A1C.add(next2);
                    }
                }
                ArrayList<C68980NcB> A1C2 = AnonymousClass7TE.A1C();
                for (Object next3 : list) {
                    if (next3 instanceof C68980NcB) {
                        A1C2.add(next3);
                    }
                }
                if ((list.size() - A1C.size()) - A1C2.size() == 0) {
                    for (C68981NcC ncC : A1C) {
                        C70768OKo oKo = oo22.A03;
                        boolean z = ncC instanceof C68979NcA;
                        if (z) {
                            str = ((C68979NcA) ncC).A02;
                        } else {
                            str = ncC.A01;
                        }
                        if (z) {
                            str2 = ((C68979NcA) ncC).A01;
                        } else {
                            str2 = ncC.A00;
                        }
                        synchronized (oKo) {
                            0qQ.A0B(str2, 2);
                            if (str != null) {
                                Map map = oKo.A01;
                                Object obj2 = map.get(str);
                                if (obj2 == null) {
                                    obj2 = DbS.A0y();
                                    map.put(str, obj2);
                                }
                                ((Set) obj2).add(str5);
                            }
                            Map map2 = oKo.A00;
                            Object obj3 = map2.get(str2);
                            if (obj3 == null) {
                                obj3 = DbS.A0y();
                                map2.put(str2, obj3);
                            }
                            ((Set) obj3).add(str5);
                            Map map3 = oKo.A02;
                            Object obj4 = map3.get(str5);
                            if (obj4 == null) {
                                obj4 = new AtomicInteger(0);
                                map3.put(str5, obj4);
                            }
                            ((AtomicInteger) obj4).incrementAndGet();
                        }
                    }
                    ArrayList A0p2 = AnonymousClass7TF.A0p(A1C2);
                    for (C68980NcB ncB : A1C2) {
                        A0p2.add(ncB.A00);
                    }
                    String[] A1b2 = DbU.A1b(A0p2, 0);
                    0qQ.A0B(A1b2, 2);
                    if (C71033OZu.A01(oZu2, str5)) {
                        oZu2.A00.markerAnnotate(724174487, C71033OZu.A00(oZu2, str5), "render_noop_reasons", A1b2);
                    }
                    List<Object> A1P = 0sr.A1P(new Boolean[]{false, true});
                    if (!(A1P instanceof Collection) || !A1P.isEmpty()) {
                        for (Object A1a : A1P) {
                            if (!AnonymousClass7TE.A1a(A1a)) {
                                return list;
                            }
                        }
                    }
                    oZu2.A04(str5, 2);
                    return list;
                }
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Encountered unexpected operation types: ");
                throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(00k.A0e(00k.A0e(list, 00k.A0k(A1C)), 00k.A0k(A1C2)), A1A));
            }
            throw AnonymousClass7TE.A0y();
        }
        0qQ.A0B(r15, 0);
        if (!r15.A0B() && !r15.A0D()) {
            Object A072 = r15.A07();
            if (A072 != null) {
                C72201OyQ.A02((C72201OyQ) this.A01, this.A02, (List) A072, 0);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return C60340gF.A00;
    }
}
