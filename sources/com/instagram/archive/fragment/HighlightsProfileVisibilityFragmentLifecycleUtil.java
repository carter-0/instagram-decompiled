package com.instagram.archive.fragment;

public final class HighlightsProfileVisibilityFragmentLifecycleUtil {
    public static void cleanupReferences(HighlightsProfileVisibilityFragment highlightsProfileVisibilityFragment) {
        highlightsProfileVisibilityFragment.includeInProfileToggle = null;
        highlightsProfileVisibilityFragment.highlightsOnlyToggle = null;
        highlightsProfileVisibilityFragment.footerText = null;
        highlightsProfileVisibilityFragment.bottomButton = null;
    }
}
