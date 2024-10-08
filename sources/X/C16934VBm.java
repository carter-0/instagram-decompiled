package X;

import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.discovery.refinement.model.RefinementAttributes;
import java.io.IOException;

/* renamed from: X.VBm  reason: case insensitive filesystem */
public abstract class C16934VBm {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.instagram.discovery.refinement.model.Refinement] */
    public static Refinement parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            RefinementAttributes refinementAttributes = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("display_text".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if ("attributes".equals(A17)) {
                    refinementAttributes = C16933VBl.parseFromJson(r5);
                }
                r5.A0z();
            }
            ? obj = new Object();
            if (str != null) {
                obj.A01 = str;
            }
            if (refinementAttributes != null) {
                obj.A00 = refinementAttributes;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
