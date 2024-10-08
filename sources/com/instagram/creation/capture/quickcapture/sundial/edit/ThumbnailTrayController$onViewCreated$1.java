package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.0qQ;
import X.AnonymousClass3AW;
import X.AnonymousClass8RH;
import X.C60398Jkr;
import X.C64711Lgk;
import X.KM0;
import android.content.Context;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;

public final class ThumbnailTrayController$onViewCreated$1 extends CustomScrollingLinearLayoutManager {
    public final /* synthetic */ C64711Lgk A00;

    public final void A1S(AnonymousClass3AW r4) {
        0qQ.A0B(r4, 0);
        super.A1S(r4);
        C64711Lgk lgk = this.A00;
        C60398Jkr jkr = lgk.A0M;
        AnonymousClass8RH A0E = lgk.A0Q.A0E();
        if (A0E != null) {
            ((KM0) jkr).A07.invoke(A0E);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThumbnailTrayController$onViewCreated$1(Context context, C64711Lgk lgk) {
        super(context, 150.0f, 0, true);
        this.A00 = lgk;
    }
}
