package com.instagram.debug.devoptions.section.search;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C293655l8;
import X.C293665l9;
import android.view.View;

public final class SearchDebugSettingsFragment$appendBootstrapOptions$6 implements View.OnClickListener {
    public final /* synthetic */ SearchDebugSettingsFragment this$0;

    public SearchDebugSettingsFragment$appendBootstrapOptions$6(SearchDebugSettingsFragment searchDebugSettingsFragment) {
        this.this$0 = searchDebugSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1200426268);
        C293655l8.A00(AnonymousClass7TE.A0l(this.this$0.session$delegate)).A01();
        C293665l9 A00 = C293655l8.A00(AnonymousClass7TE.A0l(this.this$0.session$delegate));
        if (!AnonymousClass7TF.A1Z(A00.A07)) {
            C293665l9.A00(A00);
        }
        this.this$0.toast("Fetching Keyword Bootstrap...");
        AnonymousClass0fD.A0C(251185045, A05);
    }
}
