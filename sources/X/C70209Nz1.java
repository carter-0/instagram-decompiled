package X;

import java.io.IOException;

/* renamed from: X.Nz1  reason: case insensitive filesystem */
public abstract class C70209Nz1 {
    public static C65971iV parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C65971iV r0 = new C65971iV();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C66581MXm.A1X(r3, A0q)) {
                    r0.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("folder".equals(A0q)) {
                    r0.A00 = r3.A1D();
                } else if ("custom_folder_id".equals(A0q)) {
                    r0.A01 = AnonymousClass7TG.A0l(r3);
                } else {
                    C66670Mad.A01(r3, r0, A0q);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
