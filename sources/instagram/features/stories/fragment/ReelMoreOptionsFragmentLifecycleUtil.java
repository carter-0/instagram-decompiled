package instagram.features.stories.fragment;

public final class ReelMoreOptionsFragmentLifecycleUtil {
    public static void cleanupReferences(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        reelMoreOptionsFragment.mSaveButton = null;
        reelMoreOptionsFragment.mAddIconDrawable = null;
        reelMoreOptionsFragment.mInfoIconDrawable = null;
    }
}
