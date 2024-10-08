package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.facebook.cameracore.mediapipeline.services.uicontrol.instagram.RawTextInputView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.8G2  reason: invalid class name */
public final class AnonymousClass8G2 implements C312346eH, C312336eF, AnonymousClass8G3 {
    public C371648yk A00;
    public RawTextInputView A01;
    public C41812B1r A02;
    public String A03 = null;
    public IgLinearLayout A04;
    public final InputMethodManager A05;

    public final void DCP(C41812B1r b1r, String str) {
        this.A00 = null;
        this.A02 = b1r;
        RawTextInputView rawTextInputView = this.A01;
        rawTextInputView.setText(str);
        rawTextInputView.setVisibility(0);
        rawTextInputView.setEnabled(true);
        rawTextInputView.setFocusable(true);
        rawTextInputView.setFocusableInTouchMode(true);
        rawTextInputView.setSelection(rawTextInputView.getText().length());
        rawTextInputView.bringToFront();
        rawTextInputView.requestFocus();
        rawTextInputView.A05 = true;
        rawTextInputView.post(new C40733AiK(rawTextInputView));
    }

    public final void DCT(A6V a6v, C371648yk r7) {
        this.A02 = null;
        this.A00 = r7;
        RawTextInputView rawTextInputView = this.A01;
        if (rawTextInputView != null) {
            this.A04.setVisibility(0);
            String str = a6v.A02;
            this.A03 = str;
            rawTextInputView.setText(str);
            rawTextInputView.setVisibility(0);
            rawTextInputView.setEnabled(true);
            rawTextInputView.setFocusable(true);
            rawTextInputView.setFocusableInTouchMode(true);
            rawTextInputView.setSelection(rawTextInputView.getText().length());
            rawTextInputView.bringToFront();
            rawTextInputView.requestFocus();
            InputMethodManager inputMethodManager = this.A05;
            inputMethodManager.getClass();
            if (!inputMethodManager.showSoftInput(rawTextInputView, 2)) {
                inputMethodManager.toggleSoftInput(2, 0);
                inputMethodManager.showSoftInput(rawTextInputView, 2);
            }
        }
    }

    public static void A00(AnonymousClass8G2 r4) {
        RawTextInputView rawTextInputView = r4.A01;
        if (rawTextInputView != null) {
            rawTextInputView.setEnabled(false);
            rawTextInputView.clearFocus();
            rawTextInputView.setFocusable(false);
            rawTextInputView.setFocusableInTouchMode(false);
            rawTextInputView.setVisibility(8);
            InputMethodManager inputMethodManager = r4.A05;
            inputMethodManager.getClass();
            inputMethodManager.hideSoftInputFromWindow(rawTextInputView.getWindowToken(), 0);
            if (r4.A02 != null) {
                r4.A02 = null;
            }
            r4.A04.setVisibility(8);
        }
    }

    public final void DDS() {
        this.A01.A01();
    }

    public AnonymousClass8G2(ViewGroup viewGroup) {
        this.A01 = (RawTextInputView) viewGroup.requireViewById(R.id.hidden_edit_text_view);
        View requireViewById = viewGroup.requireViewById(R.id.text_edit_cancel_button);
        this.A04 = (IgLinearLayout) viewGroup.requireViewById(R.id.edit_text_layout);
        this.A01.A02 = this;
        this.A05 = (InputMethodManager) viewGroup.getContext().getSystemService("input_method");
        this.A01.setOnEditorActionListener(new AnonymousClass8G4(this));
        AnonymousClass0fU.A00(new AnonymousClass8G5(this), requireViewById);
    }
}
