package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* renamed from: X.UsV  reason: case insensitive filesystem */
public final class C16302UsV extends W7f {
    public CharSequence A00 = "";
    public final int A01;
    public final EditText A02;

    public final void afterTextChanged(Editable editable) {
        EditText editText = this.A02;
        if (editText.getLineCount() > this.A01) {
            editText.getText().replace(0, C13988Tno.A0C(editText), this.A00);
        }
        this.A00 = new SpannableStringBuilder(editText.getText());
    }

    public C16302UsV(EditText editText, int i) {
        this.A02 = editText;
        this.A01 = i;
    }
}
