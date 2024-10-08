package com.facebook.graphql.enums;

import X.0sc;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLProductAvailabilitySet {
    public static final HashSet A00 = 0sc.A05(new String[]{"AVAILABLE_FOR_ORDER", "DISCONTINUED", "IN_STOCK", "MARK_AS_SOLD", "OUT_OF_STOCK", "PENDING", "PREORDER", "UNKNOWN"});

    public static final Set getSet() {
        return A00;
    }
}
