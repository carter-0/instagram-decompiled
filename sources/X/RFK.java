package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

public enum RFK {
    OFFERS("offers"),
    CITY(ServerW3CShippingAddressConstants.CITY),
    COUNTRY("country"),
    REGION(ServerW3CShippingAddressConstants.REGION),
    RECIPIENT("recipient"),
    POSTALCODE("postalCode");
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        RFK[] rfkArr;
        A01 = 0oU.A00(rfkArr);
    }

    /* access modifiers changed from: public */
    RFK(String str) {
        this.A00 = str;
    }
}
