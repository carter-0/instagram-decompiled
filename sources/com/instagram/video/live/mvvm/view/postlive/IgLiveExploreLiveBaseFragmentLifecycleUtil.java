package com.instagram.video.live.mvvm.view.postlive;

public final class IgLiveExploreLiveBaseFragmentLifecycleUtil {
    public static void cleanupReferences(IgLiveExploreLiveBaseFragment igLiveExploreLiveBaseFragment) {
        igLiveExploreLiveBaseFragment.recyclerView = null;
    }
}
