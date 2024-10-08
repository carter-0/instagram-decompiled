package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.util.Locale;

public abstract class W7e implements TextWatcher {
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        String str;
        Locale locale;
        Object[] objArr;
        String valueOf;
        if (this instanceof UWI) {
            boolean isEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ((UWI) this).A00;
            Chip chip = chipTextInputComboView.A03;
            if (isEmpty) {
                str = "%02d";
                locale = chipTextInputComboView.getResources().getConfiguration().locale;
                objArr = new Object[1];
                valueOf = String.valueOf("00");
            } else {
                str = "%02d";
                locale = chipTextInputComboView.getResources().getConfiguration().locale;
                objArr = new Object[1];
                valueOf = String.valueOf(editable);
            }
            objArr[0] = Pxf.A0Z(valueOf);
            chip.setText(String.format(locale, str, objArr));
        } else if (this instanceof UWG) {
            UWG uwg = (UWG) this;
            C15224UWb uWb = uwg.A00;
            EditText editText = uWb.A02.A0F;
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (uWb.A04.isTouchExplorationEnabled() && autoCompleteTextView.getKeyListener() != null && !uWb.A01.hasFocus()) {
                    autoCompleteTextView.dismissDropDown();
                }
                autoCompleteTextView.post(new C20178Wmc(autoCompleteTextView, uwg));
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void beforeTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.UWH
            if (r0 == 0) goto L_0x0020
            r0 = r3
            X.UWH r0 = (X.UWH) r0
            X.UWZ r0 = r0.A00
            com.google.android.material.internal.CheckableImageButton r2 = r0.A01
            com.google.android.material.textfield.TextInputLayout r0 = r0.A02
            android.widget.EditText r0 = r0.A0F
            if (r0 == 0) goto L_0x001a
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r1 = r0 instanceof android.text.method.PasswordTransformationMethod
            r0 = 1
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r0 = r0 ^ 1
            r2.setChecked(r0)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W7e.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
