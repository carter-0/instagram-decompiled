package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;

public final class W7j implements TextWatcher {
    public EditText A00;
    public C307786Rm A01;
    public C276544tV A02;
    public C277014uI A03;
    public boolean A04 = false;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        if (!this.A04) {
            this.A04 = true;
            if (!(this.A02 == null || this.A00 == null || this.A03 == null || this.A01 == null)) {
                String obj = editable.toString();
                C276544tV r0 = this.A02;
                C277014uI r3 = this.A03;
                String str = (String) C299275ur.A00(C307896Rx.A01(this.A01, r3, r0.A09), DbY.A0Q(obj), r3);
                if (str == null) {
                    1Kn.A00(this.A01, "ExpressionMask", "Format expression returned null. Ignoring.", (Throwable) null);
                } else if (!obj.equals(str)) {
                    InputFilter[] filters = editable.getFilters();
                    editable.setFilters(new InputFilter[0]);
                    editable.replace(0, editable.length(), str);
                    editable.setFilters(filters);
                    this.A00.setSelection(editable.length());
                }
            }
            this.A04 = false;
        }
    }
}
