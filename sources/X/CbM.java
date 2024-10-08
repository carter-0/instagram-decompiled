package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.CreditCardAssociation;
import com.instagram.api.schemas.FundingSourceType;
import com.instagram.api.schemas.PaymentMethodImpl;
import java.io.IOException;

public abstract class CbM {
    public static PaymentMethodImpl parseFromJson(16F r11) {
        String A00;
        String str;
        String str2;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            CreditCardAssociation creditCardAssociation = null;
            FundingSourceType fundingSourceType = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                16L A1J = r11.A1J();
                16L r7 = 16L.A09;
                A00 = AnonymousClass000.A00(3723);
                if (A1J == r7) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r11);
                if ("credit_card_association".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                    creditCardAssociation = (CreditCardAssociation) CreditCardAssociation.A01.get(str2);
                    if (creditCardAssociation == null) {
                        creditCardAssociation = CreditCardAssociation.UNRECOGNIZED;
                    }
                } else if (A00.equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    fundingSourceType = (FundingSourceType) FundingSourceType.A01.get(str);
                    if (fundingSourceType == null) {
                        fundingSourceType = FundingSourceType.UNRECOGNIZED;
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (creditCardAssociation == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("credit_card_association", r11, "PaymentMethodImpl");
            } else if (fundingSourceType == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r11, "PaymentMethodImpl");
            } else if (str3 != null || !(r11 instanceof 0c9)) {
                return new PaymentMethodImpl(creditCardAssociation, fundingSourceType, str4, str3);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r11, "PaymentMethodImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
