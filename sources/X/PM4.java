package X;

import android.view.View;

public final class PM4 implements C74361Ptb {
    public C70512O9l A00;
    public final View A01;
    public final AnonymousClass0eM A02 = C73900Plb.A00(this, 17);
    public final AnonymousClass0eM A03 = C73900Plb.A00(this, 18);

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        N9Z n9z = (N9Z) pry;
        0qQ.A0B(n9z, 0);
        if (n9z.A01) {
            C70512O9l o9l = this.A00;
            if (o9l != null) {
                o9l.A00.A02.A00(C72789PKd.A00);
            } else {
                0qQ.A0F("listener");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public PM4(View view) {
        this.A01 = view;
    }
}
