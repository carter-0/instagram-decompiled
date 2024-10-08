package X;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.WMd  reason: case insensitive filesystem */
public final class C19122WMd implements X36 {
    public final /* synthetic */ UWZ A00;

    public C19122WMd(UWZ uwz) {
        this.A00 = uwz;
    }

    public final void DC9(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.A0F;
        if (editText != null && i == 1) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new C20180Wme(editText, this));
        }
    }
}
