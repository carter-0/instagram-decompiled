package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class JZW {
    public static final void A03(C65211bM r1, 1Xj r2) {
        ArrayList arrayList;
        0qQ.A0B(r2, 1);
        List A14 = JTO.A14(r2);
        if (A14 != null) {
            arrayList = 00k.A0T(r1, A14);
        } else {
            arrayList = 0sn.A00;
        }
        r2.A0C.EmH(arrayList);
    }

    public static final void A05(1Xj r8, String str, int i) {
        ArrayList arrayList;
        Object obj;
        0qQ.A0B(str, 1);
        List A14 = JTO.A14(r8);
        if (A14 != null) {
            Iterator it = A14.iterator();
            while (true) {
                arrayList = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (JTT.A1b(obj, str)) {
                    break;
                }
            }
            C65211bM r7 = (C65211bM) obj;
            if (r7 != null) {
                new 1E9(new 1hu((UserSession) null), 6, false);
                Integer valueOf = Integer.valueOf(i);
                new 1E9(new 1hu((UserSession) null), 6, false);
                C65211bM A00 = B4F.A00(r7, DDf.A01((Boolean) null, valueOf));
                if (A00 != null) {
                    List A142 = JTO.A14(r8);
                    if (A142 != null) {
                        arrayList = AnonymousClass7TE.A1D(A142);
                        List A143 = JTO.A14(r8);
                        int i2 = -1;
                        if (A143 != null) {
                            int i3 = 0;
                            Iterator it2 = A143.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (JTT.A1b(it2.next(), str)) {
                                    i2 = i3;
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        arrayList.set(i2, A00);
                    }
                    r8.A0C.EmH(arrayList);
                }
            }
        }
    }

    public static final void A06(1Xj r8, String str, boolean z) {
        ArrayList arrayList;
        Object obj;
        0qQ.A0B(str, 1);
        List A14 = JTO.A14(r8);
        if (A14 != null) {
            Iterator it = A14.iterator();
            while (true) {
                arrayList = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (JTT.A1b(obj, str)) {
                    break;
                }
            }
            C65211bM r7 = (C65211bM) obj;
            if (r7 != null) {
                new 1E9(new 1hu((UserSession) null), 6, false);
                Boolean valueOf = Boolean.valueOf(z);
                new 1E9(new 1hu((UserSession) null), 6, false);
                C65211bM A00 = B4F.A00(r7, DDf.A01(valueOf, (Integer) null));
                if (A00 != null) {
                    List A142 = JTO.A14(r8);
                    if (A142 != null) {
                        arrayList = AnonymousClass7TE.A1D(A142);
                        List A143 = JTO.A14(r8);
                        int i = -1;
                        if (A143 != null) {
                            int i2 = 0;
                            Iterator it2 = A143.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (JTT.A1b(it2.next(), str)) {
                                    i = i2;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        arrayList.set(i, A00);
                    }
                    r8.A0C.EmH(arrayList);
                }
            }
        }
    }

    public static final List A00(List list) {
        if (list == null) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            C65211bM r2 = (C65211bM) next;
            if (r2.CQf() != null && 0qQ.A0K(r2.CQf(), false)) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public static final Map A01(List list) {
        LinkedHashMap A0x = DbS.A0x(JTT.A08(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C65211bM r0 = (C65211bM) it.next();
            A0x.put(r0.getPk(), r0.ApI());
        }
        return 0Yt.A0B(A0x);
    }

    public static final Map A02(List list) {
        LinkedHashMap A0x = DbS.A0x(JTT.A08(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C65211bM r0 = (C65211bM) it.next();
            A0x.put(r0.getPk(), r0.BBU());
        }
        return 0Yt.A0B(A0x);
    }

    public static final void A04(1Xj r4, String str) {
        ArrayList arrayList;
        List A14 = JTO.A14(r4);
        if (A14 != null) {
            ArrayList A1D = AnonymousClass7TE.A1D(A14);
            arrayList = AnonymousClass7TE.A1C();
            Iterator it = A1D.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                JTR.A1Q(str, ((C65211bM) next).getPk(), next, arrayList);
            }
        } else {
            arrayList = null;
        }
        r4.A0C.EmH(arrayList);
    }
}
