package X;

import java.io.IOException;

public final class LKB {
    public static C63674L2k parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C63674L2k l2k = new C63674L2k();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("ig_live_video_comment_create_subscribe".equals(AnonymousClass7TE.A17(r4))) {
                    LA3 parseFromJson = C63482Kxl.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    l2k.A00 = parseFromJson;
                }
                r4.A0z();
            }
            return l2k;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
