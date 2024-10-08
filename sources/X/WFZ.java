package X;

import android.location.Location;
import com.instagram.common.session.UserSession;

public final class WFZ implements C20945X5o, C267874cM {
    public final UserSession A00;
    public final 1Wr A01 = 1Wr.A00;

    public final C20945X5o AK5() {
        return new WFZ(this.A00);
    }

    public final Location AuA(String str) {
        return this.A01.getLastLocation(this.A00, 002.A0R("InstagramGeoLocation:", "MapConfig"));
    }

    public final void DCn(Exception exc) {
    }

    public final void onLocationChanged(Location location) {
    }

    public WFZ(UserSession userSession) {
        this.A00 = userSession;
    }
}
