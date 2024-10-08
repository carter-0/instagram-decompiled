package X;

import com.instagram.api.schemas.FBBioLinkSocialContextType;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CXT {
    public static Map A00(C282085Bj r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.AyC() != null) {
            A1H.put("display_text", r3.AyC());
        }
        r3.BOo();
        A1H.put("magnitude", Integer.valueOf(r3.BOo()));
        if (r3.BxV() != null) {
            FBBioLinkSocialContextType BxV = r3.BxV();
            0qQ.A0B(BxV, 0);
            A1H.put("social_context_type", BxV.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
