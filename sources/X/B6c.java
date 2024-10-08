package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B6c {
    public static Map A00(C279514yl r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.BZc() != null) {
            A1H.put("overall_effect_id", r4.BZc());
        }
        if (r4.BrQ() != null) {
            List<DSW> BrQ = r4.BrQ();
            ArrayList arrayList = null;
            if (BrQ != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DSW dsw : BrQ) {
                    if (dsw != null) {
                        arrayList.add(dsw.FHC());
                    }
                }
            }
            A1H.put("segment_effects_info", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
