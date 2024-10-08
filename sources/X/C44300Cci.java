package X;

import com.instagram.api.schemas.EntityImpl;
import com.instagram.api.schemas.Range;
import java.io.IOException;

/* renamed from: X.Cci  reason: case insensitive filesystem */
public abstract class C44300Cci {
    public static Range parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            EntityImpl entityImpl = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("entity".equals(A17)) {
                    entityImpl = CXN.parseFromJson(r5);
                } else if ("length".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r5);
                } else {
                    num2 = C41847B3o.A13(r5, num2, A17, "offset");
                }
                r5.A0z();
            }
            return new Range(entityImpl, num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
