package X;

import android.view.Surface;

public final class WGA implements C365228mk {
    public C344227rW A00;
    public final /* synthetic */ WG9 A01;

    public WGA(C344227rW r1, WG9 wg9) {
        this.A01 = wg9;
        this.A00 = r1;
    }

    public final void AWV(AnonymousClass8KU r3) {
        WG9.A00(this.A01, r3, 31);
    }

    public final void EzB(Surface surface, AnonymousClass8KU r5) {
        WG9.A01(this.A01, new Object[]{r5, surface}, 10);
    }

    public final void EzD(AnonymousClass8KU r3) {
        WG9 wg9 = this.A01;
        C18812W3v w3v = wg9.A03;
        synchronized (r3) {
            w3v.A0i.add(r3);
        }
        WG9.A00(wg9, r3, 11);
    }
}
