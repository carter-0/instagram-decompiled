package com.facebookpay.widget.listcell;

import X.0qQ;
import android.content.Context;
import android.util.AttributeSet;

public final class EntityListCell extends ListCell {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EntityListCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = 5;
    }

    public int getFbpayWidgetStyleType() {
        return this.A00;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EntityListCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EntityListCell(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
