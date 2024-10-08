package X;

import java.util.Map;

/* renamed from: X.WWw  reason: case insensitive filesystem */
public final class C19380WWw implements C228402lc, C231292rN {
    public final int A00;
    public final Object A01;

    public C19380WWw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final AnonymousClass3W1 BQr(1Xj r3) {
        int i = this.A00;
        0qQ.A0B(r3, 0);
        Object obj = this.A01;
        switch (i) {
            case 0:
                Map map = ((C15348Uaz) obj).A05;
                Object obj2 = map.get(r3);
                if (obj2 == null) {
                    obj2 = G9t.A18(r3);
                    map.put(r3, obj2);
                }
                return (AnonymousClass3W1) obj2;
            case 1:
                Map map2 = ((C15349Ub0) obj).A05;
                Object obj3 = map2.get(r3);
                if (obj3 == null) {
                    obj3 = G9t.A18(r3);
                    map2.put(r3, obj3);
                }
                return (AnonymousClass3W1) obj3;
            case 2:
                Map map3 = ((C15346Uax) obj).A06;
                Object obj4 = map3.get(r3);
                if (obj4 == null) {
                    obj4 = G9t.A18(r3);
                    map3.put(r3, obj4);
                }
                return (AnonymousClass3W1) obj4;
            default:
                Map map4 = ((C15347Uay) obj).A06;
                Object obj5 = map4.get(r3);
                if (obj5 == null) {
                    obj5 = G9t.A18(r3);
                    map4.put(r3, obj5);
                }
                return (AnonymousClass3W1) obj5;
        }
    }

    public final void Cs9(1Xj r2) {
        AnonymousClass0eM r0;
        switch (this.A00) {
            case 0:
                C15479UdU.A00((C15348Uaz) this.A01);
                return;
            case 1:
                ((C54225H3u) ((C15349Ub0) this.A01).A06.getValue()).A00();
                return;
            case 2:
                r0 = ((C15346Uax) this.A01).A07;
                break;
            default:
                r0 = ((C15347Uay) this.A01).A07;
                break;
        }
        C15486Udb.A00(r0);
    }
}
