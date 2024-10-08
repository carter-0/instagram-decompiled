package X;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.WMb  reason: case insensitive filesystem */
public final class C19120WMb implements X36 {
    public final /* synthetic */ C15223UWa A00;

    public C19120WMb(C15223UWa uWa) {
        this.A00 = uWa;
    }

    public final void DC9(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.A0F;
        if (editText != null && i == 2) {
            editText.post(new C20177Wmb(editText, this));
            if (editText.getOnFocusChangeListener() == this.A00.A03) {
                editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            }
        }
    }
}
