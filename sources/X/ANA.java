package X;

import android.view.View;

public final class ANA implements View.OnClickListener {
    public final /* synthetic */ C339617jt A00;

    public ANA(C339617jt r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1679238055);
        AnonymousClass37E r2 = AnonymousClass37D.A00;
        C339617jt r1 = this.A00;
        AnonymousClass37D A01 = r2.A01(r1.requireActivity());
        if (A01 != null) {
            A01.A0B();
        }
        C339607js r0 = r1.A00;
        if (r0 == null) {
            0qQ.A0F("delegate");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.Do6();
        AnonymousClass0fD.A0C(-582403662, A05);
    }
}
