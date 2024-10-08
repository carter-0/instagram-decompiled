package X;

import android.text.Editable;
import android.text.Selection;
import android.widget.EditText;

/* renamed from: X.AAc  reason: case insensitive filesystem */
public abstract class C39805AAc {
    public static final String A01(CharSequence charSequence, int i, boolean z) {
        Object subSequence;
        int i2 = i;
        while (-1 < i2 && charSequence.charAt(i2) != ' ') {
            if (charSequence.charAt(i2) == '#') {
                if (i2 != i) {
                    subSequence = charSequence.subSequence(i2, i + 1);
                    if (subSequence == null) {
                        return null;
                    }
                } else if (!z) {
                    return null;
                } else {
                    subSequence = "#";
                }
                return subSequence.toString();
            }
            i2--;
        }
        return null;
    }

    public static String A00(EditText editText, boolean z) {
        Editable text = editText.getText();
        0qQ.A07(text);
        return A01(text, Selection.getSelectionEnd(text) - 1, z);
    }
}
