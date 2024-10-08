package com.instagram.mainfeed.fragment.layoutmanager;

import X.0qQ;
import X.AnonymousClass3AW;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;

public final class MainFeedLinearLayoutManager extends FastScrollingLinearLayoutManager {
    public boolean A00;

    public final void A1s(AnonymousClass3AW r2, int[] iArr) {
        0qQ.A0B(r2, 0);
        super.A1s(r2, iArr);
    }

    public final boolean A1Y() {
        if (!this.A00 || !super.A1Y()) {
            return false;
        }
        return true;
    }
}
