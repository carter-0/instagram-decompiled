package X;

import android.text.Editable;
import android.widget.EditText;

/* renamed from: X.9qZ  reason: invalid class name and case insensitive filesystem */
public final class C389999qZ extends W7f {
    public final EditText A00;

    public C389999qZ(EditText editText) {
        0qQ.A0B(editText, 1);
        this.A00 = editText;
    }

    public final void afterTextChanged(Editable editable) {
        0qQ.A0B(editable, 0);
        int length = editable.length();
        EditText editText = this.A00;
        int i = 17;
        if (length == 0) {
            i = 8388611;
        }
        editText.setGravity(i);
    }
}
