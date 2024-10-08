package X;

import android.util.Pair;
import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;
import com.facebook.maps.ttrc.common.MapboxTTRC;

/* renamed from: X.Wlx  reason: case insensitive filesystem */
public final class C20137Wlx implements Runnable {
    public final /* synthetic */ VZ8 A00;
    public final /* synthetic */ WFX A01;

    public C20137Wlx(VZ8 vz8, WFX wfx) {
        this.A01 = wfx;
        this.A00 = vz8;
    }

    public final void run() {
        LatLngBounds A012 = W2R.A03(this.A00.A01).A01();
        WFX wfx = this.A01;
        wfx.A00.getClass();
        float f = wfx.A00.A01.A02().A02;
        LatLng latLng = A012.A00;
        double d = latLng.A00;
        LatLng latLng2 = A012.A01;
        double d2 = latLng2.A00;
        double d3 = latLng.A01;
        double d4 = latLng2.A01;
        double d5 = (double) f;
        synchronized (MapboxTTRC.class) {
            if (MapboxTTRC.sTTRCTrace != null) {
                int floor = (int) Math.floor(d5);
                Pair projectCoordinateToTile = MapboxTTRC.projectCoordinateToTile(d, d4, floor);
                Pair projectCoordinateToTile2 = MapboxTTRC.projectCoordinateToTile(d2, d3, floor);
                long floor2 = ((long) ((((int) Math.floor(((Double) projectCoordinateToTile2.second).doubleValue())) - ((int) Math.floor(((Double) projectCoordinateToTile.second).doubleValue()))) + 1)) * ((long) ((((int) Math.floor(((Double) projectCoordinateToTile2.first).doubleValue())) - ((int) Math.floor(((Double) projectCoordinateToTile.first).doubleValue()))) + 1));
                if (floor2 < 1 || floor2 > 9) {
                    MapboxTTRC.sFbErrorReporter.Ew0("MapboxTTRC", 002.A0Q("Bad expected tile count ", floor2));
                    MapboxTTRC.sTTRCTrace.CmG("midgard_tile_error", true);
                    floor2 = 1;
                }
                C17611Vb3 vb3 = MapboxTTRC.sMidgardRequestTracker;
                vb3.A00 = (int) floor2;
                vb3.A02 = floor;
                MapboxTTRC.sTTRCTrace.CmE("midgard_request_count", floor2);
            }
        }
    }
}
