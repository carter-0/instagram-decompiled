package X;

import android.widget.EditText;

/* renamed from: X.Fqb  reason: case insensitive filesystem */
public final class C51220Fqb implements Runnable {
    public final /* synthetic */ C47448E2u A00;

    public C51220Fqb(C47448E2u e2u) {
        this.A00 = e2u;
    }

    public final void run() {
        C47448E2u e2u = this.A00;
        EditText editText = e2u.A02;
        if (editText != null && editText.requestFocus()) {
            0nA.A0Q(e2u.A02);
        }
    }
}
