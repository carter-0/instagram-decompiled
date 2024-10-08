package X;

import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDictImpl;
import com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDictImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.53M  reason: invalid class name */
public abstract class AnonymousClass53M {
    public static IGAdCreationOptimizationPayloadDictImpl parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("adCreativeOptimizationConfigByType".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            IGAdCreativeOptimizationConfigByTypeDictImpl parseFromJson = AnonymousClass53N.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r4.A0z();
            }
            return new IGAdCreationOptimizationPayloadDictImpl(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
