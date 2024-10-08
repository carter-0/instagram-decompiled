package X;

import android.content.Context;
import android.location.Geocoder;
import android.os.Build;
import com.facebook.locationsharing.core.models.Address;
import com.facebook.locationsharing.core.models.Location;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectShareTarget;
import java.io.IOException;
import java.util.List;

public final class SIV {
    public final UserSession A00;
    public final DirectShareTarget A01;
    public final Context A02;
    public final Geocoder A03;

    public static final Address A00(List list, double d, double d2) {
        String addressLine = ((android.location.Address) list.get(0)).getAddressLine(0);
        C11367SPk.A03(addressLine, AnonymousClass000.A00(1558));
        return new Address(new Location(AnonymousClass7TE.A1F(), d, d2, -1, AnonymousClass972.MUTABLE_FLAG_MASK, -1), addressLine);
    }

    public final void A01(C13919TlL tlL, Address address) {
        String A08;
        DirectShareTarget directShareTarget = this.A01;
        if (!(directShareTarget == null || (A08 = directShareTarget.A08()) == null)) {
            UserSession userSession = this.A00;
            Location location = address.A00;
            float f = (float) location.A00;
            float f2 = (float) location.A01;
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("direct_v2/threads/broadcast/pinned_location/");
            A0a.A0Q(1XP.class, 1XY.class);
            A0a.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A08);
            A0a.A0B(com.facebook.location.platform.api.Location.LATITUDE, f);
            A0a.A0B("longitude", f2);
            1ES.A03(A0a.A0M());
        }
        tlL.onSuccess();
    }

    public final void A02(C13920TlM tlM, double d, double d2) {
        C13920TlM tlM2 = tlM;
        try {
            double d3 = d;
            double d4 = d2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.A03.getFromLocation(d3, d4, 1, new C11447SVj(tlM2, this, d3, d4));
                return;
            }
            List<android.location.Address> fromLocation = this.A03.getFromLocation(d3, d4, 1);
            if (fromLocation != null && !fromLocation.isEmpty()) {
                tlM2.onSuccess(A00(fromLocation, d3, d4));
            }
        } catch (IOException e) {
            tlM2.onError(e);
        }
    }

    public SIV(Context context, UserSession userSession, DirectShareTarget directShareTarget) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A02 = context;
        this.A00 = userSession;
        this.A01 = directShareTarget;
        this.A03 = new Geocoder(context);
    }
}
