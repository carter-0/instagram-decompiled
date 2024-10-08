package X;

import java.io.IOException;

/* renamed from: X.9wx  reason: invalid class name and case insensitive filesystem */
public abstract class C393759wx {
    public static C40604Aes parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C40604Aes aes = new C40604Aes();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (C46476Dff.A01().equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    aes.A06 = A0l;
                } else if ("attribution_info".equals(A17)) {
                    aes.A05 = AnonymousClass7TG.A0l(r5);
                } else if ("container_width".equals(A17)) {
                    aes.A01 = r5.A1D();
                } else if ("container_height".equals(A17)) {
                    aes.A00 = r5.A1D();
                } else if ("video_duration".equals(A17)) {
                    aes.A03 = r5.A0y();
                } else if (C273654mx.A00(682).equals(A17)) {
                    aes.A02 = r5.A1D();
                } else if (AnonymousClass000.A00(4520).equals(A17)) {
                    aes.A04 = C393779wz.A00(r5.A1Q());
                }
                r5.A0z();
            }
            return aes;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
