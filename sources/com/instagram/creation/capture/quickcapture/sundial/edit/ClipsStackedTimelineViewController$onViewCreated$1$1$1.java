package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import X.AnonymousClass7TG;
import X.LQO;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class ClipsStackedTimelineViewController$onViewCreated$1$1$1 extends LinearLayoutManager {
    public final /* synthetic */ ClipsStackedTimelineViewController A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsStackedTimelineViewController$onViewCreated$1$1$1(Context context, ClipsStackedTimelineViewController clipsStackedTimelineViewController) {
        super(context, 0, false);
        this.A00 = clipsStackedTimelineViewController;
    }

    public final int A1K(AnonymousClass3AN r2, AnonymousClass3AW r3, int i) {
        AnonymousClass7TG.A1O(r2, r3);
        return super.A1K(r2, r3, this.A00.A09(i));
    }

    public final void A1S(AnonymousClass3AW r3) {
        super.A1S(r3);
        if (LQO.A06) {
            ClipsStackedTimelineViewController clipsStackedTimelineViewController = this.A00;
            if (clipsStackedTimelineViewController.A04) {
                LinearLayoutManager linearLayoutManager = clipsStackedTimelineViewController.A01;
                if (linearLayoutManager == null) {
                    0qQ.A0F("linearLayoutManager");
                    throw AnonymousClass00P.createAndThrow();
                } else if (linearLayoutManager.A1a() == 0) {
                    clipsStackedTimelineViewController.A0I(clipsStackedTimelineViewController.A00);
                    clipsStackedTimelineViewController.A04 = false;
                }
            }
        }
    }
}
