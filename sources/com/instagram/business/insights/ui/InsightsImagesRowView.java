package com.instagram.business.insights.ui;

import X.0qQ;
import X.C66426MRg;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class InsightsImagesRowView extends LinearLayout implements C66426MRg {
    public int A00;
    public C66426MRg A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InsightsImagesRowView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final void DK0(View view, String str) {
        0qQ.A0B(view, 0);
        C66426MRg mRg = this.A01;
        if (mRg != null) {
            mRg.DK0(view, str);
        }
    }

    public final void setDelegate(C66426MRg mRg) {
        this.A01 = mRg;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsightsImagesRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A00 = 3;
        setOrientation(0);
        setImportantForAccessibility(2);
    }

    public /* synthetic */ InsightsImagesRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsightsImagesRowView(Context context, int i) {
        super(context);
        0qQ.A0B(context, 1);
        this.A00 = i;
        setOrientation(0);
        setImportantForAccessibility(2);
    }
}
