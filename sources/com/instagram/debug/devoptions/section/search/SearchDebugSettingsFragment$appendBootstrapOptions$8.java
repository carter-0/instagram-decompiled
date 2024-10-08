package com.instagram.debug.devoptions.section.search;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C14399TvS;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class SearchDebugSettingsFragment$appendBootstrapOptions$8 implements View.OnClickListener {
    public final /* synthetic */ SearchDebugSettingsFragment this$0;

    public SearchDebugSettingsFragment$appendBootstrapOptions$8(SearchDebugSettingsFragment searchDebugSettingsFragment) {
        this.this$0 = searchDebugSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(690921813);
        UserSession A0l = AnonymousClass7TE.A0l(this.this$0.session$delegate);
        0qQ.A0B(A0l, 0);
        C14399TvS tvS = C14399TvS.A03;
        C14399TvS.A00 = -1;
        tvS.A00(A0l);
        this.this$0.toast("Force Refetching Recent Searches...");
        AnonymousClass0fD.A0C(1065737313, A05);
    }
}
