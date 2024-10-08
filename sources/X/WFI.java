package X;

import com.facebook.android.maps.model.LatLng;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.Venue;

public final class WFI implements X2B {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ C15260UXv A01;
    public final /* synthetic */ VOO A02;
    public final /* synthetic */ Venue A03;

    public WFI(ImageUrl imageUrl, C15260UXv uXv, VOO voo, Venue venue) {
        this.A02 = voo;
        this.A03 = venue;
        this.A00 = imageUrl;
        this.A01 = uXv;
    }

    public final void DPW(LatLng latLng) {
        VOO voo = this.A02;
        if (voo != null) {
            C15357Ub9.A00(this.A00, voo.A00, this.A03, false);
        }
    }
}
