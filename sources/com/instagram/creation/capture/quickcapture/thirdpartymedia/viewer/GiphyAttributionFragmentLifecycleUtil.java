package com.instagram.creation.capture.quickcapture.thirdpartymedia.viewer;

public final class GiphyAttributionFragmentLifecycleUtil {
    public static void cleanupReferences(GiphyAttributionFragment giphyAttributionFragment) {
        giphyAttributionFragment.recycler = null;
    }
}
