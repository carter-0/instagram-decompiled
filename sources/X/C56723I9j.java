package X;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.List;

/* renamed from: X.I9j  reason: case insensitive filesystem */
public final class C56723I9j implements TextWatcher {
    public final List A00;

    public final void afterTextChanged(Editable editable) {
        for (TextWatcher afterTextChanged : this.A00) {
            afterTextChanged.afterTextChanged(editable);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        for (TextWatcher beforeTextChanged : this.A00) {
            beforeTextChanged.beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        for (TextWatcher onTextChanged : this.A00) {
            onTextChanged.onTextChanged(charSequence, i, i2, i3);
        }
    }

    public C56723I9j(List list) {
        this.A00 = AnonymousClass7TE.A1D(list);
    }
}
