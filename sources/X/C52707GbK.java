package X;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.List;

/* renamed from: X.GbK  reason: case insensitive filesystem */
public final class C52707GbK implements TextWatcher {
    public TextWatcher A00;
    public boolean A01;
    public final List A02 = AnonymousClass7TE.A1C();

    public final void afterTextChanged(Editable editable) {
        if (!this.A01) {
            this.A01 = true;
            for (TextWatcher afterTextChanged : this.A02) {
                afterTextChanged.afterTextChanged(editable);
            }
            TextWatcher textWatcher = this.A00;
            if (textWatcher != null) {
                textWatcher.afterTextChanged(editable);
            }
            this.A01 = false;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A01) {
            this.A01 = true;
            for (TextWatcher beforeTextChanged : this.A02) {
                beforeTextChanged.beforeTextChanged(charSequence, i, i2, i3);
            }
            TextWatcher textWatcher = this.A00;
            if (textWatcher != null) {
                textWatcher.beforeTextChanged(charSequence, i, i2, i3);
            }
            this.A01 = false;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A01) {
            this.A01 = true;
            for (TextWatcher onTextChanged : this.A02) {
                onTextChanged.onTextChanged(charSequence, i, i2, i3);
            }
            TextWatcher textWatcher = this.A00;
            if (textWatcher != null) {
                textWatcher.onTextChanged(charSequence, i, i2, i3);
            }
            this.A01 = false;
        }
    }
}
