package X;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.U7s  reason: case insensitive filesystem */
public final class C14761U7s extends C271074hr implements Runnable {
    public final Reference A00;

    public final void A00() {
        Handler handler;
        View view = (View) this.A00.get();
        if (view != null && (handler = view.getHandler()) != null) {
            handler.post(this);
        }
    }

    public final void run() {
        W7m.A00((EditText) this.A00.get(), 1);
    }

    public C14761U7s(EditText editText) {
        this.A00 = new WeakReference(editText);
    }
}
