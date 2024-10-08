package X;

import android.view.View;

public final class WZ6 implements G7A {
    public final int A00;
    public final Object A01;

    public final void ECJ(View view, UO1 uo1) {
        0qQ.A0B(view, 0);
        ((C15286UZq) this.A01).A0e.EBK(view, uo1);
    }

    public WZ6(C15286UZq uZq, int i) {
        this.A00 = i;
        this.A01 = uZq;
    }

    public final void Dag(UO1 uo1) {
        if (this.A00 != 0) {
            C15286UZq.A02(uo1, (C15286UZq) this.A01, true);
        } else {
            C15286UZq.A02(uo1, (C15286UZq) this.A01, false);
        }
    }
}
