package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public final class Q0I implements LocationListener {
    public final /* synthetic */ Q0H A00;

    public final void onLocationChanged(Location location) {
        0qQ.A0B(location, 0);
        Q0H q0h = this.A00;
        C276164sm A002 = AnonymousClass60p.A00(location);
        if (A002 != null) {
            q0h.A0C(A002);
            String str = q0h.A04;
            String str2 = q0h.A01;
            q0h.A0D.A00(false, Long.valueOf(q0h.A04(A002)), "AndroidPlatformFbLocationManager", "onLocationChanged", str, str2, "AndroidPlatformLocationProvider");
        }
    }

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public Q0I(Q0H q0h) {
        this.A00 = q0h;
    }
}
