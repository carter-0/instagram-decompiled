package com.facebookpay.msc.view;

import X.0qQ;
import X.AnonymousClass00P;
import X.C11426STk;
import X.QEY;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MSCPivotBar extends RecyclerView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MSCPivotBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        C11426STk.A03().A00(context, 12);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setAdapter(QEY qey) {
        0qQ.A0B(qey, 0);
        setAdapter(qey);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MSCPivotBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MSCPivotBar(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MSCPivotBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
        throw AnonymousClass00P.createAndThrow();
    }
}
