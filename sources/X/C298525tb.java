package X;

import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

/* renamed from: X.5tb  reason: invalid class name and case insensitive filesystem */
public enum C298525tb {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ANON_CHECKOUT_BACK_BUTTON("ANON_CHECKOUT_BACK_BUTTON"),
    APM("APM"),
    BANNER("BANNER"),
    CONTACT_INFORMATION("CONTACT_INFORMATION"),
    EMAIL_OPTIN("EMAIL_OPTIN"),
    FULFILLMENT_OPTIONS("FULFILLMENT_OPTIONS"),
    INCENTIVES("INCENTIVES"),
    ITEM_LIST("ITEM_LIST"),
    META_BRANDING_FOOTER("META_BRANDING_FOOTER"),
    ONE_TIME_CHECKOUT_OPTION("ONE_TIME_CHECKOUT_OPTION"),
    ORDER_SUMMARY("ORDER_SUMMARY"),
    PAYMENT_METHOD("PAYMENT_METHOD"),
    PAYMENT_RECEIVER("PAYMENT_RECEIVER"),
    PAY_BUTTON("PAY_BUTTON"),
    PICKUP_CONTACT_INFO("PICKUP_CONTACT_INFO"),
    PRICE_TABLE("PRICE_TABLE"),
    PROMO_CODE("PROMO_CODE"),
    SHIPPING_ADDRESS(PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS),
    SHIPPING_OPTIONS("SHIPPING_OPTIONS"),
    TERMS("TERMS");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C298525tb(String str) {
        this.A00 = str;
    }
}
