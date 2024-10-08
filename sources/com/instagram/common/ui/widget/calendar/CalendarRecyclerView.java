package com.instagram.common.ui.widget.calendar;

import X.2Rw;
import X.AnonymousClass3BD;
import X.AnonymousClass7TE;
import X.C67774MuY;
import X.UAJ;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CalendarRecyclerView extends RecyclerView {
    public final GridLayoutManager A00;

    public CalendarRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setAdapter(2Rw r4) {
        if (r4 instanceof UAJ) {
            this.A00.A01 = new C67774MuY(r4, 0);
            super.setAdapter(r4);
            return;
        }
        throw AnonymousClass7TE.A0w("adapter must be an instance of CalendarAdapter");
    }

    public CalendarRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), UAJ.A05);
        this.A00 = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
        AnonymousClass3BD recycledViewPool = getRecycledViewPool();
        recycledViewPool.A02(2, 21);
        recycledViewPool.A02(0, 90);
        recycledViewPool.A02(1, 28);
    }

    public CalendarRecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }
}
