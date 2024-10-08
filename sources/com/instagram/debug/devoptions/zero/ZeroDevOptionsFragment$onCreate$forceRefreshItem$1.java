package com.instagram.debug.devoptions.zero;

import X.AnonymousClass0fD;
import X.AnonymousClass1Qz;
import X.AnonymousClass7TE;
import android.view.View;

public final class ZeroDevOptionsFragment$onCreate$forceRefreshItem$1 implements View.OnClickListener {
    public final /* synthetic */ ZeroDevOptionsFragment this$0;

    public ZeroDevOptionsFragment$onCreate$forceRefreshItem$1(ZeroDevOptionsFragment zeroDevOptionsFragment) {
        this.this$0 = zeroDevOptionsFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1535795942);
        AnonymousClass1Qz.A00(AnonymousClass7TE.A0l(this.this$0.session$delegate)).AWJ("manual", true);
        AnonymousClass0fD.A0C(1220483363, A05);
    }
}
