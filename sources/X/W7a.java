package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.survey.structuredsurvey.views.SurveyEditTextListItemView;
import com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView;

public final class W7a implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public W7a(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void afterTextChanged(Editable editable) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                ((C16289Urr) this.A02).A02.A00(((SurveyWriteInListItemView) this.A03).getText());
                return;
            default:
                SurveyEditTextListItemView surveyEditTextListItemView = (SurveyEditTextListItemView) this.A03;
                String A0f = AnonymousClass7TF.A0f(surveyEditTextListItemView.A00);
                String str = surveyEditTextListItemView.A00.A01;
                C15316UaO uaO = ((U46) this.A01).A02;
                uaO.getClass();
                uaO.A05(str, !"".equals(A0f));
                C16288Urq urq = (C16288Urq) this.A02;
                urq.getClass();
                urq.A00(AnonymousClass7TF.A0f(surveyEditTextListItemView.A00));
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.5n1] */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        Drawable drawable;
        if (this.A00 == 0) {
            0qQ.A0B(charSequence, 0);
            int length = charSequence.length();
            C68447NIk nIk = (C68447NIk) this.A03;
            IgdsMediaButton igdsMediaButton = nIk.A0D;
            if (length == 0) {
                AnonymousClass7TH.A0R(igdsMediaButton);
            } else if (igdsMediaButton != null) {
                igdsMediaButton.setVisibility(0);
            }
            RewriteTextBubbleViewPager rewriteTextBubbleViewPager = nIk.A0A;
            Editable editable = null;
            if (rewriteTextBubbleViewPager != null) {
                str = rewriteTextBubbleViewPager.getAppliedPromptOfCurrentPage();
            } else {
                str = null;
            }
            IgEditText igEditText = nIk.A03;
            if (igEditText != null) {
                editable = igEditText.getText();
            }
            if (!00p.A0h(editable, str) || str == null || str.length() == 0) {
                Drawable drawable2 = (Drawable) this.A02;
                boolean z = nIk.A0I;
                IgdsMediaButton igdsMediaButton2 = nIk.A0D;
                if (z) {
                    if (igdsMediaButton2 != null) {
                        drawable = igdsMediaButton2.getBackground();
                    } else {
                        drawable = null;
                    }
                    0qQ.A0C(drawable, C273654mx.A00(0));
                    ((GradientDrawable) drawable).setColor(-1);
                } else if (igdsMediaButton2 != null) {
                    igdsMediaButton2.setButtonStyle(C296235pj.CREATION_FLOW);
                }
                IgdsMediaButton igdsMediaButton3 = nIk.A0D;
                if (igdsMediaButton3 != null) {
                    ? obj = new Object();
                    obj.A01 = drawable2;
                    igdsMediaButton3.setStartAddOn(obj, (CharSequence) null);
                    return;
                }
                return;
            }
            nIk.A05((Drawable) this.A01);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
