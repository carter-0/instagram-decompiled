package com.instagram.debug.modalfragmentfactories;

import X.0lg;
import X.0wb;
import X.Dbb;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public final class FamilyDeviceIdsModalFragmentFactory {
    public static final FamilyDeviceIdsModalFragmentFactory INSTANCE = new Object();

    public Fragment createFragmentByName(0lg r3, FragmentActivity fragmentActivity, Bundle bundle) {
        try {
            return Dbb.A0D("com.instagram.debug.devoptions.section.analytics.DeveloperFamilyDeviceIdFragment");
        } catch (Exception e) {
            0wb.A07("ModalActivity", e);
            return null;
        }
    }
}
