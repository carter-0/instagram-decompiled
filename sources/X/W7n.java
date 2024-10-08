package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.form.IgFormField;

public final class W7n implements TextWatcher, View.OnFocusChangeListener {
    public Drawable A00;
    public Drawable A01;
    public Drawable A02;
    public X4E A03;
    public String A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final TextView A09;
    public final C17355VSi A0A;
    public final View.AccessibilityDelegate A0B = new U32(this, 1);
    public final View A0C;
    public final EditText A0D;
    public final TextView A0E;
    public final C71662eb A0F;
    public final IgFormField A0G;

    public final void afterTextChanged(Editable editable) {
        A00(false);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        throw new java.lang.UnsupportedOperationException(X.002.A0R(X.AnonymousClass000.A00(2532), r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0140, code lost:
        if (r9.equals("valid") != false) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0154, code lost:
        r3.getStateView().setVisibility(8);
        r1.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        X.0nA.A0a(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        if ((!r14.A05) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ac, code lost:
        if (r3.A0J == false) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ae, code lost:
        r1 = r3.getStateView();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b3, code lost:
        if (r5 != null) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b5, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b7, code lost:
        r1.setVisibility(r0);
        r3.getStateView().setImageDrawable(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c1, code lost:
        r1 = r3.getBottomSubtitleErrorView().getVisibility();
        r0 = r3.getBottomSubtitleInfoView();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01cd, code lost:
        if (r1 != 0) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01cf, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d3, code lost:
        r0 = r0.getText();
        X.0qQ.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01de, code lost:
        if (X.C51966G9m.A1X(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e0, code lost:
        r3.getBottomSubtitleInfoView().setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e8, code lost:
        r3.getMEditText().setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, r5, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(boolean r15) {
        /*
            r14 = this;
            X.X4E r2 = r14.A03
            if (r2 == 0) goto L_0x01d2
            X.VSi r6 = r14.A0A
            java.lang.String r11 = "valid"
            r6.A01 = r11
            r5 = 0
            r6.A00 = r5
            android.widget.EditText r1 = r14.A0D
            android.text.Editable r0 = r1.getText()
            X.0qQ.A07(r0)
            r2.getState(r6, r0, r15)
            X.2eb r10 = r14.A0F
            java.lang.String r0 = r6.A01
            java.lang.String r12 = "loading"
            boolean r0 = X.0qQ.A0K(r0, r12)
            r4 = 8
            r2 = 0
            if (r0 == 0) goto L_0x002f
            boolean r0 = r14.A05
            r3 = r0 ^ 1
            r0 = 0
            if (r3 != 0) goto L_0x0031
        L_0x002f:
            r0 = 8
        L_0x0031:
            r10.A03(r0)
            com.instagram.igds.components.form.IgFormField r3 = r14.A0G
            X.W0n.A01(r3)
            boolean r0 = r14.A05
            X.W0n.A03(r3, r2, r0)
            android.widget.TextView r8 = r14.A09
            java.lang.String r0 = r14.A04
            r8.setText(r0)
            android.widget.TextView r0 = r3.getBottomSubtitleErrorView()
            r0.setVisibility(r4)
            android.content.Context r13 = r1.getContext()
            boolean r0 = X.2eO.A00(r13)
            if (r0 == 0) goto L_0x005d
            android.view.View r7 = r14.A0C
            java.lang.String r0 = r14.A04
            r7.setContentDescription(r0)
        L_0x005d:
            java.lang.String r9 = r6.A01
            int r0 = r9.hashCode()
            r7 = 1
            switch(r0) {
                case -804109473: goto L_0x0077;
                case 96784904: goto L_0x00c1;
                case 111972348: goto L_0x013c;
                case 336650556: goto L_0x0143;
                case 1282258139: goto L_0x0162;
                default: goto L_0x0067;
            }
        L_0x0067:
            r0 = 2532(0x9e4, float:3.548E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.002.A0R(r0, r9)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0077:
            java.lang.String r0 = "confirmed"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0067
            boolean r0 = X.2eO.A00(r13)
            if (r0 == 0) goto L_0x009f
            android.view.View r7 = r14.A0C
            java.lang.String r6 = r14.A04
            android.content.Context r1 = r7.getContext()
            r0 = 2131956506(0x7f13131a, float:1.954957E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[]{r6, r0}
            java.lang.StringBuilder r0 = X.2eQ.A00(r0)
            r7.setContentDescription(r0)
        L_0x009f:
            boolean r0 = r14.A05
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01aa
            android.graphics.drawable.Drawable r0 = r14.A00
            if (r0 != 0) goto L_0x00bd
            android.content.Context r1 = r8.getContext()
            r0 = 2131238108(0x7f081cdc, float:1.8092485E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            r14.A00 = r1
            if (r1 == 0) goto L_0x00bd
            int r0 = r14.A07
            X.AnonymousClass7TE.A1R(r1, r0)
        L_0x00bd:
            android.graphics.drawable.Drawable r5 = r14.A00
            goto L_0x01aa
        L_0x00c1:
            java.lang.String r0 = "error"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0067
            boolean r0 = X.2eO.A00(r13)
            if (r0 == 0) goto L_0x00f0
            android.view.View r11 = r14.A0C
            java.lang.String r12 = r14.A04
            android.content.Context r10 = r11.getContext()
            r9 = 2131961741(0x7f13278d, float:1.9560187E38)
            java.lang.String r0 = r6.A00
            java.lang.String r0 = X.DbW.A0h(r10, r0, r9)
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[]{r12, r0}
            java.lang.StringBuilder r0 = X.2eQ.A00(r0)
            r11.setContentDescription(r0)
            android.view.View$AccessibilityDelegate r0 = r14.A0B
            r1.setAccessibilityDelegate(r0)
        L_0x00f0:
            boolean r0 = r3.A0J
            if (r0 == 0) goto L_0x0136
            android.widget.TextView r0 = r3.getBottomSubtitleErrorView()
            r0.setVisibility(r2)
            android.widget.TextView r1 = r3.getBottomSubtitleErrorView()
            java.lang.String r0 = r6.A00
            r1.setText(r0)
        L_0x0104:
            int r6 = r14.A06
            r8.setTextColor(r6)
            r8.setVisibility(r2)
            android.widget.TextView r1 = r14.A0E
            r0 = 4
            r1.setVisibility(r0)
            boolean r0 = r14.A05
            X.W0n.A03(r3, r7, r0)
            boolean r0 = r14.A05
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01aa
            android.graphics.drawable.Drawable r0 = r14.A01
            if (r0 != 0) goto L_0x0133
            android.content.Context r1 = r8.getContext()
            r0 = 2131238260(0x7f081d74, float:1.8092794E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r14.A01 = r0
            if (r0 == 0) goto L_0x0133
            X.AnonymousClass7TE.A1R(r0, r6)
        L_0x0133:
            android.graphics.drawable.Drawable r5 = r14.A01
            goto L_0x01aa
        L_0x0136:
            java.lang.String r0 = r6.A00
            r8.setText(r0)
            goto L_0x0104
        L_0x013c:
            boolean r0 = r9.equals(r11)
            if (r0 == 0) goto L_0x0067
            goto L_0x0154
        L_0x0143:
            boolean r0 = r9.equals(r12)
            if (r0 == 0) goto L_0x0067
            android.view.View r0 = r10.A01()
            int r0 = r0.getWidth()
            X.0nA.A0a(r1, r0)
        L_0x0154:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.getStateView()
            r0.setVisibility(r4)
            r1.setCompoundDrawablesWithIntrinsicBounds(r5, r5, r5, r5)
            X.0nA.A0a(r1, r2)
            goto L_0x01c1
        L_0x0162:
            java.lang.String r0 = "removable"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0067
            boolean r0 = X.2eO.A00(r13)
            if (r0 == 0) goto L_0x018a
            android.view.View r7 = r14.A0C
            java.lang.String r6 = r14.A04
            android.content.Context r1 = r7.getContext()
            r0 = 2131956507(0x7f13131b, float:1.9549572E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[]{r6, r0}
            java.lang.StringBuilder r0 = X.2eQ.A00(r0)
            r7.setContentDescription(r0)
        L_0x018a:
            boolean r0 = r14.A05
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01aa
            android.graphics.drawable.Drawable r0 = r14.A02
            if (r0 != 0) goto L_0x01a8
            android.content.Context r1 = r8.getContext()
            r0 = 2131238125(0x7f081ced, float:1.809252E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            r14.A02 = r1
            if (r1 == 0) goto L_0x01a8
            int r0 = r14.A08
            X.AnonymousClass7TE.A1R(r1, r0)
        L_0x01a8:
            android.graphics.drawable.Drawable r5 = r14.A02
        L_0x01aa:
            boolean r0 = r3.A0J
            if (r0 == 0) goto L_0x01e8
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r3.getStateView()
            r0 = 0
            if (r5 != 0) goto L_0x01b7
            r0 = 8
        L_0x01b7:
            r1.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.getStateView()
            r0.setImageDrawable(r5)
        L_0x01c1:
            android.widget.TextView r0 = r3.getBottomSubtitleErrorView()
            int r1 = r0.getVisibility()
            android.widget.TextView r0 = r3.getBottomSubtitleInfoView()
            if (r1 != 0) goto L_0x01d3
            r0.setVisibility(r4)
        L_0x01d2:
            return
        L_0x01d3:
            java.lang.CharSequence r0 = r0.getText()
            X.0qQ.A07(r0)
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 == 0) goto L_0x01d2
            android.widget.TextView r0 = r3.getBottomSubtitleInfoView()
            r0.setVisibility(r2)
            return
        L_0x01e8:
            android.widget.EditText r1 = r3.getMEditText()
            r0 = 0
            r1.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r0, r5, r0)
            goto L_0x01c1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W7n.A00(boolean):void");
    }

    public final void onFocusChange(View view, boolean z) {
        A00(!z);
    }

    public W7n(View view, C71662eb r4, IgFormField igFormField) {
        this.A0G = igFormField;
        this.A0F = r4;
        this.A0C = view;
        TextView topLabel = igFormField.getTopLabel();
        this.A09 = topLabel;
        this.A0E = igFormField.getInlineLabel();
        this.A0D = igFormField.getMEditText();
        Context context = topLabel.getContext();
        this.A06 = context.getColor(2Yu.A03(context));
        this.A07 = AnonymousClass7TF.A03(context, R.attr.igds_color_success);
        this.A08 = context.getColor(2Yu.A09(context));
        C17355VSi vSi = new C17355VSi();
        vSi.A01 = "valid";
        this.A0A = vSi;
    }
}
