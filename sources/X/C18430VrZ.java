package X;

import android.widget.EditText;

/* renamed from: X.VrZ  reason: case insensitive filesystem */
public final class C18430VrZ {
    public final EditText A00;
    public final W7m A01;

    public C18430VrZ(EditText editText) {
        this.A00 = editText;
        W7m w7m = new W7m(editText);
        this.A01 = w7m;
        editText.addTextChangedListener(w7m);
        if (U20.A02 == null) {
            synchronized (U20.A01) {
                if (U20.A02 == null) {
                    U20.A02 = new U20();
                }
            }
        }
        editText.setEditableFactory(U20.A02);
    }

    public C18430VrZ() {
    }
}
