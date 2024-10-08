package X;

import android.content.Context;
import com.facebook.locationsharing.core.models.Location;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Vhz  reason: case insensitive filesystem */
public final class C17908Vhz {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;
    public final VN2 A04;
    public final Set A05 = new HashSet();
    public final T6B A06;

    public final Location A00() {
        android.location.Location A002 = this.A06.A00(002.A0R("DirectLocationFacade:", "LocationSharingPresenter"));
        if (A002 == null) {
            return null;
        }
        return new Location(new HashSet(), A002.getLatitude(), A002.getLongitude(), -1, AnonymousClass972.MUTABLE_FLAG_MASK, -1);
    }

    public C17908Vhz(Context context, UserSession userSession) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A02 = context;
        this.A03 = userSession;
        this.A06 = new T6B(context, userSession);
        this.A04 = new VN2();
    }
}
