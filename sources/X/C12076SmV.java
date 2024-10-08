package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.SmV  reason: case insensitive filesystem */
public final class C12076SmV implements C13816Thj {
    public final /* synthetic */ C12075SmU A00;

    public final void D5G(C11286SJe sJe) {
        0qQ.A0B(sJe, 0);
        Map map = this.A00.A01;
        C12074SmT smT = (C12074SmT) map.get(this);
        if (smT != null) {
            smT.A01 = sJe;
            smT.A00 = null;
            smT.A02 = true;
            synchronized (smT) {
                smT.notify();
            }
            map.remove(this);
        }
    }

    public final void DEX(C8989RKf rKf) {
        0qQ.A0B(rKf, 0);
        C12075SmU.A00(this, this.A00, rKf);
    }

    public final void DaE(float f) {
    }

    public final void onStart() {
    }

    public C12076SmV(C12075SmU smU) {
        this.A00 = smU;
    }

    public final void D0e() {
        C12075SmU smU = this.A00;
        C12074SmT smT = (C12074SmT) smU.A01.get(this);
        if (smT != null) {
            C12075SmU.A00(this, smU, new C8989RKf((Exception) null, "Cancellation", Collections.emptyMap(), 0, smT.A03.A00, true));
        }
    }
}
