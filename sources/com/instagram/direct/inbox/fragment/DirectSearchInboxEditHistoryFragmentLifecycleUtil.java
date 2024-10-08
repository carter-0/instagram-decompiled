package com.instagram.direct.inbox.fragment;

public final class DirectSearchInboxEditHistoryFragmentLifecycleUtil {
    public static void cleanupReferences(DirectSearchInboxEditHistoryFragment directSearchInboxEditHistoryFragment) {
        directSearchInboxEditHistoryFragment.mRecyclerView = null;
    }
}
