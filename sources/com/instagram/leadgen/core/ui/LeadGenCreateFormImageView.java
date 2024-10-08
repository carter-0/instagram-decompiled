package com.instagram.leadgen.core.ui;

import X.0qQ;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LeadGenCreateFormImageView extends ConstraintLayout {
    public final RoundedCornerImageView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenCreateFormImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_create_form_image, this);
        this.A00 = (RoundedCornerImageView) requireViewById(R.id.lead_form_cover_image);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenCreateFormImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenCreateFormImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ LeadGenCreateFormImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
