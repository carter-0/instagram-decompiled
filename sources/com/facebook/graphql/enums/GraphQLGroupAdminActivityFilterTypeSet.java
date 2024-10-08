package com.facebook.graphql.enums;

import X.0sc;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLGroupAdminActivityFilterTypeSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"ACTIVITY_ACTOR", "ACTIVITY_SUBJECT", "ACTIVITY_SUBJECT_FORMER_MEMBER", "ACTIVITY_TYPE", "ACTIVITY_TYPE_CATEGORY", "ADMIN_ASSIST_CRITERIA", "AUTOMATIC_ACTION", "COMMENT_ACTOR", "DATE_RANGE", "LAST_AND_ACTOR_IS_NOT_VIEWER", "MODERATION_ACTION", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "THREAD_ID", "WITH_NOTE"});

    public static final Set getSet() {
        return A00;
    }
}
