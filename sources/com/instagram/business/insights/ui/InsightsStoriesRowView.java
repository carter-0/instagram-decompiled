package com.instagram.business.insights.ui;

import X.0nA;
import X.0qQ;
import X.C66426MRg;
import X.DbS;
import X.JTP;
import X.Kb4;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public final class InsightsStoriesRowView extends LinearLayout implements C66426MRg {
    public C66426MRg A00;
    public List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsightsStoriesRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context, 3);
    }

    private final void A00(Context context, int i) {
        setOrientation(0);
        setImportantForAccessibility(2);
        int A04 = JTP.A04(getResources());
        int i2 = i - 1;
        int A09 = (0nA.A09(context) - (A04 * i2)) / i;
        DisplayMetrics A0H = 0nA.A0H(context);
        0qQ.A0B(A0H, 0);
        float f = ((float) A0H.widthPixels) / ((float) A0H.heightPixels);
        ArrayList A0v = DbS.A0v(i);
        for (int i3 = 0; i3 < i; i3++) {
            Kb4 kb4 = new Kb4(context);
            kb4.setAspect(f);
            kb4.A00 = this;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A09, -2);
            int i4 = A04;
            if (i3 == i2) {
                i4 = 0;
            }
            layoutParams.rightMargin = i4;
            addView(kb4, layoutParams);
            A0v.add(kb4);
        }
        this.A01 = A0v;
    }

    public final void DK0(View view, String str) {
        0qQ.A0B(view, 0);
        C66426MRg mRg = this.A00;
        if (mRg != null) {
            mRg.DK0(view, str);
        }
    }

    public final void setDelegate(C66426MRg mRg) {
        this.A00 = mRg;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsightsStoriesRowView(Context context, int i) {
        super(context);
        0qQ.A0B(context, 1);
        A00(context, i);
    }
}
