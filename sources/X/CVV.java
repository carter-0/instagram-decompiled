package X;

import com.instagram.api.schemas.ClipChainType;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CVV {
    public static Map A00(DTA dta) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        dta.Anm();
        A1H.put("clip_count", Integer.valueOf(dta.Anm()));
        if (dta.Ans() != null) {
            ClipChainType Ans = dta.Ans();
            0qQ.A0B(Ans, 0);
            A1H.put("clips_chain_type", Ans.A00);
        }
        if (dta.getTitle() != null) {
            C41845B3m.A12(dta.getTitle(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
