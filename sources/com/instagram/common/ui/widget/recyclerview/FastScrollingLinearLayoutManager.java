package com.instagram.common.ui.widget.recyclerview;

import X.AnonymousClass3AW;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

public class FastScrollingLinearLayoutManager extends CustomScrollingLinearLayoutManager {
    public FastScrollingLinearLayoutManager(Context context) {
        super(context, 25.0f, 1, false);
    }

    public final void A1T(AnonymousClass3AW r4, RecyclerView recyclerView, int i) {
        float f;
        int abs = Math.abs(i - A1a());
        if (abs < 10) {
            f = 25.0f;
        } else {
            f = 2.0f;
            if (abs < 100) {
                f = 10.0f;
            }
        }
        this.A00 = f;
        super.A1T(r4, recyclerView, i);
    }
}
