package X;

import java.io.IOException;

/* renamed from: X.HTb  reason: case insensitive filesystem */
public abstract class C54794HTb {
    public static C53440GoY parseFromJson(16F r10) {
        String A00;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            C53450Goi goi = null;
            String str2 = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r3 = 16L.A09;
                A00 = AnonymousClass000.A00(182);
                if (A1J == r3) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if ("body_text".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if (A00.equals(A17)) {
                    goi = C54806HTn.parseFromJson(r10);
                } else if ("title_text".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("body_text", r10, "DraftMidcardFallbackMetadata");
            } else if (goi == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r10, "DraftMidcardFallbackMetadata");
            } else if (str2 != null || !(r10 instanceof 0c9)) {
                return new C53440GoY(goi, str, str2);
            } else {
                AnonymousClass7TF.A1L("title_text", r10, "DraftMidcardFallbackMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
