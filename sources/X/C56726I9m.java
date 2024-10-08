package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.I9m  reason: case insensitive filesystem */
public final class C56726I9m implements TextWatcher {
    public int A00;
    public final TextInputView A01;
    public final 0sL A02;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void A00(C56726I9m i9m) {
        TextInputView textInputView = i9m.A01;
        int lineCount = textInputView.getLineCount();
        int i = i9m.A00;
        if (lineCount != i) {
            C51967G9n.A1P(Integer.valueOf(i), i9m.A02, textInputView.getLineCount());
            i9m.A00 = textInputView.getLineCount();
        }
    }

    public final void afterTextChanged(Editable editable) {
        TextInputView textInputView = this.A01;
        if (textInputView.getLayout() == null) {
            textInputView.addOnLayoutChangeListener(new ID7(this, 1));
        } else {
            A00(this);
        }
    }

    public C56726I9m(TextInputView textInputView, 0sL r3) {
        this.A01 = textInputView;
        this.A02 = r3;
        this.A00 = textInputView.getLineCount();
    }
}
