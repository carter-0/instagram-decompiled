package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.RFh  reason: case insensitive filesystem */
public enum C8914RFh {
    BASIC_CARD_V1("basic-card-v1", 0),
    FB_TOKEN_V1("fb-token-v1", 1),
    ECOM_TOKEN_V1("ecom-token-v1", 2),
    META_PAYMENT_V1("meta-payment-v1", 3),
    PAYPAL_OTC_V1("paypal-otc-v1", 4),
    FIRMLY_TOKEN_V1("firmly-token-v1", 5);
    
    public static final Map A02 = null;
    public final String A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        C8914RFh[] rFhArr;
        A03 = 0oU.A00(rFhArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C8914RFh rFh : values()) {
            A0x.put(rFh.A00, rFh);
        }
        A02 = A0x;
    }

    /* access modifiers changed from: public */
    C8914RFh(String str, int i) {
        this.A01 = r2;
        this.A00 = str;
    }
}
