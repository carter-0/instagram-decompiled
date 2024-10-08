package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

public final class IPN implements C250603lj {
    public final Map A00 = AnonymousClass7TE.A1H();
    public final Map A01 = AnonymousClass7TE.A1H();
    public final /* synthetic */ HBK A02;

    public final void ATF(AnonymousClass30Y r12, C252093oY r13) {
        boolean A1U = AnonymousClass7TF.A1U(0, r12, r13);
        Object obj = r12.A03;
        1Xj r5 = (1Xj) obj;
        String id = r5.getId();
        if (id != null) {
            int A0A = C51968G9o.A0A(r12, r13);
            if (A0A == 0 || A0A == A1U) {
                A01(id, r13.CFe(r12));
                return;
            }
            A01(id, 0.0f);
            Number number = (Number) this.A00.remove(id);
            if (number != null) {
                long longValue = number.longValue();
                HBK hbk = this.A02;
                if (longValue >= hbk.A04) {
                    0qQ.A06(obj);
                    if (1Wj.A00 != null && ((long) hbk.A00) < hbk.A03) {
                        0nY.A00().ATE(new H8N(r5, this, hbk, id, longValue));
                    }
                }
            }
        }
    }

    public IPN(HBK hbk) {
        this.A02 = hbk;
    }

    public static final List A00(IPN ipn, String str, Set set, Set set2, int i, boolean z) {
        List Ab0 = ((1Kv) ipn.A02.A0B.getValue()).A00.Ab0();
        0qQ.A0B(Ab0, 0);
        return C242173Sx.A07(C242173Sx.A0C(C242173Sx.A09(new C58771IxI(set2, set, str, 10, z), new 0jq(Ab0)), i));
    }

    private final void A01(String str, float f) {
        Map map = this.A01;
        Number A14 = C51966G9m.A14(str, map);
        double d = (double) f;
        double d2 = this.A02.A01;
        if (A14 != null) {
            if (d < d2) {
                map.remove(str);
                Map map2 = this.A00;
                map2.put(str, Long.valueOf((System.currentTimeMillis() - A14.longValue()) + DbY.A04(C51966G9m.A14(str, map2))));
            }
        } else if (d >= d2) {
            map.put(str, C51968G9o.A0u());
        }
    }
}
