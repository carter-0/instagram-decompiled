package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class T87 implements AnonymousClass5IX {
    public final Context A00;
    public final UserSession A01;

    public final boolean E1z(AnonymousClass5IY r4) {
        Context context = this.A00;
        if (!1Wr.isLocationPermitted(context, this.A01, "LOCATION_SERVICE_ENABLED_FILTER") || !1Wr.isLocationEnabled(context)) {
            return false;
        }
        return true;
    }

    public T87(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
