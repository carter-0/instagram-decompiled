package com.facebook.graphql.enums;

import X.0sc;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLWorkUserAvailabilityStatusTypeSet {
    public static final HashSet A00 = 0sc.A05(new String[]{MessageAvailabilityResponseId$Companion.AVAILABLE, "BUSY", "DO_NOT_DISTURB", "EMOJI_STATUS", "FOCUS", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "SPORADIC", "TENTATIVE"});

    public static final Set getSet() {
        return A00;
    }
}
