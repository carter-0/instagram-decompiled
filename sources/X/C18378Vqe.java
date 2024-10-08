package X;

import com.facebook.android.maps.StaticMapView;
import com.instagram.maps.ui.IgStaticMapView;
import com.instagram.model.venue.Venue;

/* renamed from: X.Vqe  reason: case insensitive filesystem */
public abstract class C18378Vqe {
    public static final StaticMapView.StaticMapOptions A00 = new StaticMapView.StaticMapOptions("location_map_row");

    public static void A00(VOP vop, VOV vov, Venue venue) {
        if (venue == null || venue.A00() == null || venue.A01() == null) {
            vov.A00.setEnabled(false);
            return;
        }
        double doubleValue = venue.A00().doubleValue();
        double doubleValue2 = venue.A01().doubleValue();
        StaticMapView.StaticMapOptions staticMapOptions = A00;
        staticMapOptions.A00();
        staticMapOptions.A03(14);
        if (!(venue.A00() == null || venue.A01() == null)) {
            staticMapOptions.A02(doubleValue, doubleValue2);
        }
        IgStaticMapView igStaticMapView = vov.A00;
        igStaticMapView.setEnabled(true);
        igStaticMapView.setMapOptions(staticMapOptions);
        WBG.A01(igStaticMapView, 64, venue, vop);
    }
}
