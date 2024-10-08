package X;

import java.util.concurrent.Callable;

/* renamed from: X.Art  reason: case insensitive filesystem */
public final /* synthetic */ class C41313Art implements Callable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C340597lW A01;

    public /* synthetic */ C41313Art(C340597lW r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }

    public final Object call() {
        float f;
        C342627ou r1;
        C340597lW r4 = this.A01;
        float f2 = this.A00;
        if (r4.isConnected()) {
            C340837lu r2 = r4.A0R;
            C340807lr r12 = r2.A0J;
            r12.A01("Can only check if the prepared on the Optic thread");
            if (r12.A00 && (r1 = r4.A07) != null) {
                if (r1.A09(f2, false)) {
                    C342627ou.A03(r4, r2);
                }
                f = r4.A07.A05();
                return Float.valueOf(f);
            }
        }
        f = -1.0f;
        return Float.valueOf(f);
    }
}
