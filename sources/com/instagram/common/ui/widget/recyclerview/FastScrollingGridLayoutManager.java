package com.instagram.common.ui.widget.recyclerview;

import X.AnonymousClass3AW;
import X.U9c;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FastScrollingGridLayoutManager extends GridLayoutManager {
    public float A00;
    public final Context A01;

    public FastScrollingGridLayoutManager(Context context, int i) {
        super(context, i);
        this.A01 = context;
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
        U9c u9c = new U9c(this.A01, this);
        u9c.A00 = i;
        A0t(u9c);
    }
}
