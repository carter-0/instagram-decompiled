package com.instagram.debug.modalfragmentfactories;

import X.0lg;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import instagram.features.devoptions.plugins.DeveloperOptionsPluginImpl;

public final class DirectInboxExperimentSwitcherModalFragmentFactory {
    public static final DirectInboxExperimentSwitcherModalFragmentFactory INSTANCE = new Object();

    public Fragment createFragmentByName(0lg r2, FragmentActivity fragmentActivity, Bundle bundle) {
        return DeveloperOptionsPluginImpl.INSTANCE.getDirectInboxExperimentSwitcherToolFragment();
    }
}
