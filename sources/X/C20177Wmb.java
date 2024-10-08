package X;

import android.widget.EditText;

/* renamed from: X.Wmb  reason: case insensitive filesystem */
public final class C20177Wmb implements Runnable {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C19120WMb A01;

    public C20177Wmb(EditText editText, C19120WMb wMb) {
        this.A01 = wMb;
        this.A00 = editText;
    }

    public final void run() {
        this.A00.removeTextChangedListener(this.A01.A00.A02);
    }
}
