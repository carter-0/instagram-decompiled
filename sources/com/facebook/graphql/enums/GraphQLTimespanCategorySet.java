package com.facebook.graphql.enums;

import X.0sc;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLTimespanCategorySet {
    public static final HashSet A00 = 0sc.A05(new String[]{"INSTANTLY", "LONGER_THAN_A_DAY", "UNKNOWN", "WITHIN_A_DAY", "WITHIN_FEW_HOURS", "WITHIN_HOUR", "WITHIN_MINUTES"});

    public static final Set getSet() {
        return A00;
    }
}
