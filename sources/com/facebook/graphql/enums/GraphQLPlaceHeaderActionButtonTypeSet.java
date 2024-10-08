package com.facebook.graphql.enums;

import X.0sc;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLPlaceHeaderActionButtonTypeSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"CHANGE_PIN_LOCATION", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "NOT_A_PLACE", "REPORT_QUESTION", "SUGGEST_EDITS", "VIEW_PAGE", "WRONG_PIN"});

    public static final Set getSet() {
        return A00;
    }
}
