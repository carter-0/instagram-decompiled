package X;

import android.view.View;

public final class LD3 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C65012Llp A01;
    public final /* synthetic */ C60440JlY A02;

    public LD3(C65012Llp llp, C60440JlY jlY, int i) {
        this.A01 = llp;
        this.A00 = i;
        this.A02 = jlY;
    }

    public final void A00() {
        C65012Llp llp = this.A01;
        int i = llp.A00 - 1;
        llp.A00 = i;
        02m.A0p.markerPoint(18943966, 002.A0O("loaded_photo_", this.A00 - i));
        if (llp.A00 == 0) {
            02m.A0p.markerEnd(18943966, 2);
            View A012 = llp.A07.A01();
            0qQ.A0A(A012);
            0nA.A0q(A012, new C65866M2h(llp));
            A012.requestLayout();
            this.A02.A00 = null;
        }
    }
}
