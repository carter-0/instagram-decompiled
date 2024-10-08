package X;

import com.instagram.api.schemas.MetaGalleryNetegoInStoryMediaType;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CaS {
    public static Map A00(C46252DSh dSh) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dSh.BR6() != null) {
            MetaGalleryNetegoInStoryMediaType BR6 = dSh.BR6();
            if (BR6 != null) {
                str = BR6.A00;
            } else {
                str = null;
            }
            A1H.put("media_type", str);
        }
        if (dSh.BRI() != null) {
            A1H.put("media_url", dSh.BRI());
        }
        return 0Yt.A0B(A1H);
    }
}
