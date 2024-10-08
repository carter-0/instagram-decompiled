package X;

import android.location.Location;

/* renamed from: X.8S7  reason: invalid class name */
public final class AnonymousClass8S7 implements C267874cM {
    public final /* synthetic */ AnonymousClass8S5 A00;

    public final void DCn(Exception exc) {
    }

    public AnonymousClass8S7(AnonymousClass8S5 r1) {
        this.A00 = r1;
    }

    public final void onLocationChanged(Location location) {
        1Wr r1 = 1Wr.A00;
        if (r1 != null) {
            r1.removeLocationUpdates(this.A00.A09, this);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
