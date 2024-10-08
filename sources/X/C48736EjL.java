package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.business.model.BoostGuidanceItemResponse;
import java.io.IOException;

/* renamed from: X.EjL  reason: case insensitive filesystem */
public abstract class C48736EjL {
    public static BoostGuidanceItemResponse parseFromJson(16F r10) {
        String A00;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r6 = 16L.A09;
                A00 = AnonymousClass000.A00(195);
                if (A1J == r6) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if ("media_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_id", r10, "BoostGuidanceItemResponse");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r10, "BoostGuidanceItemResponse");
            } else if (str3 != null || !(r10 instanceof 0c9)) {
                return new BoostGuidanceItemResponse(str, str2, str3);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r10, "BoostGuidanceItemResponse");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
