package X;

import android.widget.EditText;

/* renamed from: X.VrY  reason: case insensitive filesystem */
public final class C18429VrY {
    public final EditText A00;
    public final W7i A01;

    public C18429VrY(EditText editText) {
        this.A00 = editText;
        W7i w7i = new W7i(editText);
        this.A01 = w7i;
        editText.addTextChangedListener(w7i);
        if (C14699U1z.A02 == null) {
            synchronized (C14699U1z.A01) {
                if (C14699U1z.A02 == null) {
                    C14699U1z.A02 = new C14699U1z();
                }
            }
        }
        editText.setEditableFactory(C14699U1z.A02);
    }

    public C18429VrY() {
    }
}
