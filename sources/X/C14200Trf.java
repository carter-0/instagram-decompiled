package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Trf  reason: case insensitive filesystem */
public final class C14200Trf implements C74365Ptf {
    public int A00;
    public C14198Trd A01 = C14448TwW.A00();
    public final int A02;
    public final X8a A03;
    public final C337287g2 A04 = new AnonymousClass9PD();
    public final C337287g2 A05;
    public final boolean A06;
    public final XAB A07;
    public final X4Z A08;
    public final C20910X4b A09;

    public final String A02(C15050ULg uLg) {
        0qQ.A0B(uLg, 0);
        AnonymousClass9P5 BiW = this.A05.BiW(uLg);
        List list = BiW.A06;
        String str = BiW.A04;
        if (list == null || str == null) {
            return "";
        }
        return str;
    }

    public final String A03(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass9P5 BiX = this.A05.BiX(str);
        List list = BiX.A06;
        String str2 = BiX.A04;
        if (list == null || str2 == null) {
            return "";
        }
        return str2;
    }

    private final ArrayList A00(String str) {
        ArrayList arrayList = new ArrayList();
        int size = this.A01.A00.size();
        for (int i = 0; i < size; i++) {
            Object obj = this.A01.A00.get(i);
            Object obj2 = this.A01.A01.get(i);
            if (obj instanceof C66942Mfb) {
                C66942Mfb mfb = (C66942Mfb) obj;
                0qQ.A0C(obj2, C66579MXk.A00(17));
                C66967Mg0 mg0 = (C66967Mg0) obj2;
                if (mfb.A05(str) && this.A07.EsP(mfb, obj2) && !0qQ.A0K(mg0.A09, "bootstrap") && !(obj instanceof C69159Nfi)) {
                    arrayList.add(mfb);
                }
                if (arrayList.size() >= this.A00) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public static final List A01(C14200Trf trf, String str) {
        C337287g2 r1 = trf.A05;
        if (!(r1 instanceof AnonymousClass9PD)) {
            return new ArrayList();
        }
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.search.common.typeahead.manager.EndpointTypeaheadCache<*>");
        0qQ.A0B(str, 0);
        Map map = (Map) ((AnonymousClass9PD) r1).A00.get(str);
        if (map != null) {
            return 00k.A0a(map.keySet());
        }
        return 0sn.A00;
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [X.V3n, java.lang.Object] */
    public final void A04() {
        ArrayList arrayList;
        ArrayList A0U;
        C14198Trd E3A;
        ArrayList arrayList2;
        List list;
        if (this.A08.CYJ()) {
            E3A = this.A03.E39();
        } else {
            String E4p = this.A09.E4p();
            if (this.A06) {
                List<String> A012 = A01(this, E4p);
                ArrayList arrayList3 = new ArrayList();
                for (String uLg : A012) {
                    C15050ULg uLg2 = new C15050ULg(E4p, uLg, 8);
                    AnonymousClass9P5 BiW = this.A05.BiW(uLg2);
                    Integer num = BiW.A01;
                    List list2 = BiW.A06;
                    if ((num == AnonymousClass05K.A0C || num == AnonymousClass05K.A01) && list2 != null) {
                        arrayList2 = new ArrayList(list2);
                    } else {
                        arrayList2 = new ArrayList();
                    }
                    if (this.A00 <= 0) {
                        list = new ArrayList();
                    } else {
                        C337287g2 r1 = this.A04;
                        list = r1.BiW(uLg2).A06;
                        if (list == null) {
                            list = A00(uLg2.A01);
                            r1.A9x(uLg2, (String) null, list);
                        }
                    }
                    String A022 = A02(uLg2);
                    ? obj = new Object();
                    obj.A02 = arrayList2;
                    obj.A01 = list;
                    obj.A00 = A022;
                    arrayList3.add(obj);
                }
                E3A = this.A03.E38(E4p, arrayList3);
            } else {
                AnonymousClass9P5 BiX = this.A05.BiX(E4p);
                Integer num2 = BiX.A01;
                List list3 = BiX.A06;
                if ((num2 == AnonymousClass05K.A0C || num2 == AnonymousClass05K.A01) && list3 != null) {
                    arrayList = new ArrayList(list3);
                } else {
                    arrayList = new ArrayList();
                }
                if (this.A00 <= 0) {
                    A0U = new ArrayList();
                } else {
                    C337287g2 r2 = this.A04;
                    List list4 = r2.BiX(E4p).A06;
                    if (list4 == null) {
                        list4 = A00(E4p);
                        r2.A9z(E4p, (String) null, list4);
                    }
                    A0U = 00k.A0U(list4);
                }
                E3A = this.A03.E3A(E4p, A03(E4p), arrayList, A0U);
            }
        }
        this.A01 = E3A;
    }

    public final C14198Trd B1u() {
        return this.A01;
    }

    public C14200Trf(XAB xab, X4Z x4z, C20910X4b x4b, X8a x8a, C337287g2 r6, int i, boolean z) {
        C51974G9v.A1P(r6, x4b, x4z, x8a);
        0qQ.A0B(xab, 5);
        this.A05 = r6;
        this.A09 = x4b;
        this.A08 = x4z;
        this.A03 = x8a;
        this.A07 = xab;
        this.A06 = z;
        this.A02 = i;
        this.A00 = i;
    }
}
