package X;

import java.io.IOException;

/* renamed from: X.VEh  reason: case insensitive filesystem */
public abstract class C17007VEh {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.VbP, java.lang.Object] */
    public static C17633VbP parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1A(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("url".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("action".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("background_color".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("border_color".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("text_color".equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("action_info".equals(A17)) {
                    obj.A00 = C48987EnP.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
