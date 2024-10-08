package com.instagram.debug.modalfragmentfactories;

import X.0lg;
import X.0qQ;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundSignalsFragment;

public final class CreatorInspirationSignalsPlaygroundFragmentFactory {
    public static final CreatorInspirationSignalsPlaygroundFragmentFactory INSTANCE = new Object();

    public Fragment createFragmentByName(0lg r2, FragmentActivity fragmentActivity, Bundle bundle) {
        0qQ.A0B(bundle, 2);
        CreatorInspirationSignalsPlaygroundSignalsFragment creatorInspirationSignalsPlaygroundSignalsFragment = new CreatorInspirationSignalsPlaygroundSignalsFragment();
        creatorInspirationSignalsPlaygroundSignalsFragment.setArguments(bundle);
        return creatorInspirationSignalsPlaygroundSignalsFragment;
    }
}
