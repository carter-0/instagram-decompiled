package X;

import com.instagram.direct.model.DirectMessageEditHistory;
import java.io.IOException;

/* renamed from: X.4uu  reason: invalid class name and case insensitive filesystem */
public abstract class C277324uu {
    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.direct.model.DirectMessageEditHistory, java.lang.Object] */
    public static DirectMessageEditHistory parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            Long l = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("body".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("timestamp".equals(A0q)) {
                    l = Long.valueOf(r8.A0y());
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("body", "DirectMessageEditHistory");
            } else if (l != null || !(r8 instanceof 0c9)) {
                long longValue = l.longValue();
                0qQ.A0B(str, 1);
                ? obj = new Object();
                obj.A01 = str;
                obj.A00 = longValue;
                return obj;
            } else {
                ((0c9) r8).A03.A00("timestamp", "DirectMessageEditHistory");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
