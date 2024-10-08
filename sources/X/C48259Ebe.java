package X;

import android.content.Context;

/* renamed from: X.Ebe  reason: case insensitive filesystem */
public abstract class C48259Ebe {
    public final void A00() {
        if (this instanceof EMS) {
            EMS ems = (EMS) this;
            if (1 - ems.A00 == 0) {
                EDB edb = (EDB) ems.A01;
                LQc lQc = edb.A08;
                AnonymousClass0aP r3 = edb.A03;
                String str = edb.A05;
                String str2 = edb.A06;
                LQc.A00(edb.A02, edb.A01, r3, lQc, edb.A04, str, str2, edb.A07);
                return;
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01() {
        if (this instanceof EMT) {
            EMT emt = (EMT) this;
            Context context = emt.A00;
            E3X e3x = emt.A01;
            FHA.A00(context, e3x.A01, (Boolean) null, (Boolean) null, e3x.A0A, (String) null, true, false);
            return;
        }
        if (this instanceof EMS) {
            EMS ems = (EMS) this;
            if (ems.A00 == 0) {
                C47476E4a.A00((C47476E4a) ems.A01);
                return;
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }
}
