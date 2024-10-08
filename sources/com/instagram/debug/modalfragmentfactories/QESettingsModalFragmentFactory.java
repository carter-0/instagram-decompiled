package com.instagram.debug.modalfragmentfactories;

import X.0lg;
import X.0wb;
import X.C273654mx;
import X.Dbb;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public final class QESettingsModalFragmentFactory {
    public static final QESettingsModalFragmentFactory INSTANCE = new Object();

    public Fragment createFragmentByName(0lg r3, FragmentActivity fragmentActivity, Bundle bundle) {
        try {
            return Dbb.A0D(C273654mx.A00(621));
        } catch (Exception e) {
            0wb.A07("ModalActivity", e);
            return null;
        }
    }
}
