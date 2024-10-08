package com.instagram.debug.devoptions.plugins;

import X.C47452E2y;
import X.C47518E6c;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.plugins.DeveloperOptionsPlugin;
import com.instagram.debug.devoptions.section.localinjection.InjectMediaToolFragment;
import instagram.features.devoptions.plugins.DeveloperOptionsPluginImpl;
import java.util.List;

public class DeveloperOptionsPluginStatic {
    public static Fragment getDeveloperOptionsFragment() {
        return DeveloperOptionsPluginImpl.INSTANCE.getDeveloperOptionsFragment();
    }

    public static Fragment getDirectInboxExperimentSwitcherToolFragment() {
        return DeveloperOptionsPluginImpl.INSTANCE.getDirectInboxExperimentSwitcherToolFragment();
    }

    public static Fragment getGraphQLConsistencyFragment() {
        return new C47452E2y();
    }

    public static Fragment getHomeDeliveryDebugTool() {
        return DeveloperOptionsPluginImpl.INSTANCE.getHomeDeliveryDebugTool();
    }

    public static Fragment getInjectedMediaToolFragment() {
        return new InjectMediaToolFragment();
    }

    public static List getPinnedDevOptions(UserSession userSession, C47518E6c e6c, DeveloperOptionsPlugin.OnPinnedDevOptionInteraction onPinnedDevOptionInteraction) {
        return DeveloperOptionsPluginImpl.INSTANCE.getPinnedDevOptions(userSession, e6c, onPinnedDevOptionInteraction);
    }

    public static Fragment getStoriesExperimentSwitcherToolFragment() {
        return DeveloperOptionsPluginImpl.INSTANCE.getStoriesExperimentSwitcherToolFragment();
    }

    public static void removePinnedItemInPrefs(String str) {
        DeveloperOptionsPluginImpl.INSTANCE.removePinnedItemInPrefs(str);
    }
}
