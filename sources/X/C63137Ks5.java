package X;

import android.app.Activity;
import android.location.Location;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.location.intf.LocationSignalPackage;
import java.util.HashMap;

/* renamed from: X.Ks5  reason: case insensitive filesystem */
public abstract class C63137Ks5 {
    public static final void A00(Activity activity, UserSession userSession, C3499682q r10) {
        Location location;
        HashMap hashMap;
        CreationSession creationSession = ((JWE) r10).A01;
        MediaSession mediaSession = creationSession.A07;
        if (mediaSession != null) {
            location = mediaSession.BNg();
        } else {
            location = null;
        }
        LocationSignalPackage locationSignalPackage = creationSession.A08;
        if (location == null) {
            1Wr r1 = 1Wr.A00;
            if (r1 != null) {
                0qQ.A0A(userSession);
                location = r1.getLastLocation(userSession, "NearbyVenuePrefetchHelper");
                if (location == null || !C270984hi.A00(location)) {
                    return;
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        long j = -1;
        if (r10.E2M() != null) {
            if (userSession != null) {
                AnonymousClass3Q2 A03 = 28K.A00(userSession).A03(r10.E2M());
                if (!(A03 == null || (hashMap = A03.A44) == null)) {
                    j = C9859RiY.A00(DbS.A0r("date_time_original", hashMap), AnonymousClass7TF.A1W(A03.A1G, 1iA.A0Q));
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        0qQ.A0A(activity);
        0qQ.A0A(userSession);
        NearbyVenuesService.A01(activity, location, userSession, locationSignalPackage, Long.valueOf(j));
    }
}
