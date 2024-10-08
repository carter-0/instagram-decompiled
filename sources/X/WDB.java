package X;

import android.view.KeyEvent;
import android.widget.TextView;

public final class WDB implements TextView.OnEditorActionListener {
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        0nA.A0N(textView);
        return true;
    }
}
