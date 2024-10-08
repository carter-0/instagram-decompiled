package X;

import android.content.Context;
import android.location.Location;
import com.instagram.common.session.UserSession;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class T6B implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "MapLocationManager";
    public Location A00;
    public boolean A01;
    public final Context A02;
    public final AnonymousClass60p A03;
    public final UserSession A04;
    public final Set A05;
    public final C13709TfW A06;
    public final 1Wr A07;

    public T6B(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A02 = context;
        this.A04 = userSession;
        this.A03 = C242073Sn.A00(context, userSession).A05();
        1Wr r0 = 1Wr.A00;
        if (r0 != null) {
            this.A07 = r0;
            this.A06 = new C12130Sna(this, 1);
            this.A05 = new CopyOnWriteArraySet();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final Location A00(String str) {
        0qQ.A0B(str, 0);
        Context context = this.A02;
        UserSession userSession = this.A04;
        if (!1Wr.isLocationPermitted(context, userSession, "MEDIA_MAP")) {
            return null;
        }
        Location location = this.A00;
        if (location != null) {
            return location;
        }
        Location lastLocation = this.A07.getLastLocation(userSession, 002.A0R("MapLocationManager:", str));
        this.A00 = lastLocation;
        return lastLocation;
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void A01() {
        if (!this.A01 && 1Wr.isLocationPermitted(this.A02, this.A04, "MEDIA_MAP")) {
            this.A01 = true;
            this.A03.A07(this.A06, new AnonymousClass9QC((Float) null, AnonymousClass05K.A0C, (Long) null, 10000L, 10.0f, 0.6666667f, 120000, 500, false, true, true), __redex_internal_original_name);
        }
    }
}
