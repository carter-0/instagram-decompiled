package X;

import java.io.IOException;

/* renamed from: X.9wy  reason: invalid class name and case insensitive filesystem */
public abstract class C393769wy {
    public static C40603Aer parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C40603Aer aer = new C40603Aer();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (C46476Dff.A01().equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    aer.A05 = A0l;
                } else if ("attribution_info".equals(A17)) {
                    aer.A04 = AnonymousClass7TG.A0l(r5);
                } else if ("container_width".equals(A17)) {
                    aer.A01 = r5.A1D();
                } else if ("container_height".equals(A17)) {
                    aer.A00 = r5.A1D();
                } else if ("video_duration".equals(A17)) {
                    aer.A03 = r5.A0y();
                } else if (C273654mx.A00(682).equals(A17)) {
                    aer.A02 = r5.A1D();
                }
                r5.A0z();
            }
            return aer;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
