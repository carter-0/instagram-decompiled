package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.OlQ  reason: case insensitive filesystem */
public final class C71479OlQ implements TextView.OnEditorActionListener {
    public final /* synthetic */ C314436iG A00;

    public C71479OlQ(C314436iG r1) {
        this.A00 = r1;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        C314436iG.A02(this.A00);
        return true;
    }
}
