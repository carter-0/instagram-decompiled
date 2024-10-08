package X;

import com.instagram.model.mapquery.MapQuery;
import java.io.IOException;

/* renamed from: X.O2c  reason: case insensitive filesystem */
public abstract class C70324O2c {
    public static C69156Nff parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C69156Nff nff = new C69156Nff();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("map_query".equals(A17)) {
                    MapQuery parseFromJson = C70896OQo.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    nff.A00 = parseFromJson;
                } else {
                    C66941Mfa.A01(r4, nff, A17);
                }
                r4.A0z();
            }
            return nff;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
