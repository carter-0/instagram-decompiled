package com.instagram.debug.devoptions.section.search;

import X.1wn;
import X.AnonymousClass0fD;
import X.AnonymousClass9Fi;
import X.UKV;

public final class SearchDebugSettingsFragment$userBootstrapListener$1 implements 1wn {
    public final /* synthetic */ SearchDebugSettingsFragment this$0;

    public SearchDebugSettingsFragment$userBootstrapListener$1(SearchDebugSettingsFragment searchDebugSettingsFragment) {
        this.this$0 = searchDebugSettingsFragment;
    }

    public final void onEvent(AnonymousClass9Fi r4) {
        int A03 = AnonymousClass0fD.A03(-1341914005);
        this.this$0.toast("Bootstrap successfully fetched and updated.");
        UKV ukv = (UKV) this.this$0.getSettingsModel().A02();
        if (ukv != null) {
            this.this$0.updateItems(ukv);
        }
        AnonymousClass0fD.A0A(-473774266, A03);
    }

    public /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1878023973);
        onEvent((AnonymousClass9Fi) obj);
        AnonymousClass0fD.A0A(569732153, A03);
    }
}
