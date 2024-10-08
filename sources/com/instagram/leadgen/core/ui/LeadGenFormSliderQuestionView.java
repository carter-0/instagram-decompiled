package com.instagram.leadgen.core.ui;

import X.0qQ;
import X.C14746U6n;
import X.DbT;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LeadGenFormSliderQuestionView extends C14746U6n {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgEditSeekBar A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenFormSliderQuestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_form_slider, this);
        this.A00 = DbT.A0a(this, R.id.label_text_view);
        this.A03 = (IgEditSeekBar) requireViewById(R.id.slider);
        this.A02 = DbT.A0a(this, R.id.min_label);
        this.A01 = DbT.A0a(this, R.id.max_label);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        if (r1 != null) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0076 A[LOOP:0: B:13:0x0074->B:14:0x0076, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092 A[LOOP:1: B:19:0x008c->B:21:0x0092, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r11, boolean r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            r5 = 0
            X.0qQ.A0B(r11, r5)
            r10.A00 = r11
            r10.A04 = r14
            com.instagram.common.ui.base.IgTextView r1 = r10.A00
            java.lang.String r0 = r11.A0A
            r1.setText(r0)
            com.instagram.ui.igeditseekbar.IgEditSeekBar r6 = r10.A03
            r0 = 1093664768(0x41300000, float:11.0)
            r6.setSeekBarHeight(r0)
            r7 = 1
            r6.A04 = r7
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165344(0x7f0700a0, float:1.7944902E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r6.A00 = r0
            android.graphics.Paint r2 = r6.A09
            android.content.Context r1 = r6.getContext()
            r0 = 2130971037(0x7f04099d, float:1.7550801E38)
            int r0 = X.2Yu.A0F(r1, r0)
            r2.setColor(r0)
            r2.setFakeBoldText(r7)
            java.util.List r1 = r11.A0E
            r8 = 0
            if (r1 == 0) goto L_0x007b
            java.lang.Object r0 = X.00k.A0O(r1, r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x007b
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x007b
            int r4 = r0.intValue()
        L_0x0050:
            java.lang.Object r0 = X.00k.A0O(r1, r7)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x007f
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x007f
            int r2 = r0.intValue()
        L_0x0062:
            com.instagram.common.ui.base.IgTextView r0 = r10.A02
            X.C13988Tno.A15(r0, r4)
            com.instagram.common.ui.base.IgTextView r0 = r10.A01
            X.C13988Tno.A15(r0, r2)
            int r1 = r11.A02
            r0 = r4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0074:
            if (r0 > r2) goto L_0x0081
            X.AnonymousClass7TF.A1M(r3, r0)
            int r0 = r0 + r1
            goto L_0x0074
        L_0x007b:
            r4 = 0
            if (r1 == 0) goto L_0x007f
            goto L_0x0050
        L_0x007f:
            r2 = 0
            goto L_0x0062
        L_0x0081:
            r6.setShouldOverrideVisualValue(r7)
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x008c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009e
            int r0 = X.AnonymousClass7TG.A0F(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.add(r0)
            goto L_0x008c
        L_0x009e:
            r6.setOverrideVisualValueList(r2)
            java.lang.String r0 = r11.A0B
            if (r0 == 0) goto L_0x0117
            java.lang.Integer r0 = X.00y.A0l(r0)
            int r7 = X.AnonymousClass7TG.A0A(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0105
            java.util.Iterator r9 = r3.iterator()
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r8 = r9.next()
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00e9
            int r0 = X.AnonymousClass7TE.A0M(r8)
            int r2 = X.C13988Tno.A06(r7, r0)
        L_0x00d3:
            java.lang.Object r1 = r9.next()
            int r0 = X.AnonymousClass7TE.A0M(r1)
            int r0 = X.C13988Tno.A06(r7, r0)
            if (r2 <= r0) goto L_0x00e3
            r8 = r1
            r2 = r0
        L_0x00e3:
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L_0x00d3
        L_0x00e9:
            java.lang.Number r8 = (java.lang.Number) r8
            if (r8 != 0) goto L_0x0101
            int r0 = r3.size()
            int r1 = r0 / 2
            if (r1 < 0) goto L_0x0120
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x0120
            java.lang.Object r8 = r3.get(r1)
        L_0x00ff:
            java.lang.Number r8 = (java.lang.Number) r8
        L_0x0101:
            int r7 = r8.intValue()
        L_0x0105:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            int r0 = r3.indexOf(r0)
            r6.setCurrentValue(r0)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r10.A0F(r11, r0)
        L_0x0117:
            X.We6 r0 = new X.We6
            r0.<init>(r11, r10, r4)
            r6.setOnSliderChangeListener(r0)
            return
        L_0x0120:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            goto L_0x00ff
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadgen.core.ui.LeadGenFormSliderQuestionView.A0G(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion, boolean, boolean, boolean):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormSliderQuestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormSliderQuestionView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormSliderQuestionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
