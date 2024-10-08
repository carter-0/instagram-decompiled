package X;

import com.instagram.maps.raster.IgRasterMapView;

public final /* synthetic */ class WFO implements X2E {
    public final /* synthetic */ X2U A00;
    public final /* synthetic */ IgRasterMapView A01;

    public /* synthetic */ WFO(X2U x2u, IgRasterMapView igRasterMapView) {
        this.A01 = igRasterMapView;
        this.A00 = x2u;
    }

    public final void DPZ(WFU wfu) {
        IgRasterMapView igRasterMapView = this.A01;
        X2U x2u = this.A00;
        VZ8 vz8 = igRasterMapView.A02;
        if (vz8 == null) {
            vz8 = new VZ8(wfu);
            igRasterMapView.A02 = vz8;
        }
        x2u.DPa(vz8);
    }
}
