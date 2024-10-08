package com.instagram.leadgen.core.ui;

import X.0qQ;
import X.C14746U6n;
import X.C19404WXx;
import X.C19406WXz;
import X.C244063aa;
import X.C244083ac;
import X.DbT;
import X.DbU;
import X.JTT;
import X.W0n;
import X.W7Z;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LeadGenFormShortAnswerQuestionView extends C14746U6n {
    public TextWatcher A00;
    public final IgFormField A01;
    public final IgTextView A02;
    public final IgTextView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenFormShortAnswerQuestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_form_short_answer, this);
        this.A02 = DbT.A0a(this, R.id.label_text_view);
        this.A01 = DbT.A0d(this, R.id.answer_form_field);
        this.A03 = DbT.A0a(this, R.id.optional_label);
    }

    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        this.A00 = leadGenFormBaseQuestion;
        this.A04 = z3;
        IgTextView igTextView = this.A02;
        igTextView.setText(leadGenFormBaseQuestion.A0A);
        setLastKnownInput(leadGenFormBaseQuestion.A00);
        this.A06 = z2;
        IgFormField igFormField = this.A01;
        igFormField.setPrismMode(z2);
        igFormField.setText(leadGenFormBaseQuestion.A00);
        igFormField.setRuleChecker(new C19404WXx(leadGenFormBaseQuestion, this, false, z));
        A0I();
        igFormField.setInputType(16385);
        W0n.A00(igFormField);
        if (!z3 || !leadGenFormBaseQuestion.A0I) {
            this.A03.setVisibility(8);
        } else {
            this.A03.setVisibility(0);
            W0n.A02(igFormField, new C19406WXz(this, 4));
        }
        C244083ac.A05(igTextView, C244063aa.TITLE);
    }

    public final void A0I() {
        TextWatcher textWatcher = this.A00;
        if (textWatcher != null) {
            DbU.A1E(textWatcher, this.A01);
        }
        LeadGenFormBaseQuestion leadGenFormBaseQuestion = this.A00;
        if (leadGenFormBaseQuestion != null) {
            W7Z w7z = new W7Z(6, leadGenFormBaseQuestion, this);
            this.A00 = w7z;
            this.A01.A0G(w7z);
        }
    }

    public final String getText() {
        return this.A01.getText().toString();
    }

    public final void setUpLabelTextStyle(boolean z) {
        IgTextView igTextView = this.A02;
        if (z) {
            igTextView.setGravity(17);
            igTextView.setTextAppearance(R.style.igds_title);
            return;
        }
        igTextView.setGravity(8388611);
        igTextView.setTextAppearance(R.style.igds_emphasized_label);
        igTextView.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormShortAnswerQuestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormShortAnswerQuestionView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormShortAnswerQuestionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
