package com.instagram.debug.devoptions.direct.burner;

import X.1as;
import X.2FW;
import X.AnonymousClass0fD;
import X.AnonymousClass37D;
import X.AnonymousClass7TE;
import X.C49731F3w;
import X.C71277OhI;
import android.view.View;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import java.util.List;

public final class BurnerSendSettingsFragment$onViewCreated$2 implements View.OnClickListener {
    public final /* synthetic */ List $items;
    public final /* synthetic */ C71277OhI $targetUserIdEditText;
    public final /* synthetic */ BurnerSendSettingsFragment this$0;

    public BurnerSendSettingsFragment$onViewCreated$2(BurnerSendSettingsFragment burnerSendSettingsFragment, C71277OhI ohI, List list) {
        this.this$0 = burnerSendSettingsFragment;
        this.$targetUserIdEditText = ohI;
        this.$items = list;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(542728808);
        view.setEnabled(false);
        C49731F3w A07 = 1as.A04.A02.A07(this.this$0, AnonymousClass7TE.A0l(this.this$0.session$delegate), 2FW.A1g);
        A07.A06(AnonymousClass7TE.A0l(this.this$0.session$delegate).A06);
        A07.A01 = new BurnerSendSettingsFragment$onViewCreated$2$shareFragment$1(this.this$0, this.$targetUserIdEditText, view, this.$items);
        DirectShareSheetFragment A00 = A07.A00();
        AnonymousClass37D A01 = AnonymousClass37D.A00.A01(this.this$0.requireActivity());
        if (A01 != null) {
            A01.A0J(A00);
        }
        AnonymousClass0fD.A0C(1921672372, A05);
    }
}
