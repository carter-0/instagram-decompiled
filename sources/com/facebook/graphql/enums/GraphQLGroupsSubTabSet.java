package com.facebook.graphql.enums;

import X.0sc;
import X.AnonymousClass7TF;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLGroupsSubTabSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[29];
        System.arraycopy(new String[]{"YOUR_GROUPS", "YOUR_GROUP_JOINS"}, AnonymousClass7TF.A1X(new String[]{"ACTIVITY_LOG", "CATEGORIES", "COMPOSER", "CREATE", "CROSS_GROUP_INBOX", "CROSS_GROUP_INBOX_CHATS_ONLY", "CROSS_GROUP_INBOX_JVC_ONLY", "DISCOVER_MAIN", "ENGAGE_MAIN", "EVENTS", "FOR_YOU", "GROUP_DIGEST", "GROUP_SET", "INVITES", "JOINED", "LOCAL", "MANAGE_GROUPS", "ME", "POSTS", "QUESTIONS", "RELATED_CONTENT", "RISING", "SETTINGS", "THANKS", "UNKNOWN", "VIDEOS", "YOUR_CHATS"}, strArr) ? 1 : 0, strArr, 27, 2);
        A00 = 0sc.A05(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
