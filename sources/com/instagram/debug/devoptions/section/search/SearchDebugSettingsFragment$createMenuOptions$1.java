package com.instagram.debug.devoptions.section.search;

import X.19B;
import X.AnonymousClass0fD;
import X.AnonymousClass4D7;
import X.C51647Fy6;
import X.C67351tA;
import android.view.View;

public final class SearchDebugSettingsFragment$createMenuOptions$1 implements View.OnClickListener {
    public final /* synthetic */ SearchDebugSettingsFragment this$0;

    public SearchDebugSettingsFragment$createMenuOptions$1(SearchDebugSettingsFragment searchDebugSettingsFragment) {
        this.this$0 = searchDebugSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1799663524);
        C67351tA.A00(19B.A00, new C51647Fy6((Object) this.this$0.getSearchDebugPreferences(), (AnonymousClass4D7) null, 39));
        this.this$0.toast("Cleared.");
        AnonymousClass0fD.A0C(-963125570, A05);
    }
}
