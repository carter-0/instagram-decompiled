package X;

import java.io.IOException;

public abstract class VHT {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.VYh, java.lang.Object] */
    public static C17503VYh parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (AnonymousClass9NJ.A00(61, 8, 97).equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r5);
                } else if ("pk".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("full_name".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r5);
                } else if ("profile_pic_url".equals(A17)) {
                    obj.A00 = 16h.A00(r5);
                } else if ("profile_pic_id".equals(A17)) {
                    C41846B3n.A1A(r5);
                } else if ("seller_shoppable_feed_type".equals(A17)) {
                    16m.A00(AnonymousClass7TG.A0l(r5));
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
