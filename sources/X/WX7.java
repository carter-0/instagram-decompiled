package X;

import android.view.View;

public final class WX7 implements AnonymousClass726 {
    public final /* synthetic */ C15464UdF A00;

    public final void AAh(1Xj r6, int i) {
        0qQ.A0B(r6, 0);
        C229932oe r4 = this.A00.A01;
        String id = r6.getId();
        if (id != null) {
            Integer valueOf = Integer.valueOf(i);
            String id2 = r6.getId();
            if (id2 != null) {
                r4.A01(AnonymousClass30Y.A00(r6, valueOf, id2).A01(), id);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public WX7(C15464UdF udF) {
        this.A00 = udF;
    }

    public final void ECC(View view, 1Xj r5) {
        C15464UdF udF = this.A00;
        2el r2 = udF.A00;
        C229932oe r1 = udF.A01;
        String id = r5.getId();
        if (id != null) {
            C13988Tno.A14(view, r2, r1, id);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
