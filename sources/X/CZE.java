package X;

import com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CZE {
    public static Map A00(C257773xw r3) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.BFY() != null) {
            IGPBIAProfileBrowseTypeEnum BFY = r3.BFY();
            if (BFY != null) {
                str = BFY.A00;
            } else {
                str = null;
            }
            A1H.put("ig_pbia_profile_and_browse_type", str);
        }
        if (r3.BuS() != null) {
            A1H.put("should_render_dimmer", r3.BuS());
        }
        return 0Yt.A0B(A1H);
    }
}
