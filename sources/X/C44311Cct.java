package X;

import com.instagram.api.schemas.ReelsMediaInteractivityType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cct  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44311Cct {
    public static Map A00(DU9 du9) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (du9.AyF() != null) {
            A1H.put("display_uri", du9.AyF());
        }
        if (du9.AzJ() != null) {
            A1H.put("duration_in_ms", du9.AzJ());
        }
        if (du9.BCo() != null) {
            A1H.put("headline", du9.BCo());
        }
        du9.CSO();
        A1H.put("is_eligible_for_tappable_tooltip", Boolean.valueOf(du9.CSO()));
        if (du9.BQQ() != null) {
            List<ReelsMediaInteractivityType> BQQ = du9.BQQ();
            if (BQQ != null) {
                arrayList = AnonymousClass7TG.A0r(BQQ);
                for (ReelsMediaInteractivityType reelsMediaInteractivityType : BQQ) {
                    0qQ.A0B(reelsMediaInteractivityType, 0);
                    arrayList.add(reelsMediaInteractivityType.A00);
                }
            } else {
                arrayList = null;
            }
            A1H.put("media_interactivity_types", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
