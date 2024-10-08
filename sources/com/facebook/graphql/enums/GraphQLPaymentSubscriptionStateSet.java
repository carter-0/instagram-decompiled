package com.facebook.graphql.enums;

import X.0sc;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLPaymentSubscriptionStateSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"ACTIVE", "CANCELLED", "EXPIRED", "FREE_TRIAL", "INITED", "IN_GRACE_PERIOD", "ON_HOLD", "PAUSED", "REINITED"});

    public static final Set getSet() {
        return A00;
    }
}
