package instagram.features.clips.viewer.recommend;

public final class ClipsViewerRecommendClipsFragmentLifecycleUtil {
    public static void cleanupReferences(ClipsViewerRecommendClipsFragment clipsViewerRecommendClipsFragment) {
        clipsViewerRecommendClipsFragment.recyclerView = null;
        clipsViewerRecommendClipsFragment.spinnerImageView = null;
        clipsViewerRecommendClipsFragment.submitButton = null;
    }
}
