package X;

import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum RH6 {
    ;
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        RH6[] rh6Arr;
        A02 = 0oU.A00(rh6Arr);
        int A0L2 = 0se.A0L(r5);
        if (A0L2 < 16) {
            A0L2 = 16;
        }
        LinkedHashMap A0x = DbS.A0x(A0L2);
        for (RH6 rh6 : values()) {
            C51967G9n.A1O(rh6, A0x, rh6.A00);
        }
        A01 = A0x;
    }

    public static RH6 A00(String str, int i) {
        return new RH6(str, i, i);
    }

    /* access modifiers changed from: public */
    RH6(int i) {
        this.A00 = i;
    }

    public final String A01() {
        switch (ordinal()) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "PAYMENT_METHOD";
            case 13:
                return PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS;
            case 14:
                return "CONTACT_INFORMATION";
            case 15:
                return "FULFILLMENT_OPTIONS";
            case 16:
                return "ORDER_SUMMARY";
            case 17:
                return "PICKUP_CONTACT_INFO";
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return "INCENTIVES";
            default:
                throw C51973G9u.A0g(this, "ItemType is not found for identifier => ", AnonymousClass7TE.A1A());
        }
    }
}
