package X;

import android.app.Activity;
import android.location.Location;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;

public final class WZ2 implements X4K {
    public boolean A00;
    public final Activity A01;
    public final WFU A02;
    public final UserSession A03;
    public final C267874cM A04 = new C19424WYr(this, 2);
    public final C66494MTx A05 = new C19425WYu(this, 3);
    public final boolean A06;

    public static void A00(WZ2 wz2) {
        Location AuA = wz2.AuA("updateCameraToCurrentLocation");
        WFU wfu = wz2.A02;
        if (wfu != null && AuA != null) {
            C18580VuW.A00(wfu, new LatLng(AuA.getLatitude(), AuA.getLongitude()), 11.0f);
        }
    }

    public final Location AuA(String str) {
        1Wr r2 = 1Wr.A00;
        r2.getClass();
        return r2.getLastLocation(this.A03, 002.A0R("MediaLocationMapMyLocationHelper:", str));
    }

    public WZ2(Activity activity, WFU wfu, UserSession userSession) {
        this.A03 = userSession;
        this.A01 = activity;
        this.A02 = wfu;
        this.A06 = 1DL.A05(activity, "android.permission.ACCESS_FINE_LOCATION");
    }
}
