package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.8m5  reason: invalid class name and case insensitive filesystem */
public final class C364828m5 extends C344317rf implements C343687qd {
    public C344737sL A00;

    public final void A09() {
        C343667qb r0 = C343737qi.A05;
        boolean z = false;
        C343837qt r1 = this.A00;
        Object Apu = r1.Apu(r0);
        if (Apu != null) {
            z = Apu;
        }
        boolean booleanValue = ((Boolean) z).booleanValue();
        C344767sO r2 = null;
        if (booleanValue) {
            C343917r1 Apf = r1.Apf(C343927r2.A00);
            0qQ.A07(Apf);
            C343927r2 r6 = (C343927r2) Apf;
            C343917r1 Apf2 = r1.Apf(C344037rD.A00);
            0qQ.A07(Apf2);
            C344037rD r5 = (C344037rD) Apf2;
            Context context = r1.getContext();
            0qQ.A07(context);
            0qQ.A0B(r6, 2);
            0qQ.A0B(r5, 3);
            r2 = C344787sQ.A00(context, (Handler) null, (C344807sS) null, C344407ro.A01, r5, r6, true, false, false, false, false, false, true, false);
        }
        C344407ro r3 = C344407ro.A01;
        0qQ.A08(r3);
        this.A00 = new C366468oy((C368028rx) null, r2, r3, (C344737sL) A0B(C343737qi.A0C), true, false);
    }

    public final C343717qg BJt() {
        C343717qg r0 = C343687qd.A01;
        0qQ.A08(r0);
        return r0;
    }

    public final C344737sL BQ6() {
        C344737sL r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("mediaGraph");
        throw AnonymousClass00P.createAndThrow();
    }
}
