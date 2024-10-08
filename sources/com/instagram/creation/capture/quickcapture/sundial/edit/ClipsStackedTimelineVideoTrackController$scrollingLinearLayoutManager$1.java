package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.0kD;
import X.AnonymousClass0fD;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import X.AnonymousClass7TG;
import X.KMS;
import android.content.Context;
import android.view.View;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;

public final class ClipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1 extends CustomScrollingLinearLayoutManager {
    public final /* synthetic */ KMS A00;

    public final void A0j(View view, int i, int i2) {
        boolean z = this.A01;
        this.A01 = true;
        super.A0j(view, 0, 0);
        this.A01 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1(Context context, KMS kms) {
        super(context, 150.0f, 0, true);
        this.A00 = kms;
    }

    public final int A1K(AnonymousClass3AN r5, AnonymousClass3AW r6, int i) {
        String str;
        AnonymousClass7TG.A1O(r5, r6);
        try {
            return super.A1K(r5, r6, this.A00.A09(i));
        } catch (NullPointerException e) {
            e = e;
            str = "scrollHorizontallyBy failed";
            0kD.A07("ClipsStackedTimelineVideoTrackController", str, e);
            return 0;
        } catch (IllegalStateException e2) {
            e = e2;
            str = "scrollHorizontallyBy failed due to MID 2ff29f0d4f81f32502aab9ce8039e5a2";
            0kD.A07("ClipsStackedTimelineVideoTrackController", str, e);
            return 0;
        }
    }

    public final void A1R(AnonymousClass3AN r5, AnonymousClass3AW r6) {
        int A03 = AnonymousClass0fD.A03(-148820240);
        AnonymousClass7TG.A1N(r5, r6);
        try {
            super.A1R(r5, r6);
        } catch (IndexOutOfBoundsException e) {
            0kD.A07("ClipsStackedTimelineVideoTrackController", "onLayoutChildren failed", e);
        }
        AnonymousClass0fD.A0A(-1098862906, A03);
    }
}
