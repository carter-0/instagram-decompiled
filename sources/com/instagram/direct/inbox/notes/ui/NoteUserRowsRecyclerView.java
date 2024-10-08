package com.instagram.direct.inbox.notes.ui;

import X.0qQ;
import X.AnonymousClass972;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class NoteUserRowsRecyclerView extends RecyclerView {
    public Integer A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NoteUserRowsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final Integer getMaxHeight() {
        return this.A00;
    }

    public final void onMeasure(int i, int i2) {
        Integer num = this.A00;
        if (num != null) {
            i2 = View.MeasureSpec.makeMeasureSpec(num.intValue(), AnonymousClass972.MUTABLE_FLAG_MASK);
        }
        super.onMeasure(i, i2);
    }

    public final void setMaxHeight(Integer num) {
        this.A00 = num;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoteUserRowsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NoteUserRowsRecyclerView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
