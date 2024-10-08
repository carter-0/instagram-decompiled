package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CXg  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44141CXg {
    public static Map A00(C257693xo r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.B1a() != null) {
            A1H.put("end_scene_length", r3.B1a());
        }
        if (r3.B6w() != null) {
            A1H.put("follower_count", r3.B6w());
        }
        if (r3.CSh() != null) {
            A1H.put("is_end_scene_permanent", r3.CSh());
        }
        if (r3.BaI() != null) {
            A1H.put("page_name", r3.BaI());
        }
        if (r3.getSubtitle() != null) {
            A1H.put("subtitle", r3.getSubtitle());
        }
        return 0Yt.A0B(A1H);
    }
}
