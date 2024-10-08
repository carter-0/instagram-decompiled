package instagram.features.feed.fragment;

public final class ContextualFeedFragmentLifecycleUtil {
    public static void cleanupReferences(ContextualFeedFragment contextualFeedFragment) {
        contextualFeedFragment.mContextualFeedContainer = null;
    }
}
