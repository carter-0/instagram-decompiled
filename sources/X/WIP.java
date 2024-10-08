package X;

import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;

public final class WIP implements X2S {
    public final /* synthetic */ WFU A00;
    public final /* synthetic */ C18663VwL A01;

    public WIP(WFU wfu, C18663VwL vwL) {
        this.A01 = vwL;
        this.A00 = wfu;
    }

    public final void D03(CameraPosition cameraPosition) {
        C18663VwL vwL = this.A01;
        C17367VSu A02 = vwL.A02();
        if (A02 != null) {
            LatLng latLng = new LatLng(A02.A00, A02.A01);
            X8V x8v = vwL.A03;
            boolean z = false;
            if (this.A00.A0I.A0W) {
                z = true;
            }
            x8v.D0D(latLng, !z);
        }
    }
}
