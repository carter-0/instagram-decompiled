package com.facebook.graphql.enums;

import X.0sc;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLMessengerFeedbackScoreTypeSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"DIS_SAT", "HARD_EASY", "NEG_POS", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "POOR_GREAT", "UNLIKE_LIKE"});

    public static final Set getSet() {
        return A00;
    }
}
