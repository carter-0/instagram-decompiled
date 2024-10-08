package com.facebook.graphql.enums;

import X.0sc;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLWorkForeignEntityDetailSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"EXTERNAL_ACCOUNT", "EXTERNAL_LIMITED_ACCOUNT", "HAS_GUESTS", "IS_EXTERNAL", "LIMITED_ACCOUNT", "LIMITED_GROUP", "MULTICOMPANY", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "ROOMS_GUEST", "RP4SMB_GUEST"});

    public static final Set getSet() {
        return A00;
    }
}
