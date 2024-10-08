package X;

import android.text.Editable;
import android.text.TextWatcher;

public abstract class W7f implements TextWatcher {
    public void afterTextChanged(Editable editable) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this instanceof C16304UsX) {
            0qQ.A0B(charSequence, 0);
            for (TextWatcher beforeTextChanged : ((C16304UsX) this).A00) {
                beforeTextChanged.beforeTextChanged(charSequence, i, i2, i3);
            }
        } else if (this instanceof C16306UsZ) {
            C16306UsZ usZ = (C16306UsZ) this;
            0qQ.A0B(charSequence, 0);
            usZ.A01 = 0qQ.A0K(charSequence.toString(), usZ.A00);
        }
    }
}
