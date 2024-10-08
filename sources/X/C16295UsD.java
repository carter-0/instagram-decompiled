package X;

import android.view.MotionEvent;

/* renamed from: X.UsD  reason: case insensitive filesystem */
public final class C16295UsD extends AnonymousClass7HP {
    public final /* synthetic */ C17535VZo A00;

    public final boolean Dgn(C253913rc r2) {
        return true;
    }

    public final boolean Dgo(C253913rc r5) {
        0qQ.A0B(r5, 0);
        C17535VZo vZo = this.A00;
        C18001Vjd vjd = vZo.A01;
        C20967X6u x6u = vZo.A00;
        if (vjd == null || x6u == null) {
            return true;
        }
        x6u.E0Z(vZo.A02, vZo.A03, vjd, r5);
        return true;
    }

    public final void Dgt(C253913rc r1) {
    }

    public C16295UsD(C17535VZo vZo) {
        this.A00 = vZo;
    }

    public final void A00(MotionEvent motionEvent, AnonymousClass7HQ r6) {
        C17535VZo vZo = this.A00;
        C18001Vjd vjd = vZo.A01;
        C20967X6u x6u = vZo.A00;
        if (vjd != null && x6u != null) {
            x6u.FHJ(vZo.A02, vZo.A03, vjd, r6);
        }
    }
}
