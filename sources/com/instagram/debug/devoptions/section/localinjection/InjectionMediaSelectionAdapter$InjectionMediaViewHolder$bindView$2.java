package com.instagram.debug.devoptions.section.localinjection;

import X.AnonymousClass0fD;
import android.view.View;
import com.instagram.debug.devoptions.section.localinjection.InjectionMediaSelectionAdapter;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

public final class InjectionMediaSelectionAdapter$InjectionMediaViewHolder$bindView$2 implements View.OnClickListener {
    public final /* synthetic */ InjectionMediaSelectionAdapter.InjectionMediaViewHolder this$0;

    public InjectionMediaSelectionAdapter$InjectionMediaViewHolder$bindView$2(InjectionMediaSelectionAdapter.InjectionMediaViewHolder injectionMediaViewHolder) {
        this.this$0 = injectionMediaViewHolder;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(89826728);
        IgdsSwitch igdsSwitch = this.this$0.injectedMediaSwitch;
        igdsSwitch.setCheckedAnimated(!igdsSwitch.isChecked());
        AnonymousClass0fD.A0C(-384689608, A05);
    }
}
