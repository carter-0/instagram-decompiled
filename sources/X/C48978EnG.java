package X;

import com.instagram.login.twofac.model.TotpSeed;
import java.io.IOException;

/* renamed from: X.EnG  reason: case insensitive filesystem */
public abstract class C48978EnG {
    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.login.twofac.model.TotpSeed, java.lang.Object] */
    public static TotpSeed parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (Dbb.A0W().equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("device_name".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                } else if (Dbb.A0V().equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
