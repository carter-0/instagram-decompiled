package X;

import android.os.Handler;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.facebook.locationsharing.core.models.Location;
import java.util.HashSet;

public final class WIN implements X2S {
    public final /* synthetic */ C15931Ukw A00;

    public WIN(C15931Ukw ukw) {
        this.A00 = ukw;
    }

    public final void D03(CameraPosition cameraPosition) {
        UHR uhr = this.A00.A02;
        if (uhr == null) {
            0qQ.A0F("locationSharingPresenter");
            throw AnonymousClass00P.createAndThrow();
        }
        LatLng latLng = cameraPosition.A03;
        double d = latLng.A00;
        double d2 = latLng.A01;
        if (uhr.A00) {
            Handler handler = uhr.A00;
            Runnable runnable = uhr.A07;
            handler.removeCallbacks(runnable);
            if (UHR.A00(uhr).A0D) {
                handler.postDelayed(runnable, 200);
            }
            UHS.A04(uhr, new Location(new HashSet(), d, d2, -1, AnonymousClass972.MUTABLE_FLAG_MASK, -1), "MAP_MOVED");
        }
    }
}
