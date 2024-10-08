package com.facebook.graphql.enums;

import X.0sc;
import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLPaymentActivityPriceTypeSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"DETAIL", "FB_FUNDED_PROMOTIONAL", "PRIMARY", "PROMOTIONAL", "SECONDARY", "SHIPPING", PriceTableAnnotation$Companion.SUBTOTAL, "TAX"});

    public static final Set getSet() {
        return A00;
    }
}
