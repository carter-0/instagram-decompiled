package X;

import com.instagram.api.schemas.CachedExternalLoginUserImpl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.Ech  reason: case insensitive filesystem */
public abstract class C48324Ech {
    public static CachedExternalLoginUserImpl parseFromJson(16F r12) {
        String A00;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            SimpleImageUrl simpleImageUrl = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                16L A1J = r12.A1J();
                16L r0 = 16L.A09;
                A00 = Dbk.A00();
                if (A1J == r0) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r12);
                if ("external_id".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("fullname".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("pk".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if (AnonymousClass000.A00(1719).equals(A17)) {
                    simpleImageUrl = 16h.A00(r12);
                } else if ("source".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            if (str3 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("pk", r12, "CachedExternalLoginUserImpl");
            } else if (str5 != null || !(r12 instanceof 0c9)) {
                return new CachedExternalLoginUserImpl(simpleImageUrl, str, str2, str3, str4, str5);
            } else {
                AnonymousClass7TF.A1L(A00, r12, "CachedExternalLoginUserImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
