package com.instagram.settings.privacy.messages;

public final class DirectMessagesOptionsFragmentLifecycleUtil {
    public static void cleanupReferences(DirectMessagesOptionsFragment directMessagesOptionsFragment) {
        directMessagesOptionsFragment.emptyStateView = null;
    }
}
