package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.facebook.react.modules.location.LocationModule;

/* renamed from: X.SVk  reason: case insensitive filesystem */
public final class C11448SVk implements LocationListener {
    public final /* synthetic */ LocationModule A00;

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public C11448SVk(LocationModule locationModule) {
        this.A00 = locationModule;
    }

    public final void onLocationChanged(Location location) {
        QZK reactApplicationContextIfActiveOrWarn = this.A00.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.A0E("geolocationDidChange", LocationModule.locationToMap(location));
        }
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
        LocationModule locationModule;
        int i2;
        StringBuilder A0n;
        String str2;
        if (i == 0) {
            locationModule = this.A00;
            i2 = 2;
            A0n = AnonymousClass7TF.A0n("Provider ");
            A0n.append(str);
            str2 = " is out of service.";
        } else if (i == 1) {
            locationModule = this.A00;
            i2 = 3;
            A0n = AnonymousClass7TF.A0n("Provider ");
            A0n.append(str);
            str2 = " is temporarily unavailable.";
        } else {
            return;
        }
        locationModule.emitError(i2, AnonymousClass7TF.A0l(str2, A0n));
    }
}
