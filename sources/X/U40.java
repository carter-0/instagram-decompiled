package X;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

public final class U40 extends InputConnectionWrapper {
    public final TextView A00;

    public U40(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        Bundle bundle;
        this.A00 = textView;
        W0M A002 = W0M.A00();
        if (A002.A01() == 1 && editorInfo != null && (bundle = editorInfo.extras) != null) {
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", C13992Tns.A01(A002.A02.A02.A02));
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        if (W16.A01(this.A00.getEditableText(), this, i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (W16.A01(this.A00.getEditableText(), this, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
