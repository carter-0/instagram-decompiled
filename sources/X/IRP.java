package X;

import android.view.View;

public final class IRP implements X41 {
    public final int A00;
    public final Object A01;

    public IRP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void ECL(View view, C296995qz r5, C296905qq r6, C296935qt r7, boolean z) {
        int i = this.A00;
        C51974G9v.A1O(view, r7, r6, r5);
        if (i != 0) {
            ((C55941Hq5) this.A01).A00(view, r5, r6, r7);
            return;
        }
        C55653HlC hlC = ((C52770GcN) this.A01).A0B;
        if (hlC == null) {
            0qQ.A0F("viewpointHelper");
            throw AnonymousClass00P.createAndThrow();
        } else if (r7 instanceof C296965qw) {
            String id = ((C296965qw) r7).BPf().getId();
            id.getClass();
            C2354830a A002 = AnonymousClass30Y.A00(r7, new C52528GWf(r5, r6), id);
            A002.A00(hlC.A01);
            C51967G9n.A0z(view, A002, hlC.A00);
        }
    }
}
