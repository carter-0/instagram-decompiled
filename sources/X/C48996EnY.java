package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.EnY  reason: case insensitive filesystem */
public abstract class C48996EnY {
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.EuG] */
    public static C49352EuG parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            SimpleImageUrl simpleImageUrl = null;
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(1586).equals(A17)) {
                    simpleImageUrl = 16h.A00(r3);
                } else {
                    if (C66579MXk.A00(965).equals(A17)) {
                        if (r3.A11() == 16L.A0G) {
                        }
                    } else if (C41845B3m.A1E(A17)) {
                        if (r3.A11() == 16L.A0G) {
                        }
                    }
                    r3.A1P();
                }
                r3.A0z();
            }
            ? obj = new Object();
            if (simpleImageUrl != null) {
                obj.A00 = simpleImageUrl;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
