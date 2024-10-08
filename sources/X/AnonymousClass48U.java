package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: X.48U  reason: invalid class name */
public final class AnonymousClass48U {
    public static final C2610448a A00 = new C2610448a(AnonymousClass48Y.A00, AnonymousClass48V.A00);
    public static final Comparator A01 = C2610948f.A00;
    public static final Comparator A02 = C2610648c.A00;
    public static final Comparator A03 = C2610748d.A00;
    public static final Comparator A04 = C2611048g.A00;
    public static final Comparator A05 = C2610848e.A00;

    public static final String A05(String str, List list) {
        if (list != null && !list.isEmpty()) {
            String A0g = ((C254703su) list.get(0)).A0g();
            if (str == null || (A0g != null && A02.compare(str, A0g) >= 0)) {
                return A0g;
            }
        }
        return str;
    }

    public static final boolean A08(C370878xD r4, C370548we r5) {
        List list;
        if (r4 == null) {
            return false;
        }
        C370538wd r52 = (C370538wd) r5;
        String str = r52.A06;
        String str2 = r4.A00;
        String A042 = A04(str, str2);
        if (!r4.A03 || !0qQ.A0K(str2, A042) || (list = r52.A07) == null || !(!list.isEmpty())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A09(java.lang.String r5, java.util.List r6) {
        /*
            r4 = 0
            X.0qQ.A0B(r6, r4)
            r3 = 1
            X.0qQ.A0B(r5, r3)
            java.util.Iterator r2 = r6.iterator()
        L_0x000c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r1 = r2.next()
            X.3su r1 = (X.C254703su) r1
            java.lang.String r0 = r1.A0g()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = r1.A0f()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000c
        L_0x002c:
            r2.remove()
            return r3
        L_0x0030:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48U.A09(java.lang.String, java.util.List):boolean");
    }

    public static final int A00(String str, List list) {
        if ("MINCURSOR".equals(str)) {
            return -1;
        }
        if ("MAXCURSOR".equals(str)) {
            return list.size() ^ -1;
        }
        C254703su r1 = new C254703su();
        r1.A1E(str);
        return Collections.binarySearch(list, r1, A04);
    }

    public static final int A01(String str, List list) {
        if (str == null) {
            return 0;
        }
        int A002 = A00(str, list);
        int i = A002 ^ -1;
        if (A002 >= 0) {
            return A002 + 1;
        }
        return i;
    }

    public static final C2611148h A02(NHP nhp) {
        boolean z;
        String str = nhp.A03;
        String str2 = nhp.A02;
        AnonymousClass48V r3 = AnonymousClass48V.A00;
        boolean z2 = false;
        if (str != null) {
            z2 = true;
        }
        String A012 = AnonymousClass48V.A01(str, z2, true);
        Boolean bool = nhp.A01;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return new C2611148h(r3, A012, AnonymousClass48V.A00(str2, z));
    }

    public static final String A04(String str, String str2) {
        if (str == null || (str2 != null && A02.compare(str, str2) <= 0)) {
            return str2;
        }
        return str;
    }

    public static final void A07(C45409Cvp cvp, C254703su r3, List list, int i) {
        if (!(r3 == null || r3.A0g() == null || r3.A1j == null)) {
            String A0g = r3.A0g();
            String str = "";
            if (A0g == null) {
                A0g = str;
            }
            cvp.A02 = A0g;
            String str2 = r3.A1j;
            if (str2 != null) {
                str = str2;
            }
            cvp.A03 = str;
        }
        cvp.A00 = i;
        list.add(cvp);
    }

    public static final String A03(C370878xD r3, C370548we r4) {
        String str;
        boolean CKJ = r4.CKJ();
        if (CKJ || r3.A03) {
            String str2 = null;
            if (CKJ) {
                str = ((C370538wd) r4).A06;
            } else {
                str = null;
            }
            if (r3.A03) {
                str2 = r3.A00;
            }
            return A04(str, str2);
        }
        String str3 = ((C370538wd) r4).A06;
        String str4 = r3.A00;
        if (str3 == null || (str4 != null && A02.compare(str3, str4) >= 0)) {
            return str4;
        }
        return str3;
    }

    public static final String A06(Map map) {
        AnonymousClass9JD r0;
        String str;
        Collection<AnonymousClass3SZ> values = map.values();
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass3SZ r02 : values) {
            if (!(r02 == null || (r0 = r02.A01) == null || (str = r0.A02) == null)) {
                arrayList.add(str);
            }
        }
        return (String) 00k.A06(arrayList);
    }
}
