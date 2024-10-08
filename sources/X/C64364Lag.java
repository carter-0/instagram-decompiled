package X;

import android.location.Location;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.location.impl.LocationSignalPackageImpl;
import com.instagram.location.intf.LocationSignalPackage;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Lag  reason: case insensitive filesystem */
public abstract class C64364Lag implements CallerContextable {
    public static final String __redex_internal_original_name = "NearbyVenuesApi";

    public static final 1OC A00(Location location, UserSession userSession, LocationSignalPackage locationSignalPackage, String str, String str2, long j) {
        Integer num;
        String str3;
        0qQ.A0B(userSession, 0);
        1NY A0M = DbU.A0M(userSession);
        if (locationSignalPackage != null) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0N;
        }
        A0M.A08(num);
        A0M.A0A("location_search/");
        A0M.A0O((15p) null, C22328Xzd.class, LIY.class, false);
        if (location != null) {
            A0M.A9m(com.facebook.location.platform.api.Location.LATITUDE, String.valueOf(location.getLatitude()));
            str3 = String.valueOf(location.getLongitude());
        } else {
            str3 = "0.000000";
            A0M.A9m(com.facebook.location.platform.api.Location.LATITUDE, str3);
        }
        A0M.A9m("longitude", str3);
        if (j > 0) {
            A0M.A9m("timestamp", String.valueOf(j));
        }
        if (str != null) {
            A0M.A9m("search_query", str);
        }
        if (!(str2 == null || str2.length() == 0)) {
            A0M.A9m("rankToken", str2);
        }
        if (locationSignalPackage != null) {
            C298285tB A01 = C298215t4.A01((Boolean) null, (Integer) null, (String) null, (String) null, (String) null, Collections.singletonList(((LocationSignalPackageImpl) locationSignalPackage).A00), (List) null);
            C298235t6 r5 = A01.A02;
            C298225t5 r4 = A01.A04;
            try {
                StringWriter A0v = JTO.A0v();
                17W A0K = AnonymousClass7TF.A0K(A0v);
                if (r4 != null) {
                    A0K.A0q("wifi_info");
                    C298305tD.A00(r4, A0K);
                }
                if (r5 != null) {
                    A0K.A0q(C273654mx.A00(2101));
                    C298325tF.A00(r5, A0K);
                }
                A0M.A9m("signal_package", AnonymousClass7TG.A0k(A0K, A0v));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return A0M.A0M();
    }
}
