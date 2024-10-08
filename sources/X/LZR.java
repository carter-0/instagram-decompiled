package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public final class LZR implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public LZR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.A00) {
            case 0:
                if (i != 6) {
                    return false;
                }
                ((View) this.A01).clearFocus();
                return false;
            case 1:
                if (i != 6) {
                    return false;
                }
                C60651Joy joy = (C60651Joy) this.A01;
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                C381919cn r0 = joy.A00;
                if (r0 == null || !r0.A03) {
                    throw DbT.A0m();
                }
                C64724Lh1.A00(joy.A02.A00);
                return true;
            case 2:
                0qQ.A0B(textView, 0);
                C62263Kcx kcx = (C62263Kcx) this.A01;
                String A012 = C62263Kcx.A01(textView);
                if (4 != i || A012.length() <= 0) {
                    return false;
                }
                kcx.A0G(textView);
                return true;
            case 3:
                if (i != 5) {
                    return false;
                }
                K4Z.A00((K4Z) this.A01);
                return false;
            default:
                return false;
        }
    }
}
