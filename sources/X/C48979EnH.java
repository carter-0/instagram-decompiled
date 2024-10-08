package X;

import com.facebook.location.platform.api.Location;
import com.instagram.login.twofac.model.TrustedDevice;
import java.io.IOException;

/* renamed from: X.EnH  reason: case insensitive filesystem */
public abstract class C48979EnH {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, com.instagram.login.twofac.model.TrustedDevice] */
    public static TrustedDevice parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (Dbq.A05(197, 11, 14).equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r5);
                } else if ("device_name".equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r5);
                } else if (AnonymousClass000.A00(2997).equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r5);
                } else if ("last_login_location".equals(A17)) {
                    obj.A07 = AnonymousClass7TG.A0l(r5);
                } else if ("last_login_time".equals(A17)) {
                    obj.A02 = r5.A0y();
                } else if (Location.LATITUDE.equals(A17)) {
                    obj.A00 = r5.A0U();
                } else if ("longitude".equals(A17)) {
                    obj.A01 = r5.A0U();
                } else if (C66579MXk.A00(345).equals(A17)) {
                    obj.A09 = r5.A0d();
                } else if (AnonymousClass000.A00(4218).equals(A17)) {
                    obj.A08 = AnonymousClass7TG.A0l(r5);
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
