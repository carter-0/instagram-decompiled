package com.instagram.leadgen.core.ui;

import X.0qQ;
import X.DbT;
import X.DbU;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LeadGenFormHeaderViewWithoutWelcomeMessage extends ConstraintLayout {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenFormHeaderViewWithoutWelcomeMessage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_form_header_without_welcome_message, this);
        this.A02 = DbU.A0X(this, R.id.lead_form_profile_image);
        this.A01 = DbT.A0a(this, R.id.username_text_view);
        this.A00 = DbT.A0a(this, R.id.follower_number_text_view);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormHeaderViewWithoutWelcomeMessage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormHeaderViewWithoutWelcomeMessage(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormHeaderViewWithoutWelcomeMessage(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
