package com.instagram.ui.listview;

import X.C346817vo;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class CustomFadingEdgeListView extends ListView implements C346817vo {
    public boolean A00 = true;
    public int A01 = 0;
    public boolean A02 = true;
    public boolean A03 = true;
    public boolean A04 = true;

    public float getBottomFadingEdgeStrength() {
        if (this.A00) {
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
        return this.A01;
    }

    public float getTopFadingEdgeStrength() {
        if (this.A04) {
            return super.getTopFadingEdgeStrength();
        }
        return 0.0f;
    }

    public CustomFadingEdgeListView(Context context) {
        super(context);
    }

    public void setBottomFadingEnabled(boolean z) {
        this.A00 = z;
    }

    public void setLeftFadingEnabled(boolean z) {
        this.A02 = z;
    }

    public void setRightFadingEnabled(boolean z) {
        this.A03 = z;
    }

    public void setSolidColor(int i) {
        this.A01 = i;
    }

    public void setTopFadingEnabled(boolean z) {
        this.A04 = z;
    }

    public CustomFadingEdgeListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CustomFadingEdgeListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
