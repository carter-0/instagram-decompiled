package X;

import java.util.Arrays;
import java.util.List;

public enum RF3 {
    A03("DEBIT", "CREDIT_CARD_CATEGORY_DEBIT"),
    A02("CREDIT", "CREDIT_CARD_CATEGORY_CREDIT"),
    A04("PREPAID", "CREDIT_CARD_CATEGORY_PREPAID");
    
    public final List A00;

    /* access modifiers changed from: public */
    RF3(String... strArr) {
        this.A00 = Arrays.asList(strArr);
    }
}
