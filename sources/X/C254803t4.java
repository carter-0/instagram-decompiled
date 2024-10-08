package X;

import java.io.IOException;

/* renamed from: X.3t4  reason: invalid class name and case insensitive filesystem */
public abstract class C254803t4 {
    public static AnonymousClass9I4 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            Boolean bool = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("is_paid_partnership".equals(A0q)) {
                    bool = Boolean.valueOf(r5.A0d());
                }
                r5.A0z();
            }
            if (bool != null || !(r5 instanceof 0c9)) {
                return new AnonymousClass9I4(bool.booleanValue(), 2);
            }
            ((0c9) r5).A03.A00("is_paid_partnership", "DirectBrandedContentPaidPartnershipInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
