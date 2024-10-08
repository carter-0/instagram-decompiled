package X;

import com.instagram.discovery.refinement.model.RefinementAttributes;
import java.io.IOException;

/* renamed from: X.VBl  reason: case insensitive filesystem */
public abstract class C16933VBl {
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.discovery.refinement.model.RefinementAttributes, java.lang.Object] */
    public static RefinementAttributes parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("category_id".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("category".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("on_sale".equals(A17)) {
                    obj.A05 = r3.A0d();
                } else if ("keyword".equals(A17)) {
                    obj.A02 = C67385Mn1.parseFromJson(r3);
                } else if (C66579MXk.A00(351).equals(A17)) {
                    obj.A00 = C16932VBk.parseFromJson(r3);
                }
                r3.A0z();
            }
            obj.A00();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
