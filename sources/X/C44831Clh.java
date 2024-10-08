package X;

import java.io.IOException;

/* renamed from: X.Clh  reason: case insensitive filesystem */
public abstract class C44831Clh {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Cwr, java.lang.Object] */
    public static C45460Cwr parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("body".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("cta_title".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("image_url".equals(A17)) {
                    obj.A02 = 16h.A00(r3);
                } else if ("image_width".equals(A17)) {
                    obj.A01 = r3.A1D();
                } else if ("image_height".equals(A17)) {
                    obj.A00 = r3.A1D();
                } else if ("sticker_type".equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r3);
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
