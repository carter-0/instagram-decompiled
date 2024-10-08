package com.instagram.creation.location;

import X.02C;
import X.09i;
import X.0KC;
import X.1ES;
import X.1OC;
import X.AnonymousClass00P;
import X.AnonymousClass1Nd;
import X.AnonymousClass7TG;
import X.C22328Xzd;
import X.C41845B3m;
import X.C60916Jta;
import X.C62810vf;
import X.C64364Lag;
import X.C64677Lg3;
import X.KAR;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.location.intf.LocationSignalPackage;
import java.util.List;

public class NearbyVenuesService extends C62810vf {
    public static Location A00;
    public static C22328Xzd A01;
    public static LocationSignalPackage A02;

    public static synchronized C22328Xzd A00(Location location) {
        C22328Xzd xzd;
        Location location2;
        synchronized (NearbyVenuesService.class) {
            if (A01 == null || (location2 = A00) == null || location == null || location.distanceTo(location2) >= 20.0f) {
                xzd = null;
            } else {
                xzd = A01;
            }
        }
        return xzd;
    }

    public static void A02(UserSession userSession, C22328Xzd xzd) {
        C64677Lg3 lg3;
        if (xzd != null) {
            C60916Jta jta = xzd.A00.A00;
            if (jta == null) {
                C41845B3m.A0v();
                throw AnonymousClass00P.createAndThrow();
            }
            lg3 = new C64677Lg3(jta.A01, xzd.BjE(), xzd.getItems());
        } else {
            lg3 = new C64677Lg3((String) null, (String) null, (List) null);
        }
        AnonymousClass1Nd.A00(userSession).A00(lg3);
    }

    public static void A01(Context context, Location location, UserSession userSession, LocationSignalPackage locationSignalPackage, Long l) {
        String A0j = AnonymousClass7TG.A0j();
        Class<NearbyVenuesService> cls = NearbyVenuesService.class;
        Intent intent = new Intent(context, cls);
        intent.putExtra("location", location);
        intent.putExtra("requestId", A0j);
        intent.putExtra("rankToken", A0j);
        intent.putExtra("signalPackage", locationSignalPackage);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        intent.putExtra("timestamp", l);
        02C.enqueueWork(context, cls, 1, intent);
    }

    public final void onHandleWork(Intent intent) {
        float f;
        C22328Xzd xzd;
        LocationSignalPackage locationSignalPackage;
        Bundle extras = intent.getExtras();
        extras.getClass();
        UserSession A06 = 09i.A0A.A06(extras);
        Location location = (Location) intent.getParcelableExtra("location");
        String stringExtra = intent.getStringExtra("rankToken");
        long longExtra = intent.getLongExtra("timestamp", -1);
        LocationSignalPackage locationSignalPackage2 = (LocationSignalPackage) intent.getParcelableExtra("signalPackage");
        if (location == null) {
            0KC.A0C("NearbyVenuesService", "Cannot query venues for null location");
            xzd = null;
        } else {
            Location location2 = A00;
            float f2 = Float.MAX_VALUE;
            if (location2 != null) {
                f = location.distanceTo(location2);
            } else {
                f = Float.MAX_VALUE;
            }
            if (!(locationSignalPackage2 == null || locationSignalPackage2.BNg() == null || (locationSignalPackage = A02) == null || locationSignalPackage.BNg() == null)) {
                f2 = locationSignalPackage2.BNg().distanceTo(A02.BNg());
            }
            if (A00 == null || f >= 20.0f || (locationSignalPackage2 != null && f2 >= 20.0f)) {
                1OC A002 = C64364Lag.A00(location, A06, locationSignalPackage2, (String) null, stringExtra, longExtra);
                A002.A00 = new KAR(2, location, locationSignalPackage2, A06);
                1ES.A02(A002);
                return;
            }
            xzd = A01;
        }
        A02(A06, xzd);
    }
}
