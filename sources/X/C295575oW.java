package X;

import android.location.Location;
import com.instagram.common.session.UserSession;
import com.instagram.location.impl.LocationPluginImpl;

/* renamed from: X.5oW  reason: invalid class name and case insensitive filesystem */
public final class C295575oW implements C267874cM {
    public final /* synthetic */ C3722490b A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ LocationPluginImpl A02;

    public C295575oW(C3722490b r1, UserSession userSession, LocationPluginImpl locationPluginImpl) {
        this.A02 = locationPluginImpl;
        this.A00 = r1;
        this.A01 = userSession;
    }

    public final void DCn(Exception exc) {
        this.A00.A02(exc);
        this.A02.removeLocationUpdates(this.A01, this);
    }

    public final void onLocationChanged(Location location) {
        this.A00.A01(location);
        this.A02.removeLocationUpdates(this.A01, this);
    }
}
