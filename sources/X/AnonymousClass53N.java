package X;

import com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDictImpl;
import java.io.IOException;

/* renamed from: X.53N  reason: invalid class name */
public abstract class AnonymousClass53N {
    public static IGAdCreativeOptimizationConfigByTypeDictImpl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("optimizationType".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if ("optionValue".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new IGAdCreativeOptimizationConfigByTypeDictImpl(str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
