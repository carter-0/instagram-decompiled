package com.facebook.graphql.enums;

import X.0sc;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLMAIdentitySyncFieldSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"AVATAR", "CATEGORY", "DESCRIPTION", PaymentDetailChangeTypes$Companion.EMAIL, "LOCATION_ADDRESS", "LOCATION_CITY_ID", "LOCATION_ZIP", "NAME", "PHONE", "PROFILE_PHOTO", "USERNAME", "WEBSITE"});

    public static final Set getSet() {
        return A00;
    }
}
