package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.ArrayAdapter;
import android.widget.Checkable;
import android.widget.EditText;
import com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView;
import java.util.ArrayList;
import java.util.HashMap;

public final class U46 extends ArrayAdapter {
    public Activity A00;
    public View.OnClickListener A01;
    public C15316UaO A02;
    public HashMap A03 = new HashMap();
    public HashMap A04 = new HashMap();
    public String A05;
    public final View.OnClickListener A06 = new WB0(this, 25);
    public final View.OnFocusChangeListener A07 = new WBI(this, 11);
    public final View.OnFocusChangeListener A08 = new WBI(this, 10);
    public final View.OnFocusChangeListener A09 = new WBI(this, 12);

    public U46(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
    }

    public static void A01(View view, U46 u46) {
        U5Y u5y;
        C16524UwT uwT;
        Checkable checkable = (Checkable) view;
        checkable.setChecked(true);
        U5Y u5y2 = (U5Y) view;
        C18441Vrk vrk = u5y2.A00;
        if (vrk != null) {
            String str = vrk.A01;
            C15316UaO uaO = u46.A02;
            uaO.getClass();
            uaO.A05(str, true);
            HashMap hashMap = u46.A04;
            if (!(!hashMap.containsKey(str) || (u5y = (U5Y) hashMap.get(str)) == null || u5y == checkable || ((uwT = u5y.A00.A00) == u5y2.A00.A00 && uwT == C16524UwT.RADIOWRITEIN))) {
                ((Checkable) u5y).setChecked(false);
            }
            hashMap.put(str, u5y2);
        }
    }

    private void A00(View.OnFocusChangeListener onFocusChangeListener, C16289Urr urr, SurveyWriteInListItemView surveyWriteInListItemView) {
        surveyWriteInListItemView.setChecked(urr.A01);
        surveyWriteInListItemView.A00 = onFocusChangeListener;
        if (surveyWriteInListItemView.A00.A01.equals(this.A05) && urr.A01) {
            EditText editText = surveyWriteInListItemView.A03;
            editText.getClass();
            editText.requestFocus();
        }
    }

    public static void A02(View view, U46 u46, boolean z) {
        ViewParent parent = view.getParent();
        if (z) {
            parent.getClass();
            u46.A05 = ((U5Y) parent).A00.A01;
        }
    }

