package com.instagram.ui.recyclerview;

import X.0qQ;
import X.C346817vo;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

public final class CustomFadingEdgeRecyclerView extends RecyclerView implements C346817vo {
    public int A00;
    public boolean A01 = true;
    public boolean A02 = true;
    public boolean A03 = true;
    public boolean A04 = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomFadingEdgeRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }

    public float getBottomFadingEdgeStrength() {
        if (this.A01) {
            return super.getBottomFadingEdgeStrength();
        }
        return 0.0f;
    }

    public float getLeftFadingEdgeStrength() {
        if (this.A02) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    public float getRightFadingEdgeStrength() {
        if (this.A03) {
            return super.getRightFadingEdgeStrength();
        }
        return 0.0f;
    }

    public int getSolidColor() {
        return this.A00;
    }

    public float getTopFadingEdgeStrength() {
        if (this.A04) {
            return super.getTopFadingEdgeStrength();
        }
        return 0.0f;
    }

    public void setBottomFadingEnabled(boolean z) {
        this.A01 = z;
    }

    public void setLeftFadingEnabled(boolean z) {
        this.A02 = z;
    }

    public void setRightFadingEnabled(boolean z) {
        this.A03 = z;
    }

    public final void setSolidColor(int i) {
        this.A00 = i;
    }

    public void setTopFadingEnabled(boolean z) {
        this.A04 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomFadingEdgeRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomFadingEdgeRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
