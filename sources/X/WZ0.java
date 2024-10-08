package X;

import android.location.Location;

public final class WZ0 implements X4K {
    public final /* synthetic */ UZB A00;

    public WZ0(UZB uzb) {
        this.A00 = uzb;
    }

    public final Location AuA(String str) {
        T6B t6b = this.A00.A01;
        if (t6b != null) {
            return t6b.A00(UZB.__redex_internal_original_name);
        }
        0qQ.A0F("locationManager");
        throw AnonymousClass00P.createAndThrow();
    }
}
