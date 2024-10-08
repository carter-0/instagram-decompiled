package com.fbpay.common;

import X.0qQ;
import X.C13612Tde;
import X.SF9;
import android.view.View;

public final class LinkableText$makeSpannable$1 extends URLSpanNoUnderline {
    public final /* synthetic */ SF9 A00;
    public final /* synthetic */ C13612Tde A01;
    public final /* synthetic */ boolean A02;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        if (this.A02) {
            view.cancelPendingInputEvents();
        }
        this.A01.DNd(this.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkableText$makeSpannable$1(SF9 sf9, C13612Tde tde, String str, boolean z) {
        super(str);
        this.A02 = z;
        this.A01 = tde;
        this.A00 = sf9;
    }
}
