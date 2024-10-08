package X;

import java.io.IOException;

/* renamed from: X.Erv  reason: case insensitive filesystem */
public abstract class C49252Erv {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.EzV, java.lang.Object] */
    public static C49612EzV parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("screen_time_daily_limit_seconds".equals(A17)) {
                    obj.A03 = AnonymousClass7TF.A0X(r3);
                } else if (Pxd.A00(205).equals(A17)) {
                    obj.A02 = AnonymousClass7TF.A0X(r3);
                } else if (AnonymousClass000.A00(168).equals(A17)) {
                    obj.A00 = C298915uF.parseFromJson(r3);
                } else if ("is_daily_limit_non_blocking".equals(A17)) {
                    obj.A01 = AnonymousClass7TF.A0S(r3);
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
