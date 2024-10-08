package X;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

public final class W7q implements KeyListener {
    public int A00 = 0;

    public final void clearMetaKeyState(View view, Editable editable, int i) {
        U66.A0V.clearMetaKeyState(view, editable, i);
    }

    public final int getInputType() {
        return this.A00;
    }

    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return U66.A0V.onKeyDown(view, editable, i, keyEvent);
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return U66.A0V.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return U66.A0V.onKeyUp(view, editable, i, keyEvent);
    }
}
