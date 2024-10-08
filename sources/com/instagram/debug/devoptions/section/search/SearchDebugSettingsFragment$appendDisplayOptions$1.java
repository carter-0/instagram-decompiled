package com.instagram.debug.devoptions.section.search;

import X.19B;
import X.AnonymousClass4D7;
import X.C67351tA;
import X.JV6;
import android.widget.CompoundButton;

public final class SearchDebugSettingsFragment$appendDisplayOptions$1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SearchDebugSettingsFragment this$0;

    public SearchDebugSettingsFragment$appendDisplayOptions$1(SearchDebugSettingsFragment searchDebugSettingsFragment) {
        this.this$0 = searchDebugSettingsFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C67351tA.A00(19B.A00, new JV6((Object) this.this$0.getSearchDebugPreferences(), (AnonymousClass4D7) null, 35, z));
    }
}
