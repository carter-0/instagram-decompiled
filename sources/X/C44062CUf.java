package X;

import com.instagram.api.schemas.AudienceMessageEntityRangeImpl;
import java.io.IOException;

/* renamed from: X.CUf  reason: case insensitive filesystem */
public abstract class C44062CUf {
    public static AudienceMessageEntityRangeImpl parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("length".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if ("offset".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r6);
                } else if (C41845B3m.A18(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new AudienceMessageEntityRangeImpl(num, num2, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