    public final int getItemViewType(int i) {
        Object item = getItem(i);
        item.getClass();
        return ((C18441Vrk) item).A00.ordinal();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f1, code lost:
        r9.setTag(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0265, code lost:
        r5.setTag(r4);
        r9 = r5;
        r0 = r7.A06;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x026b, code lost:
        X.AnonymousClass0fU.A00(r0, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            int r0 = r7.getItemViewType(r8)
            switch(r0) {
                case 0: goto L_0x0270;
                case 1: goto L_0x0274;
                case 2: goto L_0x0278;
                case 3: goto L_0x027c;
                case 4: goto L_0x0280;
                case 5: goto L_0x0284;
                case 6: goto L_0x0288;
                case 7: goto L_0x0007;
                case 8: goto L_0x028c;
                case 9: goto L_0x0290;
                case 10: goto L_0x0294;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.UwT r4 = X.C16524UwT.WHITESPACE
        L_0x0009:
            r2 = r4
            if (r9 != 0) goto L_0x002a
            int r0 = r4.ordinal()
            switch(r0) {
                case 0: goto L_0x0185;
                case 1: goto L_0x0256;
                case 2: goto L_0x0246;
                case 3: goto L_0x01e2;
                case 4: goto L_0x01d2;
                case 5: goto L_0x0195;
                case 6: goto L_0x01c2;
                case 7: goto L_0x01b2;
                case 8: goto L_0x01f6;
                case 9: goto L_0x01f6;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.String r3 = "SurveyListAdapter"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r0 = 1987(0x7c3, float:2.784E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            X.0wb.A03(r3, r0)
        L_0x002a:
            java.lang.Object r4 = r7.getItem(r8)
            X.Vrk r4 = (X.C18441Vrk) r4
            r5 = r9
            X.U5Y r5 = (X.U5Y) r5
            if (r5 == 0) goto L_0x0076
            if (r4 == 0) goto L_0x0076
            boolean r0 = r5 instanceof com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView
            if (r0 == 0) goto L_0x00fc
            com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView r5 = (com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView) r5
            r5.A00 = r4
            r6 = r4
            X.Urr r6 = (X.C16289Urr) r6
            android.widget.EditText r3 = r5.A03
            r3.getClass()
            X.Urq r0 = r6.A02
            X.V3o r0 = r0.A00
            if (r0 != 0) goto L_0x00f8
            r0 = 0
        L_0x004e:
            r3.setText(r0)
            android.widget.TextView r1 = r5.A04
            r1.getClass()
            X.V3o r0 = r6.A00
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            X.UwT r1 = r5.A05
            X.UwT r0 = X.C16524UwT.CHECKBOXWRITEIN
            if (r1 != r0) goto L_0x00f0
            r1 = 26
        L_0x0065:
            X.WB0 r0 = new X.WB0
            r0.<init>(r5, r1)
            r3.setOnClickListener(r0)
        L_0x006d:
            r1 = 2
            X.WBJ r0 = new X.WBJ
            r0.<init>(r1, r3, r5)
            r3.setOnFocusChangeListener(r0)
        L_0x0076:
            X.UwT r0 = X.C16524UwT.CHECKBOX
            if (r2 != r0) goto L_0x0088
            r4.getClass()
            r0 = r4
            X.Uro r0 = (X.C16286Uro) r0
            boolean r1 = r0.A01
            r0 = r9
            com.instagram.survey.structuredsurvey.views.SurveyCheckboxListItemView r0 = (com.instagram.survey.structuredsurvey.views.SurveyCheckboxListItemView) r0
            r0.setChecked(r1)
        L_0x0088:
            X.UwT r0 = X.C16524UwT.RADIO
            if (r2 != r0) goto L_0x009a
            r1 = r9
            com.instagram.survey.structuredsurvey.views.SurveyRadioListItemView r1 = (com.instagram.survey.structuredsurvey.views.SurveyRadioListItemView) r1
            r4.getClass()
            r0 = r4
            X.Urp r0 = (X.C16287Urp) r0
            boolean r0 = r0.A01
            r1.setChecked(r0)
        L_0x009a:
            X.UwT r1 = X.C16524UwT.CHECKBOXWRITEIN
            if (r2 == r1) goto L_0x00a2
            X.UwT r0 = X.C16524UwT.RADIOWRITEIN
            if (r2 != r0) goto L_0x00c0
        L_0x00a2:
            r5 = r9
            com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView r5 = (com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView) r5
            r4.getClass()
            r3 = r4
            X.Urr r3 = (X.C16289Urr) r3
            if (r2 != r1) goto L_0x00ea
            android.view.View$OnFocusChangeListener r0 = r7.A07
            r7.A00(r0, r3, r5)
        L_0x00b2:
            r0 = 1
            X.W7a r1 = new X.W7a
            r1.<init>(r0, r7, r3, r5)
            android.widget.EditText r0 = r5.A03
            r0.getClass()
            r0.addTextChangedListener(r1)
        L_0x00c0:
            X.UwT r0 = X.C16524UwT.EDITTEXT
            if (r2 != r0) goto L_0x00e9
            r3 = r9
            com.instagram.survey.structuredsurvey.views.SurveyEditTextListItemView r3 = (com.instagram.survey.structuredsurvey.views.SurveyEditTextListItemView) r3
            android.view.View$OnFocusChangeListener r0 = r7.A08
            r3.setItemOnFocusChangeListener(r0)
            r1 = 2
            X.W7a r0 = new X.W7a
            r0.<init>(r1, r7, r4, r3)
            android.widget.EditText r2 = r3.A00
            r2.addTextChangedListener(r0)
            X.Vrk r0 = r3.A00
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r7.A05
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e9
            r2.requestFocus()
            X.JTR.A1F(r2)
        L_0x00e9:
            return r9
        L_0x00ea:
            android.view.View$OnFocusChangeListener r0 = r7.A09
            r7.A00(r0, r3, r5)
            goto L_0x00b2
        L_0x00f0:
            X.UwT r0 = X.C16524UwT.RADIOWRITEIN
            if (r1 != r0) goto L_0x006d
            r1 = 27
            goto L_0x0065
        L_0x00f8:
            java.lang.String r0 = r0.A02
            goto L_0x004e
        L_0x00fc:
            boolean r0 = r5 instanceof com.instagram.survey.structuredsurvey.views.SurveyRadioListItemView
            if (r0 == 0) goto L_0x0112
            com.instagram.survey.structuredsurvey.views.SurveyRadioListItemView r5 = (com.instagram.survey.structuredsurvey.views.SurveyRadioListItemView) r5
            r5.A00 = r4
            r0 = r4
            X.Urp r0 = (X.C16287Urp) r0
            android.widget.TextView r1 = r5.A01
            X.V3o r0 = r0.A00
            java.lang.String r0 = r0.A01
        L_0x010d:
            r1.setText(r0)
            goto L_0x0076
        L_0x0112:
            boolean r0 = r5 instanceof com.instagram.survey.structuredsurvey.views.SurveyQuestionListItemView
            if (r0 == 0) goto L_0x0133
            com.instagram.survey.structuredsurvey.views.SurveyQuestionListItemView r5 = (com.instagram.survey.structuredsurvey.views.SurveyQuestionListItemView) r5
            r6 = r4
            X.Urm r6 = (X.C16284Urm) r6
            java.lang.String r3 = r6.A01
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            android.widget.TextView r1 = r5.A00
            if (r0 == 0) goto L_0x012f
            r0 = 8
            r1.setVisibility(r0)
        L_0x012a:
            android.widget.TextView r1 = r5.A01
            java.lang.String r0 = r6.A00
            goto L_0x010d
        L_0x012f:
            r1.setText(r3)
            goto L_0x012a
        L_0x0133:
            boolean r0 = r5 instanceof com.instagram.survey.structuredsurvey.views.SurveyMessageListItemView
            if (r0 == 0) goto L_0x0141
            com.instagram.survey.structuredsurvey.views.SurveyMessageListItemView r5 = (com.instagram.survey.structuredsurvey.views.SurveyMessageListItemView) r5
            r0 = r4
            X.Urk r0 = (X.C16282Urk) r0
            android.widget.TextView r1 = r5.A00
            java.lang.String r0 = r0.A00
            goto L_0x010d
        L_0x0141:
            boolean r0 = r5 instanceof com.instagram.survey.structuredsurvey.views.SurveyImageBlockListItemView
            if (r0 == 0) goto L_0x0156
            com.instagram.survey.structuredsurvey.views.SurveyImageBlockListItemView r5 = (com.instagram.survey.structuredsurvey.views.SurveyImageBlockListItemView) r5
            r3 = r4
            X.Url r3 = (X.C16283Url) r3
            android.widget.TextView r1 = r5.A01
            java.lang.String r0 = r3.A01
            r1.setText(r0)
            android.widget.TextView r1 = r5.A00
            java.lang.String r0 = r3.A00
            goto L_0x010d
        L_0x0156:
            boolean r0 = r5 instanceof com.instagram.survey.structuredsurvey.views.SurveyEditTextListItemView
            if (r0 == 0) goto L_0x0173
            com.instagram.survey.structuredsurvey.views.SurveyEditTextListItemView r5 = (com.instagram.survey.structuredsurvey.views.SurveyEditTextListItemView) r5
            r5.A00 = r4
            android.widget.EditText r1 = r5.A00
            r0 = 2131974583(0x7f1359b7, float:1.9586234E38)
            r1.setHint(r0)
            X.Vrk r0 = r5.A00
            X.Urq r0 = (X.C16288Urq) r0
            X.V3o r0 = r0.A00
            if (r0 != 0) goto L_0x0170
            r0 = 0
            goto L_0x010d
        L_0x0170:
            java.lang.String r0 = r0.A02
            goto L_0x010d
        L_0x0173:
            boolean r0 = r5 instanceof com.instagram.survey.structuredsurvey.views.SurveyCheckboxListItemView
            if (r0 == 0) goto L_0x0076
            com.instagram.survey.structuredsurvey.views.SurveyCheckboxListItemView r5 = (com.instagram.survey.structuredsurvey.views.SurveyCheckboxListItemView) r5
            r5.A00 = r4
            r0 = r4
            X.Uro r0 = (X.C16286Uro) r0
            android.widget.TextView r1 = r5.A01
            X.V3o r0 = r0.A00
            java.lang.String r0 = r0.A01
            goto L_0x010d
        L_0x0185:
            android.view.LayoutInflater r1 = X.DbV.A0D(r10)
            r0 = 2131629587(0x7f0e1613, float:1.88865E38)
            android.view.View r9 = X.DbT.A0C(r1, r10, r0)
            com.instagram.survey.structuredsurvey.views.SurveyQuestionListItemView r9 = (com.instagram.survey.structuredsurvey.views.SurveyQuestionListItemView) r9
            X.UwT r0 = X.C16524UwT.QUESTION
            goto L_0x01f1
        L_0x0195:
            android.view.LayoutInflater r1 = X.DbV.A0D(r10)
            r0 = 2131629581(0x7f0e160d, float:1.8886487E38)
            android.view.View r9 = X.DbT.A0C(r1, r10, r0)
            com.instagram.survey.structuredsurvey.views.SurveyImageBlockListItemView r9 = (com.instagram.survey.structuredsurvey.views.SurveyImageBlockListItemView) r9
            X.UwT r0 = X.C16524UwT.IMAGEBLOCK
            r9.setTag(r0)
            r0 = 2131442330(0x7f0b3a9a, float:1.8506697E38)
            android.view.View r5 = r9.requireViewById(r0)
            android.view.View$OnClickListener r0 = r7.A01
            goto L_0x026b
        L_0x01b2:
            android.view.LayoutInflater r1 = X.DbV.A0D(r10)
            r0 = 2131629592(0x7f0e1618, float:1.888651E38)
            android.view.View r9 = X.DbT.A0C(r1, r10, r0)
            com.instagram.survey.structuredsurvey.views.SurveySpaceListItemView r9 = (com.instagram.survey.structuredsurvey.views.SurveySpaceListItemView) r9
            X.UwT r0 = X.C16524UwT.WHITESPACE
            goto L_0x01f1
        L_0x01c2:
            android.view.LayoutInflater r1 = X.DbV.A0D(r10)
            r0 = 2131629577(0x7f0e1609, float:1.8886479E38)
            android.view.View r9 = X.DbT.A0C(r1, r10, r0)
            com.instagram.survey.structuredsurvey.views.SurveyDividerListItemView r9 = (com.instagram.survey.structuredsurvey.views.SurveyDividerListItemView) r9
            X.UwT r0 = X.C16524UwT.DIVIDER
            goto L_0x01f1
        L_0x01d2:
            android.view.LayoutInflater r1 = X.DbV.A0D(r10)
            r0 = 2131629584(0x7f0e1610, float:1.8886493E38)
            android.view.View r9 = X.DbT.A0C(r1, r10, r0)
            com.instagram.survey.structuredsurvey.views.SurveyMessageListItemView r9 = (com.instagram.survey.structuredsurvey.views.SurveyMessageListItemView) r9
            X.UwT r0 = X.C16524UwT.MESSAGE
            goto L_0x01f1
        L_0x01e2:
            android.view.LayoutInflater r1 = X.DbV.A0D(r10)
            r0 = 2131629579(0x7f0e160b, float:1.8886483E38)
            android.view.View r9 = X.DbT.A0C(r1, r10, r0)
            com.instagram.survey.structuredsurvey.views.SurveyEditTextListItemView r9 = (com.instagram.survey.structuredsurvey.views.SurveyEditTextListItemView) r9
            X.UwT r0 = X.C16524UwT.EDITTEXT
        L_0x01f1:
            r9.setTag(r0)
            goto L_0x002a
        L_0x01f6:
            android.view.LayoutInflater r1 = X.DbV.A0D(r10)
            r0 = 2131629594(0x7f0e161a, float:1.8886513E38)
            android.view.View r5 = X.DbT.A0C(r1, r10, r0)
            com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView r5 = (com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView) r5
            r5.A05 = r4
            X.UwT r0 = X.C16524UwT.CHECKBOXWRITEIN
            if (r4 != r0) goto L_0x0238
            r3 = 2131629576(0x7f0e1608, float:1.8886477E38)
            r0 = 2131442323(0x7f0b3a93, float:1.8506683E38)
            r1 = 2131442325(0x7f0b3a95, float:1.8506687E38)
        L_0x0212:
            r5.setContentView(r3)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.Checkable r0 = (android.widget.Checkable) r0
            r5.A02 = r0
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r5, r1)
            r5.A04 = r0
            r0 = 2131442327(0x7f0b3a97, float:1.850669E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r5.A03 = r0
            r0 = 2131428942(0x7f0b064e, float:1.8479543E38)
            android.view.View r0 = r5.findViewById(r0)
            r5.A01 = r0
            goto L_0x0265
        L_0x0238:
            X.UwT r0 = X.C16524UwT.RADIOWRITEIN
            if (r4 != r0) goto L_0x0298
            r3 = 2131629590(0x7f0e1616, float:1.8886505E38)
            r0 = 2131442341(0x7f0b3aa5, float:1.850672E38)
            r1 = 2131442343(0x7f0b3aa7, float:1.8506723E38)
            goto L_0x0212
        L_0x0246:
            android.view.LayoutInflater r1 = X.DbV.A0D(r10)
            r0 = 2131629575(0x7f0e1607, float:1.8886475E38)
            android.view.View r5 = X.DbT.A0C(r1, r10, r0)
            com.instagram.survey.structuredsurvey.views.SurveyCheckboxListItemView r5 = (com.instagram.survey.structuredsurvey.views.SurveyCheckboxListItemView) r5
            X.UwT r4 = X.C16524UwT.CHECKBOX
            goto L_0x0265
        L_0x0256:
            android.view.LayoutInflater r1 = X.DbV.A0D(r10)
            r0 = 2131629589(0x7f0e1615, float:1.8886503E38)
            android.view.View r5 = X.DbT.A0C(r1, r10, r0)
            com.instagram.survey.structuredsurvey.views.SurveyRadioListItemView r5 = (com.instagram.survey.structuredsurvey.views.SurveyRadioListItemView) r5
            X.UwT r4 = X.C16524UwT.RADIO
        L_0x0265:
            r5.setTag(r4)
            r9 = r5
            android.view.View$OnClickListener r0 = r7.A06
        L_0x026b:
            X.AnonymousClass0fU.A00(r0, r5)
            goto L_0x002a
        L_0x0270:
            X.UwT r4 = X.C16524UwT.QUESTION
            goto L_0x0009
        L_0x0274:
            X.UwT r4 = X.C16524UwT.RADIO
            goto L_0x0009
        L_0x0278:
            X.UwT r4 = X.C16524UwT.CHECKBOX
            goto L_0x0009
        L_0x027c:
            X.UwT r4 = X.C16524UwT.EDITTEXT
            goto L_0x0009
        L_0x0280:
            X.UwT r4 = X.C16524UwT.MESSAGE
            goto L_0x0009
        L_0x0284:
            X.UwT r4 = X.C16524UwT.IMAGEBLOCK
            goto L_0x0009
        L_0x0288:
            X.UwT r4 = X.C16524UwT.DIVIDER
            goto L_0x0009
        L_0x028c:
            X.UwT r4 = X.C16524UwT.RADIOWRITEIN
            goto L_0x0009
        L_0x0290:
            X.UwT r4 = X.C16524UwT.CHECKBOXWRITEIN
            goto L_0x0009
        L_0x0294:
            X.UwT r4 = X.C16524UwT.NOTIFICATION
            goto L_0x0009
        L_0x0298:
            java.lang.String r1 = "Either CHECKBOXWRITEIN or RADIOWRITEIN type is allowed"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U46.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final int getViewTypeCount() {
        return C16524UwT.values().length;
    }
}
