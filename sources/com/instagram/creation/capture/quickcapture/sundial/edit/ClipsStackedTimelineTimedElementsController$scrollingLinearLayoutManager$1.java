package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.0qQ;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import X.AnonymousClass7TG;
import X.KMT;
import android.content.Context;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;

public final class ClipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1 extends CustomScrollingLinearLayoutManager {
    public final /* synthetic */ KMT A00;

    public final void A1S(AnonymousClass3AW r4) {
        0qQ.A0B(r4, 0);
        super.A1S(r4);
        KMT kmt = this.A00;
        if ((kmt.A04 || kmt.A05) && A1a() == 0) {
            kmt.A04 = false;
            kmt.A05 = false;
            int i = kmt.A0I.A03;
            if (i != 0) {
                kmt.A00 = 0;
                kmt.A0G((float) i);
            }
        }
        kmt.A02 = kmt.A0C.A03;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1(Context context, KMT kmt) {
        super(context, 150.0f, 0, true);
        this.A00 = kmt;
    }

    public final int A1K(AnonymousClass3AN r2, AnonymousClass3AW r3, int i) {
        AnonymousClass7TG.A1O(r2, r3);
        return super.A1K(r2, r3, this.A00.A09(i));
    }
}
