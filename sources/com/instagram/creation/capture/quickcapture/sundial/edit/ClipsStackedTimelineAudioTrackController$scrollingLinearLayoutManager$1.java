package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.0qQ;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import X.AnonymousClass7TG;
import X.KMU;
import android.content.Context;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;

public final class ClipsStackedTimelineAudioTrackController$scrollingLinearLayoutManager$1 extends CustomScrollingLinearLayoutManager {
    public final /* synthetic */ KMU A00;

    public final void A1S(AnonymousClass3AW r4) {
        0qQ.A0B(r4, 0);
        super.A1S(r4);
        KMU kmu = this.A00;
        if ((kmu.A01 || kmu.A03) && A1a() == 0) {
            kmu.A01 = false;
            kmu.A03 = false;
            int i = kmu.A0I.A03;
            if (i != 0) {
                kmu.A00 = 0;
                kmu.A0G((float) i);
            }
        }
        kmu.A00 = kmu.A0D.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsStackedTimelineAudioTrackController$scrollingLinearLayoutManager$1(Context context, KMU kmu) {
        super(context, 150.0f, 0, true);
        this.A00 = kmu;
    }

    public final int A1K(AnonymousClass3AN r2, AnonymousClass3AW r3, int i) {
        AnonymousClass7TG.A1O(r2, r3);
        return super.A1K(r2, r3, this.A00.A09(i));
    }
}
