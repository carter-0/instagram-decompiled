package com.instagram.igds.components.bottombutton;

import X.0qQ;
import X.C3021461u;
import X.C3021661w;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsBottomButtonLayout extends C3021461u {
    public final C3021461u A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsBottomButtonLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public void setButtonType(C3021661w r2) {
        0qQ.A0B(r2, 0);
        this.A00.setButtonType(r2);
    }

    public void setDividerVisible(boolean z) {
        this.A00.setDividerVisible(z);
    }

    public final void setFooterAboveActionText(CharSequence charSequence) {
        this.A00.A04(charSequence, 0);
    }

    public final void setFooterText(CharSequence charSequence) {
        this.A00.A05(charSequence, 0);
    }

    public void setPrimaryActionIsLoading(boolean z) {
        this.A00.setPrimaryActionIsLoading(z);
    }

    public void setPrimaryActionOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setPrimaryActionOnClickListener(onClickListener);
    }

    public void setPrimaryActionText(CharSequence charSequence) {
        this.A00.setPrimaryActionText(charSequence);
    }

    public void setPrimaryButtonEnabled(boolean z) {
        this.A00.setPrimaryButtonEnabled(z);
    }

    public void setSecondaryActionOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setSecondaryActionOnClickListener(onClickListener);
    }

    public void setSecondaryActionText(CharSequence charSequence) {
        this.A00.setSecondaryActionText(charSequence);
    }

    public void setSecondaryButtonEnabled(boolean z) {
        this.A00.setSecondaryButtonEnabled(z);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [android.widget.LinearLayout, X.61v, android.view.View, X.61u, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r13v2, types: [android.widget.LinearLayout, android.view.View, X.61u, android.view.ViewGroup, X.943] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IgdsBottomButtonLayout(android.content.Context r16, android.util.AttributeSet r17, int r18) {
        /*
            r15 = this;
            r2 = 1
            r9 = r16
            X.0qQ.A0B(r9, r2)
            r5 = r17
            r1 = r18
            r15.<init>(r9, r5, r1)
            X.1QG r0 = X.1QE.A0E()
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x006a
            X.943 r13 = new X.943
            r13.<init>(r9, r5, r1)
            r13.setOrientation(r2)
            android.content.res.Resources$Theme r1 = r9.getTheme()
            int[] r0 = X.C71382cm.A04
            r4 = 0
            android.content.res.TypedArray r10 = r1.obtainStyledAttributes(r5, r0, r4, r4)
            X.0qQ.A07(r10)
            r0 = 2
            boolean r0 = r10.getBoolean(r0, r4)
            java.lang.String r6 = "primaryActionButton"
            if (r0 == 0) goto L_0x0185
            com.instagram.igds.components.button.IgdsButton r5 = new com.instagram.igds.components.button.IgdsButton
            r5.<init>(r9)
            X.4lp r0 = X.C273024lp.LARGE
            r5.setSize(r0)
            X.4lo r0 = X.C273014lo.PRIMARY
            r5.setStyle(r0)
            r13.A03 = r5
            r2 = -1
            r1 = -2
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r2, r1)
            r13.addView(r5, r0)
            r1 = 3
            com.instagram.igds.components.button.IgdsButton r0 = r13.A03
            if (r0 == 0) goto L_0x01cf
            X.AnonymousClass943.A00(r9, r10, r13, r0, r1)
        L_0x0057:
            r10.getInt(r4, r4)
        L_0x005a:
            r10.recycle()
            r15.A00 = r13
            r2 = -1
            r1 = -2
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r2, r1)
            r15.addView(r13, r0)
            return
        L_0x006a:
            X.61v r13 = new X.61v
            r13.<init>(r9, r5, r1)
            r13.setOrientation(r2)
            android.content.res.Resources$Theme r1 = r9.getTheme()
            int[] r0 = X.C71382cm.A04
            r4 = 0
            android.content.res.TypedArray r10 = r1.obtainStyledAttributes(r5, r0, r4, r4)
            X.0qQ.A07(r10)
            r0 = 2
            boolean r1 = r10.getBoolean(r0, r4)
            java.lang.String r8 = "primaryActionContainer"
            java.lang.String r7 = "primaryAction"
            if (r1 == 0) goto L_0x00ce
            r0 = 2131624281(0x7f0e0159, float:1.8875737E38)
            android.view.View.inflate(r9, r0, r13)
            r0 = 2131428630(0x7f0b0516, float:1.847891E38)
            android.view.View r11 = r13.requireViewById(r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r13.A05 = r11
            if (r11 == 0) goto L_0x0181
            r13.A02 = r11
            r14 = 3
            r12 = r11
            X.C3021561v.A01(r9, r10, r11, r12, r13, r14)
        L_0x00a5:
            int r0 = r10.getInt(r4, r4)
            if (r0 != r2) goto L_0x00cb
            X.61w r0 = X.C3021661w.ON_MEDIA
        L_0x00ad:
            X.C3021561v.A03(r0, r13, r1)
            android.view.View r0 = r13.A02
            if (r0 == 0) goto L_0x017d
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.2eS.A04(r0, r1)
            android.widget.TextView r0 = r13.A05
            if (r0 == 0) goto L_0x0181
            X.C3021761x.A00(r0)
            android.widget.TextView r0 = r13.A06
            if (r0 == 0) goto L_0x005a
            X.2eS.A04(r0, r1)
            X.C3021761x.A00(r0)
            goto L_0x005a
        L_0x00cb:
            X.61w r0 = X.C3021661w.DEFAULT
            goto L_0x00ad
        L_0x00ce:
            r0 = 2131624282(0x7f0e015a, float:1.887574E38)
            android.view.View.inflate(r9, r0, r13)
            r0 = 2131428630(0x7f0b0516, float:1.847891E38)
            android.view.View r0 = r13.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.A05 = r0
            r0 = 2131428632(0x7f0b0518, float:1.8478914E38)
            android.view.View r11 = r13.requireViewById(r0)
            r13.A02 = r11
            r14 = 3
            android.widget.TextView r12 = r13.A05
            if (r12 == 0) goto L_0x0181
            if (r11 == 0) goto L_0x017d
            X.C3021561v.A01(r9, r10, r11, r12, r13, r14)
            r0 = 2131428634(0x7f0b051a, float:1.8478918E38)
            android.view.View r6 = r13.requireViewById(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r6 = (com.instagram.ui.widget.spinner.SpinnerImageView) r6
            r13.A07 = r6
            if (r6 == 0) goto L_0x0110
            r5 = 2131239340(0x7f0821ac, float:1.8094984E38)
            r0 = 2130970334(0x7f0406de, float:1.7549375E38)
            int r0 = X.2Yu.A0H(r9, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4Ed.A01(r9, r5, r0)
            r6.setImageDrawable(r0)
        L_0x0110:
            r0 = 2131428635(0x7f0b051b, float:1.847892E38)
            android.view.View r11 = r13.requireViewById(r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r13.A06 = r11
            if (r11 == 0) goto L_0x0122
            r14 = 4
            r12 = r11
            X.C3021561v.A01(r9, r10, r11, r12, r13, r14)
        L_0x0122:
            r0 = 2131428628(0x7f0b0514, float:1.8478906E38)
            android.view.View r11 = r13.requireViewById(r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r13.A03 = r11
            if (r11 == 0) goto L_0x0141
            r12 = r11
            r14 = r2
            X.C3021561v.A01(r9, r10, r11, r12, r13, r14)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r11.setMovementMethod(r0)
            r11.setHighlightColor(r4)
            r11.setFocusable(r2)
        L_0x0141:
            r0 = 2131428629(0x7f0b0515, float:1.8478908E38)
            android.view.View r5 = r13.requireViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r13.A04 = r5
            if (r5 == 0) goto L_0x015e
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r5.setMovementMethod(r0)
            r5.setHighlightColor(r4)
            r5.setFocusable(r2)
            X.03v.A07(r5)
        L_0x015e:
            r0 = 5
            boolean r5 = r10.getBoolean(r0, r2)
            r0 = 2131428626(0x7f0b0512, float:1.8478902E38)
            android.view.View r0 = r13.requireViewById(r0)
            r13.A00 = r0
            r13.setDividerVisible(r5)
            r0 = 2131428627(0x7f0b0513, float:1.8478904E38)
            android.view.View r0 = r13.requireViewById(r0)
            r13.A01 = r0
            r13.A07()
            goto L_0x00a5
        L_0x017d:
            X.0qQ.A0F(r8)
            goto L_0x01d2
        L_0x0181:
            X.0qQ.A0F(r7)
            goto L_0x01d2
        L_0x0185:
            r0 = 2131626079(0x7f0e085f, float:1.8879384E38)
            android.view.View.inflate(r9, r0, r13)
            r0 = 2131428632(0x7f0b0518, float:1.8478914E38)
            android.view.View r0 = r13.requireViewById(r0)
            com.instagram.igds.components.button.IgdsButton r0 = (com.instagram.igds.components.button.IgdsButton) r0
            r13.A03 = r0
            r0 = 2131428635(0x7f0b051b, float:1.847892E38)
            android.view.View r0 = r13.requireViewById(r0)
            com.instagram.igds.components.button.IgdsButton r0 = (com.instagram.igds.components.button.IgdsButton) r0
            r13.A04 = r0
            r0 = 2131428628(0x7f0b0514, float:1.8478906E38)
            android.view.View r0 = r13.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.A01 = r0
            r0 = 2131428629(0x7f0b0515, float:1.8478908E38)
            android.view.View r0 = r13.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.A02 = r0
            r0 = 2131428626(0x7f0b0512, float:1.8478902E38)
            android.view.View r0 = r13.requireViewById(r0)
            r13.A00 = r0
            r1 = 3
            com.instagram.igds.components.button.IgdsButton r0 = r13.A03
            if (r0 == 0) goto L_0x01cf
            X.AnonymousClass943.A00(r9, r10, r13, r0, r1)
            r1 = 4
            com.instagram.igds.components.button.IgdsButton r0 = r13.A04
            if (r0 != 0) goto L_0x01d7
            java.lang.String r6 = "secondaryActionButton"
        L_0x01cf:
            X.0qQ.A0F(r6)
        L_0x01d2:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01d7:
            X.AnonymousClass943.A00(r9, r10, r13, r0, r1)
            android.widget.TextView r1 = r13.A01
            java.lang.String r5 = "footer"
            if (r1 == 0) goto L_0x0239
            int r0 = r10.getResourceId(r2, r4)
            if (r0 == 0) goto L_0x0231
            java.lang.CharSequence r0 = r9.getText(r0)
            r1.setText(r0)
            r1.setVisibility(r4)
        L_0x01f0:
            X.AnonymousClass943.A02(r13)
            android.widget.TextView r1 = r13.A01
            if (r1 == 0) goto L_0x0239
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r0)
            android.widget.TextView r0 = r13.A01
            if (r0 == 0) goto L_0x0239
            r0.setHighlightColor(r4)
            android.widget.TextView r0 = r13.A01
            if (r0 == 0) goto L_0x0239
            r0.setFocusable(r2)
            android.widget.TextView r1 = r13.A02
            java.lang.String r6 = "footerAboveAction"
            if (r1 == 0) goto L_0x01cf
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r0)
            android.widget.TextView r0 = r13.A02
            if (r0 == 0) goto L_0x01cf
            r0.setHighlightColor(r4)
            android.widget.TextView r0 = r13.A02
            if (r0 == 0) goto L_0x01cf
            r0.setFocusable(r2)
            r0 = 5
            boolean r0 = r10.getBoolean(r0, r2)
            r13.setDividerVisible(r0)
            goto L_0x0057
        L_0x0231:
            java.lang.CharSequence r0 = r10.getText(r2)
            X.AnonymousClass943.A01(r1, r13, r0)
            goto L_0x01f0
        L_0x0239:
            X.0qQ.A0F(r5)
            goto L_0x01d2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsBottomButtonLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsBottomButtonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
