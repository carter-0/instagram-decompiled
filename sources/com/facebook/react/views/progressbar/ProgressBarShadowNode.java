package com.facebook.react.views.progressbar;

import X.0Sd;
import X.AnonymousClass2T1;
import X.C18671VwU;
import X.C245003c8;
import X.C245103cK;
import X.C245193cT;
import X.QZL;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.HashSet;
import java.util.Set;

public final class ProgressBarShadowNode extends LayoutShadowNode implements AnonymousClass2T1 {
    public String A00;
    public final SparseIntArray A01 = new SparseIntArray();
    public final SparseIntArray A02 = new SparseIntArray();
    public final Set A03 = new HashSet();

    public final long Cnu(C245103cK r7, C245103cK r8, C245003c8 r9, float f, float f2) {
        int A002 = C18671VwU.A00(this.A00);
        Set set = this.A03;
        Integer valueOf = Integer.valueOf(A002);
        if (!set.contains(valueOf)) {
            QZL qzl = this.A0A;
            0Sd.A00(qzl);
            ProgressBar A012 = C18671VwU.A01(qzl, A002);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            A012.measure(makeMeasureSpec, makeMeasureSpec);
            this.A01.put(A002, A012.getMeasuredHeight());
            this.A02.put(A002, A012.getMeasuredWidth());
            set.add(valueOf);
        }
        return C245193cT.A00(this.A02.get(A002), this.A01.get(A002));
    }

    @ReactProp(name = "styleAttr")
    public final void setStyle(String str) {
        if (str == null) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        this.A00 = str;
    }

    public ProgressBarShadowNode() {
        A09(this);
        this.A00 = ReactProgressBarViewManager.DEFAULT_STYLE;
    }
}
