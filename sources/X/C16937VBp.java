package X;

import com.instagram.discovery.related.model.RelatedItem;
import java.io.IOException;

/* renamed from: X.VBp  reason: case insensitive filesystem */
public abstract class C16937VBp {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.discovery.related.model.RelatedItem, java.lang.Object] */
    public static RelatedItem parseFromJson(16F r3) {
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
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A19(A0q)) {
                    obj.A05 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A1C(A0q)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("profile_pic_url".equals(A0q)) {
                    obj.A01 = 16h.A00(r3);
                } else if ("media_count".equals(A0q)) {
                    obj.A00 = r3.A1D();
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
