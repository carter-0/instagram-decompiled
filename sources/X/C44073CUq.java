package X;

import com.instagram.api.schemas.BillingWizardName;
import java.io.IOException;

/* renamed from: X.CUq  reason: case insensitive filesystem */
public abstract class C44073CUq {
    public static GSY parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str2 = null;
            BillingWizardName billingWizardName = null;
            BDt bDt = null;
            String str3 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("display_label".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("wizard_name".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    billingWizardName = (BillingWizardName) BillingWizardName.A01.get(str);
                    if (billingWizardName == null) {
                        billingWizardName = BillingWizardName.UNRECOGNIZED;
                    }
                } else if ("wizard_props".equals(A17)) {
                    bDt = C44074CUr.parseFromJson(r9);
                } else if ("wizard_props_json".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (str2 != null || !(r9 instanceof 0c9)) {
                return new GSY((JRV) bDt, billingWizardName, str2, str3);
            }
            AnonymousClass7TF.A1L("display_label", r9, "BillingInfoAction");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
