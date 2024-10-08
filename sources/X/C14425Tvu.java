package X;

import android.view.View;

/* renamed from: X.Tvu  reason: case insensitive filesystem */
public final class C14425Tvu implements C227182im {
    public final /* synthetic */ 2dZ A00;
    public final /* synthetic */ AnonymousClass32L A01;

    public C14425Tvu(2dZ r1, AnonymousClass32L r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void DmH(int i, int i2) {
        2dZ r3 = this.A00;
        View view = r3.A0N;
        view.setVisibility(0);
        AnonymousClass32L r2 = this.A01;
        GX1 gx1 = new GX1(r2.requireActivity(), r2.getSession(), AnonymousClass7TE.A1I(view), r3.AYI(), i);
        r2.A0S = gx1;
        C14074TpO tpO = r2.A06;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        tpO.A09(gx1);
        r2.mLifecycleRegistry.A09(gx1);
    }
}
