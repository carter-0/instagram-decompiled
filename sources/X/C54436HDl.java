package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.HDl  reason: case insensitive filesystem */
public final class C54436HDl extends C252733pa {
    public C362088hK A00;
    public C352218Cl A01;
    public final UserSession A02;
    public final Map A03 = AnonymousClass7TE.A1H();
    public final Map A04 = AnonymousClass7TE.A1H();
    public final 05G A05 = C51967G9n.A0u();

    public static final C56511Hzi A00(C54436HDl hDl) {
        C362088hK r3 = hDl.A00;
        if (r3 != null) {
            C352218Cl r1 = hDl.A01;
            if (r1 != null) {
                C352218Cl r0 = r1.A0M;
                if (r0 == null) {
                    r0 = r1;
                }
                String str = r0.A0h;
                Map map = hDl.A04;
                C61081JwJ jwJ = new C61081JwJ(r3, str);
                Object obj = map.get(jwJ);
                if (obj == null) {
                    obj = new C56511Hzi();
                    map.put(jwJ, obj);
                }
                return (C56511Hzi) obj;
            }
            throw AnonymousClass7TE.A0w("No photo set");
        }
        throw AnonymousClass7TE.A0w("No MagicMod Tool set");
    }

    public final I12 A02() {
        C352218Cl r1 = this.A01;
        if (r1 == null) {
            return null;
        }
        C352218Cl r0 = r1.A0M;
        if (r0 == null) {
            r0 = r1;
        }
        return (I12) this.A03.get(r0.A0h);
    }

    public final void A03() {
        this.A05.Epw(A02());
        C56511Hzi A002 = A00(this);
        A002.A01 = null;
        A002.A02.Epw(AnonymousClass62M.A01);
    }

    public final boolean A06() {
        if (this.A00 == null) {
            return false;
        }
        return !((Collection) A00(this).A02.getValue()).isEmpty();
    }

    public /* synthetic */ C54436HDl(UserSession userSession) {
        super("MagicMod", AnonymousClass43D.A00(1530208012));
        this.A02 = userSession;
    }

    public final int A01(String str) {
        Iterator A1H = C51966G9m.A1H(A00(this).A02.getValue());
        int i = 0;
        while (A1H.hasNext()) {
            if (0qQ.A0K(((I12) A1H.next()).A04, str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void A04(C59721JVf jVf, List list) {
        C56511Hzi A002 = A00(this);
        I12 i12 = (I12) 00k.A0J(list);
        C56511Hzi.A00(A002, i12);
        A002.A01 = i12;
        A002.A00 = jVf;
        if (list.size() > 1) {
            for (I12 A003 : C51969G9p.A0v(list, 1)) {
                C56511Hzi.A00(A002, A003);
            }
        }
        A05((I12) 00k.A0J(list));
    }

    public final void A05(I12 i12) {
        C56511Hzi A002 = A00(this);
        C56511Hzi.A00(A002, i12);
        A002.A01 = i12;
        this.A05.Epw(i12);
    }
}
