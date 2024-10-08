package X;

import java.io.IOException;

/* renamed from: X.9Uf  reason: invalid class name and case insensitive filesystem */
public abstract class C379519Uf {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.A6D, java.lang.Object] */
    public static A6D parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("serialized_sticker_client_model".equals(A0q)) {
                    obj.A00 = C2802050s.parseFromJson(r3);
                } else if ("sticker_transform".equals(A0q)) {
                    obj.A02 = AnonymousClass9UX.parseFromJson(r3);
                } else if ("drawable_config".equals(A0q)) {
                    obj.A01 = C14291TtP.parseFromJson(r3);
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

    public static void A00(17Z r1, A6D a6d) {
        r1.A0c();
        if (a6d.A00 != null) {
            r1.A0q("serialized_sticker_client_model");
            C2802050s.A00(r1, a6d.A00);
        }
        if (a6d.A02 != null) {
            r1.A0q("sticker_transform");
            AnonymousClass9UX.A00(r1, a6d.A02);
        }
        if (a6d.A01 != null) {
            r1.A0q("drawable_config");
            C14291TtP.A00(r1, a6d.A01);
        }
        r1.A0Z();
    }
}
