package X;

import com.instagram.api.schemas.FormattedStringImpl;
import java.io.IOException;

/* renamed from: X.CXr  reason: case insensitive filesystem */
public abstract class C44152CXr {
    public static FormattedStringImpl parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            while (r6.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r6, "text")) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                }
                r6.A0z();
            }
            if (str != null || !(r6 instanceof 0c9)) {
                return new FormattedStringImpl(str);
            }
            AnonymousClass7TF.A1L("text", r6, "FormattedStringImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
