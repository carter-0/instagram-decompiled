package X;

import java.io.IOException;

/* renamed from: X.Cp7  reason: case insensitive filesystem */
public abstract class C45029Cp7 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Cvs, java.lang.Object] */
    public static C45412Cvs parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("default_text".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("out_of_stock_text".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("in_cart_text".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("destination".equals(A17)) {
                    obj.A01 = C45081Cpy.A00(AnonymousClass7TG.A0l(r3));
                } else if ("secondary_cta_info".equals(A17)) {
                    obj.A00 = C45082Cpz.parseFromJson(r3);
                } else if ("is_item_in_cart".equals(A17)) {
                    obj.A05 = r3.A0d();
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
