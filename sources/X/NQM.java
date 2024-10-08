package X;

import android.content.Context;

public final class NQM extends XU2 {
    public AnonymousClass3KQ A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass3KO A02;

    public final void A00() {
        AnonymousClass3KG r1 = (AnonymousClass3KG) this.A01.getValue();
        r1.A03();
        AnonymousClass3KQ A002 = AnonymousClass3KG.A00(this.A02);
        this.A00 = A002;
        r1.A05(A002);
    }

    public final void A01() {
        AnonymousClass3KG r1 = (AnonymousClass3KG) this.A01.getValue();
        r1.A06(this.A00);
        r1.A04();
        this.A00 = null;
    }

    public NQM(Context context, AnonymousClass3KO r4, 0lg r5) {
        this.A02 = r4;
        this.A01 = AnonymousClass0eN.A01(new GNG(10, context, r5));
    }
}
