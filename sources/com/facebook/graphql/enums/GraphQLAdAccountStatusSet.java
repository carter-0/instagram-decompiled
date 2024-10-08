package com.facebook.graphql.enums;

import X.0sc;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLAdAccountStatusSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"ACTIVE", "CLOSED", "DISABLED", "IN_GRACE_PERIOD", "PENDING_CLOSURE", "PENDING_RISK_REVIEW", "PENDING_SETTLEMENT", "UNSETTLED"});

    public static final Set getSet() {
        return A00;
    }
}
