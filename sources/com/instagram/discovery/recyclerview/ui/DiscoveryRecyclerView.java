package com.instagram.discovery.recyclerview.ui;

import X.0qQ;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DiscoveryRecyclerView extends RecyclerView {
    public double A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DiscoveryRecyclerView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final boolean A1F(int i, int i2) {
        return super.A1F(i, (int) (((double) i2) * this.A00));
    }

    public final void setScrollingFrictionYFactor(double d) {
        this.A00 = d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoveryRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = 1.0d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiscoveryRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DiscoveryRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
