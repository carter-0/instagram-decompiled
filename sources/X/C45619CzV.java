package X;

import com.instagram.api.schemas.BillingWizardName;
import com.instagram.api.schemas.NonDiscInfo;
import com.instagram.api.schemas.PaymentInfo;
import java.io.IOException;

/* renamed from: X.CzV  reason: case insensitive filesystem */
public final class C45619CzV {
    public static C43816CEi parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("display_footer_subtitle".equals(A17)) {
                    r1.A09 = AnonymousClass7TG.A0l(r11);
                } else if ("error".equals(A17)) {
                    r1.A07 = C44284CcS.parseFromJson(r11);
                } else if ("estimated_taxes".equals(A17)) {
                    r1.A02 = CXP.parseFromJson(r11);
                } else if ("non_discrimination_policy_info".equals(A17)) {
                    r1.A05 = C44233Cau.parseFromJson(r11);
                } else if ("payment".equals(A17)) {
                    r1.A06 = CbL.parseFromJson(r11);
                } else if ("payment_details".equals(A17)) {
                    r1.A03 = CbK.parseFromJson(r11);
                } else if ("required_action".equals(A17)) {
                    r1.A01 = C44317Ccz.parseFromJson(r11);
                } else if (AnonymousClass000.A00(766).equals(A17)) {
                    BillingWizardName billingWizardName = (BillingWizardName) BillingWizardName.A01.get(AnonymousClass7TG.A0l(r11));
                    if (billingWizardName == null) {
                        billingWizardName = BillingWizardName.UNRECOGNIZED;
                    }
                    r1.A04 = billingWizardName;
                } else if ("tax".equals(A17)) {
                    r1.A00 = C44507Cg3.parseFromJson(r11);
                } else {
                    1XY.A01(r11, r1, A17);
                }
                r11.A0z();
            }
            String str = r1.A09;
            UKM ukm = r1.A07;
            N4Q n4q = r1.A02;
            NonDiscInfo nonDiscInfo = r1.A05;
            0qQ.A0A(nonDiscInfo);
            PaymentInfo paymentInfo = r1.A06;
            ULZ ulz = r1.A03;
            r1.A08 = new C15026UKf(r1.A00, r1.A01, n4q, ulz, r1.A04, nonDiscInfo, paymentInfo, ukm, str);
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
