package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GhV  reason: case insensitive filesystem */
public final class C53039GhV extends 2YL {
    public int A00;
    public final UserSession A01;
    public final C57093IOh A02;
    public final String A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;

    public final void A04(UserSession userSession, 1Xj r15) {
        Object value;
        GMQ gmq;
        0qQ.A0B(userSession, 1);
        05G r2 = this.A04;
        ArrayList A0U = 00k.A0U((Collection) ((GMQ) r2.getValue()).A06);
        LinkedHashMap A032 = 0Yt.A03((Map) ((GMQ) r2.getValue()).A07);
        if (A0U.contains(r15)) {
            A0U.remove(r15);
            0u4.A03(A032).remove(r15.A2n());
        } else if (A0U.size() < DbS.A04(0Tu.A05, userSession, 36601754248941896L)) {
            A0U.add(r15);
            String A2n = r15.A2n();
            if (A2n != null) {
                A032.put(A2n, ((GMQ) r2.getValue()).A01);
            }
        } else {
            return;
        }
        do {
            value = r2.getValue();
            gmq = (GMQ) value;
        } while (!r2.AIY(value, GMQ.A00(gmq, (1Xj) null, (C54662HMt) null, (Integer) null, 00k.A0T(ITK.A00, (Collection) gmq.A02), A0U, (List) null, A032, 57)));
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Long] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(X.LRh r5, java.util.List r6, java.util.Map r7, boolean r8) {
        /*
            r3 = 10
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x000a:
            boolean r0 = r1.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = X.C51975G9x.A0k(r1)
            if (r0 == 0) goto L_0x001b
            java.lang.Long r4 = X.00y.A0n(r3, r0)
        L_0x001b:
            r2.add(r4)
            goto L_0x000a
        L_0x001f:
            java.util.List r3 = X.00k.A0X(r2)
            if (r5 == 0) goto L_0x0072
            com.instagram.common.session.UserSession r0 = r5.A07
            X.0iw r2 = r5.A05
            X.0Aj r1 = X.C51975G9x.A0S(r2, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x004f
            if (r8 == 0) goto L_0x006f
            X.HOu r0 = X.C54689HOu.OPEN_CAROUSEL_APPROVE
        L_0x0037:
            X.C51965G9l.A1C(r0, r1)
            X.DbW.A16(r1, r2)
            java.lang.String r0 = "media_list"
            r1.AAe(r0, r3)
            java.lang.String r0 = r5.A08
            X.C51965G9l.A1K(r1, r0)
            java.lang.String r0 = r5.A00
            X.C51965G9l.A1O(r1, r0)
            r1.Cgf()
        L_0x004f:
            if (r8 == 0) goto L_0x0072
            java.lang.String r4 = X.AnonymousClass7TG.A0j()
            java.util.Iterator r2 = r3.iterator()
        L_0x0059:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Long r1 = X.C51968G9o.A0v(r0)
            X.28D r0 = X.28D.A3k
            X.LRh.A01(r0, r5, r1, r4, r7)
            goto L_0x0059
        L_0x006f:
            X.HOu r0 = X.C54689HOu.OPEN_CAROUSEL_DECLINE
            goto L_0x0037
        L_0x0072:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53039GhV.A01(X.LRh, java.util.List, java.util.Map, boolean):java.lang.String");
    }

    public static final LinkedHashMap A02(C53039GhV ghV) {
        Collection<C54662HMt> values = ((Map) ((GMQ) ghV.A04.getValue()).A07).values();
        ArrayList A0r = AnonymousClass7TG.A0r(values);
        for (C54662HMt hMt : values) {
            A0r.add(hMt.A01);
        }
        List A0a = 00k.A0a(A0r);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        for (Object next : A0a) {
            Object obj = A1H.get(next);
            if (obj == null && !A1H.containsKey(next)) {
                obj = new Object();
            }
            0rk r1 = (0rk) obj;
            r1.A00++;
            A1H.put(next, r1);
        }
        Iterator A0s = AnonymousClass7TF.A0s(A1H);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            0qQ.A0C(A1J, C66579MXk.A00(1012));
            0u4.A02(A1J).setValue(Integer.valueOf(((0rk) A1J.getValue()).A00));
        }
        Map A032 = 0u4.A03(A1H);
        LinkedHashMap A0o = C51975G9x.A0o(A032);
        Iterator A0u = AnonymousClass7TF.A0u(A032);
        while (A0u.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u);
            A0o.put(A1J2.getKey(), C51969G9p.A0r((Number) A1J2.getValue()));
        }
        return A0o;
    }

    public static final void A03(C53039GhV ghV, Integer num, List list, int i, boolean z) {
        int i2;
        05G r3;
        Object value;
        GMQ gmq;
        if (num == AnonymousClass05K.A00) {
            i2 = C56645I6a.A00(ghV.A01);
        } else {
            if (z) {
                i2 = ghV.A00 - i;
            }
            r3 = ghV.A04;
            do {
                value = r3.getValue();
                gmq = (GMQ) value;
            } while (!r3.AIY(value, GMQ.A00(gmq, (1Xj) null, (C54662HMt) null, (Integer) null, 00k.A0T(new ITH(num), (Collection) gmq.A02), (List) null, list, (Map) null, 117)));
        }
        ghV.A00 = i2;
        r3 = ghV.A04;
        do {
            value = r3.getValue();
            gmq = (GMQ) value;
        } while (!r3.AIY(value, GMQ.A00(gmq, (1Xj) null, (C54662HMt) null, (Integer) null, 00k.A0T(new ITH(num), (Collection) gmq.A02), (List) null, list, (Map) null, 117)));
    }

    public final void A05(OCO oco) {
        Object value;
        GMQ gmq;
        ITI iti;
        05G r3 = this.A04;
        do {
            value = r3.getValue();
            gmq = (GMQ) value;
            iti = new ITI(oco);
        } while (!r3.AIY(value, GMQ.A00(gmq, (1Xj) null, (C54662HMt) null, AnonymousClass05K.A0C, 00k.A0T(iti, (Collection) gmq.A02), (List) gmq.A06, (List) null, (Map) null, 89)));
    }

    public final boolean A06() {
        if (((GMQ) this.A04.getValue()).A04 == AnonymousClass05K.A0C && this.A02.A00 == null) {
            return true;
        }
        return false;
    }

    public final boolean A07(String str) {
        List list = (List) ((GMQ) this.A04.getValue()).A06;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (0qQ.A0K(C51971G9r.A0v(it), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C53039GhV(UserSession userSession, C57093IOh iOh, String str) {
        Object value;
        this.A01 = userSession;
        String str2 = str;
        this.A03 = str2;
        this.A02 = iOh;
        02z A10 = DbS.A10(new GMQ());
        this.A04 = A10;
        this.A05 = 10b.A03(A10);
        1Xj A0U = DbV.A0U(userSession, str2);
        if (A0U != null) {
            this.A00 += C51967G9n.A04(C263014Gw.A00(A0U), 0);
            do {
                value = A10.getValue();
            } while (!A10.AIY(value, GMQ.A00((GMQ) value, A0U, (C54662HMt) null, (Integer) null, (List) null, (List) null, (List) null, (Map) null, 126)));
        } else if (str != null) {
            1OC A042 = C3724090s.A04(userSession, str2);
            A042.A00 = new C54238H4h(this);
            1ES.A06(A042, 1508969885, false);
        }
    }

    public static GMQ A00(AnonymousClass0eM r0) {
        return (GMQ) ((C53039GhV) r0.getValue()).A04.getValue();
    }
}
