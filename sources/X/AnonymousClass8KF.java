package X;

import android.view.Surface;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.8KF  reason: invalid class name */
public final class AnonymousClass8KF implements AnonymousClass8KG {
    public final Set A00;

    public final void DpX(Surface surface, int i, int i2) {
        0qQ.A0B(surface, 0);
        for (AnonymousClass8KG DpX : this.A00) {
            DpX.DpX(surface, i, i2);
        }
    }

    public final void DpU(int i, int i2) {
        for (AnonymousClass8KG DpU : this.A00) {
            DpU.DpU(i, i2);
        }
    }

    public final void Dpb() {
        for (AnonymousClass8KG Dpb : this.A00) {
            Dpb.Dpb();
        }
    }

    public AnonymousClass8KF(AnonymousClass8KF r2) {
        this.A00 = new CopyOnWriteArraySet();
    }

    public AnonymousClass8KF() {
        this((AnonymousClass8KF) null);
    }
}
