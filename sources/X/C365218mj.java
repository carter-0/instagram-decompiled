package X;

import android.view.Surface;

/* renamed from: X.8mj  reason: invalid class name and case insensitive filesystem */
public final class C365218mj implements C365228mk {
    public final /* synthetic */ C365168me A00;

    public final void AWV(AnonymousClass8KU r1) {
    }

    public final void EzB(Surface surface, AnonymousClass8KU r6) {
        0qQ.A0B(surface, 1);
        C365168me r2 = this.A00;
        AnonymousClass8KU r1 = r2.A05;
        synchronized (r1) {
            C345897uG r0 = r2.A0E;
            if (r0 != null) {
                r1.CMn(surface, r0.Azk());
                r2.A0F = true;
            }
        }
    }

    public C365218mj(C365168me r1) {
        this.A00 = r1;
    }

    public final void EzD(AnonymousClass8KU r4) {
        C365168me r2 = this.A00;
        synchronized (r2.A05) {
            r2.A0F = false;
        }
    }
}
