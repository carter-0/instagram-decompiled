package com.facebook.graphql.enums;

import X.0sc;
import X.AnonymousClass7TF;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLPaymentCheckoutScreenComponentTypeSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[34];
        System.arraycopy(new String[]{"SELLER_INITIATED_MESSAGING_PREFERENCE_OPT_IN", "SHIPPING_ADDRESSES", "SUBSCRIPTION_CONFIRMATION", "SUBSCRIPTION_INFO", "TAX_INFO", "TERMS_AND_POLICIES", "USER_INFO_OPT_IN"}, AnonymousClass7TF.A1X(new String[]{"BANNER", "BUBBLE", "CONTACT_INFO", "COUPON_CODES", "CUSTOM_EXTENSION", "DEBUG_INFO", "DELIVERY_INFO", "DELIVERY_OPTIONS", "DELIVERY_OPTIONS_GROUP", "DESCRIPTION", "DONATION_OPTIONS", "ENTITY", "FREE_TRIAL", "FREQUENCY_SELECTOR", "INCENTIVES", "ITEM_DETAILS", "ITEM_DETAILS_BY_MERCHANT", "LOYALTY", "NATIONALITY_SELECTOR", PaymentDetailChangeTypes$Companion.OFFERS, "PAYMENT_CREDENTIAL_OPTIONS", "PAY_BUTTON", "PICKUP_LOCATION", "PRICE_SELECTOR", "PRICE_TABLE", "PROMOTIONS_OPT_IN", "PSD_AGREEMENT"}, strArr) ? 1 : 0, strArr, 27, 7);
        A00 = 0sc.A05(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
