package X;

import com.facebook.location.platform.api.Location;
import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;

/* renamed from: X.CjO  reason: case insensitive filesystem */
public abstract class C44696CjO {
    public static AnonymousClass1eN parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass1eN r0 = new AnonymousClass1eN();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("thread_key".equals(A17)) {
                    DirectThreadKey parseFromJson = C254733sx.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A02 = parseFromJson;
                } else if (Location.LATITUDE.equals(A17)) {
                    r0.A00 = r4.A0U();
                } else if ("longitude".equals(A17)) {
                    r0.A01 = r4.A0U();
                } else if ("localized_address".equals(A17)) {
                    r0.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("header_title_text".equals(A17)) {
                    r0.A03 = AnonymousClass7TG.A0l(r4);
                } else {
                    C66893Meb.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
