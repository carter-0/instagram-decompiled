package X;

import java.util.Map;

public final class SHJ {
    public final AnonymousClass38L A00;
    public final Object A01 = Pxe.A0p();
    public final Map A02 = AnonymousClass7TE.A1E();
    public final Map A03 = AnonymousClass7TE.A1E();

    static {
        AnonymousClass389.A01("WorkTimer");
    }

    public final void A00(C255373u1 r3) {
        synchronized (this.A01) {
            if (((TEu) this.A03.remove(r3)) != null) {
                AnonymousClass389.A00();
                this.A02.remove(r3);
            }
        }
    }

    public SHJ(AnonymousClass38L r2) {
        this.A00 = r2;
    }
}
