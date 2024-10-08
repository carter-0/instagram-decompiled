package com.instagram.business.insights.ui;

import X.0qQ;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66426MRg;
import X.JTR;
import X.Kb4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;

public final class InsightsTopPostsView extends LinearLayout implements C66426MRg {
    public C66426MRg A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsightsTopPostsView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        setOrientation(1);
    }

    public final void DK0(View view, String str) {
        0qQ.A0B(view, 0);
        C66426MRg mRg = this.A00;
        if (mRg != null) {
            mRg.DK0(view, str);
        }
    }

    public final void setData(ImmutableList immutableList, AnonymousClass0iw r16) {
        boolean A1U = AnonymousClass7TF.A1U(0, immutableList, r16);
        removeAllViews();
        int size = immutableList.size();
        int i = 0;
        for (int i2 = 0; i2 < size && i < 2; i2 += 3) {
            InsightsImagesRowView insightsImagesRowView = new InsightsImagesRowView(AnonymousClass7TE.A0S(this), 3);
            ImmutableList subList = immutableList.subList(i2, Math.min(immutableList.size(), i2 + 3));
            0qQ.A07(subList);
            insightsImagesRowView.removeAllViews();
            int size2 = subList.size();
            int i3 = insightsImagesRowView.A00;
            if (0 < Math.min(size2, i3)) {
                subList.get(0);
                Context A0S = AnonymousClass7TE.A0S(insightsImagesRowView);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                if (A1U) {
                    layoutParams.setMarginEnd(JTR.A08(A0S));
                }
                new Kb4(A0S).setLayoutParams(layoutParams);
                throw AnonymousClass7TE.A11("getInstagramMediaId");
            }
            for (int i4 = 0; i4 < i3; i4++) {
                Context A0S2 = AnonymousClass7TE.A0S(insightsImagesRowView);
                boolean A1T = AnonymousClass7TF.A1T(i4, size2 - 1);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                if (A1T) {
                    layoutParams2.setMarginEnd(JTR.A08(A0S2));
                }
                Kb4 kb4 = new Kb4(A0S2);
                kb4.setLayoutParams(layoutParams2);
                kb4.setVisibility(4);
                insightsImagesRowView.addView(kb4);
            }
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.topMargin = getResources().getDimensionPixelOffset(R.dimen.account_recs_header_image_margin);
            insightsImagesRowView.setLayoutParams(layoutParams3);
            insightsImagesRowView.A01 = this;
            addView(insightsImagesRowView);
            i++;
        }
    }

    public final void setDelegate(C66426MRg mRg) {
        this.A00 = mRg;
    }

    public final void setShowAvatarForMediaOverlay(boolean z) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsightsTopPostsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        setOrientation(1);
    }
}
