package com.instagram.debug.devoptions.section.localinjection;

import X.AnonymousClass0fD;
import android.app.Activity;
import android.view.View;

public final class InjectMediaToolFragment$configureActionBar$1 implements View.OnClickListener {
    public final /* synthetic */ InjectMediaToolFragment this$0;

    public InjectMediaToolFragment$configureActionBar$1(InjectMediaToolFragment injectMediaToolFragment) {
        this.this$0 = injectMediaToolFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(947289684);
        Activity rootActivity = this.this$0.getRootActivity();
        if (rootActivity != null) {
            rootActivity.onBackPressed();
        }
        AnonymousClass0fD.A0C(-203029542, A05);
    }
}
