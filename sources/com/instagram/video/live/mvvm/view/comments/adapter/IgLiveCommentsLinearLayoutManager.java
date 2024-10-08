package com.instagram.video.live.mvvm.view.comments.adapter;

import X.0qQ;
import X.0wb;
import X.AnonymousClass0fD;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import X.AnonymousClass7TG;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class IgLiveCommentsLinearLayoutManager extends LinearLayoutManager {
    public final int A15(AnonymousClass3AW r3) {
        0qQ.A0B(r3, 0);
        return Math.max(LinearLayoutManager.A0K(this, r3), 0);
    }

    public final void A1R(AnonymousClass3AN r5, AnonymousClass3AW r6) {
        String str;
        int A03 = AnonymousClass0fD.A03(1582907712);
        AnonymousClass7TG.A1N(r5, r6);
        try {
            super.A1R(r5, r6);
        } catch (IndexOutOfBoundsException e) {
            Throwable cause = e.getCause();
            if ((cause == null || (str = cause.getMessage()) == null) && (str = e.getMessage()) == null) {
                str = "Comment layout out of bound";
            }
            0wb.A03("live_comments", str);
        }
        AnonymousClass0fD.A0A(1730357647, A03);
    }

    public IgLiveCommentsLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
