package com.facebook.smartcapture.components;

import X.0qQ;
import X.C11408SSf;
import X.SKW;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class ContourView extends FrameLayout {
    public int A00;
    public int A01;
    public boolean A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final ImageView A06 = SKW.A01(this, R.id.iv_contour_bottom_left);
    public final ImageView A07 = SKW.A01(this, R.id.iv_contour_bottom_right);
    public final ImageView A08 = SKW.A01(this, R.id.iv_contour_top_left);
    public final ImageView A09 = SKW.A01(this, R.id.iv_contour_top_right);
    public final TextView A0A = SKW.A02(this, R.id.tv_text_tip);
    public final DarkenedFrameView A0B = ((DarkenedFrameView) SKW.A00(this, R.id.darkened_frame_view));
    public final DottedAlignmentView A0C = ((DottedAlignmentView) SKW.A00(this, R.id.dotted_alignment_view));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContourView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        View.inflate(getContext(), R.layout.contour_view, this);
        Resources resources = getResources();
        this.A03 = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
        this.A04 = resources.getDimension(R.dimen.abc_control_corner_material);
        this.A05 = C11408SSf.A01(context, R.attr.sc_positive);
        this.A01 = 0;
        this.A00 = 0;
        setAlpha(0.0f);
        this.A02 = true;
    }

    public final View getTextTip() {
        return this.A0A;
    }

    public final void setTextTip(CharSequence charSequence) {
        this.A0A.setText(charSequence);
    }
}
