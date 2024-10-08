package com.instagram.leadgen.core.ui;

import X.0kx;
import X.0qQ;
import X.AnonymousClass7TF;
import X.C13991Tnr;
import X.C14746U6n;
import X.C244063aa;
import X.C244083ac;
import X.DbT;
import X.DbV;
import X.JTT;
import X.WA6;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LeadGenFormSingleMultipleChoiceQuestionView extends C14746U6n {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenFormSingleMultipleChoiceQuestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_form_single_multiple_choice, this);
        this.A01 = DbT.A0a(this, R.id.label_text_view);
        this.A00 = (IgLinearLayout) requireViewById(R.id.multiple_choice_options);
        this.A02 = DbT.A0a(this, R.id.optional_label);
    }

    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        IgFrameLayout igFrameLayout;
        LeadGenFormBaseQuestion leadGenFormBaseQuestion2 = leadGenFormBaseQuestion;
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        boolean z4 = z3;
        this.A04 = z4;
        IgTextView igTextView = this.A01;
        igTextView.setText(leadGenFormBaseQuestion.A0A);
        IgLinearLayout igLinearLayout = this.A00;
        igLinearLayout.removeAllViews();
        if (!z3 || !leadGenFormBaseQuestion.A0I) {
            this.A02.setVisibility(8);
        } else {
            this.A02.setVisibility(0);
        }
        for (String str : leadGenFormBaseQuestion.A0D) {
            View inflate = DbV.A0D(this).inflate(R.layout.lead_gen_view_form_single_multiple_choice_option, igLinearLayout, false);
            if ((inflate instanceof IgFrameLayout) && (igFrameLayout = (IgFrameLayout) inflate) != null) {
                TextView A08 = C13991Tnr.A08(igFrameLayout, R.id.option_text);
                A08.setText(str);
                if (0qQ.A0K(str, leadGenFormBaseQuestion.A00)) {
                    igFrameLayout.setSelected(true);
                }
                A08.setOnClickListener(new WA6(igFrameLayout, leadGenFormBaseQuestion2, this, str, z4));
                igLinearLayout.addView(igFrameLayout);
            }
        }
        C244083ac.A05(igTextView, C244063aa.TITLE);
    }

    public final void setUpTextStyle(boolean z) {
        IgTextView igTextView = this.A01;
        if (z) {
            igTextView.setGravity(17);
            igTextView.setTextAppearance(R.style.igds_title);
            0kx r2 = new 0kx(this.A00);
            while (r2.hasNext()) {
                AnonymousClass7TF.A0G((View) r2.next(), R.id.option_text).setTextAlignment(5);
            }
            return;
        }
        igTextView.setGravity(8388611);
        igTextView.setTextAppearance(R.style.igds_emphasized_label);
        igTextView.setTypeface(Typeface.DEFAULT_BOLD);
        0kx r22 = new 0kx(this.A00);
        while (r22.hasNext()) {
            AnonymousClass7TF.A0G((View) r22.next(), R.id.option_text).setTextAlignment(4);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormSingleMultipleChoiceQuestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormSingleMultipleChoiceQuestionView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormSingleMultipleChoiceQuestionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
