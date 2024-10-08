package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.DhW  reason: case insensitive filesystem */
public final class C46590DhW implements Handler.Callback {
    public final Handler.Callback A00;

    public final boolean handleMessage(Message message) {
        String str;
        0qQ.A0B(message, 0);
        Object obj = message.obj;
        if (obj instanceof C46586DhS) {
            0qQ.A0C(obj, "null cannot be cast to non-null type com.bloks.foa.core.surface.MessageParam");
            str = ((C46586DhS) obj).A00;
            1KZ.A01(str);
        } else {
            str = null;
        }
        try {
            return this.A00.handleMessage(message);
        } finally {
            if (str != null) {
                1KZ.A00();
            }
        }
    }

    public C46590DhW(Handler.Callback callback) {
        this.A00 = callback;
    }
}
