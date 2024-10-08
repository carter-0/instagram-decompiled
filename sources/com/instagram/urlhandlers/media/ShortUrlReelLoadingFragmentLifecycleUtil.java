package com.instagram.urlhandlers.media;

public final class ShortUrlReelLoadingFragmentLifecycleUtil {
    public static void cleanupReferences(ShortUrlReelLoadingFragment shortUrlReelLoadingFragment) {
        shortUrlReelLoadingFragment.mLoadingSpinner = null;
    }
}
