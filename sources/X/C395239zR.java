package X;

import java.io.IOException;

/* renamed from: X.9zR  reason: invalid class name and case insensitive filesystem */
public abstract class C395239zR {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.8x9] */
    public static C370838x9 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("last_visual_message_ts".equals(AnonymousClass7TE.A17(r3))) {
                    obj.A00 = r3.A0y();
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
