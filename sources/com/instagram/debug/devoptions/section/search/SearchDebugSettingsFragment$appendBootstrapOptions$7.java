package com.instagram.debug.devoptions.section.search;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C14408Tvb;
import X.C363368jb;
import X.C67383Mmz;
import android.view.View;

public final class SearchDebugSettingsFragment$appendBootstrapOptions$7 implements View.OnClickListener {
    public final /* synthetic */ SearchDebugSettingsFragment this$0;

    public SearchDebugSettingsFragment$appendBootstrapOptions$7(SearchDebugSettingsFragment searchDebugSettingsFragment) {
        this.this$0 = searchDebugSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1668096443);
        C363368jb r0 = C14408Tvb.A00(AnonymousClass7TE.A0l(this.this$0.session$delegate)).A02;
        r0.A01();
        r0.A02();
        C67383Mmz.A00(C14408Tvb.A00(AnonymousClass7TE.A0l(this.this$0.session$delegate)));
        this.this$0.toast("Fetching Popular Keywords...");
        AnonymousClass0fD.A0C(2038363534, A05);
    }
}
