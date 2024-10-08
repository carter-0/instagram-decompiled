package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.WGt  reason: case insensitive filesystem */
public final class C19017WGt implements X7R, X2O {
    public C17973VjA A00;
    public final Set A01 = new LinkedHashSet();
    public final C18609Vv2 A02;

    public C19017WGt(C18609Vv2 vv2) {
        0qQ.A0B(vv2, 1);
        this.A02 = vv2;
    }

    public final synchronized void AOt() {
        C18609Vv2 vv2 = this.A02;
        vv2.A01();
        synchronized (vv2) {
            vv2.A03.remove(this);
        }
        this.A00 = null;
        for (X2N Cv0 : this.A01) {
            Cv0.Cv0(this.A00);
        }
    }

    public final synchronized void CMo(C15046UKz uKz) {
        if (this.A00 == null) {
            C18609Vv2 vv2 = this.A02;
            this.A00 = vv2.A00(uKz);
            synchronized (vv2) {
                vv2.A03.add(this);
            }
            for (X2N Cv0 : this.A01) {
                Cv0.Cv0(this.A00);
            }
        }
    }

    public final synchronized void EBP(X2N x2n) {
        this.A01.add(x2n);
    }

    public final void Cv0(C17973VjA vjA) {
        this.A00 = vjA;
    }
}
