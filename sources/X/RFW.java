package X;

import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;
import java.util.LinkedHashMap;
import java.util.Map;

public enum RFW {
    SUBTOTAL(PriceTableAnnotation$Companion.SUBTOTAL),
    TAX(PriceTableAnnotation$Companion.ESTIMATED_TAX),
    SHIPPING("SHIPPING"),
    DISCOUNT(PriceTableAnnotation$Companion.OFFER),
    PRE_TAX_DISCOUNT("PRE_TAX_DISCOUNT"),
    FEE(PriceTableAnnotation$Companion.FEE),
    TOTAL(PriceTableAnnotation$Companion.TOTAL),
    FULFILLMENT(PriceTableAnnotation$Companion.FULFILLMENT);
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        RFW[] rfwArr;
        A02 = 0oU.A00(rfwArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (RFW rfw : values()) {
            A0x.put(rfw.A00, rfw);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    RFW(String str) {
        this.A00 = str;
    }
}
