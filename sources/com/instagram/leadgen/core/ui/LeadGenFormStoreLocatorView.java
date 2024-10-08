package com.instagram.leadgen.core.ui;

import X.0qQ;
import X.0sP;
import X.AnonymousClass00P;
import X.C14746U6n;
import X.C20979X7s;
import X.DbT;
import X.JTT;
import X.X4I;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LeadGenFormStoreLocatorView extends C14746U6n {
    public String A00;
    public LeadGenFormBaseQuestion A01;
    public final RadioGroup A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final Map A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final LeadGenFormPrismZipView A08;
    public final LeadGenFormZipView A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenFormStoreLocatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = "";
        this.A05 = new LinkedHashMap();
        View.inflate(context, R.layout.lead_gen_view_form_store_locator, this);
        this.A06 = DbT.A0a(this, R.id.label_text_view);
        this.A09 = (LeadGenFormZipView) requireViewById(R.id.zip_code_picker);
        this.A08 = (LeadGenFormPrismZipView) requireViewById(R.id.prism_zip_code_picker);
        this.A04 = DbT.A0a(this, R.id.store_locator_error_text_view);
        this.A03 = DbT.A0a(this, R.id.store_locator_empty_list_text_view);
        this.A02 = (RadioGroup) requireViewById(R.id.store_options);
        this.A07 = DbT.A0a(this, R.id.optional_label);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a1, code lost:
        if (r6.A0I == false) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r30, boolean r31, boolean r32, boolean r33) {
        /*
            r29 = this;
            r1 = 0
            r6 = r30
            X.0qQ.A0B(r6, r1)
            r4 = r29
            r5 = r32
            r4.A06 = r5
            r3 = r33
            r4.A04 = r3
            com.instagram.common.ui.base.IgTextView r2 = r4.A06
            java.lang.String r0 = r6.A0A
            r2.setText(r0)
            java.util.List r0 = r6.A0F
            r9 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0097
            java.lang.Object r7 = X.00k.A0O(r0, r1)
        L_0x0021:
            java.lang.String r0 = "post_code"
            boolean r8 = X.0qQ.A0K(r7, r0)
            android.content.Context r7 = r4.getContext()
            r0 = 2131964701(0x7f13331d, float:1.9566191E38)
            if (r8 == 0) goto L_0x0092
            r0 = 2131964700(0x7f13331c, float:1.956619E38)
            java.lang.String r11 = r7.getString(r0)
        L_0x0037:
            X.0qQ.A0A(r11)
            if (r8 == 0) goto L_0x008f
            X.Uxp r8 = X.C16595Uxp.A0Q
        L_0x003e:
            java.lang.String r10 = r6.A06
            X.0sn r19 = X.0sn.A00
            java.lang.String r13 = r4.A00
            java.lang.String r12 = ""
            X.0sm r23 = X.0Yt.A0E()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r7 = new com.instagram.leadgen.core.model.LeadGenFormBaseQuestion
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r20 = r9
            r21 = r9
            r22 = r9
            r24 = r1
            r25 = r1
            r26 = r1
            r27 = r1
            r28 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r4.A01 = r7
            com.instagram.leadgen.core.ui.LeadGenFormZipView r7 = r4.A09
            r0 = r32 ^ 1
            int r0 = X.DbW.A01(r0)
            r7.setVisibility(r0)
            com.instagram.leadgen.core.ui.LeadGenFormPrismZipView r7 = r4.A08
            int r0 = X.DbW.A01(r5)
            r7.setVisibility(r0)
            X.U6n r7 = r4.getZipCodePicker()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = r4.A01
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = "zipQuestion"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008f:
            X.Uxp r8 = X.C16595Uxp.A0a
            goto L_0x003e
        L_0x0092:
            java.lang.String r11 = r7.getString(r0)
            goto L_0x0037
        L_0x0097:
            r7 = r9
            goto L_0x0021
        L_0x0099:
            r7.A0G(r0, r1, r5, r3)
            if (r33 == 0) goto L_0x00a3
            boolean r0 = r6.A0I
            r1 = 1
            if (r0 != 0) goto L_0x00a4
        L_0x00a3:
            r1 = 0
        L_0x00a4:
            com.instagram.common.ui.base.IgTextView r0 = r4.A07
            if (r1 != 0) goto L_0x00aa
            r2 = 8
        L_0x00aa:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadgen.core.ui.LeadGenFormStoreLocatorView.A0G(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion, boolean, boolean, boolean):void");
    }

    public final void setCountryPickerClickListener(0sP r3) {
        C20979X7s x7s;
        0qQ.A0B(r3, 0);
        C14746U6n zipCodePicker = getZipCodePicker();
        if ((zipCodePicker instanceof C20979X7s) && (x7s = (C20979X7s) zipCodePicker) != null) {
            x7s.setOnCountryPickerClickListener(r3);
        }
    }

    public final void setCurrentInput(String str) {
        0qQ.A0B(str, 0);
        this.A00 = str;
    }

    public final void setSearchKeyChangeListener(X4I x4i) {
        0qQ.A0B(x4i, 0);
        getZipCodePicker().A01 = x4i;
    }

    private final C14746U6n getZipCodePicker() {
        if (this.A06) {
            return this.A08;
        }
        return this.A09;
    }

    public final String getCurrentInput() {
        return this.A00;
    }

    public final boolean A0I() {
        C14746U6n zipCodePicker = getZipCodePicker();
        LeadGenFormBaseQuestion leadGenFormBaseQuestion = this.A01;
        if (leadGenFormBaseQuestion != null) {
            return zipCodePicker.A0H(leadGenFormBaseQuestion, false);
        }
        0qQ.A0F("zipQuestion");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getCountryCode() {
        C20979X7s x7s;
        C14746U6n zipCodePicker = getZipCodePicker();
        if (!(zipCodePicker instanceof C20979X7s) || (x7s = (C20979X7s) zipCodePicker) == null) {
            return "";
        }
        return x7s.getCurrentCountryCode();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormStoreLocatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenFormStoreLocatorView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormStoreLocatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
