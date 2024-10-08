package com.facebook.graphql.enums;

import X.0sc;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLThreadConnectivityStatusSubtitleTypeSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"ADDRESSBOOK_CONTACT", "BASED_ON_SETTINGS", "FOLLOWS_VIEWER_ON_IG", "HAS_VIEWER_CONTACT_INFO", "INBOX_MESSAGE_REQUEST", "INSTAGRAM", "MUTUAL_FRIENDS", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "VIEWERS_LINKED_ACCOUNT_FOLLOWS_ON_IG", "VIEWER_FOLLOWS_ON_IG", "VIEWER_HAS_ADDRESSBOOK_CONTACT"});

    public static final Set getSet() {
        return A00;
    }
}
