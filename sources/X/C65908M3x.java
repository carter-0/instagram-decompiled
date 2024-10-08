package X;

import android.widget.EditText;

/* renamed from: X.M3x  reason: case insensitive filesystem */
public final class C65908M3x implements Runnable {
    public final /* synthetic */ C61365K4j A00;

    public C65908M3x(C61365K4j k4j) {
        this.A00 = k4j;
    }

    public final void run() {
        C61365K4j k4j = this.A00;
        EditText editText = k4j.A00;
        if (editText != null) {
            editText.requestFocus();
            EditText editText2 = k4j.A00;
            if (editText2 != null) {
                0nA.A0Q(editText2);
                return;
            }
        }
        0qQ.A0F("titleEditText");
        throw AnonymousClass00P.createAndThrow();
    }
}
