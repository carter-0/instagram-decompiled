package X;

import android.view.View;

public final class WBI implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public WBI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ea, code lost:
        X.0qQ.A0F(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f1, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016a, code lost:
        r1.Epw(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e4, code lost:
        X.C63183Ksq.A00(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFocusChange(android.view.View r12, boolean r13) {
        /*
            r11 = this;
            int r0 = r11.A00
            r6 = r13
            switch(r0) {
                case 0: goto L_0x0111;
                case 1: goto L_0x017d;
                case 2: goto L_0x00ff;
                case 3: goto L_0x01d0;
                case 4: goto L_0x00cd;
                case 5: goto L_0x00b7;
                case 6: goto L_0x00ab;
                case 7: goto L_0x003c;
                case 8: goto L_0x0144;
                case 9: goto L_0x0125;
                case 10: goto L_0x001c;
                case 11: goto L_0x011d;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r1 = r11.A01
            X.U46 r1 = (X.U46) r1
            X.U46.A02(r12, r1, r13)
            if (r13 == 0) goto L_0x001b
            android.view.ViewParent r0 = r12.getParent()
            r0.getClass()
            android.view.View r0 = (android.view.View) r0
            X.U46.A01(r0, r1)
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r0 = r11.A01
            X.U46 r0 = (X.U46) r0
            X.U46.A02(r12, r0, r13)
            if (r13 != 0) goto L_0x001b
            android.view.ViewParent r0 = r12.getParent()
            r0.getClass()
            com.instagram.survey.structuredsurvey.views.SurveyEditTextListItemView r0 = (com.instagram.survey.structuredsurvey.views.SurveyEditTextListItemView) r0
            X.Vrk r1 = r0.A00
            X.Urq r1 = (X.C16288Urq) r1
            android.widget.EditText r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            r1.A00(r0)
            return
        L_0x003c:
            r4 = 0
            X.0qQ.A0B(r12, r4)
            java.lang.Object r2 = r11.A01
            com.instagram.igds.components.form.IgFormField r2 = (com.instagram.igds.components.form.IgFormField) r2
            android.view.View r0 = r2.getPrismFormFieldContainer()
            r0.setSelected(r13)
            X.W7n r5 = r2.A0E
            if (r5 != 0) goto L_0x0053
            java.lang.String r3 = "ruleManager"
            goto L_0x00ea
        L_0x0053:
            r5.onFocusChange(r12, r13)
            android.widget.EditText r0 = r2.getMEditText()
            int r0 = X.C13988Tno.A0C(r0)
            if (r0 != 0) goto L_0x001b
            X.VSi r0 = r5.A0A
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "valid"
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.String r3 = "labelAnimationHelper"
            if (r0 != 0) goto L_0x009b
            if (r13 != 0) goto L_0x0198
            boolean r0 = r2.A0J
            if (r0 != 0) goto L_0x0198
            android.widget.TextView r1 = r2.getInlineLabel()
            java.lang.String r0 = r5.A04
            r1.setText(r0)
            android.widget.TextView r0 = r2.getInlineLabel()
            r0.setVisibility(r4)
            X.ViC r2 = r2.A0F
            if (r2 == 0) goto L_0x00ea
            android.widget.TextView r1 = r2.A06
            r0 = 0
            r1.setTranslationY(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setScaleY(r0)
            r1.setScaleX(r0)
            java.lang.String r0 = "inline"
            r2.A02 = r0
            return
        L_0x009b:
            X.ViC r2 = r2.A0F
            if (r2 == 0) goto L_0x00ea
            if (r13 == 0) goto L_0x00a8
            java.lang.String r1 = "top"
        L_0x00a3:
            r0 = 1
            r2.A00(r1, r0)
            return
        L_0x00a8:
            java.lang.String r1 = "inline"
            goto L_0x00a3
        L_0x00ab:
            java.lang.Object r1 = r11.A01
            com.instagram.discovery.mediamap.fragment.LocationSearchFragment r1 = (com.instagram.discovery.mediamap.fragment.LocationSearchFragment) r1
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r1.mSearchEditText
            if (r12 != r0) goto L_0x001b
            com.instagram.discovery.mediamap.fragment.LocationSearchFragment.A01(r1, r13)
            return
        L_0x00b7:
            if (r13 == 0) goto L_0x001b
            X.0qQ.A0A(r12)
            X.0nA.A0Q(r12)
            java.lang.Object r0 = r11.A01
            X.UDO r0 = (X.UDO) r0
            android.widget.EditText r1 = r0.A00
            int r0 = r1.length()
            r1.setSelection(r0)
            return
        L_0x00cd:
            boolean r0 = r12 instanceof android.widget.EditText
            if (r0 == 0) goto L_0x001b
            java.lang.Object r2 = r11.A01
            X.WUa r2 = (X.C19318WUa) r2
            if (r13 == 0) goto L_0x00e4
            X.0eM r0 = r2.A0J
            java.lang.Object r0 = r0.getValue()
            X.87F r0 = (X.AnonymousClass87F) r0
            r0.A00()
            goto L_0x01e4
        L_0x00e4:
            android.widget.EditText r0 = r2.A04
            if (r0 != 0) goto L_0x00f2
            java.lang.String r3 = "questionView"
        L_0x00ea:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f2:
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L_0x001b
            android.view.ViewGroup r0 = r2.A02
            if (r0 != 0) goto L_0x01a2
            java.lang.String r3 = "optionsContainer"
            goto L_0x00ea
        L_0x00ff:
            java.lang.Object r1 = r11.A01
            X.UWb r1 = (X.C15224UWb) r1
            com.google.android.material.textfield.TextInputLayout r0 = r1.A02
            r0.setEndIconActivated(r13)
            if (r13 != 0) goto L_0x001b
            r0 = 0
            X.C15224UWb.A02(r1, r0)
            r1.A06 = r0
            return
        L_0x0111:
            java.lang.Object r1 = r11.A01
            androidx.appcompat.widget.SearchView r1 = (androidx.appcompat.widget.SearchView) r1
            android.view.View$OnFocusChangeListener r0 = r1.A02
            if (r0 == 0) goto L_0x001b
            r0.onFocusChange(r1, r13)
            return
        L_0x011d:
            java.lang.Object r0 = r11.A01
            X.U46 r0 = (X.U46) r0
            X.U46.A02(r12, r0, r13)
            return
        L_0x0125:
            java.lang.Object r0 = r11.A01
            X.VtD r0 = (X.C18514VtD) r0
            X.U91 r0 = X.C18514VtD.A00(r0)
            X.Vj6 r0 = r0.A06
            X.05G r1 = r0.A00
            java.lang.Object r0 = r1.getValue()
            X.Tnz r0 = (X.C13997Tnz) r0
            boolean r8 = r0.A02
            boolean r9 = r0.A03
            boolean r10 = r0.A00
            r7 = 5
            X.Tnz r5 = new X.Tnz
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x016a
        L_0x0144:
            java.lang.Object r0 = r11.A01
            X.UaN r0 = (X.C15315UaN) r0
            X.U8w r5 = r0.A02()
            if (r13 == 0) goto L_0x0164
            boolean r0 = r5 instanceof X.C16045UnY
            if (r0 == 0) goto L_0x016e
            r0 = r5
            X.UnY r0 = (X.C16045UnY) r0
            X.WYZ r4 = r0.A02
            java.lang.Long r3 = r0.A05
            java.lang.String r2 = X.C14786U8w.A00(r0)
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "welcome_message_editor_impression"
            X.WYZ.A02(r4, r3, r1, r0, r2)
        L_0x0164:
            X.05G r1 = r5.A07
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r13)
        L_0x016a:
            r1.Epw(r5)
            return
        L_0x016e:
            r0 = r5
            X.UnZ r0 = (X.C16046UnZ) r0
            X.WYX r3 = r0.A00
            java.lang.Long r2 = r0.A04
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "welcome_message_editor_impression"
            X.WYX.A02(r3, r2, r1, r0)
            goto L_0x0164
        L_0x017d:
            android.widget.EditText r12 = (android.widget.EditText) r12
            android.text.Editable r0 = r12.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            r1 = r0 ^ 1
            java.lang.Object r0 = r11.A01
            X.UWa r0 = (X.C15223UWa) r0
            if (r1 == 0) goto L_0x0196
            if (r13 == 0) goto L_0x0196
        L_0x0192:
            X.C15223UWa.A00(r0, r2)
            return
        L_0x0196:
            r2 = 0
            goto L_0x0192
        L_0x0198:
            android.widget.TextView r1 = r2.getInlineLabel()
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x01a2:
            X.0kx r1 = new X.0kx
            r1.<init>(r0)
        L_0x01a7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x01a7
            return
        L_0x01ba:
            X.0eM r0 = r2.A0J
            java.lang.Object r0 = r0.getValue()
            X.87F r0 = (X.AnonymousClass87F) r0
            r0.A01()
            r0 = 0
            X.0qQ.A0B(r12, r0)
            X.0nA.A0N(r12)
            X.C19318WUa.A02(r2)
            return
        L_0x01d0:
            java.lang.Object r2 = r11.A01
            X.WUb r2 = (X.C19319WUb) r2
            if (r13 == 0) goto L_0x01e8
            X.0eM r0 = r2.A0S
            java.lang.Object r0 = r0.getValue()
            X.87F r0 = (X.AnonymousClass87F) r0
            r0.A00()
            X.0qQ.A0A(r12)
        L_0x01e4:
            X.C63183Ksq.A00(r12)
            return
        L_0x01e8:
            java.lang.String r0 = r2.A0E
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01fb
            android.content.Context r1 = r2.A0H
            r0 = 2131955073(0x7f130d81, float:1.9546663E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0E = r0
        L_0x01fb:
            X.0eM r0 = r2.A0S
            java.lang.Object r0 = r0.getValue()
            X.87F r0 = (X.AnonymousClass87F) r0
            r0.A01()
            X.JTQ.A1K(r12)
            X.0nA.A0N(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WBI.onFocusChange(android.view.View, boolean):void");
    }
}
