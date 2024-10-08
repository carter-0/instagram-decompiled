package instagram.features.stories.fragment;

public final class ReelResharesViewerFragmentLifecycleUtil {
    public static void cleanupReferences(ReelResharesViewerFragment reelResharesViewerFragment) {
        reelResharesViewerFragment.emptyStateView = null;
    }
}
