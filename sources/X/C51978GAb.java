package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GAb  reason: case insensitive filesystem */
public abstract /* synthetic */ class C51978GAb {
    public static Map A00(C67241sS r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.B1J() != null) {
            A1H.put("enable_user_engagement_base_insertion", r4.B1J());
        }
        if (r4.BPU() != null) {
            A1H.put("max_xout_prediction_threshold", r4.BPU());
        }
        if (r4.Be8() != null) {
            A1H.put("post_gap_to_previous_ad", r4.Be8());
        }
        if (r4.Be9() != null) {
            A1H.put("post_gap_to_previous_netego", r4.Be9());
        }
        if (r4.BeX() != null) {
            A1H.put("predicted_xout_rate", r4.BeX());
        }
        if (r4.BiN() != null) {
            A1H.put("push_up_min_gap", r4.BiN());
        }
        if (r4.C7G() != null) {
            A1H.put("time_based_insertion_gap_in_seconds", r4.C7G());
        }
        if (r4.CCl() != null) {
            List<DT2> CCl = r4.CCl();
            ArrayList arrayList = null;
            if (CCl != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DT2 dt2 : CCl) {
                    if (dt2 != null) {
                        arrayList.add(dt2.FHC());
                    }
                }
            }
            A1H.put(AnonymousClass000.A00(4171), arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
