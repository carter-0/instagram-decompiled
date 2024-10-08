package com.facebook.graphql.enums;

import X.0sc;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLPayTransactionStatusSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"CANCELED", "CHARGED_BACK", "COMPLETED", "DECLINED", "EXPIRED", "INITED", "PARTIAL_REFUND", "PENDING", "REFUNDED", "UNAVAILABLE"});

    public static final Set getSet() {
        return A00;
    }
}
