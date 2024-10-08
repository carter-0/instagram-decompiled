package X;

import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;

public final class WIO implements X2S {
    public final /* synthetic */ C18663VwL A00;

    public WIO(C18663VwL vwL) {
        this.A00 = vwL;
    }

    public final void D03(CameraPosition cameraPosition) {
        C18663VwL vwL = this.A00;
        X8V x8v = vwL.A03;
        LatLng latLng = cameraPosition.A03;
        x8v.DYH(vwL, new C17368VSv(latLng.A00, latLng.A01, cameraPosition.A02));
    }
}
