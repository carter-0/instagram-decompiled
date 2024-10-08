package X;

import com.instagram.api.schemas.EntityImpl;
import java.io.IOException;

public abstract class CXN {
    public static EntityImpl parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                if (C41846B3n.A1Y(r8, A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("typename".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if (C41845B3m.A18(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (str != null || !(r8 instanceof 0c9)) {
                return new EntityImpl(str2, str, str3);
            }
            AnonymousClass7TF.A1L("typename", r8, "EntityImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
