package X;

import android.view.View;
import android.widget.EditText;

/* renamed from: X.Fqy  reason: case insensitive filesystem */
public final class C51243Fqy implements Runnable {
    public final /* synthetic */ C49691F2b A00;

    public C51243Fqy(C49691F2b f2b) {
        this.A00 = f2b;
    }

    public final void run() {
        C49691F2b f2b = this.A00;
        EditText editText = f2b.A01;
        editText.setOnTouchListener((View.OnTouchListener) null);
        editText.removeTextChangedListener(f2b.A00);
    }
}
