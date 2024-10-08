package X;

import com.instagram.common.typedurl.GifUrlLoggingExtras;
import java.io.IOException;

public abstract class VB2 {
    public static GifUrlLoggingExtras parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            String str2 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("a_pk".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r6);
                } else if ("m_pk".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("tracking_token".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new GifUrlLoggingExtras(l, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
