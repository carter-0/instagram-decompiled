package X;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.U1j  reason: case insensitive filesystem */
public final class C14684U1j extends Handler {
    public WeakReference A00;

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.A00.get(), i);
        } else if (i == 1) {
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
