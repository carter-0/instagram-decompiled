package X;

import android.view.View;
import android.view.ViewParent;
import android.widget.Checkable;
import android.widget.EditText;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView;

public final class WBJ implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WBJ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.A00) {
            case 0:
                ReactTextInputManager.lambda$addEventEmitters$0((QZL) this.A01, (U66) this.A02, view, z);
                return;
            case 1:
                if (!z) {
                    int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                    ((C17997VjZ) this.A02).A00 = AnonymousClass7TF.A0f((EditText) ((UE4) this.A01).A04.A01());
                    return;
                }
                return;
            default:
                SurveyWriteInListItemView surveyWriteInListItemView = (SurveyWriteInListItemView) this.A01;
                View.OnFocusChangeListener onFocusChangeListener = surveyWriteInListItemView.A00;
                onFocusChangeListener.getClass();
                onFocusChangeListener.onFocusChange(view, z);
                if (z) {
                    ViewParent parent = view.getParent();
                    parent.getClass();
                    View view2 = (View) parent;
                    if (!((Checkable) view2).isChecked()) {
                        view2.performClick();
                    }
                    JTR.A1F((EditText) this.A02);
                    return;
                }
                ((C16289Urr) surveyWriteInListItemView.A00).A02.A00(surveyWriteInListItemView.getText());
                return;
        }
    }
}
