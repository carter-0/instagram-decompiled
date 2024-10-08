package X;

import com.facebook.location.platform.api.Location;
import java.io.IOException;

public abstract class O3E {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.OTt, java.lang.Object] */
    public static C70972OTt parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C41846B3n.A1Y(r4, A0q)) {
                    obj.A06 = AnonymousClass7TG.A0l(r4);
                } else if (Location.LATITUDE.equals(A0q)) {
                    obj.A00 = (float) r4.A0U();
                } else if ("longitude".equals(A0q)) {
                    obj.A01 = (float) r4.A0U();
                } else if ("timestamp".equals(A0q)) {
                    obj.A04 = r4.A0y();
                } else if ("status_update_timestamp".equals(A0q)) {
                    obj.A03 = r4.A0y();
                } else if ("location".equals(A0q)) {
                    obj.A07 = AnonymousClass7TG.A0l(r4);
                } else if ("device".equals(A0q)) {
                    obj.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("is_current".equals(A0q)) {
                    obj.A0A = r4.A0d();
                } else if (C66584MXp.A0S().equals(A0q)) {
                    obj.A08 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
