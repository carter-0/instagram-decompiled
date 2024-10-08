package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Cnr  reason: case insensitive filesystem */
public abstract class C44957Cnr {
    public static C68170N3l parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("position".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r14);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("subtitle".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("cta_title".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("action_type".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            if (num == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("position", r14, "AymfActionItem");
            } else if (str == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r14, "AymfActionItem");
            } else if (str2 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("subtitle", r14, "AymfActionItem");
            } else if (str3 != null || !(r14 instanceof 0c9)) {
                return new C68170N3l(num.intValue(), str, str2, str3, str4);
            } else {
                AnonymousClass7TF.A1L("cta_title", r14, "AymfActionItem");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
