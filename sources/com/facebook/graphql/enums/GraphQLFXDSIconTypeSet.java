package com.facebook.graphql.enums;

import X.0sc;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLFXDSIconTypeSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"ACCOUNT", "AC_SHARE", "CARD", "INFO", "LINK", "LOGIN", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "USER"});

    public static final Set getSet() {
        return A00;
    }
}
