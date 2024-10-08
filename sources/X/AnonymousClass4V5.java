package X;

import java.io.IOException;

/* renamed from: X.4V5  reason: invalid class name */
public abstract class AnonymousClass4V5 {
    public static AnonymousClass4VQ parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            AnonymousClass4UC r1 = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("quick_promotion".equals(A0q)) {
                    r1 = AnonymousClass4V6.parseFromJson(r5);
                }
                r5.A0z();
            }
            if (r1 != null || !(r5 instanceof 0c9)) {
                return new AnonymousClass4VQ(r1);
            }
            ((0c9) r5).A03.A00("quick_promotion", "QuickPromotionAdapter");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
