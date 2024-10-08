package X;

import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDictImpl;
import java.io.IOException;

/* renamed from: X.3ta  reason: invalid class name and case insensitive filesystem */
public abstract class C255103ta {
    public static AnonymousClass53S parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            IGAdCreationOptimizationPayloadDictImpl iGAdCreationOptimizationPayloadDictImpl = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("adCreativeOptimizationPayload".equals(A0q)) {
                    iGAdCreationOptimizationPayloadDictImpl = AnonymousClass53M.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new AnonymousClass53S(iGAdCreationOptimizationPayloadDictImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
