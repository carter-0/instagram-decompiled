package X;

import android.widget.Toast;
import com.facebook.react.modules.toast.ToastModule;

/* renamed from: X.TIh  reason: case insensitive filesystem */
public final class C13025TIh implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ToastModule A01;
    public final /* synthetic */ String A02;

    public C13025TIh(ToastModule toastModule, String str, int i) {
        this.A01 = toastModule;
        this.A02 = str;
        this.A00 = i;
    }

    public final void run() {
        Toast.makeText(Pxe.A0T(this.A01), this.A02, this.A00).show();
    }
}
