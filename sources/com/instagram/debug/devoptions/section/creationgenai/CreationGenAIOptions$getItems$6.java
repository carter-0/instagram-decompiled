package com.instagram.debug.devoptions.section.creationgenai;

import X.0xY;
import X.1Av;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import android.view.View;

public final class CreationGenAIOptions$getItems$6 implements View.OnClickListener {
    public final /* synthetic */ 1Av $userPreferences;

    public CreationGenAIOptions$getItems$6(1Av r1) {
        this.$userPreferences = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-8143230);
        0xY A0p = AnonymousClass7TE.A0p(this.$userPreferences);
        A0p.E5Z("ig_native_imagine_disclosure_nux_seen_count", 0);
        A0p.apply();
        AnonymousClass0fD.A0C(-3342384, A05);
    }
}
