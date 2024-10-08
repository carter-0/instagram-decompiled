package X;

import com.instagram.business.promote.model.AudienceGeoLocation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WOd  reason: case insensitive filesystem */
public final class C19171WOd implements X3P {
    public final /* synthetic */ UZ7 A00;

    public C19171WOd(UZ7 uz7) {
        this.A00 = uz7;
    }

    public final void DLt(AudienceGeoLocation audienceGeoLocation) {
        U92 u92 = (U92) this.A00.A0B.getValue();
        List list = u92.A0A().A05;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            DbV.A1U(next, arrayList, 0qQ.A0K(((AudienceGeoLocation) next).A06, audienceGeoLocation.A06) ? 1 : 0);
        }
        U92.A05(u92, 00k.A0U(arrayList));
    }
}
