package X;

import java.io.IOException;

/* renamed from: X.Chh  reason: case insensitive filesystem */
public abstract class C44609Chh {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.Cwn] */
    public static C45456Cwn parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C41846B3n.A1Y(r4, A0q)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    obj.A03 = A0l;
                } else if ("asset_compression_type".equals(A0q)) {
                    obj.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("asset_url".equals(A0q)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    obj.A02 = A0l2;
                } else if ("filesize_bytes".equals(A0q)) {
                    obj.A00 = r4.A0y();
                } else if ("md5_hash".equals(A0q)) {
                    obj.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("cache_key".equals(A0q)) {
                    0qQ.A0B(AnonymousClass7TG.A0l(r4), 0);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
