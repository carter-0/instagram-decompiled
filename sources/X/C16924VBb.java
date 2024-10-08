package X;

import com.instagram.discovery.mediamap.model.LocationPageInformation;
import java.io.IOException;

/* renamed from: X.VBb  reason: case insensitive filesystem */
public abstract class C16924VBb {
    /* JADX WARNING: type inference failed for: r0v5, types: [X.V39, java.lang.Object] */
    public static V39 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            LocationPageInformation locationPageInformation = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("page_info".equals(AnonymousClass7TE.A17(r3))) {
                    locationPageInformation = C16925VBc.parseFromJson(r3);
                }
                r3.A0z();
            }
            ? obj = new Object();
            obj.A00 = locationPageInformation;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
