package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class S53 {
    public final C307456Qe A00;
    public final C307766Rj A01;
    public final C229652no A02;
    public final S4e A03;
    public final C10291Rpp A04;
    public final C276744tp A05;
    public final String A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;

    public S53(C307456Qe r7, C307766Rj r8, C229652no r9, S53 s53, S4e s4e, C276744tp r12, String str) {
        Map map;
        0vq r4;
        HashMap A19;
        HashMap A192;
        AnonymousClass7TG.A0w(1, r7, r8, r9);
        this.A00 = r7;
        this.A05 = r12;
        this.A01 = r8;
        this.A02 = r9;
        this.A06 = str;
        this.A03 = s4e;
        Map map2 = r7.A08;
        Map synchronizedMap = Collections.synchronizedMap(Pxe.A19(map2));
        0qQ.A07(synchronizedMap);
        this.A09 = synchronizedMap;
        Map A0w = Pxf.A0w();
        0qQ.A07(A0w);
        this.A07 = A0w;
        C10291Rpp rpp = null;
        if (s53 != null) {
            map = s53.A07;
        } else {
            map = null;
        }
        this.A08 = map;
        if (s53 != null) {
            0vq r0 = AnonymousClass01q.A00;
            r4 = new 0vq(6);
            synchronized (s53.A09) {
                A192 = Pxe.A19(s53.A09);
            }
            Iterator A0s = AnonymousClass7TF.A0s(A192);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                if (!0qQ.A0K(map2.get(A1J.getKey()), A1J.getValue())) {
                    Object key = A1J.getKey();
                    0qQ.A07(key);
                    r4.A09(key);
                }
            }
            rpp = new C10291Rpp(r4);
        } else {
            r4 = null;
        }
        this.A04 = rpp;
        HashMap A1E = AnonymousClass7TE.A1E();
        if (!(r4 == null || s53 == null)) {
            synchronized (s53.A0A) {
                A19 = Pxe.A19(s53.A0A);
            }
            Iterator A0s2 = AnonymousClass7TF.A0s(A19);
            while (A0s2.hasNext()) {
                Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
                Object key2 = A1J2.getKey();
                C11016S5n s5n = (C11016S5n) A1J2.getValue();
                if (!A01(Pxf.A1b(s5n.A01, 0))) {
                    A1E.put(key2, s5n);
                }
            }
        }
        this.A0A = Collections.synchronizedMap(A1E);
    }

    public final boolean A01(String[] strArr) {
        boolean A1Q;
        int length;
        boolean A042;
        0qQ.A0B(strArr, 0);
        C10291Rpp rpp = this.A04;
        if (rpp != null) {
            0vq r4 = rpp.A00;
            synchronized (r4) {
                A1Q = AnonymousClass7TF.A1Q(r4.A01);
            }
            if (!A1Q && (length = strArr.length) != 0) {
                int i = 0;
                do {
                    String str = strArr[i];
                    synchronized (r4) {
                        A042 = r4.A04(str);
                    }
                    if (A042) {
                        return true;
                    }
                    i++;
                } while (i < length);
            }
        }
        return false;
    }

    public final C307896Rx A00(C276544tV r16, AnonymousClass6SD r17, C277014uI r18) {
        List list = r16.A09;
        Map map = this.A07;
        C307456Qe r4 = this.A00;
        Map map2 = this.A0A;
        C276744tp r8 = this.A05;
        return new C307896Rx((C276634te) null, (C307786Rm) null, (C307786Rm) null, r4, r17, this.A02, r18, r8, AnonymousClass05K.A00, this.A06, (String) null, list, map, map2);
    }
}
