package X;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class W7m implements TextWatcher {
    public C271074hr A00;
    public boolean A01 = true;
    public final EditText A02;

    public static void A00(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C13993Tnu A002 = C13993Tnu.A00();
            if (editableText == null) {
                length = 0;
            } else {
                length = editableText.length();
            }
            A002.A02(editableText, 0, length);
            if (selectionStart >= 0) {
                if (selectionEnd >= 0) {
                    Selection.setSelection(editableText, selectionStart, selectionEnd);
                } else {
                    Selection.setSelection(editableText, selectionStart);
                }
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.A02;
        if (!editText.isInEditMode() && this.A01 && C13993Tnu.A09 != null && i2 <= i3 && (charSequence instanceof Spannable)) {
            int A012 = C13993Tnu.A00().A01();
            if (A012 != 0) {
                if (A012 == 1) {
                    C13993Tnu.A00().A02(charSequence, i, i + i3);
                    return;
                } else if (A012 != 3) {
                    return;
                }
            }
            C13993Tnu A002 = C13993Tnu.A00();
            C271074hr r0 = this.A00;
            if (r0 == null) {
                r0 = new C14761U7s(editText);
                this.A00 = r0;
            }
            A002.A04(r0);
        }
    }

    public W7m(EditText editText) {
        this.A02 = editText;
    }
}
