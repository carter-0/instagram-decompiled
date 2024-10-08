package X;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UsX  reason: case insensitive filesystem */
public final class C16304UsX extends W7f {
    public final List A00 = new ArrayList();

    public final void afterTextChanged(Editable editable) {
        0qQ.A0B(editable, 0);
        for (TextWatcher afterTextChanged : this.A00) {
            afterTextChanged.afterTextChanged(editable);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        0qQ.A0B(charSequence, 0);
        for (TextWatcher onTextChanged : this.A00) {
            onTextChanged.onTextChanged(charSequence, i, i2, i3);
        }
    }
}
