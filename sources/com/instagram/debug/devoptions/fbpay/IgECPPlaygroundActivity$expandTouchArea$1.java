package com.instagram.debug.devoptions.fbpay;

import X.AnonymousClass7TE;
import X.C66581MXm;
import android.graphics.Rect;
import android.view.View;

public final class IgECPPlaygroundActivity$expandTouchArea$1 implements Runnable {
    public final /* synthetic */ View $childView;
    public final /* synthetic */ View $parentView;
    public final /* synthetic */ int $value;

    public IgECPPlaygroundActivity$expandTouchArea$1(View view, int i, View view2) {
        this.$childView = view;
        this.$value = i;
        this.$parentView = view2;
    }

    public final void run() {
        Rect A0W = AnonymousClass7TE.A0W();
        this.$childView.getHitRect(A0W);
        int i = A0W.top;
        int i2 = this.$value;
        A0W.top = i - i2;
        A0W.left -= i2;
        A0W.right += i2;
        A0W.bottom += i2;
        C66581MXm.A18(A0W, this.$childView, this.$parentView);
    }
}
