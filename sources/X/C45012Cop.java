package X;

import java.io.IOException;

/* renamed from: X.Cop  reason: case insensitive filesystem */
public abstract class C45012Cop {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Ct1, java.lang.Object] */
    public static Ct1 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("video_call_in_call_notification_event".equals(AnonymousClass7TE.A17(r3))) {
                    obj.A00 = C45015Cos.parseFromJson(r3);
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
