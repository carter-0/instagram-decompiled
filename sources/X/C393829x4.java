package X;

import java.io.IOException;

/* renamed from: X.9x4  reason: invalid class name and case insensitive filesystem */
public abstract class C393829x4 {
    public static C40600Aeo parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C40600Aeo aeo = new C40600Aeo();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C46476Dff.A01().equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    aeo.A04 = A0l;
                } else if ("attribution_info".equals(A17)) {
                    aeo.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("container_width".equals(A17)) {
                    aeo.A01 = r4.A1D();
                } else if ("container_height".equals(A17)) {
                    aeo.A00 = r4.A1D();
                } else if ("video_duration".equals(A17)) {
                    aeo.A02 = r4.A1D();
                }
                r4.A0z();
            }
            return aeo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
