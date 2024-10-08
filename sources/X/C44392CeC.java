package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CeC  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44392CeC {
    public static Map A00(DUB dub) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dub.B4W() != null) {
            A1H.put("fb_tag_id", dub.B4W());
        }
        if (dub.B4X() != null) {
            A1H.put("fb_tag_name", dub.B4X());
        }
        if (dub.B4a() != null) {
            A1H.put("fb_tag_type", dub.B4a());
        }
        if (dub.B4b() != null) {
            A1H.put("fb_tag_url", dub.B4b());
        }
        if (dub.getPk() != null) {
            A1H.put("pk", dub.getPk());
        }
        return 0Yt.A0B(A1H);
    }
}
