package com.facebook.graphql.enums;

import X.0sc;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLNotificationSeenFilterSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"ALL", "READ_ONLY", "SEEN_BUT_UNREAD_ONLY", "SEEN_ONLY", "UNREAD_ONLY", "UNSEEN_ONLY"});

    public static final Set getSet() {
        return A00;
    }
}
