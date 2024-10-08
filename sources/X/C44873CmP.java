package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.CmP  reason: case insensitive filesystem */
public abstract class C44873CmP {
    public static C42123BIb parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            C42105BHi bHi = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("body".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("call_to_action".equals(A17)) {
                    bHi = C44495Cfr.parseFromJson(r9);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("body", r9, "BrandSurveyLearnMore");
            } else if (str2 != null || !(r9 instanceof 0c9)) {
                return new C42123BIb(bHi, str, str2);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r9, "BrandSurveyLearnMore");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
