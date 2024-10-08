package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Cns  reason: case insensitive filesystem */
public abstract class C44958Cns {
    public static C53380GnA parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Integer num = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if (!"subtitle".equals(A17)) {
                    num = C41847B3o.A13(r10, num, A17, "followings");
                } else if (r10.A11() == 16L.A0G) {
                    str2 = null;
                } else {
                    str2 = r10.A1P();
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r10, "AymfHeader");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("subtitle", r10, "AymfHeader");
            } else if (num != null || !(r10 instanceof 0c9)) {
                return new C53380GnA(str, str2, num.intValue(), 5);
            } else {
                AnonymousClass7TF.A1L("followings", r10, "AymfHeader");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
