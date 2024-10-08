package com.instagram.business.insights.ui;

import X.0nA;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66426MRg;
import X.DbS;
import X.JTP;
import X.Kb4;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

public final class InsightsTopStoriesView extends LinearLayout implements C66426MRg {
    public C66426MRg A00;
    public List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsightsTopStoriesView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00(context);
    }

    private final void A00(Context context) {
        setOrientation(0);
        Resources resources = getResources();
        int A04 = JTP.A04(resources);
        int A09 = (int) (((float) ((0nA.A09(context) - (A04 * 5)) - AnonymousClass7TE.A0B(resources))) / 3.1f);
        DisplayMetrics A0H = 0nA.A0H(context);
        0qQ.A0B(A0H, 0);
        float f = ((float) A0H.widthPixels) / ((float) A0H.heightPixels);
        ArrayList A0v = DbS.A0v(6);
        int i = 0;
        do {
            Kb4 kb4 = new Kb4(context);
            kb4.setAspect(f);
            kb4.A00 = this;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A09, -2);
            int i2 = A04;
            if (i == 5) {
                i2 = 0;
            }
            layoutParams.rightMargin = i2;
            addView(kb4, layoutParams);
            A0v.add(kb4);
            i++;
        } while (i < 6);
        this.A01 = A0v;
    }

    public final void DK0(View view, String str) {
        0qQ.A0B(view, 0);
        C66426MRg mRg = this.A00;
        if (mRg != null) {
            mRg.DK0(view, str);
        }
    }

    public final void setData(ImmutableList immutableList, AnonymousClass0iw r7) {
        AnonymousClass7TG.A1N(immutableList, r7);
        0qQ.A07(getResources().getString(2131968500));
        List<View> list = this.A01;
        if (list == null) {
            0qQ.A0F("imageItemViews");
            throw AnonymousClass00P.createAndThrow();
        }
        int i = 0;
        for (View view : list) {
            int i2 = i + 1;
            if (i < immutableList.size()) {
                immutableList.get(i);
                throw AnonymousClass7TE.A11("getMetric");
            } else {
                view.setVisibility(8);
                i = i2;
            }
        }
    }

    public final void setDelegate(C66426MRg mRg) {
        this.A00 = mRg;
    }

    public final void setShowAvatarForMediaOverlay(boolean z) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsightsTopStoriesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context);
    }
}
