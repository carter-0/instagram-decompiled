package com.instagram.feed.ui.rows.videoscrubber.buffer.layout;

import X.03v;
import X.0qQ;
import X.0sP;
import X.0sr;
import X.AnonymousClass00P;
import X.C258423yz;
import X.C55992Hqy;
import X.C59100J6i;
import X.C62320sa;
import X.IDA;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.instagram.android.R;

public final class MediaVideoScrubberBufferRelativeLayout extends RelativeLayout implements C258423yz {
    public boolean A00;
    public C55992Hqy A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaVideoScrubberBufferRelativeLayout(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final void CMg(C62320sa r8, 0sP r9, int i, int i2) {
        0qQ.A0B(r9, 3);
        this.A01 = new C55992Hqy(r8, r9, new C59100J6i(this, 5), new C59100J6i(this, 6), i, i2);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new IDA(this, i2));
            return;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        03v.A0H(this, 0sr.A1P(new Rect[]{new Rect(0, 0, dimensionPixelSize, i2), new Rect(getWidth() - dimensionPixelSize, 0, getWidth(), i2)}));
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (!this.A00) {
            return super.dispatchTouchEvent(motionEvent);
        }
        C55992Hqy hqy = this.A01;
        if (hqy != null) {
            return hqy.A00(motionEvent);
        }
        0qQ.A0F("bufferLayoutDelegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public void setBufferEnabled(boolean z) {
        this.A00 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaVideoScrubberBufferRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaVideoScrubberBufferRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }
}
