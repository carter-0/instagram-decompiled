package com.instagram.leadgen.core.ui;

import X.0qQ;
import X.C14746U6n;
import X.DbT;
import X.JTT;
import X.X1U;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LeadGenFormDateTimeQuestionView extends C14746U6n implements X1U {
    public final IgFormField A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenFormDateTimeQuestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_form_date_time, this);
        this.A02 = DbT.A0a(this, R.id.label_text_view);
        this.A00 = DbT.A0d(this, R.id.answer_form_field);
        this.A01 = DbT.A0a(this, R.id.confirmation_text_view);
        this.A03 = DbT.A0a(this, R.id.optional_label);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r6.A0I == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r5.A06 = r8
            r5.A04 = r9
            com.instagram.igds.components.form.IgFormField r4 = r5.A00
            r4.setPrismMode(r8)
            r5.A00 = r6
            com.instagram.common.ui.base.IgTextView r1 = r5.A02
            java.lang.String r0 = r6.A0A
            r1.setText(r0)
            java.lang.String r0 = r6.A00
            r5.setLastKnownInput(r0)
            com.instagram.common.ui.base.IgTextView r3 = r5.A03
            r2 = 0
            if (r9 == 0) goto L_0x0025
            boolean r1 = r6.A0I
            r0 = 0
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            r0 = 8
        L_0x0027:
            r3.setVisibility(r0)
            java.lang.String r1 = r6.A00
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0035
            r4.setText(r1)
        L_0x0035:
            com.instagram.common.ui.base.IgTextView r1 = r5.A01
            java.lang.String r0 = r6.A07
            r1.setText(r0)
            if (r0 == 0) goto L_0x0044
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0046
        L_0x0044:
            r2 = 8
        L_0x0046:
            r1.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadgen.core.ui.LeadGenFormDateTimeQuestionView.A0G(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion, boolean, boolean, boolean):void");
    }

    public final void setDateTimePickerClickListener(View.OnClickListener onClickListener) {
        0qQ.A0B(onClickListener, 0);
        this.A00.setInPickerMode(onClickListener);
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
    public LeadGenFormDateTimeQuestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormDateTimeQuestionView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormDateTimeQuestionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
