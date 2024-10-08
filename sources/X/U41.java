package X;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

public final class U41 extends InputConnectionWrapper {
    public final TextView A00;

    public U41(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        this.A00 = textView;
        if (C13993Tnu.A09 != null) {
            C13993Tnu.A00().A03(editorInfo);
        }
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        if (2ER.A02(this.A00.getEditableText(), this, i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (2ER.A02(this.A00.getEditableText(), this, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
