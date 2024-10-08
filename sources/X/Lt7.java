package X;

import android.location.Location;
import com.instagram.location.intf.LocationSignalPackage;

public final class Lt7 implements MSX {
    public final /* synthetic */ K5H A00;

    public Lt7(K5H k5h) {
        this.A00 = k5h;
    }

    public final void DOn(LocationSignalPackage locationSignalPackage) {
        Location BNg = locationSignalPackage.BNg();
        K5H k5h = this.A00;
        Location location = (Location) k5h.requireArguments().getParcelable("INTENT_EXTRA_PHOTO_LOCATION");
        if (location == null || BNg == null || ((double) BNg.distanceTo(location)) <= 1000.0d) {
            k5h.A02 = BNg;
            k5h.A0F = locationSignalPackage;
            K5H.A04(k5h);
            return;
        }
        K5H.A09(k5h);
        K5H.A07(k5h);
    }
}
