package X;

import com.instagram.business.promote.model.BillingWizardName;

public final class WQL implements AnonymousClass1qK {
    public final BillingWizardName A00;
    public final Integer A01;

    public WQL(String str, String str2) {
        BillingWizardName billingWizardName;
        String str3;
        AnonymousClass7TG.A1O(str, str2);
        BillingWizardName[] values = BillingWizardName.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                billingWizardName = BillingWizardName.A0U;
                break;
            }
            billingWizardName = values[i];
            if (0qQ.A0K(billingWizardName.toString(), str)) {
                break;
            }
            i++;
        }
        this.A00 = billingWizardName;
        for (Integer num : AnonymousClass05K.A00(3)) {
            switch (num.intValue()) {
                case 1:
                    str3 = "complete";
                    break;
                case 2:
                    str3 = "fallback";
                    break;
                default:
                    str3 = "closed";
                    break;
            }
            if (str3.equals(str2)) {
                this.A01 = num;
                return;
            }
        }
        throw new IllegalArgumentException("can not parse return code type string from React Native");
    }
}
