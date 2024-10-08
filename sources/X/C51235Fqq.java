package X;

import android.widget.EditText;

/* renamed from: X.Fqq  reason: case insensitive filesystem */
public final class C51235Fqq implements Runnable {
    public final /* synthetic */ C47936ENn A00;

    public C51235Fqq(C47936ENn eNn) {
        this.A00 = eNn;
    }

    public final void run() {
        C47936ENn eNn = this.A00;
        EditText editText = eNn.A00;
        if (editText != null && editText.requestFocus()) {
            0nA.A0Q(eNn.A00);
        }
    }
}
