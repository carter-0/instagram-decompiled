package com.instagram.debug.devoptions.section.search;

import X.0sP;
import X.19B;
import X.AnonymousClass0fD;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C66164MGb;
import X.C67351tA;
import X.UKV;
import android.view.View;

public final class SearchDebugSettingsFragment$appendBootstrapOptions$4 implements View.OnClickListener {
    public final /* synthetic */ UKV $prefs;
    public final /* synthetic */ SearchDebugSettingsFragment this$0;

    public SearchDebugSettingsFragment$appendBootstrapOptions$4(SearchDebugSettingsFragment searchDebugSettingsFragment, UKV ukv) {
        this.this$0 = searchDebugSettingsFragment;
        this.$prefs = ukv;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1405450112);
        final SearchDebugSettingsFragment searchDebugSettingsFragment = this.this$0;
        searchDebugSettingsFragment.showCacheLimitSelectionDialog(this.$prefs.A00, new 0sP() {
            public final void invoke(int i) {
                C67351tA.A00(19B.A00, new C66164MGb(SearchDebugSettingsFragment.this.getSearchDebugPreferences(), (AnonymousClass4D7) null, i, 27));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(AnonymousClass7TE.A0M(obj));
                return C60340gF.A00;
            }
        });
        AnonymousClass0fD.A0C(-293111586, A05);
    }
}
