package com.instagram.feed.ui.rows.videoscrubber.buffer.layout;

import X.0qQ;
import X.0sP;
import X.AnonymousClass00P;
import X.AnonymousClass7TG;
import X.C258423yz;
import X.C51976G9y;
import X.C55992Hqy;
import X.C59100J6i;
import X.C62320sa;
import X.IDB;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class MediaVideoScrubberBufferConstraintLayout extends ConstraintLayout implements C258423yz {
    public boolean A00;
    public C55992Hqy A01;

    public final void CMg(C62320sa r10, 0sP r11, int i, int i2) {
        0qQ.A0B(r11, 3);
        this.A01 = new C55992Hqy(r10, r11, new C59100J6i(this, 1), new C59100J6i(this, 2), i, i2);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new IDB(this, i2, 1));
            return;
        }
        int A02 = AnonymousClass7TG.A02(getContext());
        C51976G9y.A0P(new Rect(0, 0, A02, i2), this, A02, i2);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaVideoScrubberBufferConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7TG.A1O(context, attributeSet);
    }

    public void setBufferEnabled(boolean z) {
        this.A00 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaVideoScrubberBufferConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass7TG.A1O(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaVideoScrubberBufferConstraintLayout(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }
}
