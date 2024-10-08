package com.instagram.ui.widget.refresh;

import X.002;
import X.0qQ;
import X.0wb;
import X.AnonymousClass3AH;
import X.AnonymousClass7TF;
import android.content.Context;
import android.util.AttributeSet;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class IgSwipeRefreshLayout extends SwipeRefreshLayout {
    public final AnonymousClass3AH A00 = new AnonymousClass3AH(AnonymousClass7TF.A0h(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgSwipeRefreshLayout(Context context) {
        super(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final int getChildDrawingOrder(int i, int i2) {
        int childDrawingOrder = IgSwipeRefreshLayout.super.getChildDrawingOrder(i, i2);
        if (childDrawingOrder < i) {
            return childDrawingOrder;
        }
        0wb.A07("IgSwipeRefreshLayout", new IndexOutOfBoundsException(002.A0n("getChildDrawingOrder() returns an invalid index ", " (child count is ", ") in IgSwipeRefreshLayout.", childDrawingOrder, i)));
        return i - 1;
    }

    public void setRefreshing(boolean z) {
        IgSwipeRefreshLayout.super.setRefreshing(z);
        AnonymousClass3AH r3 = this.A00;
        if (z) {
            r3.A00(1.0d, true);
        } else {
            r3.A00(0.0d, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}
