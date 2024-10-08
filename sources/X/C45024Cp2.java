package X;

import java.io.IOException;

/* renamed from: X.Cp2  reason: case insensitive filesystem */
public abstract class C45024Cp2 {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Cvi] */
    public static C45402Cvi parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("carousel_title".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("carousel_subtitle".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("ar_effect_metadata".equals(A17)) {
                    obj.A00 = C44911Cn1.parseFromJson(r3);
                } else if ("placeholder_image".equals(A17)) {
                    obj.A01 = C275414q7.parseFromJson(r3);
                } else if ("indicator_text".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
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
