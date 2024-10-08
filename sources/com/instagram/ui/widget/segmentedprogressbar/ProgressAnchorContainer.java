package com.instagram.ui.widget.segmentedprogressbar;

import X.0mk;
import X.AnonymousClass7TE;
import X.C294975nL;
import X.C315596kB;
import X.C67680MsG;
import X.C71392co;
import X.JTP;
import X.JTT;
import X.PQU;
import X.PRR;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ProgressAnchorContainer extends LinearLayout {
    public C67680MsG A00;
    public final SegmentedProgressBar A01;
    public final boolean A02;

    public ProgressAnchorContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final void A00(ProgressAnchorContainer progressAnchorContainer, boolean z) {
        SegmentedProgressBar segmentedProgressBar = progressAnchorContainer.A01;
        int i = segmentedProgressBar.A04;
        boolean z2 = progressAnchorContainer.A02;
        int i2 = segmentedProgressBar.A03;
        if (z2) {
            i2 = (i - i2) - 1;
        }
        if (i > 1) {
            C71392co r0 = C315596kB.A02;
            C294975nL A0b = JTP.A0b(progressAnchorContainer);
            A0b.A06 = new PQU(progressAnchorContainer, i, i2, z);
            A0b.A0F(true).A0H();
        }
        C67680MsG msG = progressAnchorContainer.A00;
        if (msG != null) {
            View[] viewArr = {msG};
            if (z) {
                C315596kB.A08(viewArr, true);
            } else {
                C315596kB.A09(viewArr, true);
            }
        }
    }

    public final void addView(View view) {
        if ((view instanceof C67680MsG) || (view instanceof SegmentedProgressBar)) {
            super.addView(view);
            return;
        }
        throw AnonymousClass7TE.A0w("Can only attach views that extend from ProgressAnchorView");
    }

    public final C67680MsG getAnchorView() {
        return this.A00;
    }

    public final SegmentedProgressBar getSegmentedProgressBar() {
        return this.A01;
    }

    public final void setAnchorView(C67680MsG msG) {
        C67680MsG msG2 = this.A00;
        if (msG2 != null) {
            removeView(msG2);
        }
        addView(msG);
        this.A00 = msG;
    }

    public ProgressAnchorContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.layout_progress_anchor_container, this, true);
        SegmentedProgressBar segmentedProgressBar = (SegmentedProgressBar) requireViewById(R.id.segment_progress_bar);
        this.A01 = segmentedProgressBar;
        this.A02 = 0mk.A02(context);
        segmentedProgressBar.A0C = new PRR(this);
    }

    public /* synthetic */ ProgressAnchorContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    public ProgressAnchorContainer(Context context) {
        this(context, (AttributeSet) null, 0);
    }
}
