package X;

import java.io.IOException;

public abstract class V78 {
    public static UMr parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("actionLink".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("actionLinkFallback".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if (!"fallbackCTALabel".equals(A17)) {
                    num = C41847B3o.A13(r7, num, A17, "fallbackDestination");
                } else if (r7.A11() == 16L.A0G) {
                    str3 = null;
                } else {
                    str3 = r7.A1P();
                }
                r7.A0z();
            }
            return new UMr(num, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
