package X;

import java.io.IOException;

/* renamed from: X.HTr  reason: case insensitive filesystem */
public abstract class C54810HTr {
    public static C53368Gms parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Integer num = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("clips_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else {
                    num2 = C41847B3o.A13(r7, num2, A17, "photos_count");
                }
                r7.A0z();
            }
            if (num == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("clips_count", r7, "MusicPageMediaCountImpl");
            } else if (num2 != null || !(r7 instanceof 0c9)) {
                return new C53368Gms(num.intValue(), num2.intValue(), 4);
            } else {
                AnonymousClass7TF.A1L("photos_count", r7, "MusicPageMediaCountImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
