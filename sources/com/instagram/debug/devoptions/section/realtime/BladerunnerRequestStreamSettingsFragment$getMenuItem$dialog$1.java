package com.instagram.debug.devoptions.section.realtime;

import android.content.DialogInterface;
import com.instagram.debug.devoptions.section.realtime.BladerunnerRequestStreamSettingsFragment;

public final class BladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ BladerunnerRequestStreamSettingsFragment.RealTimeSandboxConfigSourceKey $key;
    public final /* synthetic */ BladerunnerRequestStreamSettingsFragment this$0;

    public BladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$1(BladerunnerRequestStreamSettingsFragment bladerunnerRequestStreamSettingsFragment, BladerunnerRequestStreamSettingsFragment.RealTimeSandboxConfigSourceKey realTimeSandboxConfigSourceKey) {
        this.this$0 = bladerunnerRequestStreamSettingsFragment;
        this.$key = realTimeSandboxConfigSourceKey;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.this$0.setValueForSandboxOverride(this.$key, "");
        this.this$0.generateView();
    }
}
