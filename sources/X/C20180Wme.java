package X;

import android.widget.EditText;

/* renamed from: X.Wme  reason: case insensitive filesystem */
public final class C20180Wme implements Runnable {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C19122WMd A01;

    public C20180Wme(EditText editText, C19122WMd wMd) {
        this.A01 = wMd;
        this.A00 = editText;
    }

    public final void run() {
        this.A00.removeTextChangedListener(this.A01.A00.A00);
    }
}
