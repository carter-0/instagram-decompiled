package com.google.android.material.internal;

import X.C18932WDk;
import X.C20869X1v;
import X.DbU;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

public class NavigationMenuView extends RecyclerView implements C20869X1v {
    public final void CN4(C18932WDk wDk) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        DbU.A15(context, this, 1, false);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context) {
        this(context, (AttributeSet) null);
    }
}
