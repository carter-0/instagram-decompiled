package X;

import java.io.IOException;

/* renamed from: X.Cg4  reason: case insensitive filesystem */
public abstract class C44508Cg4 {
    public static C15060UNd parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("display_tax_name".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("formatted_tax_amount".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("tax_rate".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("display_tax_name", r10, "TaxLineItemImpl");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("formatted_tax_amount", r10, "TaxLineItemImpl");
            } else if (str3 != null || !(r10 instanceof 0c9)) {
                return new C15060UNd(str, str2, str3);
            } else {
                AnonymousClass7TF.A1L("tax_rate", r10, "TaxLineItemImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
