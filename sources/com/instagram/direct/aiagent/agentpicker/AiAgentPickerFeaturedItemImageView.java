package com.instagram.direct.aiagent.agentpicker;

import X.0qQ;
import X.JTT;
import X.SN3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AiAgentPickerFeaturedItemImageView extends IgImageView {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AiAgentPickerFeaturedItemImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void onMeasure(int i, int i2) {
        View.MeasureSpec.getMode(i2);
        View.MeasureSpec.getSize(i2);
        int size = View.MeasureSpec.getSize(i);
        AiAgentPickerFeaturedItemImageView.super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec((int) (((float) size) / 1.0f), SN3.MAX_SIGNED_POWER_OF_TWO));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiAgentPickerFeaturedItemImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ AiAgentPickerFeaturedItemImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AiAgentPickerFeaturedItemImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
