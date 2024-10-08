package com.facebook.graphql.enums;

import X.0sc;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLMessengerFeedbackScoreOptionSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"FIVE_EMOJIS", "FIVE_STARS", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "ONE_TO_FIVE", "ONE_TO_SEVEN", "TWO_THUMBS", "YES_NO", "ZERO_TO_TEN"});

    public static final Set getSet() {
        return A00;
    }
}
