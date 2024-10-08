package instagram.features.devoptions.plugins;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C47452E2y;
import X.C47518E6c;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.helper.DevOptionsHelper;
import com.instagram.debug.devoptions.plugins.DeveloperOptionsPlugin;
import com.instagram.debug.devoptions.release.DeveloperOptionsFragment;
import com.instagram.debug.devoptions.release.DirectInboxExperimentSwitcherToolFragment;
import com.instagram.debug.devoptions.release.HomeDeliveryDebugToolFragment;
import com.instagram.debug.devoptions.release.PinnedDeveloperOptionsUtil;
import com.instagram.debug.devoptions.release.StoriesExperimentSwitcherToolFragment;
import com.instagram.debug.devoptions.section.localinjection.InjectMediaToolFragment;
import java.util.List;

public final class DeveloperOptionsPluginImpl {
    public static final DeveloperOptionsPluginImpl INSTANCE = new Object();

    public final void removePinnedItemInPrefs(String str) {
        0qQ.A0B(str, 0);
        DevOptionsHelper.Companion.removePinnedItemInPrefs(str);
    }

    public final Fragment getDeveloperOptionsFragment() {
        return new DeveloperOptionsFragment();
    }

    public final Fragment getDirectInboxExperimentSwitcherToolFragment() {
        return new DirectInboxExperimentSwitcherToolFragment();
    }

    public final Fragment getGraphQLConsistencyFragment() {
        return new C47452E2y();
    }

    public final Fragment getHomeDeliveryDebugTool() {
        return new HomeDeliveryDebugToolFragment();
    }

    public final Fragment getInjectedMediaToolFragment() {
        return new InjectMediaToolFragment();
    }

    public final Fragment getStoriesExperimentSwitcherToolFragment() {
        return new StoriesExperimentSwitcherToolFragment();
    }

    public final List getPinnedDevOptions(UserSession userSession, C47518E6c e6c, DeveloperOptionsPlugin.OnPinnedDevOptionInteraction onPinnedDevOptionInteraction) {
        AnonymousClass7TG.A1T(userSession, e6c, onPinnedDevOptionInteraction);
        return PinnedDeveloperOptionsUtil.getPinnedDevOptions(userSession, e6c, onPinnedDevOptionInteraction);
    }
}
