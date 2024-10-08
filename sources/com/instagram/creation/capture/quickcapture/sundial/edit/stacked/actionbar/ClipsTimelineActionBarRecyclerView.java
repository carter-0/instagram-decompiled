package com.instagram.creation.capture.quickcapture.sundial.edit.stacked.actionbar;

import X.0qQ;
import X.AnonymousClass3AS;
import X.C60449Jlh;
import X.DbS;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ClipsTimelineActionBarRecyclerView extends RecyclerView {
    public boolean A00;
    public boolean A01;
    public final C60449Jlh A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClipsTimelineActionBarRecyclerView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final boolean isPaddingOffsetRequired() {
        return true;
    }

    public float getLeftFadingEdgeStrength() {
        if (this.A00) {
            return 0.3f;
        }
        return 0.0f;
    }

    public float getRightFadingEdgeStrength() {
        if (this.A01) {
            return 0.3f;
        }
        return 0.0f;
    }

    public int getLeftPaddingOffset() {
        return -getPaddingLeft();
    }

    public int getRightPaddingOffset() {
        return getPaddingRight();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsTimelineActionBarRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A00 = true;
        this.A01 = true;
        C60449Jlh jlh = new C60449Jlh(1);
        this.A02 = jlh;
        setItemAnimator((AnonymousClass3AS) null);
        setHorizontalFadingEdgeEnabled(true);
        setFadingEdgeLength(DbS.A02(context, 80));
        setHorizontalFadingEdgeEnabled(true);
        A11(jlh);
    }

    public /* synthetic */ ClipsTimelineActionBarRecyclerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }
}
