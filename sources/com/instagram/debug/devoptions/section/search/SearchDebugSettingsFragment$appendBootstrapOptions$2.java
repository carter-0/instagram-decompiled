package com.instagram.debug.devoptions.section.search;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C309516Yo;
import android.view.View;
import com.instagram.debug.devoptions.search.bootstrap.BootstrapKeywordListFragment;

public final class SearchDebugSettingsFragment$appendBootstrapOptions$2 implements View.OnClickListener {
    public final /* synthetic */ SearchDebugSettingsFragment this$0;

    public SearchDebugSettingsFragment$appendBootstrapOptions$2(SearchDebugSettingsFragment searchDebugSettingsFragment) {
        this.this$0 = searchDebugSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-826162042);
        C309516Yo r1 = new C309516Yo(this.this$0.requireActivity(), AnonymousClass7TE.A0l(this.this$0.session$delegate));
        r1.A0D(new BootstrapKeywordListFragment());
        r1.A04();
        AnonymousClass0fD.A0C(-35615797, A05);
    }
}
