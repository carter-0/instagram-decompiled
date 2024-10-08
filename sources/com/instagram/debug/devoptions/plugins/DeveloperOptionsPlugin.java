package com.instagram.debug.devoptions.plugins;

import X.C47518E6c;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

public interface DeveloperOptionsPlugin {

    public interface OnPinnedDevOptionInteraction {
        void onPinnedDevOptionRemoved();

        void onPinnedDevOptionSelected();
    }

    Fragment getDeveloperOptionsFragment();

    Fragment getDirectInboxExperimentSwitcherToolFragment();

    Fragment getGraphQLConsistencyFragment();

    Fragment getHomeDeliveryDebugTool();

    Fragment getInjectedMediaToolFragment();

    List getPinnedDevOptions(UserSession userSession, C47518E6c e6c, OnPinnedDevOptionInteraction onPinnedDevOptionInteraction);

    Fragment getStoriesExperimentSwitcherToolFragment();

    void removePinnedItemInPrefs(String str);
}
