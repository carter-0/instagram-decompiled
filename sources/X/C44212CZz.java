package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CZz  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44212CZz {
    public static Map A00(C46315DUs dUs) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUs.Aoi() != null) {
            A1H.put("collection_id", dUs.Aoi());
        }
        if (dUs.getEffectId() != null) {
            A1H.put("effect_id", dUs.getEffectId());
        }
        if (dUs.B0I() != null) {
            A1H.put("effect_type", dUs.B0I());
        }
        if (dUs.B3Z() != null) {
            A1H.put("facebook_places_id", dUs.B3Z());
        }
        if (dUs.CQI() != null) {
            A1H.put("is_collected", dUs.CQI());
        }
        dUs.BLU();
        A1H.put("lat", AnonymousClass7TF.A0T(dUs.BLU()));
        dUs.BNU();
        A1H.put("lng", AnonymousClass7TF.A0T(dUs.BNU()));
        if (dUs.getName() != null) {
            C41845B3m.A0z(dUs.getName(), A1H);
        }
        if (dUs.Bct() != null) {
            A1H.put("placement_id", dUs.Bct());
        }
        if (dUs.Bj6() != null) {
            A1H.put("radius", AnonymousClass7TH.A0D(dUs.Bj6()));
        }
        return 0Yt.A0B(A1H);
    }
}
