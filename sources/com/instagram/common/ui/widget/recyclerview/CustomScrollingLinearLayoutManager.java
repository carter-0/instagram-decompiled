package com.instagram.common.ui.widget.recyclerview;

import X.17k;
import X.AnonymousClass3AW;
import X.JY8;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

public class CustomScrollingLinearLayoutManager extends LinearLayoutManagerCompat {
    public float A00;
    public boolean A01 = true;
    public final boolean A02;
    public final Context A03;

    public CustomScrollingLinearLayoutManager(Context context, float f, int i, boolean z) {
        super(context, i, false);
        this.A00 = -1;
        this.A01 = -1;
        this.A02 = false;
        this.A03 = context;
        this.A00 = f;
        this.A02 = z;
    }

    public void A1T(AnonymousClass3AW r3, RecyclerView recyclerView, int i) {
        boolean z = false;
        if (this.A00 > 0.0f) {
            z = true;
        }
        17k.A0G(z, "Cannot perform smooth scrolling with non positive scrolling speed.");
        JY8 jy8 = new JY8(this.A03, this);
        jy8.A00 = i;
        A0t(jy8);
    }

    public final boolean A1X() {
        if (!this.A01 || this.A01 != 0) {
            return false;
        }
        return true;
    }
}
