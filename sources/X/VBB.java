package X;

import com.instagram.model.venue.LocationDict;
import java.io.IOException;

public abstract class VBB {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.6MU, X.9m4, java.lang.Object] */
    public static C387349m4 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("venue".equals(A17)) {
                    LocationDict parseFromJson = AnonymousClass41Q.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    obj.A00 = parseFromJson;
                } else if ("themed_color".equals(A17)) {
                    obj.A01 = AnonymousClass7TF.A0X(r4);
                } else {
                    AAV.A01(r4, obj, A17);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
