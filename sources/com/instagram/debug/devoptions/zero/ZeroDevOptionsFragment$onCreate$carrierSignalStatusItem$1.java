package com.instagram.debug.devoptions.zero;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C309516Yo;
import android.view.View;

public final class ZeroDevOptionsFragment$onCreate$carrierSignalStatusItem$1 implements View.OnClickListener {
    public final /* synthetic */ ZeroDevOptionsFragment this$0;

    public ZeroDevOptionsFragment$onCreate$carrierSignalStatusItem$1(ZeroDevOptionsFragment zeroDevOptionsFragment) {
        this.this$0 = zeroDevOptionsFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-132519405);
        C309516Yo r1 = new C309516Yo(this.this$0.requireActivity(), AnonymousClass7TE.A0l(this.this$0.session$delegate));
        r1.A0D(new CarrierSignalStatusFragment());
        r1.A04();
        AnonymousClass0fD.A0C(-939349376, A05);
    }
}
