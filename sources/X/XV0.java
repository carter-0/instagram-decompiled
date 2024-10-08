package X;

import com.facebook.location.platform.api.Location;
import com.facebook.proxygen.TraceFieldType;

public abstract class XV0 {
    public static void A00(XbD xbD, 17Z r5) {
        r5.A0c();
        r5.A0P("base_station_id", xbD.A00);
        if (xbD.A08 != null) {
            r5.A0q("base_station_coordinates");
            C21391XZy xZy = xbD.A08;
            r5.A0c();
            r5.A0N(Location.LATITUDE, xZy.A00);
            r5.A0N("longitude", xZy.A01);
            r5.A0Z();
        }
        r5.A0P(TraceFieldType.NetworkID, xbD.A06);
        r5.A0P("system_id", xbD.A07);
        r5.A0P("cdma_rssi_dbm", xbD.A02);
        r5.A0P("cdma_ecio_db10", xbD.A01);
        r5.A0P("evdo_rssi_dbm", xbD.A04);
        r5.A0P("evdo_ecio_db10", xbD.A03);
        r5.A0P("evdo_signal_to_noise", xbD.A05);
        r5.A0Z();
    }
}
