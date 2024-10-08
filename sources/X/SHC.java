package X;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

public final class SHC {
    public final Context A00;
    public final UserSession A01;
    public final 1Wr A02;

    public final String A00(String str) {
        Location location;
        List<Address> fromLocation;
        Address address;
        1Wr r2 = this.A02;
        if (r2 != null) {
            location = r2.getLastLocation(this.A01, 002.A0R("IgFBPayLocationAPI:", str));
        } else {
            location = null;
        }
        if (location == null || (fromLocation = new Geocoder(this.A00).getFromLocation(location.getLatitude(), location.getLongitude(), 10)) == null) {
            return null;
        }
        Iterator<Address> it = fromLocation.iterator();
        while (true) {
            if (!it.hasNext()) {
                address = null;
                break;
            }
            address = it.next();
            String postalCode = address.getPostalCode();
            if (postalCode != null && !00l.A0W(postalCode)) {
                break;
            }
        }
        Address address2 = address;
        if (address2 != null) {
            return address2.getPostalCode();
        }
        return null;
    }

    public SHC(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = 1Wr.A00;
    }

    public SHC() {
    }
}
