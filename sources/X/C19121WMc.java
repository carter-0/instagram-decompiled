package X;

import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.WMc  reason: case insensitive filesystem */
public final class C19121WMc implements X36 {
    public final /* synthetic */ C15224UWb A00;

    public C19121WMc(C15224UWb uWb) {
        this.A00 = uWb;
    }

    public final void DC9(TextInputLayout textInputLayout, int i) {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.A0F;
        if (autoCompleteTextView != null && i == 3) {
            autoCompleteTextView.post(new C20179Wmd(autoCompleteTextView, this));
            if (autoCompleteTextView.getOnFocusChangeListener() == this.A00.A09) {
                autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            }
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
    }
}
