package X;

import com.instagram.discovery.refinement.model.QueryInformation;
import java.io.IOException;

/* renamed from: X.VBk  reason: case insensitive filesystem */
public abstract class C16932VBk {
    public static QueryInformation parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("query_type".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if (AnonymousClass000.A00(1733).equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                }
                r5.A0z();
            }
            QueryInformation queryInformation = new QueryInformation();
            if (str != null) {
                queryInformation.A00 = str;
            }
            if (str2 != null) {
                queryInformation.A01 = str2;
            }
            return queryInformation;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
