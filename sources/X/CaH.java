package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CaH {
    public static Map A00(AnonymousClass3I4 r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        r3.B2m();
        A1H.put("expiring_at", Long.valueOf(r3.B2m()));
        if (r3.getId() != null) {
            C41845B3m.A0x(r3.getId(), A1H);
        }
        if (r3.BGO() != null) {
            A1H.put("image_versions2", r3.BGO().FHC());
        }
        if (r3.getMediaType() != null) {
            A1H.put("media_type", r3.getMediaType());
        }
        if (r3.getPreview() != null) {
            A1H.put("preview", r3.getPreview());
        }
        return 0Yt.A0B(A1H);
    }
}
