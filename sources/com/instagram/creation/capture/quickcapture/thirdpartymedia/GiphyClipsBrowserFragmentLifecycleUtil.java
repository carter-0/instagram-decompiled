package com.instagram.creation.capture.quickcapture.thirdpartymedia;

public final class GiphyClipsBrowserFragmentLifecycleUtil {
    public static void cleanupReferences(GiphyClipsBrowserFragment giphyClipsBrowserFragment) {
        giphyClipsBrowserFragment.giphyClipsRecyclerView = null;
        giphyClipsBrowserFragment.searchEditText = null;
        giphyClipsBrowserFragment.errorTextView = null;
    }
}
