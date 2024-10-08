package X;

import com.instagram.model.shopping.ProductSource;
import java.io.IOException;

/* renamed from: X.VEu  reason: case insensitive filesystem */
public abstract class C17020VEu {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.model.shopping.ProductSource, java.lang.Object] */
    public static ProductSource parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C41846B3n.A1Y(r3, A0q)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A1C(A0q)) {
                    obj.A00 = C17019VEt.A00(AnonymousClass7TG.A0l(r3));
                } else if (C41845B3m.A1E(A0q)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("subtitle".equals(A0q)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("image_url".equals(A0q)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
