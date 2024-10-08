package X;

import com.facebook.android.maps.model.LatLng;
import java.util.Iterator;

public final class WFG implements X2B {
    public final /* synthetic */ VZ8 A00;

    public WFG(VZ8 vz8) {
        this.A00 = vz8;
    }

    public final void DPW(LatLng latLng) {
        Iterator it = this.A00.A02.iterator();
        while (it.hasNext()) {
            ((X2T) it.next()).DPW(latLng);
        }
    }
}
