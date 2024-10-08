package com.instagram.debug.devoptions.section.search;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C363288jT;
import android.view.View;

public final class SearchDebugSettingsFragment$appendBootstrapOptions$5 implements View.OnClickListener {
    public final /* synthetic */ SearchDebugSettingsFragment this$0;

    public SearchDebugSettingsFragment$appendBootstrapOptions$5(SearchDebugSettingsFragment searchDebugSettingsFragment) {
        this.this$0 = searchDebugSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(905958915);
        C363288jT.A03(C363288jT.A00(AnonymousClass7TE.A0l(this.this$0.session$delegate)));
        this.this$0.toast("Fetching User Bootstrap...");
        AnonymousClass0fD.A0C(747275779, A05);
    }
}
