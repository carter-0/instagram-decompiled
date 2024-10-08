package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.SVr  reason: case insensitive filesystem */
public final class C11453SVr implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((C13796ThF) message.obj).recycle();
        return true;
    }
}
