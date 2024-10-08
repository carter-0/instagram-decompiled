package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cf0  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44442Cf0 {
    public static Map A00(C46301DUe dUe) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUe.BLb() != null) {
            A1H.put("latest_slider_vote_time", dUe.BLb());
        }
        if (dUe.BP8() != null) {
            A1H.put("max_id", dUe.BP8());
        }
        if (dUe.BU7() != null) {
            A1H.put("more_available", dUe.BU7());
        }
        if (dUe.getSliderId() != null) {
            A1H.put("slider_id", dUe.getSliderId());
        }
        if (dUe.CG0() != null) {
            List<C46296DTz> CG0 = dUe.CG0();
            ArrayList arrayList = null;
            if (CG0 != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46296DTz dTz : CG0) {
                    if (dTz != null) {
                        arrayList.add(dTz.FHC());
                    }
                }
            }
            A1H.put("voters", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
