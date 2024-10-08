package X;

import java.io.IOException;

/* renamed from: X.VmW  reason: case insensitive filesystem */
public final class C18156VmW {
    public static C15254UXo parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("prevalidation_success".equals(A17)) {
                    r0.A06 = r3.A0d();
                } else if ("prevalidation_error".equals(A17)) {
                    r0.A04 = C44606Che.parseFromJson(r3);
                } else if ("init_info".equals(A17)) {
                    r0.A03 = VAQ.parseFromJson(r3);
                } else if ("prefill_info".equals(A17)) {
                    r0.A05 = VAS.parseFromJson(r3);
                } else if ("coupon_info".equals(A17)) {
                    r0.A02 = C18171Vml.parseFromJson(r3);
                } else if ("payment_info".equals(A17)) {
                    r0.A00 = CbL.parseFromJson(r3);
                } else if ("error".equals(A17)) {
                    r0.A01 = C44284CcS.parseFromJson(r3);
                } else {
                    1XY.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
