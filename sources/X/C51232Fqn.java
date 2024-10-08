package X;

import android.widget.EditText;

/* renamed from: X.Fqn  reason: case insensitive filesystem */
public final class C51232Fqn implements Runnable {
    public final /* synthetic */ E4P A00;

    public C51232Fqn(E4P e4p) {
        this.A00 = e4p;
    }

    public final void run() {
        E4P e4p = this.A00;
        EditText editText = e4p.A01;
        if (editText != null) {
            if (editText.requestFocus()) {
                EditText editText2 = e4p.A01;
                if (editText2 != null) {
                    0nA.A0Q(editText2);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("password");
        throw AnonymousClass00P.createAndThrow();
    }
}
